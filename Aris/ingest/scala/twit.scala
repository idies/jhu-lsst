class TwitterStream(
  consumerKey: String,
  consumerSecret: String,
  accessToken: String,
  accessTokenSecret: String,
  path: String,
  savingInterval: Long,
  filters: Array[String]) {
  
  private val threadName = "tweet-downloader"  {
    val hasActiveStream = Thread.getAllStackTraces().keySet().asScala.map(_.getName).contains(threadName)
    if (hasActiveStream) {
      throw new RuntimeException(
         "There is already an active stream that writes tweets to the configured path. " +
        "Please stop the existing stream first (using twitterStream.stop()).")
    }
  }

  @volatile private var thread: Thread = null
  @volatile private var isStopped = false
  @volatile var isDownloading = false
  @volatile var exception: Throwable = null


  private var httpclient: CloseableHttpClient = null
  private var input: InputStream = null
  private var httpGet: HttpGet = null

  private def encode(string: String): String = {
    URLEncoder.encode(string, StandardCharsets.UTF_8.name)
  }

  def start(): Unit = synchronized {
    isDownloading = false
    isStopped = false
    thread = new Thread(threadName) {
      override def run(): Unit = {
        httpclient = HttpClients.createDefault()
        try {
          requestStream(httpclient)
        } catch {
          case e: Throwable => exception = e
        } finally {
          //TwitterStream.this.stop()
        }
      }
    }
    thread.start()
  } 

  private def requestStream(httpclient: CloseableHttpClient): Unit = {
    val url = "https://stream.twitter.com/1.1/statuses/filter.json"
    val timestamp = System.currentTimeMillis / 1000
    val nonce = timestamp + scala.util.Random.nextInt
    val oauthNonce = nonce.toString
    val oauthTimestamp = timestamp.toString

    val oauthHeaderParams = List(
      "oauth_consumer_key" -> encode(consumerKey),
      "oauth_signature_method" -> encode("HMAC-SHA1"),
      "oauth_timestamp" -> encode(oauthTimestamp),
      "oauth_nonce" -> encode(oauthNonce),
      "oauth_token" -> encode(accessToken),
      "oauth_version" -> "1.0"
    )
    val requestParams = List(
      "track" -> encode(filters.mkString(","))
    )

    val parameters = (oauthHeaderParams ++ requestParams).sortBy(_._1).map(pair => s"""${pair._1}=${pair._2}""").mkString("&")
    val base = s"GET&${encode(url)}&${encode(parameters)}"
    val oauthBaseString: String = base.toString
    val signature = generateSignature(oauthBaseString)
    val oauthFinalHeaderParams = oauthHeaderParams ::: List("oauth_signature" -> encode(signature))
    val authHeader = "OAuth " + ((oauthFinalHeaderParams.sortBy(_._1).map(pair => s"""${pair._1}="${pair._2}"""")).mkString(", "))

    httpGet = new HttpGet(s"https://stream.twitter.com/1.1/statuses/filter.json?${requestParams.map(pair => s"""${pair._1}=${pair._2}""").mkString("&")}")
    httpGet.addHeader("Authorization", authHeader)
    println("Downloading tweets!")
    val response = httpclient.execute(httpGet)
    val entity = response.getEntity()
    input = entity.getContent()
    
    if (response.getStatusLine.getStatusCode != 200) {
      throw new RuntimeException(IOUtils.toString(input, StandardCharsets.UTF_8))

    }

    isDownloading = true
    val reader = new BufferedReader(new InputStreamReader(input, StandardCharsets.UTF_8))
    var line: String = null
    var lineno = 1
    line = reader.readLine()
    var lastSavingTime = System.currentTimeMillis()
    val s = new StringBuilder() //why is this a val not a var? are references to objects vals always?

    val conf = new Configuration()
    val fs = FileSystem.get(conf)

    while (line != null && !isStopped) {
      lineno += 1
      line = reader.readLine()
      s.append(line + "\n")
      val now = System.currentTimeMillis()
     
      if (now - lastSavingTime >= savingInterval) {

        val df = spark.read.json(spark.sparkContext.parallelize(Seq(s.toString)))
        df.write.json(path + now.toString)

        lastSavingTime = now
        s.clear()
      }
    }

  }

  private def generateSignature(data: String): String = {
    val mac = Mac.getInstance("HmacSHA1")
    val oauthSignature = encode(consumerSecret) + "&" + encode(accessTokenSecret)
    val spec = new SecretKeySpec(oauthSignature.getBytes, "HmacSHA1")
    mac.init(spec)
    val byteHMAC = mac.doFinal(data.getBytes)
    return Base64.getEncoder.encodeToString(byteHMAC)

  }

  def stop(): Unit = synchronized {
    isStopped = true
    isDownloading = false
    try {
      if (httpGet != null) {
        httpGet.abort()
        httpGet = null
      }
      if (input != null){
        input.close()
        input = null
      }
      if (thread != null) {
        thread.interrupt()
        thread = null
      }
    } catch {
      case _:Throwable =>
    }
  }
}

println("class defined!")



