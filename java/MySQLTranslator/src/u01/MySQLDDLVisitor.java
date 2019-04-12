package u01;

import java.util.List;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

import db.mssql.Column;
import db.mssql.DDLs;
import db.mssql.ForeignKey;
import db.mssql.Index;
import db.mssql.Constraint;
import db.mssql.Table;
import db.mssql.Util;
import mysql.mysql_ddlBaseVisitor;
import mysql.mysql_ddlParser.Column_def_table_constraintContext;
import mysql.mysql_ddlParser.Column_definitionContext;
import mysql.mysql_ddlParser.Column_name_listContext;
import mysql.mysql_ddlParser.Constant_expressionContext;
import mysql.mysql_ddlParser.Create_tableContext;
import mysql.mysql_ddlParser.Data_typeContext;
import mysql.mysql_ddlParser.Ddl_clauseContext;
import mysql.mysql_ddlParser.Ddl_clausesContext;
import mysql.mysql_ddlParser.IdContext;
import mysql.mysql_ddlParser.Sorted_column_name_listContext;
import mysql.mysql_ddlParser.Table_constraintContext;
import mysql.mysql_ddlParser.Table_foreign_key_defContext;
import mysql.mysql_ddlParser.Table_index_constraintContext;
import mysql.mysql_ddlParser.Table_unique_constraintContext;

public class MySQLDDLVisitor extends mysql_ddlBaseVisitor<DDLs> {

	
	@Override
	public DDLs visitDdl_clauses(Ddl_clausesContext ctx) {
		DDLs ddls = new DDLs();
		CreateTableVisitor ct = new CreateTableVisitor();
		for (Ddl_clauseContext ddl : ctx.ddl_clause()) {
			if (ddl.create_table() != null) {
				Table t = ct.visitCreate_table(ddl.create_table());
				ddls.creates.add(t);
			}
			if (ddl.drop_table() != null)
				ddls.drops.add(Util.normalize(ddl.drop_table().table_name().getText()));
		}
		return ddls;
	}

	private static class CreateTableVisitor extends mysql_ddlBaseVisitor<Table> {

		private Table table;
		@Override
		public Table visitCreate_table(Create_tableContext ctx) {
			// TODO Auto-generated method stub
			table = new Table();
			table.name = Util.normalize(ctx.table_name().getText());
			ColumnVisitor cv = new ColumnVisitor(table);
			
			for (Column_def_table_constraintContext cdf : ctx.column_def_table_constraint()) {
				if (cdf.column_definition() != null) {
					cv.visitColumn_definition(cdf.column_definition());
				} else if(cdf.table_constraint() != null) {
					this.visitTable_constraint(cdf.table_constraint());
				}
			}
			return table;
		}


		@Override
		public Table visitTable_constraint(Table_constraintContext ctx) {

			Constraint key ;
			if(ctx.table_unique_constraint() != null) {
				Table_unique_constraintContext tuc = ctx.table_unique_constraint();
				if(tuc.PRIMARY() != null) {
					key = new Constraint();
					table.setPrimaryKey(key);
				} else {
					Index index = new Index();
					table.addIndex(index);
					key = index;
				}
				if (tuc.id() != null)
					key.name = Util.normalize(tuc.id().getText());
				Sorted_column_name_listContext columns = tuc.sorted_column_name_list();
				for(IdContext id : columns.id()) {
					String name = Util.safeName(Util.normalize(id.getText()));
					key.add(name);
				}
			} else if(ctx.table_foreign_key_def() != null) {
				Table_foreign_key_defContext fkd = ctx.table_foreign_key_def();
				ForeignKey fk = new ForeignKey();
				table.addFK(fk);
				Column_name_listContext fromColumns = fkd.column_name_list().get(0);
				Column_name_listContext refColumns = fkd.column_name_list().get(1);
				for (IdContext id: fromColumns.id())
					fk.add(Util.safeName(Util.normalize(id.getText())));
				for (IdContext id: refColumns.id())
					fk.addRefColumn(Util.safeName(Util.normalize(id.getText())));
			} else if(ctx.table_index_constraint() != null) {
				Table_index_constraintContext tic = ctx.table_index_constraint();
				Index index = new Index();
				key = index;
				table.addIndex(index);
				if (tic.id() != null)
					index.name = Util.normalize(tic.id().getText());
				Sorted_column_name_listContext columns = tic.sorted_column_name_list();
				for(IdContext id : columns.id()) {
					String name = Util.safeName(Util.normalize(id.getText()));
					key.add(name);
				}
			}
			return this.table;
		}

		
	}


	private static class ColumnVisitor extends mysql_ddlBaseVisitor<Column> {

		private Table table;

		private Column currentColumn = null;
		private ColumnVisitor(Table t) {
			this.table = t;
		}

		@Override
		public Column visitColumn_definition(Column_definitionContext ctx) {
			currentColumn = new Column();
			table.addColumn(currentColumn);
			currentColumn.name = Util.normalize(ctx.id().getText());
			Data_typeContext dtx = ctx.data_type();
			String dt_name = dtx.getChild(0).getText();
			currentColumn.datatype = Util.my2mssql(dt_name);
			if (Util.typeHasLength(currentColumn.datatype)) {
				List<TerminalNode> dec = dtx.DECIMAL_LITERAL();
				if (dec != null) {
					if (dec.size() >= 1)
						currentColumn.length = dec.get(0).getText();
					if (dec.size() >= 2)
						currentColumn.precision = dec.get(1).getText();
				}
			}
			if(ctx.null_notnull() != null) {
				if(ctx.null_notnull().NOT() != null)
					currentColumn.nullnotnull ="NOT NULL";
				else
					currentColumn.nullnotnull = "NULL";
			}
			if(ctx.column_default() != null) {
				visitConstant_expression(ctx.column_default().constant_expression());
			}
			return currentColumn;
		}

		@Override
		public Column visitConstant_expression(Constant_expressionContext ctx) {
			// TODO Auto-generated method stub
			if(ctx.constant() != null)
				currentColumn.defaultvalue = ctx.constant().getText();
			else if(ctx.NULL() != null)
				currentColumn.defaultvalue = "NULL";
			return super.visitConstant_expression(ctx);
		}
		
		@Override
		public Column visitColumn_def_table_constraint(Column_def_table_constraintContext ctx) {
			// TODO Auto-generated method stub
			return super.visitColumn_def_table_constraint(ctx);
		}

	}
}
