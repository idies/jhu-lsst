object TwTest {

    def main(args: Array[String]): Unit = {


        //Twitter api auth keys
        val consumerKey = "7SMW41Vb3dLfZkWsFYxGa8Mdo"
        val consumerSecret = "08pEiMTXY0xyv1TDfUwBYJiNzEOupoVwaw9Vk3tzt1gvsZq9QF"
        val accessToken = "10022462-hx6lkyAGKLnGU8GhOHpIUfyRpGhosiph491oY7J6k"
        val accessTokenSecret = "avduKmDt6dlL8GzWLRCorTCLTFrAydr43GsjGPHQn3fhT"

        //SQL auth stuff
        val user = "sa"
        val password = "fooRiuzg54"

        //Spark-SQL connector params
        val hostname = "master-0.master-svc"
        val port = 1433
        val database = "TwitterData"
        val url = s"jdbc:sqlserver://${hostname}:${port};database=${database};user={$user};password=${password};"
        val dbtable = "Tweets"
        val datasource_name = "TweetsDataSource"

        //Twitter stream object parameters

        val filters = Array("goose", "springsteen", "punk", "hypnospace")  
        val path = "/user/twitter/"
        val savingInterval = 2000

        val twitterStream = new TwitterStream(consumerKey, consumerSecret, accessToken, accessTokenSecret, path, savingInterval, filters)

        val tweets = spark.read.json(path + "*")
        val tweets_schema = tweets.schema

        val tweetStream = spark.readStream.
        |schema(tweets_schema).
        |json(path + "*").
        |filter($"lang" === "en").
        |withColumn("screen_name", $"user.screen_name").
        |withColumn("num_followers", $"user.followers_count").
        |withColumn("createdAt", from_utc_timestamp(from_unixtime(unix_timestamp($"created_at", "EEE MMM dd HH:mm:ss ZZZZ yyyy")),"EST")).
        |select("screen_name","createdAt","num_followers", "text")


    }
}




/*

val query = tweetStream.writeStream.outputMode("append").foreachBatch{ (batchDF: DataFrame, batchId: Long) => 
    batchDF.write
        .format("com.microsoft.sqlserver.jdbc.spark")
        .mode("append")
        .option("url", url)
        .option("dbtable", dbtable)
        .option("user", user)
        .option("password", password)
        .option("dataPoolDataSource",datasource_name).save()
   }.start()
query.processAllAvailable()
//query.awaitTermination(40000)

*/

/*
def df_read(dbtable: String,
                url: String,
                dataPoolDataSource: String=""): DataFrame = {
                spark.read
                        .format("com.microsoft.sqlserver.jdbc.spark")
                        .option("url", url)
                        .option("dbtable", dbtable)
                        .option("user", user)
                        .option("password", password)
                        .option("dataPoolDataSource", datasource_name)
                        .load()
                }


*/

/*

val new_df = df_read(dbtable, url, dataPoolDataSource=datasource_name)
new_df.count

*/

//twitterStream.stop()