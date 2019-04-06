package u01;

import java.util.List;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import u01.mssql.Column;
import u01.mssql.DDLs;
import u01.mssql.Table;
import u01.mssql.Util;
import mysql.mysql_ddlBaseVisitor;
import mysql.mysql_ddlParser.Column_def_table_constraintContext;
import mysql.mysql_ddlParser.Column_definitionContext;
import mysql.mysql_ddlParser.Create_tableContext;
import mysql.mysql_ddlParser.Data_typeContext;
import mysql.mysql_ddlParser.Ddl_clauseContext;
import mysql.mysql_ddlParser.Ddl_clausesContext;

public class MySQLDDLVisitor extends mysql_ddlBaseVisitor<DDLs>{
 
	
	
	
	@Override
	public  DDLs visitDdl_clauses(Ddl_clausesContext ctx) {
		DDLs ddls = new DDLs();
		CreateTableVisitor ct = new CreateTableVisitor();
		for(Ddl_clauseContext ddl: ctx.ddl_clause()){
			if(ddl.create_table() != null){
				Table t = ct.visitCreate_table(ddl.create_table());
				ddls.creates.add(t);
			}
			if(ddl.drop_table() != null)
				ddls.drops.add(ddl.drop_table().table_name().getText());
		}
		return ddls;
	}

	private static class CreateTableVisitor extends mysql_ddlBaseVisitor<Table>{

		@Override
		public Table visitCreate_table(Create_tableContext ctx) {
			// TODO Auto-generated method stub
			Table t = new Table();
			t.name = Util.normalize(ctx.table_name().getText());
			ColumnVisitor cv = new ColumnVisitor(t);
			for(Column_def_table_constraintContext cdf: ctx.column_def_table_constraint()){
				if(cdf.column_definition() != null)
				{
					cv.visitColumn_definition(cdf.column_definition());
				}
			}
			return t;
		}
		
	}
	
	private static class ColumnVisitor extends mysql_ddlBaseVisitor<Column>{

		private Table table;
		private ColumnVisitor(Table t){
			this.table = t;
		}
		@Override
		public Column visitColumn_definition(Column_definitionContext ctx) {
			Column c = new Column();
			table.addColumn(c);
			c.name=Util.normalize(ctx.id().getText());
			Data_typeContext dtx =  ctx.data_type();
			String dt_name = dtx.getChild(0).getText();
			c.datatype=Util.datatype(dt_name);
			if(Util.typeHasLength(c.datatype)){
			List<TerminalNode> dec = dtx.DECIMAL_LITERAL();
			if(dec != null){
				if(dec.size() >= 1)
					c.length=dec.get(0).getText();
				if(dec.size() >= 2)
					c.precision=dec.get(1).getText();
			}
			}
			return c;
		}

		@Override
		public Column visitColumn_def_table_constraint(Column_def_table_constraintContext ctx) {
			// TODO Auto-generated method stub
			return super.visitColumn_def_table_constraint(ctx);
		}


		
	}	
}
