package u01;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import db.Table;


public class Translator {

	File infile, outfile;

	public static Pattern drop_table=Pattern.compile("drop[ ]+table[ ]+if[ ]+exists[ ]+`(\\w+)`;", Pattern.CASE_INSENSITIVE);
	public static Pattern create_table=Pattern.compile("create[ ]+table", Pattern.CASE_INSENSITIVE);
  public static Pattern parens = Pattern.compile("(\\w*)(\\(([^()]*|\\([^()]*\\))*\\))"); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern quotedname = Pattern.compile("`(\\w+)`"); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern p_bigint = Pattern.compile("bigint(\\s*)[\\((\\w+\\)]?", Pattern.CASE_INSENSITIVE); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern p_int = Pattern.compile("int(\\s*)[\\((\\w+\\)]?", Pattern.CASE_INSENSITIVE); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern pk = Pattern.compile("PRIMARYKEY[ ]*\\(([^()]*)\\)", Pattern.CASE_INSENSITIVE); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern p_uniqueindex = Pattern.compile("WNIQUEKEY[ ]+`(\\w+)`[ ]+\\(([^()]*)\\)", Pattern.CASE_INSENSITIVE); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern p_index = Pattern.compile("SINGLEKEY[ ]+`(\\w+)`[ ]+\\(([^()]*)\\)", Pattern.CASE_INSENSITIVE); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern p_skindex = Pattern.compile("SINGLEKEY[ ]?\\(([^()]*)\\)", Pattern.CASE_INSENSITIVE); // (\w+)(\(([^()]*|\([^()]*\))*\))
  public static Pattern p_fk = Pattern.compile("FOERIGNKEY[ ]+`(\\w+)`[ ]+\\(([^()]*)\\)", Pattern.CASE_INSENSITIVE); // (\w+)(\(([^()]*|\([^()]*\))*\))
	
	
	public static void main(String[] args) throws Exception{
		
		try {
			Translator t = new Translator(args[0]);
			t.run();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String preprocess(String c){
		c=c.replaceAll("auto_increment", "IDENTITY(1,1)");
		c=c.replaceAll("PRIMARY KEY", "PRIMARYKEY");
		c=c.replaceAll("FOREIGN KEY", "FOREIGNKEY");
		c=c.replaceAll("UNIQUE KEY", "WNIQUEKEY");
		c=c.replaceAll(" KEY", "SINGLEKEY");
		c=c.replaceAll(" Key", "SINGLEKEY");
		return c;
	}
	
	
	private Translator(String _f){
		this.infile = new File(_f);
		this.outfile = new File(_f+".MS.sql");
	}
	private void run() throws Exception{
		// 1. translate DDLs
		List<Table> tables = translateDDLs(infile,outfile);
		
		for(Table table: tables){
				System.out.println(table.toString());
		}
	}
	
	private List<Table> translateDDLs(File infile, File outfile) throws Exception{
		ArrayList<Table> tables = new ArrayList<Table>();
		parseDDL(infile);
		return tables;
	}		
	
	public static String readFile(File file) throws IOException{
		byte[] encoded = Files.readAllBytes(Paths.get(file.getAbsolutePath()));
	  return new String(encoded, Charset.defaultCharset());
	}

	public static String match(String content, Matcher matcher){
	  return content.substring(matcher.start(),matcher.end()-1);

	}
	
	public List<Table> parseDDL(File infile) throws Exception{
	  String contents = readFile(infile);
	  contents=preprocess(contents);
	  
	  String loadFile = infile.getAbsolutePath()+".MS.LOAD.sql";
	  String keysfile = infile.getAbsolutePath()+".MS.KEYS.sql";
	  String outfile = infile.getAbsolutePath()+".MS.CREATE.sql";
	  
	  PrintStream out = new PrintStream(new FileOutputStream(outfile), true);
    out.printf("-- MS SQL DDL ported from MySQL version at %s\n\n", infile);
	  PrintStream keysout = new PrintStream(new FileOutputStream(keysfile), true);
    keysout.printf("-- MS SQL key and index definitions ported from MySQL version at %s\n\n", infile);
    
    Hashtable<String, Table> tablesDict = new Hashtable<String, Table>();
    ArrayList<String> orderedTables = new ArrayList<String>();
	  Matcher matcher = drop_table.matcher(contents);
	  while (matcher.find()) {
	  	String key = match(contents,matcher);
	  	String tablename=droptable(key);
	  	
	    out.printf("IF OBJECT_ID('dbo.%s', 'U') IS NOT NULL\n DROP TABLE dbo.%s\n\n",tablename,tablename);
	    orderedTables.add(tablename);
	  }
    out.print("\n\nGO\n\n");
    
	  matcher = create_table.matcher(contents);
	  List<Table> tables = new ArrayList<Table>();
	  while (matcher.find()) {
	  	Table table = startTable(matcher, contents, out, keysout);
	  	tables.add(table);
	  	tablesDict.put(table.name, table);
	  } 
	  out.print("\n\nGO\n\n");
	  keysout.print("\n\nGO\n\n");

	  out.flush();
	  out.close();
	  keysout.flush();
	  keysout.close();
	  
	  out = new PrintStream(new FileOutputStream(loadFile), true);
	
	  int n = orderedTables.size();
	  for(int i = n-1; i>=0; i--){
	  	String name = orderedTables.get(i);
	  	Table table = tablesDict.get(name);
	  	StringBuffer mssqlColumns = new StringBuffer();
	  	boolean first = true;
	  	for(String c : table.columns){
	  		if(!first){
	  			mssqlColumns.append(",");
	  		}
	  		first=false;
	  		mssqlColumns.append("[").append(c).append("]");
	  	}
	  	
	  	out.printf("PRINT('LOADING TABLE %s')\n", name);
	  	if(table.hasIdentity)
	  		out.printf("SET IDENTITY_INSERT [%s] ON\n",name);
	  	out.printf("insert into [%s]  with (tablock)  (%s)select * from openquery(CBIOPORTALMYSQL,'select * from `%s`')\n",name,mssqlColumns,name);
	  	if(table.hasIdentity)
	  		out.printf("SET IDENTITY_INSERT [%s] OFF\n",name);
	  	out.print("\n");
	  }
	  out.print("\n\nGO\n\n");

	  out.flush();
	  out.close();
	  return tables;
	}
	public Table startTable(Matcher matcher, String contents, PrintStream out, PrintStream keysout) throws Exception{
		Table t = new Table();
	  int start, end,name_start, name_end;
  	start=matcher.start();
  	name_start=matcher.end()-start;
	  contents=contents.substring(start);
	  start=0;
	  matcher = parens.matcher(contents);
	  if(matcher.find()) {
	  	name_end=matcher.start()-1;
	  	end=matcher.end();
	  } else {
	  	throw new Exception("no parens () after create table");
	  }
	  String tablename=contents.substring(name_start, name_end).trim().replaceAll("`","");
	  t.name = tablename;
    out.printf("CREATE TABLE [%s] (\n", tablename);

    contents=contents.substring(matcher.start()+1,end-1);
    
    String primaryKey = null;
		ArrayList<String> uniqueindexes=new ArrayList<String>();
		ArrayList<String> indexes=new ArrayList<String>();
		ArrayList<String> fks=new ArrayList<String>();
		ArrayList<String> uniques=new ArrayList<String>();

		
	  String[] lines=contents.split("\\r?\\n");//contents.split("[,]");
	  int count = 0;
    for(String line: lines){
    	int ix = line.indexOf("--");
    	if (ix >= 0)
    		line=line.substring(0,ix);
	  	line=line.trim();
	  	if(line.endsWith(","))
	  		line=line.substring(0,line.length()-1);
	  	if(line.length() == 0)
	  		continue;
	  	
    	
  		matcher = pk.matcher(line);
  		if(matcher.find()){
  			primaryKey=line.substring(matcher.start(), matcher.end());
  			continue;
  		} 
  		
  		if(line.indexOf("FOREIGNKEY")>=0){
  			fks.add(line);
  			continue;
  		}
  		if(line.indexOf("WNIQUEKEY")>=0){
  			uniqueindexes.add(line);
  			continue;
  		}
  		if(line.indexOf("UNIQUE")>=0){
  			uniques.add(line);
  			continue;
  		}
  		if(line.indexOf("SINGLEKEY") >=0){
  			indexes.add(line);
  			continue;
  		}
    	
	  	String[] words = line.split("[ ]+");
	  	String name=words[0].replaceAll("`", "");
	  	if(words.length < 2){
		  	throw new Exception(String.format("Parsing probeml for table %s\n",t.name, line));
	  	}
	  	String type=typeFor(words[1]);
	  	if(count++ > 0)
	  		out.print(",");
	  	else
	  		out.print(" ");
	  		
	  	out.printf("  [%s] %s", name, type);
	  	t.addColumn(name);
	  	if (line.indexOf("IDENTITY(1,1)")>=0)
	  		t.hasIdentity=true;
	  	for(int i = 2; i < words.length;i++)
		  	out.printf(" %s",words[i]);
  		out.print("\n");
	  }	  
	  out.print(")\n\n");
    if(primaryKey != null)
    	keysout.printf("%s\n\n",primKey(primaryKey, tablename));
	  for(String key : uniqueindexes)
	  	keysout.printf("\n\n %s",index(key, tablename));
	  
	  for(String key : indexes)
	  	keysout.printf("\n\n -- TODO DEFINE: %s\n%s\n",key,singlekey(key,tablename));
	  for(String key : fks)
	  	keysout.printf("\n%s\n\n",fk(key,tablename));
	  
	  
	  return t;
	}
	
	public static String typeFor(String t){
		String parens="";
		int index=t.indexOf("(");
		if(index >=0){
			parens=t.substring(index);
			t=t.substring(0,index);
		}
		t=t.toUpperCase();
		if(t.equals("TIMESTAMP")) return "DATETIME";
		if(t.equals("DOUBLE")) return "FLOAT";
		if(t.equals("FLOAT")) return "REAL";
		if(t.startsWith("INT")) return "INTEGER";
		if(t.startsWith("BOOLEAN")) return "BIT";
		if(t.startsWith("MEDIUMTEXT")) return "TEXT";
		if(t.startsWith("LONGTEXT")) return "TEXT";
		if(t.equals("BIT")|| t.equals("SMALLINT") || t.equals("TINYINT")||t.equals("BIGINT")) return t;
		if(t.equals("FLOAT")) return "REAL";
		return t+parens;
	}
	
	public static String testIndex(String line){
		if (line.trim().toLowerCase().startsWith("key"))
			return line;
		return null;
	}
	
	public static String primKey(String pk, String name){
		StringBuffer sb = new StringBuffer("ALTER TABLE [").append(name).append("] ADD CONSTRAINT pk_").append(name).append(" PRIMARY KEY (");
		Matcher matcher = quotedname.matcher(pk);
		boolean first = true;
		while(matcher.find()){
			String column=pk.substring(matcher.start()+1, matcher.end()-1);
			if(!first)
				sb.append(",");
			sb.append("[").append(column).append("]");
			first=false;
		}
		sb.append(")");
		return sb.toString();
	}
	
	
	
	public static String droptable(String key){
		Matcher matcher = quotedname.matcher(key);
		int count = 0;
		if(matcher.find()){
			return key.substring(matcher.start()+1, matcher.end()-1);
		}
		return null;
	}
	
	public static String index(String key, String name){
		StringBuffer sb = new StringBuffer("CREATE INDEX ix_").append(name).append("_");
		Matcher matcher = quotedname.matcher(key);
		int count = 0;
		while(matcher.find()){
			String column=key.substring(matcher.start()+1, matcher.end()-1);
			if(count == 0){
				sb.append(column).append(" ON [").append(name).append("](");			
				count++;
			}
			else {
				if(count++ > 1)
					sb.append(",");
				sb.append("[").append(column).append("]");
			}
		}
		sb.append(")");
		return sb.toString();
	}
	public static String singlekey(String key, String name){
		StringBuffer sb = new StringBuffer("CREATE INDEX ix_").append(name).append("_");
		Matcher matcher = quotedname.matcher(key);
		int count = 0;
		StringBuffer sb2=new StringBuffer("(");
		
		int ix = key.indexOf("(");
		while(matcher.find()){
			if (matcher.start() < ix) // filter out cases where single key is follwed by name before definein the columns.
				continue;
			String column=key.substring(matcher.start()+1, matcher.end()-1);
			if(count>0)
			{
				sb.append("_");
				sb2.append(",");
			}
			count++;
  		sb.append(column);
  		sb2.append("[").append(column).append("]");
		}
		sb2.append(")");
		sb.append(" ON ").append(name).append(sb2);
		return sb.toString();
	}
	public static String fk(String key, String name){
		
		int ix = key.indexOf("REFERENCES");
		StringBuffer sb = new StringBuffer("-- TODO DEFINE: ").append(key);
		sb.append("\r\nALTER TABLE ").append(name).append(" ADD CONSTRAINT fk_").append(name).append("_");
		Matcher matcher = quotedname.matcher(key);
		ArrayList<String> c1 = new ArrayList<String>();
		ArrayList<String> c2 = new ArrayList<String>();
		while(matcher.find()){
			String column=key.substring(matcher.start()+1, matcher.end()-1);
			if(matcher.start() < ix)
				c1.add(column);
			else 
				c2.add(column);
		}
		int count = 0;
		for(String c :  c1){
			if(count > 0)
				sb.append("_");
			sb.append(c);
			count++;
		}
		
		String on_clause=key.substring(ix);
		ix = on_clause.indexOf(")")+1;
		on_clause=on_clause.substring(ix);
		if(on_clause != null){
			on_clause=on_clause.trim();
			on_clause = on_clause.toUpperCase();
			on_clause = on_clause.replaceAll("RESTRICT", "NO ACTION");
		}
		
		sb.append(" FOREIGN KEY(");
		
		count = 0;
		for(String c :  c1){
			if(count > 0)
				sb.append(";");
			sb.append(c);
			count++;
		}
		sb.append(") REFERENCES [").append(c2.get(0)).append("]");
		sb.append("(");
		for(int i = 1; i < c2.size(); i++){
			String c=c2.get(i);
			if(i > 1)
				sb.append(",");
			sb.append(c);
		}
		sb.append(") ").append(on_clause);
		return sb.toString();
	}
	
}
