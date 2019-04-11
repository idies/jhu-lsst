// Generated from ./grammars/mysql_ddl.g4 by ANTLR 4.5.3
package mysql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mysql_ddlParser}.
 */
public interface mysql_ddlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#mysql_ddl_file}.
	 * @param ctx the parse tree
	 */
	void enterMysql_ddl_file(mysql_ddlParser.Mysql_ddl_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#mysql_ddl_file}.
	 * @param ctx the parse tree
	 */
	void exitMysql_ddl_file(mysql_ddlParser.Mysql_ddl_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(mysql_ddlParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(mysql_ddlParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#ddl_clauses}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clauses(mysql_ddlParser.Ddl_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#ddl_clauses}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clauses(mysql_ddlParser.Ddl_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(mysql_ddlParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(mysql_ddlParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(mysql_ddlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(mysql_ddlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(mysql_ddlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(mysql_ddlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(mysql_ddlParser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(mysql_ddlParser.Table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void enterTable_option(mysql_ddlParser.Table_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_option}.
	 * @param ctx the parse tree
	 */
	void exitTable_option(mysql_ddlParser.Table_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#char_set}.
	 * @param ctx the parse tree
	 */
	void enterChar_set(mysql_ddlParser.Char_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#char_set}.
	 * @param ctx the parse tree
	 */
	void exitChar_set(mysql_ddlParser.Char_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_comment}.
	 * @param ctx the parse tree
	 */
	void enterTable_comment(mysql_ddlParser.Table_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_comment}.
	 * @param ctx the parse tree
	 */
	void exitTable_comment(mysql_ddlParser.Table_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#column_comment}.
	 * @param ctx the parse tree
	 */
	void enterColumn_comment(mysql_ddlParser.Column_commentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#column_comment}.
	 * @param ctx the parse tree
	 */
	void exitColumn_comment(mysql_ddlParser.Column_commentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(mysql_ddlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(mysql_ddlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(mysql_ddlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(mysql_ddlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(mysql_ddlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(mysql_ddlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(mysql_ddlParser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(mysql_ddlParser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(mysql_ddlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(mysql_ddlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#column_definition1}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition1(mysql_ddlParser.Column_definition1Context ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#column_definition1}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition1(mysql_ddlParser.Column_definition1Context ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(mysql_ddlParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(mysql_ddlParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(mysql_ddlParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(mysql_ddlParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(mysql_ddlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(mysql_ddlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(mysql_ddlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(mysql_ddlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_unique_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_unique_constraint(mysql_ddlParser.Table_unique_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_unique_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_unique_constraint(mysql_ddlParser.Table_unique_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_index_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_index_constraint(mysql_ddlParser.Table_index_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_index_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_index_constraint(mysql_ddlParser.Table_index_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_foreign_key_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_foreign_key_def(mysql_ddlParser.Table_foreign_key_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_foreign_key_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_foreign_key_def(mysql_ddlParser.Table_foreign_key_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#fk_on_delete}.
	 * @param ctx the parse tree
	 */
	void enterFk_on_delete(mysql_ddlParser.Fk_on_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#fk_on_delete}.
	 * @param ctx the parse tree
	 */
	void exitFk_on_delete(mysql_ddlParser.Fk_on_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#fk_on_update}.
	 * @param ctx the parse tree
	 */
	void enterFk_on_update(mysql_ddlParser.Fk_on_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#fk_on_update}.
	 * @param ctx the parse tree
	 */
	void exitFk_on_update(mysql_ddlParser.Fk_on_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(mysql_ddlParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(mysql_ddlParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(mysql_ddlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(mysql_ddlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(mysql_ddlParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(mysql_ddlParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name(mysql_ddlParser.Func_proc_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#func_proc_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name(mysql_ddlParser.Func_proc_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void enterDdl_object(mysql_ddlParser.Ddl_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void exitDdl_object(mysql_ddlParser.Ddl_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(mysql_ddlParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(mysql_ddlParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(mysql_ddlParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(mysql_ddlParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#sorted_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterSorted_column_name_list(mysql_ddlParser.Sorted_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#sorted_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitSorted_column_name_list(mysql_ddlParser.Sorted_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(mysql_ddlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(mysql_ddlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(mysql_ddlParser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(mysql_ddlParser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(mysql_ddlParser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(mysql_ddlParser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(mysql_ddlParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(mysql_ddlParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(mysql_ddlParser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(mysql_ddlParser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#ms_data_type}.
	 * @param ctx the parse tree
	 */
	void enterMs_data_type(mysql_ddlParser.Ms_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#ms_data_type}.
	 * @param ctx the parse tree
	 */
	void exitMs_data_type(mysql_ddlParser.Ms_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(mysql_ddlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(mysql_ddlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(mysql_ddlParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(mysql_ddlParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(mysql_ddlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(mysql_ddlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(mysql_ddlParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(mysql_ddlParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(mysql_ddlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(mysql_ddlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(mysql_ddlParser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(mysql_ddlParser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(mysql_ddlParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(mysql_ddlParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(mysql_ddlParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(mysql_ddlParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mysql_ddlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(mysql_ddlParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mysql_ddlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(mysql_ddlParser.File_sizeContext ctx);
}