package u01;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;

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

		try {
			ANTLRTranslator t = new ANTLRTranslator();
			mysql_ddlParser.BatchContext ct = t.parse(new File(args[0]));
			MySQLDDLVisitor v = new MySQLDDLVisitor();
			DDLs ddls = v.visitDdl_clauses(ct.ddl_clauses());
			
			ExternalTableWriter etw = new ExternalTableWriter("pg64","manga.mangadapdb.binid");
			ddls.write(System.out, etw);
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
