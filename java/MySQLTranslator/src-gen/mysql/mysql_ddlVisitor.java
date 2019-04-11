// Generated from ./grammars/mysql_ddl.g4 by ANTLR 4.5.3
package mysql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mysql_ddlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mysql_ddlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#mysql_ddl_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysql_ddl_file(mysql_ddlParser.Mysql_ddl_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(mysql_ddlParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#ddl_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clauses(mysql_ddlParser.Ddl_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(mysql_ddlParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(mysql_ddlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(mysql_ddlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_options(mysql_ddlParser.Table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_option(mysql_ddlParser.Table_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#char_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_set(mysql_ddlParser.Char_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_comment(mysql_ddlParser.Table_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#column_comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_comment(mysql_ddlParser.Column_commentContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(mysql_ddlParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(mysql_ddlParser.Drop_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(mysql_ddlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(mysql_ddlParser.Column_def_table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(mysql_ddlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#column_definition1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition1(mysql_ddlParser.Column_definition1Context ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(mysql_ddlParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(mysql_ddlParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(mysql_ddlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(mysql_ddlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_unique_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_unique_constraint(mysql_ddlParser.Table_unique_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_index_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_index_constraint(mysql_ddlParser.Table_index_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_foreign_key_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_foreign_key_def(mysql_ddlParser.Table_foreign_key_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#fk_on_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_on_delete(mysql_ddlParser.Fk_on_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#fk_on_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_on_update(mysql_ddlParser.Fk_on_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(mysql_ddlParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(mysql_ddlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(mysql_ddlParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#func_proc_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name(mysql_ddlParser.Func_proc_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#ddl_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_object(mysql_ddlParser.Ddl_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(mysql_ddlParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(mysql_ddlParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#sorted_column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSorted_column_name_list(mysql_ddlParser.Sorted_column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(mysql_ddlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(mysql_ddlParser.On_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(mysql_ddlParser.ClusteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(mysql_ddlParser.Null_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(mysql_ddlParser.Scalar_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#ms_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMs_data_type(mysql_ddlParser.Ms_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(mysql_ddlParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(mysql_ddlParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(mysql_ddlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(mysql_ddlParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(mysql_ddlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(mysql_ddlParser.Simple_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(mysql_ddlParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(mysql_ddlParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mysql_ddlParser#file_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_size(mysql_ddlParser.File_sizeContext ctx);
}