package u01;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.io.PrintStream;
import java.io.FileOutputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import db.mssql.DDLs;
import db.mssql.ExternalTableWriter;
import mysql.mysql_ddlLexer;
import mysql.mysql_ddlParser;

public class ANTLRTranslator {

	File infile, outfile;
	

	public static void main(String[] args) throws Exception {

		String DataSourceName, DBName;
		
		try {
			
			//TODO: make these command line args, or config file?
			DataSourceName = "mydsp016";
			DBName = "cbioportal";
			
			ANTLRTranslator t = new ANTLRTranslator();
			mysql_ddlParser.BatchContext ct = t.parse(new File(args[0]));
			MySQLDDLVisitor v = new MySQLDDLVisitor();
			DDLs ddls = v.visitDdl_clauses(ct.ddl_clauses());
			// data_source=mydsp016 location=cbioportal.<tablename>
			ExternalTableWriter etw = new ExternalTableWriter(DataSourceName,DBName);
			ddls.write(System.out, etw);
			//test: write out to individual files
			//set FileOutputStream to "false" to overwrite exisiting files
			//TODO: maybe make this configurable?
			ddls.writeDropStatements(new PrintStream(new FileOutputStream(DBName + "-drop.sql",false)), etw);
			ddls.writeCreateStatements(new PrintStream(new FileOutputStream(DBName + "-create.sql",false)), etw);
			ddls.writeStatisticsStatements(new PrintStream(new FileOutputStream(DBName + "-stats.sql",false)), etw);
			ddls.writeTestQueries(new PrintStream(new FileOutputStream(DBName + "-testqueries.sql",false)), etw);
			// print(ct);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public mysql_ddlParser.BatchContext parse(File file) throws IOException {
		String code = readFile(file, Charset.forName("UTF-8"));
		mysql_ddlLexer lexer = new mysql_ddlLexer(new ANTLRInputStream(code));
		lexer.removeErrorListeners();
    lexer.addErrorListener(ThrowingErrorListener.INSTANCE);

		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		mysql_ddlParser parser = new mysql_ddlParser(tokens);
//		parser.setErrorHandler(new BailErrorStrategy());
	  parser.removeErrorListeners();
	  parser.addErrorListener(ThrowingErrorListener.INSTANCE);

		return parser.batch();
	}

	private static String readFile(File file, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(file.toPath());
		return new String(encoded, encoding);
	}

	public static void print(RuleContext ctx) {
		explore(ctx, 0);
	}

	private static void explore(RuleContext ctx, int indentation) {
		String ruleName = mysql_ddlParser.ruleNames[ctx.getRuleIndex()];
		for (int i = 0; i < indentation; i++) {
			System.out.print("  ");
		}
		System.out.println(ruleName);
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree element = ctx.getChild(i);
			if (element instanceof RuleContext) {
				explore((RuleContext) element, indentation + 1);
			}
		}
	}

}
