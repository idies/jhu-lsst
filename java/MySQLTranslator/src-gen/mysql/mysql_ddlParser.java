// Generated from ./grammars/mysql_ddl.g4 by ANTLR 4.5.3
package mysql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mysql_ddlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ACTION=2, ADD=3, ALL=4, ALTER=5, AND=6, ANY=7, AS=8, ASC=9, AUTHORIZATION=10, 
		AUTO_INCREMENT=11, BACKUP=12, BEGIN=13, BETWEEN=14, BREAK=15, BROWSE=16, 
		BULK=17, BY=18, CASCADE=19, CASE=20, CHANGETABLE=21, CHANGES=22, CHECK=23, 
		CHECKPOINT=24, CLOSE=25, CLUSTERED=26, COALESCE=27, COLLATE=28, COLUMN=29, 
		COMMIT=30, COMPUTE=31, CONSTRAINT=32, CONTAINMENT=33, CONTAINS=34, CONTAINSTABLE=35, 
		CONTINUE=36, CONVERT=37, CREATE=38, CROSS=39, CURRENT=40, CURRENT_DATE=41, 
		CURRENT_TIME=42, CURRENT_TIMESTAMP=43, CURRENT_USER=44, CURSOR=45, DATABASE=46, 
		DBCC=47, DEALLOCATE=48, DECLARE=49, DEFAULT=50, DELETE=51, DENY=52, DESC=53, 
		DISK=54, DISTINCT=55, DISTRIBUTED=56, DROP=57, DUMP=58, ELSE=59, END=60, 
		ENGINE=61, ERRLVL=62, ESCAPE=63, EXCEPT=64, EXECUTE=65, EXISTS=66, EXIT=67, 
		EXTERNAL=68, FETCH=69, FILE=70, FILENAME=71, FILLFACTOR=72, FOR=73, FORCESEEK=74, 
		FOREIGN=75, FREETEXT=76, FREETEXTTABLE=77, FROM=78, FULL=79, FUNCTION=80, 
		GOTO=81, GRANT=82, GROUP=83, HAVING=84, IDENTITY=85, IDENTITYCOL=86, IDENTITY_INSERT=87, 
		IF=88, IN=89, INDEX=90, INNER=91, INSERT=92, INTERSECT=93, INTO=94, IS=95, 
		JOIN=96, KEY=97, KILL=98, LEFT=99, LIKE=100, LINENO=101, LOAD=102, LOG=103, 
		MERGE=104, NATIONAL=105, NOCHECK=106, NONCLUSTERED=107, NONE=108, NO=109, 
		NOT=110, NULL=111, NULLIF=112, OF=113, OFF=114, OFFSETS=115, ON=116, OPEN=117, 
		OPENDATASOURCE=118, OPENQUERY=119, OPENROWSET=120, OPENXML=121, OPTION=122, 
		OR=123, ORDER=124, OUTER=125, OVER=126, PARTIAL=127, PERCENT=128, PIVOT=129, 
		PLAN=130, PRECISION=131, PRIMARY=132, PRINT=133, PROC=134, PROCEDURE=135, 
		PUBLIC=136, RAISERROR=137, READ=138, READTEXT=139, RECONFIGURE=140, REFERENCES=141, 
		REPLICATION=142, RESTORE=143, RESTRICT=144, RETURN=145, REVERT=146, REVOKE=147, 
		RIGHT=148, ROLLBACK=149, ROWCOUNT=150, ROWGUIDCOL=151, RULE=152, SAVE=153, 
		SCHEMA=154, SECURITYAUDIT=155, SELECT=156, SEMANTICKEYPHRASETABLE=157, 
		SEMANTICSIMILARITYDETAILSTABLE=158, SEMANTICSIMILARITYTABLE=159, SESSION_USER=160, 
		SET=161, SETUSER=162, SHUTDOWN=163, SOME=164, STATISTICS=165, SYSTEM_USER=166, 
		TABLE=167, TABLESAMPLE=168, TEXTSIZE=169, THEN=170, TO=171, TOP=172, TRAN=173, 
		TRANSACTION=174, TRIGGER=175, TRUNCATE=176, TRY_CONVERT=177, TSEQUAL=178, 
		UNION=179, UNIQUE=180, UNPIVOT=181, UNSIGNED=182, UPDATE=183, UPDATETEXT=184, 
		USE=185, USER=186, VALUES=187, VARYING=188, VIEW=189, WAITFOR=190, WHEN=191, 
		WHERE=192, WHILE=193, WITH=194, WITHIN=195, WRITETEXT=196, ABSOLUTE=197, 
		AFTER=198, ALLOWED=199, ALLOW_SNAPSHOT_ISOLATION=200, ANSI_NULLS=201, 
		ANSI_NULL_DEFAULT=202, ANSI_PADDING=203, ANSI_WARNINGS=204, APPLY=205, 
		ARITHABORT=206, AUTO=207, AUTO_CLEANUP=208, AUTO_CLOSE=209, AUTO_CREATE_STATISTICS=210, 
		AUTO_SHRINK=211, AUTO_UPDATE_STATISTICS=212, AUTO_UPDATE_STATISTICS_ASYNC=213, 
		AVG=214, BASE64=215, BINARY_CHECKSUM=216, BULK_LOGGED=217, CALLER=218, 
		CAST=219, CATCH=220, CHANGE_RETENTION=221, CHANGE_TRACKING=222, CHARSET=223, 
		CHECKSUM=224, CHECKSUM_AGG=225, COMMENT=226, COMMITTED=227, COMPATIBILITY_LEVEL=228, 
		CONCAT=229, CONCAT_NULL_YIELDS_NULL=230, CONTROL=231, COOKIE=232, COUNT=233, 
		COUNT_BIG=234, CURSOR_CLOSE_ON_COMMIT=235, CURSOR_DEFAULT=236, DATEADD=237, 
		DATEDIFF=238, DATENAME=239, DATEPART=240, DATE_CORRELATION_OPTIMIZATION=241, 
		DAYS=242, DB_CHAINING=243, DEFAULT_FULLTEXT_LANGUAGE=244, DEFAULT_LANGUAGE=245, 
		DELAY=246, DELAYED_DURABILITY=247, DELETED=248, DENSE_RANK=249, DIRECTORY_NAME=250, 
		DISABLE=251, DISABLED=252, DISABLE_BROKER=253, DYNAMIC=254, EMERGENCY=255, 
		ENABLE_BROKER=256, ENCRYPTION=257, ERROR_BROKER_CONVERSATIONS=258, EXPAND=259, 
		FAST=260, FAST_FORWARD=261, FILEGROUP=262, FILEGROWTH=263, FILESTREAM=264, 
		FIRST=265, FOLLOWING=266, FORCE=267, FORCED=268, FORWARD_ONLY=269, FULLSCAN=270, 
		GB=271, GLOBAL=272, GO=273, GROUPING=274, GROUPING_ID=275, HADR=276, HASH=277, 
		HONOR_BROKER_PRIORITY=278, HOURS=279, IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX=280, 
		IMMEDIATE=281, IMPERSONATE=282, INCREMENTAL=283, INSENSITIVE=284, INSERTED=285, 
		ISOLATION=286, KB=287, KEEP=288, KEEPFIXED=289, KEYSET=290, LAST=291, 
		LEVEL=292, LOCAL=293, LOCK_ESCALATION=294, LOGIN=295, LOOP=296, MARK=297, 
		MAX=298, MAXDOP=299, MAXRECURSION=300, MAXSIZE=301, MB=302, MEMORY_OPTIMIZED_DATA=303, 
		MIN=304, MINUTES=305, MIN_ACTIVE_ROWVERSION=306, MIXED_PAGE_ALLOCATION=307, 
		MODIFY=308, MULTI_USER=309, NAME=310, NESTED_TRIGGERS=311, NEW_BROKER=312, 
		NEXT=313, NOCOUNT=314, NOEXPAND=315, NON_TRANSACTED_ACCESS=316, NORECOMPUTE=317, 
		NO_WAIT=318, NTILE=319, NUMBER=320, NUMERIC_ROUNDABORT=321, OFFLINE=322, 
		OFFSET=323, ONLINE=324, ONLY=325, OPTIMISTIC=326, OPTIMIZE=327, OUT=328, 
		OUTPUT=329, OWNER=330, PAGE_VERIFY=331, PARAMETERIZATION=332, PARTITION=333, 
		PATH=334, PRECEDING=335, PRIOR=336, PRIVILEGES=337, QUOTED_IDENTIFIER=338, 
		RANGE=339, RANK=340, READONLY=341, READ_COMMITTED_SNAPSHOT=342, READ_ONLY=343, 
		READ_WRITE=344, RECOMPILE=345, RECOVERY=346, RECURSIVE_TRIGGERS=347, RELATIVE=348, 
		REMOTE=349, REPEATABLE=350, RESTRICTED_USER=351, ROBUST=352, ROOT=353, 
		ROW=354, ROWGUID=355, ROWS=356, ROW_NUMBER=357, SAMPLE=358, SCHEMABINDING=359, 
		SCROLL=360, SCROLL_LOCKS=361, SECONDS=362, SELF=363, SERIALIZABLE=364, 
		SHOWPLAN=365, SIMPLE=366, SINGLE_USER=367, SIZE=368, SNAPSHOT=369, SPATIAL_WINDOW_MAX_CELLS=370, 
		STATIC=371, STATS_STREAM=372, STDEV=373, STDEVP=374, SUM=375, TAKE=376, 
		TARGET_RECOVERY_TIME=377, TB=378, TEXTIMAGE_ON=379, THROW=380, TIES=381, 
		TIME=382, TORN_PAGE_DETECTION=383, TRANSFORM_NOISE_WORDS=384, TRUSTWORTHY=385, 
		TRY=386, TWO_DIGIT_YEAR_CUTOFF=387, TYPE=388, TYPE_WARNING=389, UNBOUNDED=390, 
		UNCOMMITTED=391, UNKNOWN=392, UNLIMITED=393, USING=394, VAR=395, VARP=396, 
		VIEWS=397, VIEW_METADATA=398, WORK=399, XML=400, XMLNAMESPACES=401, ZEROFILL=402, 
		DOLLAR_ACTION=403, BIT=404, BINARY=405, BOOLEAN=406, TINYINT=407, SMALLINT=408, 
		MEDIUMINT=409, INT=410, INTEGER=411, BIGINT=412, REAL=413, FLOAT=414, 
		DOUBLE=415, DECIMAL=416, NUMERIC=417, DATE=418, DATETIME=419, TIMESTAMP=420, 
		YEAR=421, CHAR=422, CHARACTER=423, VARCHAR=424, VARBINARY=425, TINYBLOB=426, 
		BLOB=427, MEDIUMBLOB=428, LONGBLOB=429, TINYTEXT=430, TEXT=431, MEDIUMTEXT=432, 
		LONGTEXT=433, ENUM=434, JSON=435, SPACE=436, MULTILINE_COMMENT=437, LINE_COMMENT=438, 
		DOUBLE_QUOTE_ID=439, LEFT_QUOTE_ID=440, SQUARE_BRACKET_ID=441, LOCAL_ID=442, 
		DECIMAL_LITERAL=443, ID=444, STRING=445, BINARY_LITERAL=446, FLOAT_LITERAL=447, 
		REAL_LITERAL=448, EQUAL=449, GREATER=450, LESS=451, EXCLAMATION=452, PLUS_ASSIGN=453, 
		MINUS_ASSIGN=454, MULT_ASSIGN=455, DIV_ASSIGN=456, MOD_ASSIGN=457, AND_ASSIGN=458, 
		XOR_ASSIGN=459, OR_ASSIGN=460, DOT=461, UNDERLINE=462, AT=463, SHARP=464, 
		DOLLAR=465, LR_BRACKET=466, RR_BRACKET=467, COMMA=468, SEMI=469, COLON=470, 
		STAR=471, DIVIDE=472, MODULE=473, PLUS=474, MINUS=475, BIT_NOT=476, BIT_OR=477, 
		BIT_AND=478, BIT_XOR=479;
	public static final int
		RULE_mysql_ddl_file = 0, RULE_batch = 1, RULE_ddl_clauses = 2, RULE_ddl_clause = 3, 
		RULE_create_index = 4, RULE_create_table = 5, RULE_table_options = 6, 
		RULE_table_option = 7, RULE_char_set = 8, RULE_table_comment = 9, RULE_column_comment = 10, 
		RULE_alter_table = 11, RULE_drop_index = 12, RULE_drop_table = 13, RULE_column_def_table_constraint = 14, 
		RULE_column_definition = 15, RULE_column_definition1 = 16, RULE_column_default = 17, 
		RULE_constant_expression = 18, RULE_column_constraint = 19, RULE_table_constraint = 20, 
		RULE_table_unique_constraint = 21, RULE_table_index_constraint = 22, RULE_table_foreign_key_def = 23, 
		RULE_fk_on_delete = 24, RULE_fk_on_update = 25, RULE_full_table_name = 26, 
		RULE_table_name = 27, RULE_simple_name = 28, RULE_func_proc_name = 29, 
		RULE_ddl_object = 30, RULE_full_column_name = 31, RULE_column_name_list = 32, 
		RULE_sorted_column_name_list = 33, RULE_cursor_name = 34, RULE_on_off = 35, 
		RULE_clustered = 36, RULE_null_notnull = 37, RULE_scalar_function_name = 38, 
		RULE_ms_data_type = 39, RULE_data_type = 40, RULE_default_value = 41, 
		RULE_constant = 42, RULE_sign = 43, RULE_id = 44, RULE_simple_id = 45, 
		RULE_comparison_operator = 46, RULE_assignment_operator = 47, RULE_file_size = 48;
	public static final String[] ruleNames = {
		"mysql_ddl_file", "batch", "ddl_clauses", "ddl_clause", "create_index", 
		"create_table", "table_options", "table_option", "char_set", "table_comment", 
		"column_comment", "alter_table", "drop_index", "drop_table", "column_def_table_constraint", 
		"column_definition", "column_definition1", "column_default", "constant_expression", 
		"column_constraint", "table_constraint", "table_unique_constraint", "table_index_constraint", 
		"table_foreign_key_def", "fk_on_delete", "fk_on_update", "full_table_name", 
		"table_name", "simple_name", "func_proc_name", "ddl_object", "full_column_name", 
		"column_name_list", "sorted_column_name_list", "cursor_name", "on_off", 
		"clustered", "null_notnull", "scalar_function_name", "ms_data_type", "data_type", 
		"default_value", "constant", "sign", "id", "simple_id", "comparison_operator", 
		"assignment_operator", "file_size"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'utf8'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'='", "'>'", "'<'", "'!'", "'+='", 
		"'-='", "'*='", "'/='", "'%='", "'&='", "'^='", "'|='", "'.'", "'_'", 
		"'@'", "'#'", "'$'", "'('", "')'", "','", "';'", "':'", "'*'", "'/'", 
		"'%'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ACTION", "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", 
		"AUTHORIZATION", "AUTO_INCREMENT", "BACKUP", "BEGIN", "BETWEEN", "BREAK", 
		"BROWSE", "BULK", "BY", "CASCADE", "CASE", "CHANGETABLE", "CHANGES", "CHECK", 
		"CHECKPOINT", "CLOSE", "CLUSTERED", "COALESCE", "COLLATE", "COLUMN", "COMMIT", 
		"COMPUTE", "CONSTRAINT", "CONTAINMENT", "CONTAINS", "CONTAINSTABLE", "CONTINUE", 
		"CONVERT", "CREATE", "CROSS", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", 
		"CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "DATABASE", "DBCC", "DEALLOCATE", 
		"DECLARE", "DEFAULT", "DELETE", "DENY", "DESC", "DISK", "DISTINCT", "DISTRIBUTED", 
		"DROP", "DUMP", "ELSE", "END", "ENGINE", "ERRLVL", "ESCAPE", "EXCEPT", 
		"EXECUTE", "EXISTS", "EXIT", "EXTERNAL", "FETCH", "FILE", "FILENAME", 
		"FILLFACTOR", "FOR", "FORCESEEK", "FOREIGN", "FREETEXT", "FREETEXTTABLE", 
		"FROM", "FULL", "FUNCTION", "GOTO", "GRANT", "GROUP", "HAVING", "IDENTITY", 
		"IDENTITYCOL", "IDENTITY_INSERT", "IF", "IN", "INDEX", "INNER", "INSERT", 
		"INTERSECT", "INTO", "IS", "JOIN", "KEY", "KILL", "LEFT", "LIKE", "LINENO", 
		"LOAD", "LOG", "MERGE", "NATIONAL", "NOCHECK", "NONCLUSTERED", "NONE", 
		"NO", "NOT", "NULL", "NULLIF", "OF", "OFF", "OFFSETS", "ON", "OPEN", "OPENDATASOURCE", 
		"OPENQUERY", "OPENROWSET", "OPENXML", "OPTION", "OR", "ORDER", "OUTER", 
		"OVER", "PARTIAL", "PERCENT", "PIVOT", "PLAN", "PRECISION", "PRIMARY", 
		"PRINT", "PROC", "PROCEDURE", "PUBLIC", "RAISERROR", "READ", "READTEXT", 
		"RECONFIGURE", "REFERENCES", "REPLICATION", "RESTORE", "RESTRICT", "RETURN", 
		"REVERT", "REVOKE", "RIGHT", "ROLLBACK", "ROWCOUNT", "ROWGUIDCOL", "RULE", 
		"SAVE", "SCHEMA", "SECURITYAUDIT", "SELECT", "SEMANTICKEYPHRASETABLE", 
		"SEMANTICSIMILARITYDETAILSTABLE", "SEMANTICSIMILARITYTABLE", "SESSION_USER", 
		"SET", "SETUSER", "SHUTDOWN", "SOME", "STATISTICS", "SYSTEM_USER", "TABLE", 
		"TABLESAMPLE", "TEXTSIZE", "THEN", "TO", "TOP", "TRAN", "TRANSACTION", 
		"TRIGGER", "TRUNCATE", "TRY_CONVERT", "TSEQUAL", "UNION", "UNIQUE", "UNPIVOT", 
		"UNSIGNED", "UPDATE", "UPDATETEXT", "USE", "USER", "VALUES", "VARYING", 
		"VIEW", "WAITFOR", "WHEN", "WHERE", "WHILE", "WITH", "WITHIN", "WRITETEXT", 
		"ABSOLUTE", "AFTER", "ALLOWED", "ALLOW_SNAPSHOT_ISOLATION", "ANSI_NULLS", 
		"ANSI_NULL_DEFAULT", "ANSI_PADDING", "ANSI_WARNINGS", "APPLY", "ARITHABORT", 
		"AUTO", "AUTO_CLEANUP", "AUTO_CLOSE", "AUTO_CREATE_STATISTICS", "AUTO_SHRINK", 
		"AUTO_UPDATE_STATISTICS", "AUTO_UPDATE_STATISTICS_ASYNC", "AVG", "BASE64", 
		"BINARY_CHECKSUM", "BULK_LOGGED", "CALLER", "CAST", "CATCH", "CHANGE_RETENTION", 
		"CHANGE_TRACKING", "CHARSET", "CHECKSUM", "CHECKSUM_AGG", "COMMENT", "COMMITTED", 
		"COMPATIBILITY_LEVEL", "CONCAT", "CONCAT_NULL_YIELDS_NULL", "CONTROL", 
		"COOKIE", "COUNT", "COUNT_BIG", "CURSOR_CLOSE_ON_COMMIT", "CURSOR_DEFAULT", 
		"DATEADD", "DATEDIFF", "DATENAME", "DATEPART", "DATE_CORRELATION_OPTIMIZATION", 
		"DAYS", "DB_CHAINING", "DEFAULT_FULLTEXT_LANGUAGE", "DEFAULT_LANGUAGE", 
		"DELAY", "DELAYED_DURABILITY", "DELETED", "DENSE_RANK", "DIRECTORY_NAME", 
		"DISABLE", "DISABLED", "DISABLE_BROKER", "DYNAMIC", "EMERGENCY", "ENABLE_BROKER", 
		"ENCRYPTION", "ERROR_BROKER_CONVERSATIONS", "EXPAND", "FAST", "FAST_FORWARD", 
		"FILEGROUP", "FILEGROWTH", "FILESTREAM", "FIRST", "FOLLOWING", "FORCE", 
		"FORCED", "FORWARD_ONLY", "FULLSCAN", "GB", "GLOBAL", "GO", "GROUPING", 
		"GROUPING_ID", "HADR", "HASH", "HONOR_BROKER_PRIORITY", "HOURS", "IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX", 
		"IMMEDIATE", "IMPERSONATE", "INCREMENTAL", "INSENSITIVE", "INSERTED", 
		"ISOLATION", "KB", "KEEP", "KEEPFIXED", "KEYSET", "LAST", "LEVEL", "LOCAL", 
		"LOCK_ESCALATION", "LOGIN", "LOOP", "MARK", "MAX", "MAXDOP", "MAXRECURSION", 
		"MAXSIZE", "MB", "MEMORY_OPTIMIZED_DATA", "MIN", "MINUTES", "MIN_ACTIVE_ROWVERSION", 
		"MIXED_PAGE_ALLOCATION", "MODIFY", "MULTI_USER", "NAME", "NESTED_TRIGGERS", 
		"NEW_BROKER", "NEXT", "NOCOUNT", "NOEXPAND", "NON_TRANSACTED_ACCESS", 
		"NORECOMPUTE", "NO_WAIT", "NTILE", "NUMBER", "NUMERIC_ROUNDABORT", "OFFLINE", 
		"OFFSET", "ONLINE", "ONLY", "OPTIMISTIC", "OPTIMIZE", "OUT", "OUTPUT", 
		"OWNER", "PAGE_VERIFY", "PARAMETERIZATION", "PARTITION", "PATH", "PRECEDING", 
		"PRIOR", "PRIVILEGES", "QUOTED_IDENTIFIER", "RANGE", "RANK", "READONLY", 
		"READ_COMMITTED_SNAPSHOT", "READ_ONLY", "READ_WRITE", "RECOMPILE", "RECOVERY", 
		"RECURSIVE_TRIGGERS", "RELATIVE", "REMOTE", "REPEATABLE", "RESTRICTED_USER", 
		"ROBUST", "ROOT", "ROW", "ROWGUID", "ROWS", "ROW_NUMBER", "SAMPLE", "SCHEMABINDING", 
		"SCROLL", "SCROLL_LOCKS", "SECONDS", "SELF", "SERIALIZABLE", "SHOWPLAN", 
		"SIMPLE", "SINGLE_USER", "SIZE", "SNAPSHOT", "SPATIAL_WINDOW_MAX_CELLS", 
		"STATIC", "STATS_STREAM", "STDEV", "STDEVP", "SUM", "TAKE", "TARGET_RECOVERY_TIME", 
		"TB", "TEXTIMAGE_ON", "THROW", "TIES", "TIME", "TORN_PAGE_DETECTION", 
		"TRANSFORM_NOISE_WORDS", "TRUSTWORTHY", "TRY", "TWO_DIGIT_YEAR_CUTOFF", 
		"TYPE", "TYPE_WARNING", "UNBOUNDED", "UNCOMMITTED", "UNKNOWN", "UNLIMITED", 
		"USING", "VAR", "VARP", "VIEWS", "VIEW_METADATA", "WORK", "XML", "XMLNAMESPACES", 
		"ZEROFILL", "DOLLAR_ACTION", "BIT", "BINARY", "BOOLEAN", "TINYINT", "SMALLINT", 
		"MEDIUMINT", "INT", "INTEGER", "BIGINT", "REAL", "FLOAT", "DOUBLE", "DECIMAL", 
		"NUMERIC", "DATE", "DATETIME", "TIMESTAMP", "YEAR", "CHAR", "CHARACTER", 
		"VARCHAR", "VARBINARY", "TINYBLOB", "BLOB", "MEDIUMBLOB", "LONGBLOB", 
		"TINYTEXT", "TEXT", "MEDIUMTEXT", "LONGTEXT", "ENUM", "JSON", "SPACE", 
		"MULTILINE_COMMENT", "LINE_COMMENT", "DOUBLE_QUOTE_ID", "LEFT_QUOTE_ID", 
		"SQUARE_BRACKET_ID", "LOCAL_ID", "DECIMAL_LITERAL", "ID", "STRING", "BINARY_LITERAL", 
		"FLOAT_LITERAL", "REAL_LITERAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", 
		"PLUS_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
		"AND_ASSIGN", "XOR_ASSIGN", "OR_ASSIGN", "DOT", "UNDERLINE", "AT", "SHARP", 
		"DOLLAR", "LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "COLON", "STAR", 
		"DIVIDE", "MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "mysql_ddl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mysql_ddlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Mysql_ddl_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mysql_ddlParser.EOF, 0); }
		public List<BatchContext> batch() {
			return getRuleContexts(BatchContext.class);
		}
		public BatchContext batch(int i) {
			return getRuleContext(BatchContext.class,i);
		}
		public Mysql_ddl_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mysql_ddl_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterMysql_ddl_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitMysql_ddl_file(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitMysql_ddl_file(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mysql_ddl_fileContext mysql_ddl_file() throws RecognitionException {
		Mysql_ddl_fileContext _localctx = new Mysql_ddl_fileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mysql_ddl_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << CREATE) | (1L << DROP))) != 0) || _la==SEMI) {
				{
				{
				setState(98);
				batch();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BatchContext extends ParserRuleContext {
		public Ddl_clausesContext ddl_clauses() {
			return getRuleContext(Ddl_clausesContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(mysql_ddlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(mysql_ddlParser.SEMI, i);
		}
		public BatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_batch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterBatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitBatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitBatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BatchContext batch() throws RecognitionException {
		BatchContext _localctx = new BatchContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_batch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(106);
				match(SEMI);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			ddl_clauses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_clausesContext extends ParserRuleContext {
		public List<Ddl_clauseContext> ddl_clause() {
			return getRuleContexts(Ddl_clauseContext.class);
		}
		public Ddl_clauseContext ddl_clause(int i) {
			return getRuleContext(Ddl_clauseContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(mysql_ddlParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(mysql_ddlParser.SEMI, i);
		}
		public Ddl_clausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterDdl_clauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitDdl_clauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitDdl_clauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_clausesContext ddl_clauses() throws RecognitionException {
		Ddl_clausesContext _localctx = new Ddl_clausesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ddl_clauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(114);
					ddl_clause();
					setState(116); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(115);
							match(SEMI);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(118); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_clauseContext extends ParserRuleContext {
		public Create_indexContext create_index() {
			return getRuleContext(Create_indexContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Alter_tableContext alter_table() {
			return getRuleContext(Alter_tableContext.class,0);
		}
		public Drop_indexContext drop_index() {
			return getRuleContext(Drop_indexContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Ddl_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterDdl_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitDdl_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitDdl_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_clauseContext ddl_clause() throws RecognitionException {
		Ddl_clauseContext _localctx = new Ddl_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ddl_clause);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				create_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				create_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				alter_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				drop_index();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				drop_table();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_indexContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysql_ddlParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(mysql_ddlParser.INDEX, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ON() { return getToken(mysql_ddlParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
		}
		public TerminalNode UNIQUE() { return getToken(mysql_ddlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public TerminalNode ASC() { return getToken(mysql_ddlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysql_ddlParser.DESC, 0); }
		public Create_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterCreate_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitCreate_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitCreate_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_indexContext create_index() throws RecognitionException {
		Create_indexContext _localctx = new Create_indexContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(CREATE);
			setState(133);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(132);
				match(UNIQUE);
				}
			}

			setState(136);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(135);
				clustered();
				}
			}

			setState(138);
			match(INDEX);
			setState(139);
			id();
			setState(140);
			match(ON);
			setState(141);
			table_name();
			setState(142);
			match(LR_BRACKET);
			setState(143);
			column_name_list();
			setState(145);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(144);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(147);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(mysql_ddlParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(mysql_ddlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Column_def_table_constraintContext> column_def_table_constraint() {
			return getRuleContexts(Column_def_table_constraintContext.class);
		}
		public Column_def_table_constraintContext column_def_table_constraint(int i) {
			return getRuleContext(Column_def_table_constraintContext.class,i);
		}
		public Table_optionsContext table_options() {
			return getRuleContext(Table_optionsContext.class,0);
		}
		public Table_commentContext table_comment() {
			return getRuleContext(Table_commentContext.class,0);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CREATE);
			setState(150);
			match(TABLE);
			setState(151);
			table_name();
			setState(152);
			match(LR_BRACKET);
			setState(153);
			column_def_table_constraint();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(154);
				match(COMMA);
				setState(155);
				column_def_table_constraint();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(RR_BRACKET);
			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AUTO_INCREMENT) | (1L << DEFAULT) | (1L << ENGINE))) != 0) || _la==CHARSET) {
				{
				setState(162);
				table_options();
				}
			}

			setState(166);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(165);
				table_comment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_optionsContext extends ParserRuleContext {
		public Table_optionContext table_option() {
			return getRuleContext(Table_optionContext.class,0);
		}
		public Table_optionsContext table_options() {
			return getRuleContext(Table_optionsContext.class,0);
		}
		public Table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_optionsContext table_options() throws RecognitionException {
		Table_optionsContext _localctx = new Table_optionsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_table_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			table_option();
			setState(171);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(169);
				match(COMMA);
				setState(170);
				table_options();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_optionContext extends ParserRuleContext {
		public TerminalNode CHARSET() { return getToken(mysql_ddlParser.CHARSET, 0); }
		public Char_setContext char_set() {
			return getRuleContext(Char_setContext.class,0);
		}
		public TerminalNode ENGINE() { return getToken(mysql_ddlParser.ENGINE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(mysql_ddlParser.AUTO_INCREMENT, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(mysql_ddlParser.DECIMAL_LITERAL, 0); }
		public TerminalNode DEFAULT() { return getToken(mysql_ddlParser.DEFAULT, 0); }
		public Table_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_option(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_optionContext table_option() throws RecognitionException {
		Table_optionContext _localctx = new Table_optionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_table_option);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if (_la==ENGINE) {
				{
				setState(173);
				match(ENGINE);
				setState(174);
				match(EQUAL);
				setState(175);
				id();
				}
			}

			setState(181);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(178);
				match(AUTO_INCREMENT);
				setState(179);
				match(EQUAL);
				setState(180);
				match(DECIMAL_LITERAL);
				}
			}

			setState(184);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(183);
				match(DEFAULT);
				}
			}

			setState(186);
			match(CHARSET);
			setState(188);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(187);
				match(EQUAL);
				}
			}

			setState(190);
			char_set();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_setContext extends ParserRuleContext {
		public Char_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterChar_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitChar_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitChar_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Char_setContext char_set() throws RecognitionException {
		Char_setContext _localctx = new Char_setContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_char_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(mysql_ddlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(mysql_ddlParser.STRING, 0); }
		public Table_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_commentContext table_comment() throws RecognitionException {
		Table_commentContext _localctx = new Table_commentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_table_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(COMMENT);
			setState(196);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(195);
				match(EQUAL);
				}
			}

			setState(198);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(mysql_ddlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(mysql_ddlParser.STRING, 0); }
		public Column_commentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterColumn_comment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitColumn_comment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitColumn_comment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_commentContext column_comment() throws RecognitionException {
		Column_commentContext _localctx = new Column_commentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_column_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(COMMENT);
			setState(201);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tableContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(mysql_ddlParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(mysql_ddlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode ADD() { return getToken(mysql_ddlParser.ADD, 0); }
		public Column_def_table_constraintContext column_def_table_constraint() {
			return getRuleContext(Column_def_table_constraintContext.class,0);
		}
		public Alter_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterAlter_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitAlter_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitAlter_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_tableContext alter_table() throws RecognitionException {
		Alter_tableContext _localctx = new Alter_tableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alter_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ALTER);
			setState(204);
			match(TABLE);
			setState(205);
			table_name();
			setState(206);
			match(ADD);
			setState(207);
			column_def_table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_indexContext extends ParserRuleContext {
		public IdContext name;
		public TerminalNode DROP() { return getToken(mysql_ddlParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(mysql_ddlParser.INDEX, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IF() { return getToken(mysql_ddlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(mysql_ddlParser.EXISTS, 0); }
		public TerminalNode ON() { return getToken(mysql_ddlParser.ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Drop_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterDrop_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitDrop_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitDrop_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_indexContext drop_index() throws RecognitionException {
		Drop_indexContext _localctx = new Drop_indexContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(DROP);
			setState(210);
			match(INDEX);
			setState(213);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(211);
				match(IF);
				setState(212);
				match(EXISTS);
				}
			}

			setState(215);
			((Drop_indexContext)_localctx).name = id();
			setState(218);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(216);
				match(ON);
				setState(217);
				table_name();
				}
			}

			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(220);
				match(SEMI);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(mysql_ddlParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(mysql_ddlParser.TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode IF() { return getToken(mysql_ddlParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(mysql_ddlParser.EXISTS, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitDrop_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitDrop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(DROP);
			setState(224);
			match(TABLE);
			setState(227);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(225);
				match(IF);
				setState(226);
				match(EXISTS);
				}
			}

			setState(229);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_def_table_constraintContext extends ParserRuleContext {
		public Column_definitionContext column_definition() {
			return getRuleContext(Column_definitionContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Column_def_table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterColumn_def_table_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitColumn_def_table_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitColumn_def_table_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_def_table_constraintContext column_def_table_constraint() throws RecognitionException {
		Column_def_table_constraintContext _localctx = new Column_def_table_constraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_column_def_table_constraint);
		try {
			setState(233);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case LEFT_QUOTE_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				column_definition();
				}
				break;
			case CONSTRAINT:
			case FOREIGN:
			case INDEX:
			case KEY:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				table_constraint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(mysql_ddlParser.AUTO_INCREMENT, 0); }
		public TerminalNode COMMENT() { return getToken(mysql_ddlParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(mysql_ddlParser.STRING, 0); }
		public TerminalNode UNIQUE() { return getToken(mysql_ddlParser.UNIQUE, 0); }
		public TerminalNode PRIMARY() { return getToken(mysql_ddlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysql_ddlParser.KEY, 0); }
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitColumn_definition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitColumn_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			id();
			setState(236);
			data_type();
			setState(238);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(237);
				null_notnull();
				}
			}

			setState(241);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(240);
				column_default();
				}
			}

			setState(244);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(243);
				match(AUTO_INCREMENT);
				}
			}

			setState(250);
			_la = _input.LA(1);
			if (_la==PRIMARY || _la==UNIQUE) {
				{
				setState(246);
				_la = _input.LA(1);
				if ( !(_la==PRIMARY || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(248);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(247);
					match(KEY);
					}
				}

				}
			}

			setState(254);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(252);
				match(COMMENT);
				setState(253);
				match(STRING);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definition1Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public Column_commentContext column_comment() {
			return getRuleContext(Column_commentContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(mysql_ddlParser.DEFAULT, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode AUTO_INCREMENT() { return getToken(mysql_ddlParser.AUTO_INCREMENT, 0); }
		public Column_definition1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterColumn_definition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitColumn_definition1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitColumn_definition1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_definition1Context column_definition1() throws RecognitionException {
		Column_definition1Context _localctx = new Column_definition1Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_column_definition1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			id();
			setState(257);
			data_type();
			setState(259);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(258);
				null_notnull();
				}
			}

			setState(264);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(261);
				match(DEFAULT);
				setState(262);
				constant_expression();
				}
				break;
			case AUTO_INCREMENT:
				{
				setState(263);
				match(AUTO_INCREMENT);
				}
				break;
			case COMMENT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(266);
			column_comment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(mysql_ddlParser.DEFAULT, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_column_default);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(DEFAULT);
			setState(269);
			constant_expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(mysql_ddlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constant_expression);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(NULL);
				}
				break;
			case DECIMAL_LITERAL:
			case STRING:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case REAL_LITERAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				constant();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				match(LR_BRACKET);
				setState(274);
				constant_expression();
				setState(275);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(mysql_ddlParser.CONSTRAINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Null_notnullContext null_notnull() {
			return getRuleContext(Null_notnullContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(mysql_ddlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysql_ddlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(mysql_ddlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(279);
				match(CONSTRAINT);
				setState(280);
				id();
				}
			}

			setState(284);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(283);
				null_notnull();
				}
			}

			{
			setState(289);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(286);
				match(PRIMARY);
				setState(287);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(288);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(292);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(291);
				clustered();
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_unique_constraintContext table_unique_constraint() {
			return getRuleContext(Table_unique_constraintContext.class,0);
		}
		public Table_index_constraintContext table_index_constraint() {
			return getRuleContext(Table_index_constraintContext.class,0);
		}
		public Table_foreign_key_defContext table_foreign_key_def() {
			return getRuleContext(Table_foreign_key_defContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_table_constraint);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				table_unique_constraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				table_index_constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(296);
				table_foreign_key_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_unique_constraintContext extends ParserRuleContext {
		public Sorted_column_name_listContext sorted_column_name_list() {
			return getRuleContext(Sorted_column_name_listContext.class,0);
		}
		public TerminalNode CONSTRAINT() { return getToken(mysql_ddlParser.CONSTRAINT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PRIMARY() { return getToken(mysql_ddlParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(mysql_ddlParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(mysql_ddlParser.UNIQUE, 0); }
		public ClusteredContext clustered() {
			return getRuleContext(ClusteredContext.class,0);
		}
		public Table_unique_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_unique_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_unique_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_unique_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_unique_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_unique_constraintContext table_unique_constraint() throws RecognitionException {
		Table_unique_constraintContext _localctx = new Table_unique_constraintContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_table_unique_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(299);
				match(CONSTRAINT);
				setState(300);
				id();
				}
			}

			{
			setState(306);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(303);
				match(PRIMARY);
				setState(304);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(305);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(308);
				clustered();
				}
			}

			setState(311);
			match(LR_BRACKET);
			setState(312);
			sorted_column_name_list();
			setState(313);
			match(RR_BRACKET);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_index_constraintContext extends ParserRuleContext {
		public Sorted_column_name_listContext sorted_column_name_list() {
			return getRuleContext(Sorted_column_name_listContext.class,0);
		}
		public TerminalNode KEY() { return getToken(mysql_ddlParser.KEY, 0); }
		public TerminalNode INDEX() { return getToken(mysql_ddlParser.INDEX, 0); }
		public TerminalNode UNIQUE() { return getToken(mysql_ddlParser.UNIQUE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_index_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_index_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_index_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_index_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_index_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_index_constraintContext table_index_constraint() throws RecognitionException {
		Table_index_constraintContext _localctx = new Table_index_constraintContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_index_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(315);
				match(UNIQUE);
				}
			}

			setState(318);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(320);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (ABSOLUTE - 197)) | (1L << (APPLY - 197)) | (1L << (AUTO - 197)) | (1L << (AVG - 197)) | (1L << (BASE64 - 197)) | (1L << (CALLER - 197)) | (1L << (CAST - 197)) | (1L << (CATCH - 197)) | (1L << (CHECKSUM_AGG - 197)) | (1L << (COMMITTED - 197)) | (1L << (CONCAT - 197)) | (1L << (CONTROL - 197)) | (1L << (COOKIE - 197)) | (1L << (COUNT - 197)) | (1L << (COUNT_BIG - 197)) | (1L << (DELAY - 197)) | (1L << (DELETED - 197)) | (1L << (DENSE_RANK - 197)) | (1L << (DISABLE - 197)) | (1L << (DYNAMIC - 197)) | (1L << (ENCRYPTION - 197)) | (1L << (EXPAND - 197)) | (1L << (FAST - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FAST_FORWARD - 261)) | (1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (ONLY - 325)) | (1L << (OPTIMISTIC - 325)) | (1L << (OPTIMIZE - 325)) | (1L << (OUT - 325)) | (1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (TYPE_WARNING - 389)) | (1L << (UNBOUNDED - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNKNOWN - 389)) | (1L << (USING - 389)) | (1L << (VAR - 389)) | (1L << (VARP - 389)) | (1L << (VIEWS - 389)) | (1L << (VIEW_METADATA - 389)) | (1L << (WORK - 389)) | (1L << (XML - 389)) | (1L << (XMLNAMESPACES - 389)) | (1L << (DOUBLE_QUOTE_ID - 389)) | (1L << (LEFT_QUOTE_ID - 389)) | (1L << (ID - 389)))) != 0)) {
				{
				setState(319);
				id();
				}
			}

			setState(322);
			match(LR_BRACKET);
			setState(323);
			sorted_column_name_list();
			setState(324);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_foreign_key_defContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(mysql_ddlParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(mysql_ddlParser.KEY, 0); }
		public List<Column_name_listContext> column_name_list() {
			return getRuleContexts(Column_name_listContext.class);
		}
		public Column_name_listContext column_name_list(int i) {
			return getRuleContext(Column_name_listContext.class,i);
		}
		public TerminalNode REFERENCES() { return getToken(mysql_ddlParser.REFERENCES, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode CONSTRAINT() { return getToken(mysql_ddlParser.CONSTRAINT, 0); }
		public List<Fk_on_deleteContext> fk_on_delete() {
			return getRuleContexts(Fk_on_deleteContext.class);
		}
		public Fk_on_deleteContext fk_on_delete(int i) {
			return getRuleContext(Fk_on_deleteContext.class,i);
		}
		public List<Fk_on_updateContext> fk_on_update() {
			return getRuleContexts(Fk_on_updateContext.class);
		}
		public Fk_on_updateContext fk_on_update(int i) {
			return getRuleContext(Fk_on_updateContext.class,i);
		}
		public Table_foreign_key_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_foreign_key_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_foreign_key_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_foreign_key_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_foreign_key_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_foreign_key_defContext table_foreign_key_def() throws RecognitionException {
		Table_foreign_key_defContext _localctx = new Table_foreign_key_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_table_foreign_key_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(326);
				match(CONSTRAINT);
				setState(327);
				id();
				}
			}

			setState(330);
			match(FOREIGN);
			setState(331);
			match(KEY);
			setState(332);
			match(LR_BRACKET);
			setState(333);
			column_name_list();
			setState(334);
			match(RR_BRACKET);
			setState(335);
			match(REFERENCES);
			setState(336);
			id();
			setState(337);
			match(LR_BRACKET);
			setState(338);
			column_name_list();
			setState(339);
			match(RR_BRACKET);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				setState(342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(340);
					fk_on_delete();
					}
					break;
				case 2:
					{
					setState(341);
					fk_on_update();
					}
					break;
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_on_deleteContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysql_ddlParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(mysql_ddlParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(mysql_ddlParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(mysql_ddlParser.RESTRICT, 0); }
		public TerminalNode NO() { return getToken(mysql_ddlParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(mysql_ddlParser.ACTION, 0); }
		public Fk_on_deleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_on_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterFk_on_delete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitFk_on_delete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitFk_on_delete(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_on_deleteContext fk_on_delete() throws RecognitionException {
		Fk_on_deleteContext _localctx = new Fk_on_deleteContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fk_on_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ON);
			setState(348);
			match(DELETE);
			setState(353);
			switch (_input.LA(1)) {
			case CASCADE:
				{
				setState(349);
				match(CASCADE);
				}
				break;
			case RESTRICT:
				{
				setState(350);
				match(RESTRICT);
				}
				break;
			case NO:
				{
				setState(351);
				match(NO);
				setState(352);
				match(ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_on_updateContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysql_ddlParser.ON, 0); }
		public TerminalNode UPDATE() { return getToken(mysql_ddlParser.UPDATE, 0); }
		public TerminalNode RESTRICT() { return getToken(mysql_ddlParser.RESTRICT, 0); }
		public TerminalNode NO() { return getToken(mysql_ddlParser.NO, 0); }
		public TerminalNode ACTION() { return getToken(mysql_ddlParser.ACTION, 0); }
		public Fk_on_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_on_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterFk_on_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitFk_on_update(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitFk_on_update(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_on_updateContext fk_on_update() throws RecognitionException {
		Fk_on_updateContext _localctx = new Fk_on_updateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fk_on_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			match(ON);
			setState(356);
			match(UPDATE);
			setState(360);
			switch (_input.LA(1)) {
			case RESTRICT:
				{
				setState(357);
				match(RESTRICT);
				}
				break;
			case NO:
				{
				setState(358);
				match(NO);
				setState(359);
				match(ACTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_table_nameContext extends ParserRuleContext {
		public IdContext server;
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Full_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterFull_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitFull_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitFull_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_table_nameContext full_table_name() throws RecognitionException {
		Full_table_nameContext _localctx = new Full_table_nameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(362);
				((Full_table_nameContext)_localctx).server = id();
				setState(363);
				match(DOT);
				setState(364);
				((Full_table_nameContext)_localctx).database = id();
				setState(365);
				match(DOT);
				setState(366);
				((Full_table_nameContext)_localctx).schema = id();
				setState(367);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(369);
				((Full_table_nameContext)_localctx).database = id();
				setState(370);
				match(DOT);
				setState(372);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (ABSOLUTE - 197)) | (1L << (APPLY - 197)) | (1L << (AUTO - 197)) | (1L << (AVG - 197)) | (1L << (BASE64 - 197)) | (1L << (CALLER - 197)) | (1L << (CAST - 197)) | (1L << (CATCH - 197)) | (1L << (CHECKSUM_AGG - 197)) | (1L << (COMMITTED - 197)) | (1L << (CONCAT - 197)) | (1L << (CONTROL - 197)) | (1L << (COOKIE - 197)) | (1L << (COUNT - 197)) | (1L << (COUNT_BIG - 197)) | (1L << (DELAY - 197)) | (1L << (DELETED - 197)) | (1L << (DENSE_RANK - 197)) | (1L << (DISABLE - 197)) | (1L << (DYNAMIC - 197)) | (1L << (ENCRYPTION - 197)) | (1L << (EXPAND - 197)) | (1L << (FAST - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FAST_FORWARD - 261)) | (1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (ONLY - 325)) | (1L << (OPTIMISTIC - 325)) | (1L << (OPTIMIZE - 325)) | (1L << (OUT - 325)) | (1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (TYPE_WARNING - 389)) | (1L << (UNBOUNDED - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNKNOWN - 389)) | (1L << (USING - 389)) | (1L << (VAR - 389)) | (1L << (VARP - 389)) | (1L << (VIEWS - 389)) | (1L << (VIEW_METADATA - 389)) | (1L << (WORK - 389)) | (1L << (XML - 389)) | (1L << (XMLNAMESPACES - 389)) | (1L << (DOUBLE_QUOTE_ID - 389)) | (1L << (LEFT_QUOTE_ID - 389)) | (1L << (ID - 389)))) != 0)) {
					{
					setState(371);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(374);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(376);
				((Full_table_nameContext)_localctx).schema = id();
				setState(377);
				match(DOT);
				}
				break;
			}
			setState(381);
			((Full_table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext table;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(383);
				((Table_nameContext)_localctx).database = id();
				setState(384);
				match(DOT);
				setState(386);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (ABSOLUTE - 197)) | (1L << (APPLY - 197)) | (1L << (AUTO - 197)) | (1L << (AVG - 197)) | (1L << (BASE64 - 197)) | (1L << (CALLER - 197)) | (1L << (CAST - 197)) | (1L << (CATCH - 197)) | (1L << (CHECKSUM_AGG - 197)) | (1L << (COMMITTED - 197)) | (1L << (CONCAT - 197)) | (1L << (CONTROL - 197)) | (1L << (COOKIE - 197)) | (1L << (COUNT - 197)) | (1L << (COUNT_BIG - 197)) | (1L << (DELAY - 197)) | (1L << (DELETED - 197)) | (1L << (DENSE_RANK - 197)) | (1L << (DISABLE - 197)) | (1L << (DYNAMIC - 197)) | (1L << (ENCRYPTION - 197)) | (1L << (EXPAND - 197)) | (1L << (FAST - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FAST_FORWARD - 261)) | (1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (ONLY - 325)) | (1L << (OPTIMISTIC - 325)) | (1L << (OPTIMIZE - 325)) | (1L << (OUT - 325)) | (1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (TYPE_WARNING - 389)) | (1L << (UNBOUNDED - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNKNOWN - 389)) | (1L << (USING - 389)) | (1L << (VAR - 389)) | (1L << (VARP - 389)) | (1L << (VIEWS - 389)) | (1L << (VIEW_METADATA - 389)) | (1L << (WORK - 389)) | (1L << (XML - 389)) | (1L << (XMLNAMESPACES - 389)) | (1L << (DOUBLE_QUOTE_ID - 389)) | (1L << (LEFT_QUOTE_ID - 389)) | (1L << (ID - 389)))) != 0)) {
					{
					setState(385);
					((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(388);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(390);
				((Table_nameContext)_localctx).schema = id();
				setState(391);
				match(DOT);
				}
				break;
			}
			setState(395);
			((Table_nameContext)_localctx).table = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_nameContext extends ParserRuleContext {
		public IdContext schema;
		public IdContext name;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitSimple_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitSimple_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(397);
				((Simple_nameContext)_localctx).schema = id();
				setState(398);
				match(DOT);
				}
				break;
			}
			setState(402);
			((Simple_nameContext)_localctx).name = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_proc_nameContext extends ParserRuleContext {
		public IdContext database;
		public IdContext schema;
		public IdContext procedure;
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Func_proc_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_proc_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterFunc_proc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitFunc_proc_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitFunc_proc_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_proc_nameContext func_proc_name() throws RecognitionException {
		Func_proc_nameContext _localctx = new Func_proc_nameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(404);
				((Func_proc_nameContext)_localctx).database = id();
				setState(405);
				match(DOT);
				setState(407);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (ABSOLUTE - 197)) | (1L << (APPLY - 197)) | (1L << (AUTO - 197)) | (1L << (AVG - 197)) | (1L << (BASE64 - 197)) | (1L << (CALLER - 197)) | (1L << (CAST - 197)) | (1L << (CATCH - 197)) | (1L << (CHECKSUM_AGG - 197)) | (1L << (COMMITTED - 197)) | (1L << (CONCAT - 197)) | (1L << (CONTROL - 197)) | (1L << (COOKIE - 197)) | (1L << (COUNT - 197)) | (1L << (COUNT_BIG - 197)) | (1L << (DELAY - 197)) | (1L << (DELETED - 197)) | (1L << (DENSE_RANK - 197)) | (1L << (DISABLE - 197)) | (1L << (DYNAMIC - 197)) | (1L << (ENCRYPTION - 197)) | (1L << (EXPAND - 197)) | (1L << (FAST - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FAST_FORWARD - 261)) | (1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (ONLY - 325)) | (1L << (OPTIMISTIC - 325)) | (1L << (OPTIMIZE - 325)) | (1L << (OUT - 325)) | (1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (TYPE_WARNING - 389)) | (1L << (UNBOUNDED - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNKNOWN - 389)) | (1L << (USING - 389)) | (1L << (VAR - 389)) | (1L << (VARP - 389)) | (1L << (VIEWS - 389)) | (1L << (VIEW_METADATA - 389)) | (1L << (WORK - 389)) | (1L << (XML - 389)) | (1L << (XMLNAMESPACES - 389)) | (1L << (DOUBLE_QUOTE_ID - 389)) | (1L << (LEFT_QUOTE_ID - 389)) | (1L << (ID - 389)))) != 0)) {
					{
					setState(406);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(409);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(411);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(412);
				match(DOT);
				}
				break;
			}
			setState(416);
			((Func_proc_nameContext)_localctx).procedure = id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ddl_objectContext extends ParserRuleContext {
		public Full_table_nameContext full_table_name() {
			return getRuleContext(Full_table_nameContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(mysql_ddlParser.LOCAL_ID, 0); }
		public Ddl_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterDdl_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitDdl_object(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitDdl_object(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_objectContext ddl_object() throws RecognitionException {
		Ddl_objectContext _localctx = new Ddl_objectContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ddl_object);
		try {
			setState(420);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case LEFT_QUOTE_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Full_column_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Full_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_full_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterFull_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitFull_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitFull_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Full_column_nameContext full_column_name() throws RecognitionException {
		Full_column_nameContext _localctx = new Full_column_nameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(422);
				table_name();
				setState(423);
				match(DOT);
				}
				break;
			}
			setState(427);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_name_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public Column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterColumn_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitColumn_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitColumn_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_name_listContext column_name_list() throws RecognitionException {
		Column_name_listContext _localctx = new Column_name_listContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			id();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(430);
				match(COMMA);
				setState(431);
				id();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sorted_column_name_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> ASC() { return getTokens(mysql_ddlParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(mysql_ddlParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(mysql_ddlParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(mysql_ddlParser.DESC, i);
		}
		public Sorted_column_name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_column_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterSorted_column_name_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitSorted_column_name_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitSorted_column_name_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sorted_column_name_listContext sorted_column_name_list() throws RecognitionException {
		Sorted_column_name_listContext _localctx = new Sorted_column_name_listContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_sorted_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			id();
			setState(439);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(438);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(441);
				match(COMMA);
				setState(442);
				id();
				setState(444);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(443);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cursor_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode LOCAL_ID() { return getToken(mysql_ddlParser.LOCAL_ID, 0); }
		public Cursor_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterCursor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitCursor_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitCursor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cursor_nameContext cursor_name() throws RecognitionException {
		Cursor_nameContext _localctx = new Cursor_nameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_cursor_name);
		try {
			setState(453);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case LEFT_QUOTE_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(LOCAL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class On_offContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysql_ddlParser.ON, 0); }
		public TerminalNode OFF() { return getToken(mysql_ddlParser.OFF, 0); }
		public On_offContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_on_off; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterOn_off(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitOn_off(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitOn_off(this);
			else return visitor.visitChildren(this);
		}
	}

	public final On_offContext on_off() throws RecognitionException {
		On_offContext _localctx = new On_offContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !(_la==OFF || _la==ON) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClusteredContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(mysql_ddlParser.CLUSTERED, 0); }
		public TerminalNode NONCLUSTERED() { return getToken(mysql_ddlParser.NONCLUSTERED, 0); }
		public ClusteredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clustered; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterClustered(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitClustered(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitClustered(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClusteredContext clustered() throws RecognitionException {
		ClusteredContext _localctx = new ClusteredContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_la = _input.LA(1);
			if ( !(_la==CLUSTERED || _la==NONCLUSTERED) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_notnullContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(mysql_ddlParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(mysql_ddlParser.NOT, 0); }
		public Null_notnullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_notnull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterNull_notnull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitNull_notnull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitNull_notnull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_notnullContext null_notnull() throws RecognitionException {
		Null_notnullContext _localctx = new Null_notnullContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(459);
				match(NOT);
				}
			}

			setState(462);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Scalar_function_nameContext extends ParserRuleContext {
		public Func_proc_nameContext func_proc_name() {
			return getRuleContext(Func_proc_nameContext.class,0);
		}
		public TerminalNode RIGHT() { return getToken(mysql_ddlParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(mysql_ddlParser.LEFT, 0); }
		public TerminalNode BINARY_CHECKSUM() { return getToken(mysql_ddlParser.BINARY_CHECKSUM, 0); }
		public TerminalNode CHECKSUM() { return getToken(mysql_ddlParser.CHECKSUM, 0); }
		public Scalar_function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterScalar_function_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitScalar_function_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitScalar_function_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Scalar_function_nameContext scalar_function_name() throws RecognitionException {
		Scalar_function_nameContext _localctx = new Scalar_function_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_scalar_function_name);
		try {
			setState(469);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case DOUBLE_QUOTE_ID:
			case LEFT_QUOTE_ID:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				match(CHECKSUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ms_data_typeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode IDENTITY() { return getToken(mysql_ddlParser.IDENTITY, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(mysql_ddlParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(mysql_ddlParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode MAX() { return getToken(mysql_ddlParser.MAX, 0); }
		public Ms_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ms_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterMs_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitMs_data_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitMs_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ms_data_typeContext ms_data_type() throws RecognitionException {
		Ms_data_typeContext _localctx = new Ms_data_typeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_ms_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			id();
			setState(473);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(472);
				match(IDENTITY);
				}
			}

			setState(482);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(475);
				match(LR_BRACKET);
				setState(476);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(479);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(477);
					match(COMMA);
					setState(478);
					match(DECIMAL_LITERAL);
					}
				}

				setState(481);
				match(RR_BRACKET);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode BIT() { return getToken(mysql_ddlParser.BIT, 0); }
		public List<TerminalNode> DECIMAL_LITERAL() { return getTokens(mysql_ddlParser.DECIMAL_LITERAL); }
		public TerminalNode DECIMAL_LITERAL(int i) {
			return getToken(mysql_ddlParser.DECIMAL_LITERAL, i);
		}
		public TerminalNode TINYINT() { return getToken(mysql_ddlParser.TINYINT, 0); }
		public TerminalNode UNSIGNED() { return getToken(mysql_ddlParser.UNSIGNED, 0); }
		public TerminalNode ZEROFILL() { return getToken(mysql_ddlParser.ZEROFILL, 0); }
		public TerminalNode SMALLINT() { return getToken(mysql_ddlParser.SMALLINT, 0); }
		public TerminalNode MEDIUMINT() { return getToken(mysql_ddlParser.MEDIUMINT, 0); }
		public TerminalNode INT() { return getToken(mysql_ddlParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(mysql_ddlParser.INTEGER, 0); }
		public TerminalNode BIGINT() { return getToken(mysql_ddlParser.BIGINT, 0); }
		public TerminalNode REAL() { return getToken(mysql_ddlParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(mysql_ddlParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(mysql_ddlParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(mysql_ddlParser.DECIMAL, 0); }
		public TerminalNode NUMERIC() { return getToken(mysql_ddlParser.NUMERIC, 0); }
		public TerminalNode DATE() { return getToken(mysql_ddlParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(mysql_ddlParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(mysql_ddlParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(mysql_ddlParser.DATETIME, 0); }
		public TerminalNode YEAR() { return getToken(mysql_ddlParser.YEAR, 0); }
		public TerminalNode CHAR() { return getToken(mysql_ddlParser.CHAR, 0); }
		public TerminalNode BINARY() { return getToken(mysql_ddlParser.BINARY, 0); }
		public TerminalNode CHARACTER() { return getToken(mysql_ddlParser.CHARACTER, 0); }
		public List<TerminalNode> SET() { return getTokens(mysql_ddlParser.SET); }
		public TerminalNode SET(int i) {
			return getToken(mysql_ddlParser.SET, i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode COLLATE() { return getToken(mysql_ddlParser.COLLATE, 0); }
		public TerminalNode VARCHAR() { return getToken(mysql_ddlParser.VARCHAR, 0); }
		public TerminalNode VARBINARY() { return getToken(mysql_ddlParser.VARBINARY, 0); }
		public TerminalNode BOOLEAN() { return getToken(mysql_ddlParser.BOOLEAN, 0); }
		public TerminalNode TINYBLOB() { return getToken(mysql_ddlParser.TINYBLOB, 0); }
		public TerminalNode BLOB() { return getToken(mysql_ddlParser.BLOB, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(mysql_ddlParser.MEDIUMBLOB, 0); }
		public TerminalNode LONGBLOB() { return getToken(mysql_ddlParser.LONGBLOB, 0); }
		public TerminalNode TINYTEXT() { return getToken(mysql_ddlParser.TINYTEXT, 0); }
		public TerminalNode TEXT() { return getToken(mysql_ddlParser.TEXT, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(mysql_ddlParser.MEDIUMTEXT, 0); }
		public TerminalNode LONGTEXT() { return getToken(mysql_ddlParser.LONGTEXT, 0); }
		public TerminalNode ENUM() { return getToken(mysql_ddlParser.ENUM, 0); }
		public TerminalNode JSON() { return getToken(mysql_ddlParser.JSON, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_data_type);
		int _la;
		try {
			setState(796);
			switch (_input.LA(1)) {
			case BIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(BIT);
				setState(486);
				_la = _input.LA(1);
				if (_la==DECIMAL_LITERAL) {
					{
					setState(485);
					match(DECIMAL_LITERAL);
					}
				}

				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(TINYINT);
				setState(492);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(489);
					match(LR_BRACKET);
					setState(490);
					match(DECIMAL_LITERAL);
					setState(491);
					match(RR_BRACKET);
					}
				}

				setState(495);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(494);
					match(UNSIGNED);
					}
				}

				setState(498);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(497);
					match(ZEROFILL);
					}
				}

				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(500);
				match(SMALLINT);
				setState(504);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(501);
					match(LR_BRACKET);
					setState(502);
					match(DECIMAL_LITERAL);
					setState(503);
					match(RR_BRACKET);
					}
				}

				setState(507);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(506);
					match(UNSIGNED);
					}
				}

				setState(510);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(509);
					match(ZEROFILL);
					}
				}

				}
				break;
			case MEDIUMINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(512);
				match(MEDIUMINT);
				setState(516);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(513);
					match(LR_BRACKET);
					setState(514);
					match(DECIMAL_LITERAL);
					setState(515);
					match(RR_BRACKET);
					}
				}

				setState(519);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(518);
					match(UNSIGNED);
					}
				}

				setState(522);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(521);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(524);
				match(INT);
				setState(528);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(525);
					match(LR_BRACKET);
					setState(526);
					match(DECIMAL_LITERAL);
					setState(527);
					match(RR_BRACKET);
					}
				}

				setState(531);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(530);
					match(UNSIGNED);
					}
				}

				setState(534);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(533);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 6);
				{
				setState(536);
				match(INTEGER);
				setState(540);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(537);
					match(LR_BRACKET);
					setState(538);
					match(DECIMAL_LITERAL);
					setState(539);
					match(RR_BRACKET);
					}
				}

				setState(543);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(542);
					match(UNSIGNED);
					}
				}

				setState(546);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(545);
					match(ZEROFILL);
					}
				}

				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(548);
				match(BIGINT);
				setState(552);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(549);
					match(LR_BRACKET);
					setState(550);
					match(DECIMAL_LITERAL);
					setState(551);
					match(RR_BRACKET);
					}
				}

				setState(555);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(554);
					match(UNSIGNED);
					}
				}

				setState(558);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(557);
					match(ZEROFILL);
					}
				}

				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(560);
				match(REAL);
				setState(566);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(561);
					match(LR_BRACKET);
					setState(562);
					match(DECIMAL_LITERAL);
					setState(563);
					match(COMMA);
					setState(564);
					match(DECIMAL_LITERAL);
					setState(565);
					match(RR_BRACKET);
					}
				}

				setState(569);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(568);
					match(UNSIGNED);
					}
				}

				setState(572);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(571);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(574);
				match(DOUBLE);
				setState(580);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(575);
					match(LR_BRACKET);
					setState(576);
					match(DECIMAL_LITERAL);
					setState(577);
					match(COMMA);
					setState(578);
					match(DECIMAL_LITERAL);
					setState(579);
					match(RR_BRACKET);
					}
				}

				setState(583);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(582);
					match(UNSIGNED);
					}
				}

				setState(586);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(585);
					match(ZEROFILL);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(588);
				match(FLOAT);
				setState(594);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(589);
					match(LR_BRACKET);
					setState(590);
					match(DECIMAL_LITERAL);
					setState(591);
					match(COMMA);
					setState(592);
					match(DECIMAL_LITERAL);
					setState(593);
					match(RR_BRACKET);
					}
				}

				setState(597);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(596);
					match(UNSIGNED);
					}
				}

				setState(600);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(599);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(602);
				match(DECIMAL);
				setState(610);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(603);
					match(LR_BRACKET);
					setState(604);
					match(DECIMAL_LITERAL);
					setState(607);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(605);
						match(COMMA);
						setState(606);
						match(DECIMAL_LITERAL);
						}
					}

					setState(609);
					match(RR_BRACKET);
					}
				}

				setState(613);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(612);
					match(UNSIGNED);
					}
				}

				setState(616);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(615);
					match(ZEROFILL);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 12);
				{
				setState(618);
				match(NUMERIC);
				setState(626);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(619);
					match(LR_BRACKET);
					setState(620);
					match(DECIMAL_LITERAL);
					setState(623);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(621);
						match(COMMA);
						setState(622);
						match(DECIMAL_LITERAL);
						}
					}

					setState(625);
					match(RR_BRACKET);
					}
				}

				setState(629);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(628);
					match(UNSIGNED);
					}
				}

				setState(632);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(631);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 13);
				{
				setState(634);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(635);
				match(TIME);
				setState(639);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(636);
					match(LR_BRACKET);
					setState(637);
					match(DECIMAL_LITERAL);
					setState(638);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 15);
				{
				setState(641);
				match(TIMESTAMP);
				setState(645);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(642);
					match(LR_BRACKET);
					setState(643);
					match(DECIMAL_LITERAL);
					setState(644);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(647);
				match(DATETIME);
				setState(651);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(648);
					match(LR_BRACKET);
					setState(649);
					match(DECIMAL_LITERAL);
					setState(650);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(653);
				match(YEAR);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(654);
				match(CHAR);
				setState(658);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(655);
					match(LR_BRACKET);
					setState(656);
					match(DECIMAL_LITERAL);
					setState(657);
					match(RR_BRACKET);
					}
				}

				setState(661);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(660);
					match(BINARY);
					}
				}

				setState(666);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(663);
					match(CHARACTER);
					setState(664);
					match(SET);
					setState(665);
					id();
					}
				}

				setState(670);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(668);
					match(COLLATE);
					setState(669);
					id();
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(672);
				match(VARCHAR);
				setState(676);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(673);
					match(LR_BRACKET);
					setState(674);
					match(DECIMAL_LITERAL);
					setState(675);
					match(RR_BRACKET);
					}
				}

				setState(679);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(678);
					match(BINARY);
					}
				}

				setState(684);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(681);
					match(CHARACTER);
					setState(682);
					match(SET);
					setState(683);
					id();
					}
				}

				setState(688);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(686);
					match(COLLATE);
					setState(687);
					id();
					}
				}

				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 20);
				{
				setState(690);
				match(BINARY);
				setState(694);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(691);
					match(LR_BRACKET);
					setState(692);
					match(DECIMAL_LITERAL);
					setState(693);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 21);
				{
				setState(696);
				match(VARBINARY);
				setState(700);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(697);
					match(LR_BRACKET);
					setState(698);
					match(DECIMAL_LITERAL);
					setState(699);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 22);
				{
				setState(702);
				match(BOOLEAN);
				}
				break;
			case TINYBLOB:
				enterOuterAlt(_localctx, 23);
				{
				setState(703);
				match(TINYBLOB);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 24);
				{
				setState(704);
				match(BLOB);
				}
				break;
			case MEDIUMBLOB:
				enterOuterAlt(_localctx, 25);
				{
				setState(705);
				match(MEDIUMBLOB);
				}
				break;
			case LONGBLOB:
				enterOuterAlt(_localctx, 26);
				{
				setState(706);
				match(LONGBLOB);
				}
				break;
			case TINYTEXT:
				enterOuterAlt(_localctx, 27);
				{
				setState(707);
				match(TINYTEXT);
				setState(709);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(708);
					match(BINARY);
					}
				}

				setState(714);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(711);
					match(CHARACTER);
					setState(712);
					match(SET);
					setState(713);
					id();
					}
				}

				setState(718);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(716);
					match(COLLATE);
					setState(717);
					id();
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(720);
				match(TEXT);
				setState(722);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(721);
					match(BINARY);
					}
				}

				setState(727);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(724);
					match(CHARACTER);
					setState(725);
					match(SET);
					setState(726);
					id();
					}
				}

				setState(731);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(729);
					match(COLLATE);
					setState(730);
					id();
					}
				}

				}
				break;
			case MEDIUMTEXT:
				enterOuterAlt(_localctx, 29);
				{
				setState(733);
				match(MEDIUMTEXT);
				setState(735);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(734);
					match(BINARY);
					}
				}

				setState(740);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(737);
					match(CHARACTER);
					setState(738);
					match(SET);
					setState(739);
					id();
					}
				}

				setState(744);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(742);
					match(COLLATE);
					setState(743);
					id();
					}
				}

				}
				break;
			case LONGTEXT:
				enterOuterAlt(_localctx, 30);
				{
				setState(746);
				match(LONGTEXT);
				setState(748);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(747);
					match(BINARY);
					}
				}

				setState(753);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(750);
					match(CHARACTER);
					setState(751);
					match(SET);
					setState(752);
					id();
					}
				}

				setState(757);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(755);
					match(COLLATE);
					setState(756);
					id();
					}
				}

				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 31);
				{
				setState(759);
				match(ENUM);
				{
				setState(760);
				match(LR_BRACKET);
				setState(761);
				id();
				setState(764);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(762);
					match(COMMA);
					setState(763);
					id();
					}
				}

				setState(766);
				match(RR_BRACKET);
				}
				setState(771);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(768);
					match(CHARACTER);
					setState(769);
					match(SET);
					setState(770);
					id();
					}
				}

				setState(775);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(773);
					match(COLLATE);
					setState(774);
					id();
					}
				}

				}
				break;
			case SET:
				enterOuterAlt(_localctx, 32);
				{
				setState(777);
				match(SET);
				{
				setState(778);
				match(LR_BRACKET);
				setState(779);
				id();
				setState(782);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(780);
					match(COMMA);
					setState(781);
					id();
					}
				}

				setState(784);
				match(RR_BRACKET);
				}
				setState(789);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(786);
					match(CHARACTER);
					setState(787);
					match(SET);
					setState(788);
					id();
					}
				}

				setState(793);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(791);
					match(COLLATE);
					setState(792);
					id();
					}
				}

				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 33);
				{
				setState(795);
				match(JSON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Default_valueContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(mysql_ddlParser.NULL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public Default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterDefault_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitDefault_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitDefault_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Default_valueContext default_value() throws RecognitionException {
		Default_valueContext _localctx = new Default_valueContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_default_value);
		try {
			setState(800);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(NULL);
				}
				break;
			case DECIMAL_LITERAL:
			case STRING:
			case BINARY_LITERAL:
			case FLOAT_LITERAL:
			case REAL_LITERAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public Token dollar;
		public TerminalNode STRING() { return getToken(mysql_ddlParser.STRING, 0); }
		public TerminalNode BINARY_LITERAL() { return getToken(mysql_ddlParser.BINARY_LITERAL, 0); }
		public TerminalNode DECIMAL_LITERAL() { return getToken(mysql_ddlParser.DECIMAL_LITERAL, 0); }
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public TerminalNode REAL_LITERAL() { return getToken(mysql_ddlParser.REAL_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(mysql_ddlParser.FLOAT_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_constant);
		int _la;
		try {
			setState(817);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				match(BINARY_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(804);
					sign();
					}
				}

				setState(807);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(809);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(808);
					sign();
					}
				}

				setState(811);
				_la = _input.LA(1);
				if ( !(_la==FLOAT_LITERAL || _la==REAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(813);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(812);
					sign();
					}
				}

				setState(815);
				((ConstantContext)_localctx).dollar = match(DOLLAR);
				setState(816);
				_la = _input.LA(1);
				if ( !(_la==DECIMAL_LITERAL || _la==FLOAT_LITERAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(819);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public Simple_idContext simple_id() {
			return getRuleContext(Simple_idContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTE_ID() { return getToken(mysql_ddlParser.DOUBLE_QUOTE_ID, 0); }
		public TerminalNode LEFT_QUOTE_ID() { return getToken(mysql_ddlParser.LEFT_QUOTE_ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_id);
		try {
			setState(824);
			switch (_input.LA(1)) {
			case FORCESEEK:
			case ABSOLUTE:
			case APPLY:
			case AUTO:
			case AVG:
			case BASE64:
			case CALLER:
			case CAST:
			case CATCH:
			case CHECKSUM_AGG:
			case COMMITTED:
			case CONCAT:
			case CONTROL:
			case COOKIE:
			case COUNT:
			case COUNT_BIG:
			case DELAY:
			case DELETED:
			case DENSE_RANK:
			case DISABLE:
			case DYNAMIC:
			case ENCRYPTION:
			case EXPAND:
			case FAST:
			case FAST_FORWARD:
			case FIRST:
			case FOLLOWING:
			case FORCE:
			case FORCED:
			case FORWARD_ONLY:
			case FULLSCAN:
			case GLOBAL:
			case GO:
			case GROUPING:
			case GROUPING_ID:
			case HASH:
			case IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX:
			case IMPERSONATE:
			case INSENSITIVE:
			case INSERTED:
			case ISOLATION:
			case KEEP:
			case KEEPFIXED:
			case KEYSET:
			case LAST:
			case LEVEL:
			case LOCAL:
			case LOCK_ESCALATION:
			case LOGIN:
			case LOOP:
			case MARK:
			case MAX:
			case MAXDOP:
			case MAXRECURSION:
			case MIN:
			case MODIFY:
			case NAME:
			case NEXT:
			case NOCOUNT:
			case NOEXPAND:
			case NORECOMPUTE:
			case NTILE:
			case NUMBER:
			case OFFSET:
			case ONLINE:
			case ONLY:
			case OPTIMISTIC:
			case OPTIMIZE:
			case OUT:
			case OUTPUT:
			case OWNER:
			case PARAMETERIZATION:
			case PARTITION:
			case PATH:
			case PRECEDING:
			case PRIOR:
			case PRIVILEGES:
			case RANGE:
			case RANK:
			case READONLY:
			case READ_ONLY:
			case RECOMPILE:
			case RELATIVE:
			case REMOTE:
			case REPEATABLE:
			case ROBUST:
			case ROOT:
			case ROW:
			case ROWGUID:
			case ROWS:
			case ROW_NUMBER:
			case SAMPLE:
			case SCHEMABINDING:
			case SCROLL:
			case SCROLL_LOCKS:
			case SELF:
			case SERIALIZABLE:
			case SIMPLE:
			case SNAPSHOT:
			case SPATIAL_WINDOW_MAX_CELLS:
			case STATIC:
			case STATS_STREAM:
			case STDEV:
			case STDEVP:
			case SUM:
			case TEXTIMAGE_ON:
			case THROW:
			case TIES:
			case TIME:
			case TRY:
			case TYPE:
			case TYPE_WARNING:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNKNOWN:
			case USING:
			case VAR:
			case VARP:
			case VIEWS:
			case VIEW_METADATA:
			case WORK:
			case XML:
			case XMLNAMESPACES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(821);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(822);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case LEFT_QUOTE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(823);
				match(LEFT_QUOTE_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mysql_ddlParser.ID, 0); }
		public TerminalNode ABSOLUTE() { return getToken(mysql_ddlParser.ABSOLUTE, 0); }
		public TerminalNode APPLY() { return getToken(mysql_ddlParser.APPLY, 0); }
		public TerminalNode AUTO() { return getToken(mysql_ddlParser.AUTO, 0); }
		public TerminalNode AVG() { return getToken(mysql_ddlParser.AVG, 0); }
		public TerminalNode BASE64() { return getToken(mysql_ddlParser.BASE64, 0); }
		public TerminalNode CALLER() { return getToken(mysql_ddlParser.CALLER, 0); }
		public TerminalNode CAST() { return getToken(mysql_ddlParser.CAST, 0); }
		public TerminalNode CATCH() { return getToken(mysql_ddlParser.CATCH, 0); }
		public TerminalNode CHECKSUM_AGG() { return getToken(mysql_ddlParser.CHECKSUM_AGG, 0); }
		public TerminalNode COMMITTED() { return getToken(mysql_ddlParser.COMMITTED, 0); }
		public TerminalNode CONCAT() { return getToken(mysql_ddlParser.CONCAT, 0); }
		public TerminalNode CONTROL() { return getToken(mysql_ddlParser.CONTROL, 0); }
		public TerminalNode COOKIE() { return getToken(mysql_ddlParser.COOKIE, 0); }
		public TerminalNode COUNT() { return getToken(mysql_ddlParser.COUNT, 0); }
		public TerminalNode COUNT_BIG() { return getToken(mysql_ddlParser.COUNT_BIG, 0); }
		public TerminalNode DELAY() { return getToken(mysql_ddlParser.DELAY, 0); }
		public TerminalNode DELETED() { return getToken(mysql_ddlParser.DELETED, 0); }
		public TerminalNode DENSE_RANK() { return getToken(mysql_ddlParser.DENSE_RANK, 0); }
		public TerminalNode DISABLE() { return getToken(mysql_ddlParser.DISABLE, 0); }
		public TerminalNode DYNAMIC() { return getToken(mysql_ddlParser.DYNAMIC, 0); }
		public TerminalNode ENCRYPTION() { return getToken(mysql_ddlParser.ENCRYPTION, 0); }
		public TerminalNode EXPAND() { return getToken(mysql_ddlParser.EXPAND, 0); }
		public TerminalNode FAST() { return getToken(mysql_ddlParser.FAST, 0); }
		public TerminalNode FAST_FORWARD() { return getToken(mysql_ddlParser.FAST_FORWARD, 0); }
		public TerminalNode FIRST() { return getToken(mysql_ddlParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(mysql_ddlParser.FOLLOWING, 0); }
		public TerminalNode FORCE() { return getToken(mysql_ddlParser.FORCE, 0); }
		public TerminalNode FORCESEEK() { return getToken(mysql_ddlParser.FORCESEEK, 0); }
		public TerminalNode FORWARD_ONLY() { return getToken(mysql_ddlParser.FORWARD_ONLY, 0); }
		public TerminalNode FULLSCAN() { return getToken(mysql_ddlParser.FULLSCAN, 0); }
		public TerminalNode GLOBAL() { return getToken(mysql_ddlParser.GLOBAL, 0); }
		public TerminalNode GO() { return getToken(mysql_ddlParser.GO, 0); }
		public TerminalNode GROUPING() { return getToken(mysql_ddlParser.GROUPING, 0); }
		public TerminalNode GROUPING_ID() { return getToken(mysql_ddlParser.GROUPING_ID, 0); }
		public TerminalNode HASH() { return getToken(mysql_ddlParser.HASH, 0); }
		public TerminalNode IMPERSONATE() { return getToken(mysql_ddlParser.IMPERSONATE, 0); }
		public TerminalNode INSENSITIVE() { return getToken(mysql_ddlParser.INSENSITIVE, 0); }
		public TerminalNode INSERTED() { return getToken(mysql_ddlParser.INSERTED, 0); }
		public TerminalNode ISOLATION() { return getToken(mysql_ddlParser.ISOLATION, 0); }
		public TerminalNode KEEP() { return getToken(mysql_ddlParser.KEEP, 0); }
		public TerminalNode KEEPFIXED() { return getToken(mysql_ddlParser.KEEPFIXED, 0); }
		public TerminalNode FORCED() { return getToken(mysql_ddlParser.FORCED, 0); }
		public TerminalNode KEYSET() { return getToken(mysql_ddlParser.KEYSET, 0); }
		public TerminalNode IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX() { return getToken(mysql_ddlParser.IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX, 0); }
		public TerminalNode LAST() { return getToken(mysql_ddlParser.LAST, 0); }
		public TerminalNode LEVEL() { return getToken(mysql_ddlParser.LEVEL, 0); }
		public TerminalNode LOCAL() { return getToken(mysql_ddlParser.LOCAL, 0); }
		public TerminalNode LOCK_ESCALATION() { return getToken(mysql_ddlParser.LOCK_ESCALATION, 0); }
		public TerminalNode LOGIN() { return getToken(mysql_ddlParser.LOGIN, 0); }
		public TerminalNode LOOP() { return getToken(mysql_ddlParser.LOOP, 0); }
		public TerminalNode MARK() { return getToken(mysql_ddlParser.MARK, 0); }
		public TerminalNode MAX() { return getToken(mysql_ddlParser.MAX, 0); }
		public TerminalNode MAXDOP() { return getToken(mysql_ddlParser.MAXDOP, 0); }
		public TerminalNode MAXRECURSION() { return getToken(mysql_ddlParser.MAXRECURSION, 0); }
		public TerminalNode MIN() { return getToken(mysql_ddlParser.MIN, 0); }
		public TerminalNode MODIFY() { return getToken(mysql_ddlParser.MODIFY, 0); }
		public TerminalNode NAME() { return getToken(mysql_ddlParser.NAME, 0); }
		public TerminalNode NEXT() { return getToken(mysql_ddlParser.NEXT, 0); }
		public TerminalNode NOCOUNT() { return getToken(mysql_ddlParser.NOCOUNT, 0); }
		public TerminalNode NOEXPAND() { return getToken(mysql_ddlParser.NOEXPAND, 0); }
		public TerminalNode NORECOMPUTE() { return getToken(mysql_ddlParser.NORECOMPUTE, 0); }
		public TerminalNode NTILE() { return getToken(mysql_ddlParser.NTILE, 0); }
		public TerminalNode NUMBER() { return getToken(mysql_ddlParser.NUMBER, 0); }
		public TerminalNode OFFSET() { return getToken(mysql_ddlParser.OFFSET, 0); }
		public TerminalNode ONLINE() { return getToken(mysql_ddlParser.ONLINE, 0); }
		public TerminalNode ONLY() { return getToken(mysql_ddlParser.ONLY, 0); }
		public TerminalNode OPTIMISTIC() { return getToken(mysql_ddlParser.OPTIMISTIC, 0); }
		public TerminalNode OPTIMIZE() { return getToken(mysql_ddlParser.OPTIMIZE, 0); }
		public TerminalNode OUT() { return getToken(mysql_ddlParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(mysql_ddlParser.OUTPUT, 0); }
		public TerminalNode OWNER() { return getToken(mysql_ddlParser.OWNER, 0); }
		public TerminalNode PARAMETERIZATION() { return getToken(mysql_ddlParser.PARAMETERIZATION, 0); }
		public TerminalNode PARTITION() { return getToken(mysql_ddlParser.PARTITION, 0); }
		public TerminalNode PATH() { return getToken(mysql_ddlParser.PATH, 0); }
		public TerminalNode PRECEDING() { return getToken(mysql_ddlParser.PRECEDING, 0); }
		public TerminalNode PRIOR() { return getToken(mysql_ddlParser.PRIOR, 0); }
		public TerminalNode PRIVILEGES() { return getToken(mysql_ddlParser.PRIVILEGES, 0); }
		public TerminalNode RANGE() { return getToken(mysql_ddlParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(mysql_ddlParser.RANK, 0); }
		public TerminalNode READONLY() { return getToken(mysql_ddlParser.READONLY, 0); }
		public TerminalNode READ_ONLY() { return getToken(mysql_ddlParser.READ_ONLY, 0); }
		public TerminalNode RECOMPILE() { return getToken(mysql_ddlParser.RECOMPILE, 0); }
		public TerminalNode RELATIVE() { return getToken(mysql_ddlParser.RELATIVE, 0); }
		public TerminalNode REMOTE() { return getToken(mysql_ddlParser.REMOTE, 0); }
		public TerminalNode REPEATABLE() { return getToken(mysql_ddlParser.REPEATABLE, 0); }
		public TerminalNode ROBUST() { return getToken(mysql_ddlParser.ROBUST, 0); }
		public TerminalNode ROOT() { return getToken(mysql_ddlParser.ROOT, 0); }
		public TerminalNode ROW() { return getToken(mysql_ddlParser.ROW, 0); }
		public TerminalNode ROWGUID() { return getToken(mysql_ddlParser.ROWGUID, 0); }
		public TerminalNode ROWS() { return getToken(mysql_ddlParser.ROWS, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(mysql_ddlParser.ROW_NUMBER, 0); }
		public TerminalNode SAMPLE() { return getToken(mysql_ddlParser.SAMPLE, 0); }
		public TerminalNode SCHEMABINDING() { return getToken(mysql_ddlParser.SCHEMABINDING, 0); }
		public TerminalNode SCROLL() { return getToken(mysql_ddlParser.SCROLL, 0); }
		public TerminalNode SCROLL_LOCKS() { return getToken(mysql_ddlParser.SCROLL_LOCKS, 0); }
		public TerminalNode SELF() { return getToken(mysql_ddlParser.SELF, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(mysql_ddlParser.SERIALIZABLE, 0); }
		public TerminalNode SIMPLE() { return getToken(mysql_ddlParser.SIMPLE, 0); }
		public TerminalNode SNAPSHOT() { return getToken(mysql_ddlParser.SNAPSHOT, 0); }
		public TerminalNode SPATIAL_WINDOW_MAX_CELLS() { return getToken(mysql_ddlParser.SPATIAL_WINDOW_MAX_CELLS, 0); }
		public TerminalNode STATIC() { return getToken(mysql_ddlParser.STATIC, 0); }
		public TerminalNode STATS_STREAM() { return getToken(mysql_ddlParser.STATS_STREAM, 0); }
		public TerminalNode STDEV() { return getToken(mysql_ddlParser.STDEV, 0); }
		public TerminalNode STDEVP() { return getToken(mysql_ddlParser.STDEVP, 0); }
		public TerminalNode SUM() { return getToken(mysql_ddlParser.SUM, 0); }
		public TerminalNode TEXTIMAGE_ON() { return getToken(mysql_ddlParser.TEXTIMAGE_ON, 0); }
		public TerminalNode THROW() { return getToken(mysql_ddlParser.THROW, 0); }
		public TerminalNode TIES() { return getToken(mysql_ddlParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(mysql_ddlParser.TIME, 0); }
		public TerminalNode TRY() { return getToken(mysql_ddlParser.TRY, 0); }
		public TerminalNode TYPE() { return getToken(mysql_ddlParser.TYPE, 0); }
		public TerminalNode TYPE_WARNING() { return getToken(mysql_ddlParser.TYPE_WARNING, 0); }
		public TerminalNode UNBOUNDED() { return getToken(mysql_ddlParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(mysql_ddlParser.UNCOMMITTED, 0); }
		public TerminalNode UNKNOWN() { return getToken(mysql_ddlParser.UNKNOWN, 0); }
		public TerminalNode USING() { return getToken(mysql_ddlParser.USING, 0); }
		public TerminalNode VAR() { return getToken(mysql_ddlParser.VAR, 0); }
		public TerminalNode VARP() { return getToken(mysql_ddlParser.VARP, 0); }
		public TerminalNode VIEW_METADATA() { return getToken(mysql_ddlParser.VIEW_METADATA, 0); }
		public TerminalNode VIEWS() { return getToken(mysql_ddlParser.VIEWS, 0); }
		public TerminalNode WORK() { return getToken(mysql_ddlParser.WORK, 0); }
		public TerminalNode XML() { return getToken(mysql_ddlParser.XML, 0); }
		public TerminalNode XMLNAMESPACES() { return getToken(mysql_ddlParser.XMLNAMESPACES, 0); }
		public Simple_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterSimple_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitSimple_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitSimple_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_idContext simple_id() throws RecognitionException {
		Simple_idContext _localctx = new Simple_idContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			_la = _input.LA(1);
			if ( !(_la==FORCESEEK || ((((_la - 197)) & ~0x3f) == 0 && ((1L << (_la - 197)) & ((1L << (ABSOLUTE - 197)) | (1L << (APPLY - 197)) | (1L << (AUTO - 197)) | (1L << (AVG - 197)) | (1L << (BASE64 - 197)) | (1L << (CALLER - 197)) | (1L << (CAST - 197)) | (1L << (CATCH - 197)) | (1L << (CHECKSUM_AGG - 197)) | (1L << (COMMITTED - 197)) | (1L << (CONCAT - 197)) | (1L << (CONTROL - 197)) | (1L << (COOKIE - 197)) | (1L << (COUNT - 197)) | (1L << (COUNT_BIG - 197)) | (1L << (DELAY - 197)) | (1L << (DELETED - 197)) | (1L << (DENSE_RANK - 197)) | (1L << (DISABLE - 197)) | (1L << (DYNAMIC - 197)) | (1L << (ENCRYPTION - 197)) | (1L << (EXPAND - 197)) | (1L << (FAST - 197)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FAST_FORWARD - 261)) | (1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (ONLY - 325)) | (1L << (OPTIMISTIC - 325)) | (1L << (OPTIMIZE - 325)) | (1L << (OUT - 325)) | (1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)))) != 0) || ((((_la - 389)) & ~0x3f) == 0 && ((1L << (_la - 389)) & ((1L << (TYPE_WARNING - 389)) | (1L << (UNBOUNDED - 389)) | (1L << (UNCOMMITTED - 389)) | (1L << (UNKNOWN - 389)) | (1L << (USING - 389)) | (1L << (VAR - 389)) | (1L << (VARP - 389)) | (1L << (VIEWS - 389)) | (1L << (VIEW_METADATA - 389)) | (1L << (WORK - 389)) | (1L << (XML - 389)) | (1L << (XMLNAMESPACES - 389)) | (1L << (ID - 389)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparison_operatorContext extends ParserRuleContext {
		public Comparison_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterComparison_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitComparison_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitComparison_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comparison_operatorContext comparison_operator() throws RecognitionException {
		Comparison_operatorContext _localctx = new Comparison_operatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comparison_operator);
		try {
			setState(843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(830);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(831);
				match(LESS);
				setState(832);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(833);
				match(GREATER);
				setState(834);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(835);
				match(LESS);
				setState(836);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(837);
				match(EXCLAMATION);
				setState(838);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(839);
				match(EXCLAMATION);
				setState(840);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(841);
				match(EXCLAMATION);
				setState(842);
				match(LESS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitAssignment_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitAssignment_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			_la = _input.LA(1);
			if ( !(((((_la - 453)) & ~0x3f) == 0 && ((1L << (_la - 453)) & ((1L << (PLUS_ASSIGN - 453)) | (1L << (MINUS_ASSIGN - 453)) | (1L << (MULT_ASSIGN - 453)) | (1L << (DIV_ASSIGN - 453)) | (1L << (MOD_ASSIGN - 453)) | (1L << (AND_ASSIGN - 453)) | (1L << (XOR_ASSIGN - 453)) | (1L << (OR_ASSIGN - 453)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_sizeContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(mysql_ddlParser.DECIMAL_LITERAL, 0); }
		public TerminalNode KB() { return getToken(mysql_ddlParser.KB, 0); }
		public TerminalNode MB() { return getToken(mysql_ddlParser.MB, 0); }
		public TerminalNode GB() { return getToken(mysql_ddlParser.GB, 0); }
		public TerminalNode TB() { return getToken(mysql_ddlParser.TB, 0); }
		public File_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).enterFile_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mysql_ddlListener ) ((mysql_ddlListener)listener).exitFile_size(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mysql_ddlVisitor ) return ((mysql_ddlVisitor<? extends T>)visitor).visitFile_size(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_sizeContext file_size() throws RecognitionException {
		File_sizeContext _localctx = new File_sizeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(DECIMAL_LITERAL);
			setState(849);
			_la = _input.LA(1);
			if (((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (GB - 271)) | (1L << (KB - 271)) | (1L << (MB - 271)))) != 0) || _la==TB || _la==MODULE) {
				{
				setState(848);
				_la = _input.LA(1);
				if ( !(((((_la - 271)) & ~0x3f) == 0 && ((1L << (_la - 271)) & ((1L << (GB - 271)) | (1L << (KB - 271)) | (1L << (MB - 271)))) != 0) || _la==TB || _la==MODULE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01e1\u0356\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\3\2\3\3\7\3n\n\3\f\3\16\3q\13\3\3\3\3\3\3\4\3\4\6\4w\n"+
		"\4\r\4\16\4x\6\4{\n\4\r\4\16\4|\3\5\3\5\3\5\3\5\3\5\5\5\u0084\n\5\3\6"+
		"\3\6\5\6\u0088\n\6\3\6\5\6\u008b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0094"+
		"\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009f\n\7\f\7\16\7\u00a2"+
		"\13\7\3\7\3\7\5\7\u00a6\n\7\3\7\5\7\u00a9\n\7\3\b\3\b\3\b\5\b\u00ae\n"+
		"\b\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\t\5\t\u00b8\n\t\3\t\5\t\u00bb\n"+
		"\t\3\t\3\t\5\t\u00bf\n\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u00c7\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00d8"+
		"\n\16\3\16\3\16\3\16\5\16\u00dd\n\16\3\16\5\16\u00e0\n\16\3\17\3\17\3"+
		"\17\3\17\5\17\u00e6\n\17\3\17\3\17\3\20\3\20\5\20\u00ec\n\20\3\21\3\21"+
		"\3\21\5\21\u00f1\n\21\3\21\5\21\u00f4\n\21\3\21\5\21\u00f7\n\21\3\21\3"+
		"\21\5\21\u00fb\n\21\5\21\u00fd\n\21\3\21\3\21\5\21\u0101\n\21\3\22\3\22"+
		"\3\22\5\22\u0106\n\22\3\22\3\22\3\22\5\22\u010b\n\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0118\n\24\3\25\3\25\5\25"+
		"\u011c\n\25\3\25\5\25\u011f\n\25\3\25\3\25\3\25\5\25\u0124\n\25\3\25\5"+
		"\25\u0127\n\25\3\26\3\26\3\26\5\26\u012c\n\26\3\27\3\27\5\27\u0130\n\27"+
		"\3\27\3\27\3\27\5\27\u0135\n\27\3\27\5\27\u0138\n\27\3\27\3\27\3\27\3"+
		"\27\3\30\5\30\u013f\n\30\3\30\3\30\5\30\u0143\n\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\5\31\u014b\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u0159\n\31\f\31\16\31\u015c\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u0164\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u016b\n"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0177\n\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u017e\n\34\3\34\3\34\3\35\3\35\3\35\5\35"+
		"\u0185\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u018c\n\35\3\35\3\35\3\36\3"+
		"\36\3\36\5\36\u0193\n\36\3\36\3\36\3\37\3\37\3\37\5\37\u019a\n\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u01a1\n\37\3\37\3\37\3 \3 \5 \u01a7\n \3!\3"+
		"!\3!\5!\u01ac\n!\3!\3!\3\"\3\"\3\"\7\"\u01b3\n\"\f\"\16\"\u01b6\13\"\3"+
		"#\3#\5#\u01ba\n#\3#\3#\3#\5#\u01bf\n#\7#\u01c1\n#\f#\16#\u01c4\13#\3$"+
		"\3$\5$\u01c8\n$\3%\3%\3&\3&\3\'\5\'\u01cf\n\'\3\'\3\'\3(\3(\3(\3(\3(\5"+
		"(\u01d8\n(\3)\3)\5)\u01dc\n)\3)\3)\3)\3)\5)\u01e2\n)\3)\5)\u01e5\n)\3"+
		"*\3*\5*\u01e9\n*\3*\3*\3*\3*\5*\u01ef\n*\3*\5*\u01f2\n*\3*\5*\u01f5\n"+
		"*\3*\3*\3*\3*\5*\u01fb\n*\3*\5*\u01fe\n*\3*\5*\u0201\n*\3*\3*\3*\3*\5"+
		"*\u0207\n*\3*\5*\u020a\n*\3*\5*\u020d\n*\3*\3*\3*\3*\5*\u0213\n*\3*\5"+
		"*\u0216\n*\3*\5*\u0219\n*\3*\3*\3*\3*\5*\u021f\n*\3*\5*\u0222\n*\3*\5"+
		"*\u0225\n*\3*\3*\3*\3*\5*\u022b\n*\3*\5*\u022e\n*\3*\5*\u0231\n*\3*\3"+
		"*\3*\3*\3*\3*\5*\u0239\n*\3*\5*\u023c\n*\3*\5*\u023f\n*\3*\3*\3*\3*\3"+
		"*\3*\5*\u0247\n*\3*\5*\u024a\n*\3*\5*\u024d\n*\3*\3*\3*\3*\3*\3*\5*\u0255"+
		"\n*\3*\5*\u0258\n*\3*\5*\u025b\n*\3*\3*\3*\3*\3*\5*\u0262\n*\3*\5*\u0265"+
		"\n*\3*\5*\u0268\n*\3*\5*\u026b\n*\3*\3*\3*\3*\3*\5*\u0272\n*\3*\5*\u0275"+
		"\n*\3*\5*\u0278\n*\3*\5*\u027b\n*\3*\3*\3*\3*\3*\5*\u0282\n*\3*\3*\3*"+
		"\3*\5*\u0288\n*\3*\3*\3*\3*\5*\u028e\n*\3*\3*\3*\3*\3*\5*\u0295\n*\3*"+
		"\5*\u0298\n*\3*\3*\3*\5*\u029d\n*\3*\3*\5*\u02a1\n*\3*\3*\3*\3*\5*\u02a7"+
		"\n*\3*\5*\u02aa\n*\3*\3*\3*\5*\u02af\n*\3*\3*\5*\u02b3\n*\3*\3*\3*\3*"+
		"\5*\u02b9\n*\3*\3*\3*\3*\5*\u02bf\n*\3*\3*\3*\3*\3*\3*\3*\5*\u02c8\n*"+
		"\3*\3*\3*\5*\u02cd\n*\3*\3*\5*\u02d1\n*\3*\3*\5*\u02d5\n*\3*\3*\3*\5*"+
		"\u02da\n*\3*\3*\5*\u02de\n*\3*\3*\5*\u02e2\n*\3*\3*\3*\5*\u02e7\n*\3*"+
		"\3*\5*\u02eb\n*\3*\3*\5*\u02ef\n*\3*\3*\3*\5*\u02f4\n*\3*\3*\5*\u02f8"+
		"\n*\3*\3*\3*\3*\3*\5*\u02ff\n*\3*\3*\3*\3*\3*\5*\u0306\n*\3*\3*\5*\u030a"+
		"\n*\3*\3*\3*\3*\3*\5*\u0311\n*\3*\3*\3*\3*\3*\5*\u0318\n*\3*\3*\5*\u031c"+
		"\n*\3*\5*\u031f\n*\3+\3+\5+\u0323\n+\3,\3,\3,\5,\u0328\n,\3,\3,\5,\u032c"+
		"\n,\3,\3,\5,\u0330\n,\3,\3,\5,\u0334\n,\3-\3-\3.\3.\3.\5.\u033b\n.\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\5\60\u034e\n\60\3\61\3\61\3\62\3\62\5\62\u0354\n\62\3\62\2\2"+
		"\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B"+
		"DFHJLNPRTVXZ\\^`b\2\16\4\2\13\13\67\67\4\2\u0086\u0086\u00b6\u00b6\4\2"+
		"\\\\cc\4\2ttvv\4\2\34\34mm\4\2\u012c\u012c\u01bd\u01bd\3\2\u01c1\u01c2"+
		"\4\2\u01bd\u01bd\u01c1\u01c1\3\2\u01dc\u01dd.\2LL\u00c7\u00c7\u00cf\u00cf"+
		"\u00d1\u00d1\u00d8\u00d9\u00dc\u00de\u00e3\u00e3\u00e5\u00e5\u00e7\u00e7"+
		"\u00e9\u00ec\u00f8\u00f8\u00fa\u00fb\u00fd\u00fd\u0100\u0100\u0103\u0103"+
		"\u0105\u0107\u010b\u0110\u0112\u0115\u0117\u0117\u011a\u011a\u011c\u011c"+
		"\u011e\u0120\u0122\u012e\u0132\u0132\u0136\u0136\u0138\u0138\u013b\u013d"+
		"\u013f\u013f\u0141\u0142\u0145\u014c\u014e\u0153\u0155\u0157\u0159\u0159"+
		"\u015b\u015b\u015e\u0160\u0162\u016b\u016d\u016e\u0170\u0170\u0173\u0179"+
		"\u017d\u0180\u0184\u0184\u0186\u018a\u018c\u0193\u01be\u01be\3\2\u01c7"+
		"\u01ce\7\2\u0111\u0111\u0121\u0121\u0130\u0130\u017c\u017c\u01db\u01db"+
		"\u03e9\2g\3\2\2\2\4o\3\2\2\2\6z\3\2\2\2\b\u0083\3\2\2\2\n\u0085\3\2\2"+
		"\2\f\u0097\3\2\2\2\16\u00aa\3\2\2\2\20\u00b2\3\2\2\2\22\u00c2\3\2\2\2"+
		"\24\u00c4\3\2\2\2\26\u00ca\3\2\2\2\30\u00cd\3\2\2\2\32\u00d3\3\2\2\2\34"+
		"\u00e1\3\2\2\2\36\u00eb\3\2\2\2 \u00ed\3\2\2\2\"\u0102\3\2\2\2$\u010e"+
		"\3\2\2\2&\u0117\3\2\2\2(\u011b\3\2\2\2*\u012b\3\2\2\2,\u012f\3\2\2\2."+
		"\u013e\3\2\2\2\60\u014a\3\2\2\2\62\u015d\3\2\2\2\64\u0165\3\2\2\2\66\u017d"+
		"\3\2\2\28\u018b\3\2\2\2:\u0192\3\2\2\2<\u01a0\3\2\2\2>\u01a6\3\2\2\2@"+
		"\u01ab\3\2\2\2B\u01af\3\2\2\2D\u01b7\3\2\2\2F\u01c7\3\2\2\2H\u01c9\3\2"+
		"\2\2J\u01cb\3\2\2\2L\u01ce\3\2\2\2N\u01d7\3\2\2\2P\u01d9\3\2\2\2R\u031e"+
		"\3\2\2\2T\u0322\3\2\2\2V\u0333\3\2\2\2X\u0335\3\2\2\2Z\u033a\3\2\2\2\\"+
		"\u033c\3\2\2\2^\u034d\3\2\2\2`\u034f\3\2\2\2b\u0351\3\2\2\2df\5\4\3\2"+
		"ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\2\2\3"+
		"k\3\3\2\2\2ln\7\u01d7\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qo\3\2\2\2rs\5\6\4\2s\5\3\2\2\2tv\5\b\5\2uw\7\u01d7\2\2vu\3\2\2"+
		"\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zt\3\2\2\2{|\3\2\2\2|z\3\2\2"+
		"\2|}\3\2\2\2}\7\3\2\2\2~\u0084\5\n\6\2\177\u0084\5\f\7\2\u0080\u0084\5"+
		"\30\r\2\u0081\u0084\5\32\16\2\u0082\u0084\5\34\17\2\u0083~\3\2\2\2\u0083"+
		"\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2"+
		"\2\u0084\t\3\2\2\2\u0085\u0087\7(\2\2\u0086\u0088\7\u00b6\2\2\u0087\u0086"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u008b\5J&\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\\"+
		"\2\2\u008d\u008e\5Z.\2\u008e\u008f\7v\2\2\u008f\u0090\58\35\2\u0090\u0091"+
		"\7\u01d4\2\2\u0091\u0093\5B\"\2\u0092\u0094\t\2\2\2\u0093\u0092\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\u01d5\2\2\u0096"+
		"\13\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\7\u00a9\2\2\u0099\u009a\58"+
		"\35\2\u009a\u009b\7\u01d4\2\2\u009b\u00a0\5\36\20\2\u009c\u009d\7\u01d6"+
		"\2\2\u009d\u009f\5\36\20\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a5\7\u01d5\2\2\u00a4\u00a6\5\16\b\2\u00a5\u00a4\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5\24\13\2\u00a8\u00a7"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\r\3\2\2\2\u00aa\u00ad\5\20\t\2\u00ab"+
		"\u00ac\7\u01d6\2\2\u00ac\u00ae\5\16\b\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\17\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1\7\u01c3\2\2\u00b1"+
		"\u00b3\5Z.\2\u00b2\u00af\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7\3\2\2"+
		"\2\u00b4\u00b5\7\r\2\2\u00b5\u00b6\7\u01c3\2\2\u00b6\u00b8\7\u01bd\2\2"+
		"\u00b7\u00b4\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb"+
		"\7\64\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00be\7\u00e1\2\2\u00bd\u00bf\7\u01c3\2\2\u00be\u00bd\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\5\22\n\2\u00c1\21\3\2\2"+
		"\2\u00c2\u00c3\7\3\2\2\u00c3\23\3\2\2\2\u00c4\u00c6\7\u00e4\2\2\u00c5"+
		"\u00c7\7\u01c3\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8"+
		"\3\2\2\2\u00c8\u00c9\7\u01bf\2\2\u00c9\25\3\2\2\2\u00ca\u00cb\7\u00e4"+
		"\2\2\u00cb\u00cc\7\u01bf\2\2\u00cc\27\3\2\2\2\u00cd\u00ce\7\7\2\2\u00ce"+
		"\u00cf\7\u00a9\2\2\u00cf\u00d0\58\35\2\u00d0\u00d1\7\5\2\2\u00d1\u00d2"+
		"\5\36\20\2\u00d2\31\3\2\2\2\u00d3\u00d4\7;\2\2\u00d4\u00d7\7\\\2\2\u00d5"+
		"\u00d6\7Z\2\2\u00d6\u00d8\7D\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d9\3\2\2\2\u00d9\u00dc\5Z.\2\u00da\u00db\7v\2\2\u00db\u00dd"+
		"\58\35\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de"+
		"\u00e0\7\u01d7\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\33\3"+
		"\2\2\2\u00e1\u00e2\7;\2\2\u00e2\u00e5\7\u00a9\2\2\u00e3\u00e4\7Z\2\2\u00e4"+
		"\u00e6\7D\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00e8\58\35\2\u00e8\35\3\2\2\2\u00e9\u00ec\5 \21\2\u00ea\u00ec"+
		"\5*\26\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\37\3\2\2\2\u00ed"+
		"\u00ee\5Z.\2\u00ee\u00f0\5R*\2\u00ef\u00f1\5L\'\2\u00f0\u00ef\3\2\2\2"+
		"\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2\u00f4\5$\23\2\u00f3\u00f2"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\7\r\2\2\u00f6"+
		"\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fc\3\2\2\2\u00f8\u00fa\t\3"+
		"\2\2\u00f9\u00fb\7c\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u0100\3\2"+
		"\2\2\u00fe\u00ff\7\u00e4\2\2\u00ff\u0101\7\u01bf\2\2\u0100\u00fe\3\2\2"+
		"\2\u0100\u0101\3\2\2\2\u0101!\3\2\2\2\u0102\u0103\5Z.\2\u0103\u0105\5"+
		"R*\2\u0104\u0106\5L\'\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u010a\3\2\2\2\u0107\u0108\7\64\2\2\u0108\u010b\5&\24\2\u0109\u010b\7"+
		"\r\2\2\u010a\u0107\3\2\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010d\5\26\f\2\u010d#\3\2\2\2\u010e\u010f\7\64\2"+
		"\2\u010f\u0110\5&\24\2\u0110%\3\2\2\2\u0111\u0118\7q\2\2\u0112\u0118\5"+
		"V,\2\u0113\u0114\7\u01d4\2\2\u0114\u0115\5&\24\2\u0115\u0116\7\u01d5\2"+
		"\2\u0116\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0112\3\2\2\2\u0117\u0113"+
		"\3\2\2\2\u0118\'\3\2\2\2\u0119\u011a\7\"\2\2\u011a\u011c\5Z.\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011f\5L\'\2\u011e"+
		"\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120\u0121\7\u0086"+
		"\2\2\u0121\u0124\7c\2\2\u0122\u0124\7\u00b6\2\2\u0123\u0120\3\2\2\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0127\5J&\2\u0126\u0125\3\2\2"+
		"\2\u0126\u0127\3\2\2\2\u0127)\3\2\2\2\u0128\u012c\5,\27\2\u0129\u012c"+
		"\5.\30\2\u012a\u012c\5\60\31\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2"+
		"\u012b\u012a\3\2\2\2\u012c+\3\2\2\2\u012d\u012e\7\"\2\2\u012e\u0130\5"+
		"Z.\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0134\3\2\2\2\u0131"+
		"\u0132\7\u0086\2\2\u0132\u0135\7c\2\2\u0133\u0135\7\u00b6\2\2\u0134\u0131"+
		"\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0138\5J&\2\u0137"+
		"\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013a\7\u01d4"+
		"\2\2\u013a\u013b\5D#\2\u013b\u013c\7\u01d5\2\2\u013c-\3\2\2\2\u013d\u013f"+
		"\7\u00b6\2\2\u013e\u013d\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2"+
		"\2\u0140\u0142\t\4\2\2\u0141\u0143\5Z.\2\u0142\u0141\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\7\u01d4\2\2\u0145\u0146\5D#\2"+
		"\u0146\u0147\7\u01d5\2\2\u0147/\3\2\2\2\u0148\u0149\7\"\2\2\u0149\u014b"+
		"\5Z.\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014d\7M\2\2\u014d\u014e\7c\2\2\u014e\u014f\7\u01d4\2\2\u014f\u0150\5"+
		"B\"\2\u0150\u0151\7\u01d5\2\2\u0151\u0152\7\u008f\2\2\u0152\u0153\5Z."+
		"\2\u0153\u0154\7\u01d4\2\2\u0154\u0155\5B\"\2\u0155\u015a\7\u01d5\2\2"+
		"\u0156\u0159\5\62\32\2\u0157\u0159\5\64\33\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0157\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\61\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u015e\7v\2\2\u015e\u0163"+
		"\7\65\2\2\u015f\u0164\7\25\2\2\u0160\u0164\7\u0092\2\2\u0161\u0162\7o"+
		"\2\2\u0162\u0164\7\4\2\2\u0163\u015f\3\2\2\2\u0163\u0160\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\63\3\2\2\2\u0165\u0166\7v\2\2\u0166\u016a\7\u00b9"+
		"\2\2\u0167\u016b\7\u0092\2\2\u0168\u0169\7o\2\2\u0169\u016b\7\4\2\2\u016a"+
		"\u0167\3\2\2\2\u016a\u0168\3\2\2\2\u016b\65\3\2\2\2\u016c\u016d\5Z.\2"+
		"\u016d\u016e\7\u01cf\2\2\u016e\u016f\5Z.\2\u016f\u0170\7\u01cf\2\2\u0170"+
		"\u0171\5Z.\2\u0171\u0172\7\u01cf\2\2\u0172\u017e\3\2\2\2\u0173\u0174\5"+
		"Z.\2\u0174\u0176\7\u01cf\2\2\u0175\u0177\5Z.\2\u0176\u0175\3\2\2\2\u0176"+
		"\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\7\u01cf\2\2\u0179\u017e"+
		"\3\2\2\2\u017a\u017b\5Z.\2\u017b\u017c\7\u01cf\2\2\u017c\u017e\3\2\2\2"+
		"\u017d\u016c\3\2\2\2\u017d\u0173\3\2\2\2\u017d\u017a\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\5Z.\2\u0180\67\3\2\2\2\u0181"+
		"\u0182\5Z.\2\u0182\u0184\7\u01cf\2\2\u0183\u0185\5Z.\2\u0184\u0183\3\2"+
		"\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\7\u01cf\2\2\u0187"+
		"\u018c\3\2\2\2\u0188\u0189\5Z.\2\u0189\u018a\7\u01cf\2\2\u018a\u018c\3"+
		"\2\2\2\u018b\u0181\3\2\2\2\u018b\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\5Z.\2\u018e9\3\2\2\2\u018f\u0190\5Z.\2\u0190"+
		"\u0191\7\u01cf\2\2\u0191\u0193\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\5Z.\2\u0195;\3\2\2\2\u0196\u0197"+
		"\5Z.\2\u0197\u0199\7\u01cf\2\2\u0198\u019a\5Z.\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\7\u01cf\2\2\u019c\u01a1"+
		"\3\2\2\2\u019d\u019e\5Z.\2\u019e\u019f\7\u01cf\2\2\u019f\u01a1\3\2\2\2"+
		"\u01a0\u0196\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2"+
		"\3\2\2\2\u01a2\u01a3\5Z.\2\u01a3=\3\2\2\2\u01a4\u01a7\5\66\34\2\u01a5"+
		"\u01a7\7\u01bc\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7?\3\2"+
		"\2\2\u01a8\u01a9\58\35\2\u01a9\u01aa\7\u01cf\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u01a8\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5Z"+
		".\2\u01aeA\3\2\2\2\u01af\u01b4\5Z.\2\u01b0\u01b1\7\u01d6\2\2\u01b1\u01b3"+
		"\5Z.\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4"+
		"\u01b5\3\2\2\2\u01b5C\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01b9\5Z.\2\u01b8"+
		"\u01ba\t\2\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01c2\3\2"+
		"\2\2\u01bb\u01bc\7\u01d6\2\2\u01bc\u01be\5Z.\2\u01bd\u01bf\t\2\2\2\u01be"+
		"\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01bb\3\2"+
		"\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"E\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\5Z.\2\u01c6\u01c8\7\u01bc\2"+
		"\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8G\3\2\2\2\u01c9\u01ca"+
		"\t\5\2\2\u01caI\3\2\2\2\u01cb\u01cc\t\6\2\2\u01ccK\3\2\2\2\u01cd\u01cf"+
		"\7p\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0"+
		"\u01d1\7q\2\2\u01d1M\3\2\2\2\u01d2\u01d8\5<\37\2\u01d3\u01d8\7\u0096\2"+
		"\2\u01d4\u01d8\7e\2\2\u01d5\u01d8\7\u00da\2\2\u01d6\u01d8\7\u00e2\2\2"+
		"\u01d7\u01d2\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8O\3\2\2\2\u01d9\u01db\5Z.\2\u01da\u01dc"+
		"\7W\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e4\3\2\2\2\u01dd"+
		"\u01de\7\u01d4\2\2\u01de\u01e1\t\7\2\2\u01df\u01e0\7\u01d6\2\2\u01e0\u01e2"+
		"\7\u01bd\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2"+
		"\2\u01e3\u01e5\7\u01d5\2\2\u01e4\u01dd\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"Q\3\2\2\2\u01e6\u01e8\7\u0196\2\2\u01e7\u01e9\7\u01bd\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u031f\3\2\2\2\u01ea\u01ee\7\u0199\2"+
		"\2\u01eb\u01ec\7\u01d4\2\2\u01ec\u01ed\7\u01bd\2\2\u01ed\u01ef\7\u01d5"+
		"\2\2\u01ee\u01eb\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0"+
		"\u01f2\7\u00b8\2\2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4"+
		"\3\2\2\2\u01f3\u01f5\7\u0194\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2"+
		"\2\u01f5\u031f\3\2\2\2\u01f6\u01fa\7\u019a\2\2\u01f7\u01f8\7\u01d4\2\2"+
		"\u01f8\u01f9\7\u01bd\2\2\u01f9\u01fb\7\u01d5\2\2\u01fa\u01f7\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01fd\3\2\2\2\u01fc\u01fe\7\u00b8\2\2\u01fd\u01fc"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0200\3\2\2\2\u01ff\u0201\7\u0194\2"+
		"\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u031f\3\2\2\2\u0202\u0206"+
		"\7\u019b\2\2\u0203\u0204\7\u01d4\2\2\u0204\u0205\7\u01bd\2\2\u0205\u0207"+
		"\7\u01d5\2\2\u0206\u0203\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2"+
		"\2\u0208\u020a\7\u00b8\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u020c\3\2\2\2\u020b\u020d\7\u0194\2\2\u020c\u020b\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u031f\3\2\2\2\u020e\u0212\7\u019c\2\2\u020f\u0210\7\u01d4"+
		"\2\2\u0210\u0211\7\u01bd\2\2\u0211\u0213\7\u01d5\2\2\u0212\u020f\3\2\2"+
		"\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0216\7\u00b8\2\2\u0215"+
		"\u0214\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0219\7\u0194"+
		"\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u031f\3\2\2\2\u021a"+
		"\u021e\7\u019d\2\2\u021b\u021c\7\u01d4\2\2\u021c\u021d\7\u01bd\2\2\u021d"+
		"\u021f\7\u01d5\2\2\u021e\u021b\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221"+
		"\3\2\2\2\u0220\u0222\7\u00b8\2\2\u0221\u0220\3\2\2\2\u0221\u0222\3\2\2"+
		"\2\u0222\u0224\3\2\2\2\u0223\u0225\7\u0194\2\2\u0224\u0223\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u031f\3\2\2\2\u0226\u022a\7\u019e\2\2\u0227\u0228"+
		"\7\u01d4\2\2\u0228\u0229\7\u01bd\2\2\u0229\u022b\7\u01d5\2\2\u022a\u0227"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022e\7\u00b8\2"+
		"\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0231"+
		"\7\u0194\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u031f\3\2\2"+
		"\2\u0232\u0238\7\u019f\2\2\u0233\u0234\7\u01d4\2\2\u0234\u0235\7\u01bd"+
		"\2\2\u0235\u0236\7\u01d6\2\2\u0236\u0237\7\u01bd\2\2\u0237\u0239\7\u01d5"+
		"\2\2\u0238\u0233\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u023c\7\u00b8\2\2\u023b\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e"+
		"\3\2\2\2\u023d\u023f\7\u0194\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2"+
		"\2\u023f\u031f\3\2\2\2\u0240\u0246\7\u01a1\2\2\u0241\u0242\7\u01d4\2\2"+
		"\u0242\u0243\7\u01bd\2\2\u0243\u0244\7\u01d6\2\2\u0244\u0245\7\u01bd\2"+
		"\2\u0245\u0247\7\u01d5\2\2\u0246\u0241\3\2\2\2\u0246\u0247\3\2\2\2\u0247"+
		"\u0249\3\2\2\2\u0248\u024a\7\u00b8\2\2\u0249\u0248\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024c\3\2\2\2\u024b\u024d\7\u0194\2\2\u024c\u024b\3\2\2"+
		"\2\u024c\u024d\3\2\2\2\u024d\u031f\3\2\2\2\u024e\u0254\7\u01a0\2\2\u024f"+
		"\u0250\7\u01d4\2\2\u0250\u0251\7\u01bd\2\2\u0251\u0252\7\u01d6\2\2\u0252"+
		"\u0253\7\u01bd\2\2\u0253\u0255\7\u01d5\2\2\u0254\u024f\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0258\7\u00b8\2\2\u0257\u0256\3\2\2"+
		"\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u025b\7\u0194\2\2\u025a"+
		"\u0259\3\2\2\2\u025a\u025b\3\2\2\2\u025b\u031f\3\2\2\2\u025c\u0264\7\u01a2"+
		"\2\2\u025d\u025e\7\u01d4\2\2\u025e\u0261\7\u01bd\2\2\u025f\u0260\7\u01d6"+
		"\2\2\u0260\u0262\7\u01bd\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0265\7\u01d5\2\2\u0264\u025d\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0268\7\u00b8\2\2\u0267\u0266\3\2\2"+
		"\2\u0267\u0268\3\2\2\2\u0268\u026a\3\2\2\2\u0269\u026b\7\u0194\2\2\u026a"+
		"\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u031f\3\2\2\2\u026c\u0274\7\u01a3"+
		"\2\2\u026d\u026e\7\u01d4\2\2\u026e\u0271\7\u01bd\2\2\u026f\u0270\7\u01d6"+
		"\2\2\u0270\u0272\7\u01bd\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0275\7\u01d5\2\2\u0274\u026d\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u0277\3\2\2\2\u0276\u0278\7\u00b8\2\2\u0277\u0276\3\2\2"+
		"\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u027b\7\u0194\2\2\u027a"+
		"\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u031f\3\2\2\2\u027c\u031f\7\u01a4"+
		"\2\2\u027d\u0281\7\u0180\2\2\u027e\u027f\7\u01d4\2\2\u027f\u0280\7\u01bd"+
		"\2\2\u0280\u0282\7\u01d5\2\2\u0281\u027e\3\2\2\2\u0281\u0282\3\2\2\2\u0282"+
		"\u031f\3\2\2\2\u0283\u0287\7\u01a6\2\2\u0284\u0285\7\u01d4\2\2\u0285\u0286"+
		"\7\u01bd\2\2\u0286\u0288\7\u01d5\2\2\u0287\u0284\3\2\2\2\u0287\u0288\3"+
		"\2\2\2\u0288\u031f\3\2\2\2\u0289\u028d\7\u01a5\2\2\u028a\u028b\7\u01d4"+
		"\2\2\u028b\u028c\7\u01bd\2\2\u028c\u028e\7\u01d5\2\2\u028d\u028a\3\2\2"+
		"\2\u028d\u028e\3\2\2\2\u028e\u031f\3\2\2\2\u028f\u031f\7\u01a7\2\2\u0290"+
		"\u0294\7\u01a8\2\2\u0291\u0292\7\u01d4\2\2\u0292\u0293\7\u01bd\2\2\u0293"+
		"\u0295\7\u01d5\2\2\u0294\u0291\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297"+
		"\3\2\2\2\u0296\u0298\7\u0197\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2"+
		"\2\u0298\u029c\3\2\2\2\u0299\u029a\7\u01a9\2\2\u029a\u029b\7\u00a3\2\2"+
		"\u029b\u029d\5Z.\2\u029c\u0299\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u02a0"+
		"\3\2\2\2\u029e\u029f\7\36\2\2\u029f\u02a1\5Z.\2\u02a0\u029e\3\2\2\2\u02a0"+
		"\u02a1\3\2\2\2\u02a1\u031f\3\2\2\2\u02a2\u02a6\7\u01aa\2\2\u02a3\u02a4"+
		"\7\u01d4\2\2\u02a4\u02a5\7\u01bd\2\2\u02a5\u02a7\7\u01d5\2\2\u02a6\u02a3"+
		"\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2\2\2\u02a8\u02aa\7\u0197\2"+
		"\2\u02a9\u02a8\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ae\3\2\2\2\u02ab\u02ac"+
		"\7\u01a9\2\2\u02ac\u02ad\7\u00a3\2\2\u02ad\u02af\5Z.\2\u02ae\u02ab\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02b1\7\36\2\2\u02b1"+
		"\u02b3\5Z.\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u031f\3\2\2"+
		"\2\u02b4\u02b8\7\u0197\2\2\u02b5\u02b6\7\u01d4\2\2\u02b6\u02b7\7\u01bd"+
		"\2\2\u02b7\u02b9\7\u01d5\2\2\u02b8\u02b5\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u031f\3\2\2\2\u02ba\u02be\7\u01ab\2\2\u02bb\u02bc\7\u01d4\2\2\u02bc\u02bd"+
		"\7\u01bd\2\2\u02bd\u02bf\7\u01d5\2\2\u02be\u02bb\3\2\2\2\u02be\u02bf\3"+
		"\2\2\2\u02bf\u031f\3\2\2\2\u02c0\u031f\7\u0198\2\2\u02c1\u031f\7\u01ac"+
		"\2\2\u02c2\u031f\7\u01ad\2\2\u02c3\u031f\7\u01ae\2\2\u02c4\u031f\7\u01af"+
		"\2\2\u02c5\u02c7\7\u01b0\2\2\u02c6\u02c8\7\u0197\2\2\u02c7\u02c6\3\2\2"+
		"\2\u02c7\u02c8\3\2\2\2\u02c8\u02cc\3\2\2\2\u02c9\u02ca\7\u01a9\2\2\u02ca"+
		"\u02cb\7\u00a3\2\2\u02cb\u02cd\5Z.\2\u02cc\u02c9\3\2\2\2\u02cc\u02cd\3"+
		"\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cf\7\36\2\2\u02cf\u02d1\5Z.\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u031f\3\2\2\2\u02d2\u02d4\7\u01b1"+
		"\2\2\u02d3\u02d5\7\u0197\2\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d9\3\2\2\2\u02d6\u02d7\7\u01a9\2\2\u02d7\u02d8\7\u00a3\2\2\u02d8\u02da"+
		"\5Z.\2\u02d9\u02d6\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dd\3\2\2\2\u02db"+
		"\u02dc\7\36\2\2\u02dc\u02de\5Z.\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2"+
		"\2\2\u02de\u031f\3\2\2\2\u02df\u02e1\7\u01b2\2\2\u02e0\u02e2\7\u0197\2"+
		"\2\u02e1\u02e0\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e6\3\2\2\2\u02e3\u02e4"+
		"\7\u01a9\2\2\u02e4\u02e5\7\u00a3\2\2\u02e5\u02e7\5Z.\2\u02e6\u02e3\3\2"+
		"\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ea\3\2\2\2\u02e8\u02e9\7\36\2\2\u02e9"+
		"\u02eb\5Z.\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u031f\3\2\2"+
		"\2\u02ec\u02ee\7\u01b3\2\2\u02ed\u02ef\7\u0197\2\2\u02ee\u02ed\3\2\2\2"+
		"\u02ee\u02ef\3\2\2\2\u02ef\u02f3\3\2\2\2\u02f0\u02f1\7\u01a9\2\2\u02f1"+
		"\u02f2\7\u00a3\2\2\u02f2\u02f4\5Z.\2\u02f3\u02f0\3\2\2\2\u02f3\u02f4\3"+
		"\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f6\7\36\2\2\u02f6\u02f8\5Z.\2\u02f7"+
		"\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u031f\3\2\2\2\u02f9\u02fa\7\u01b4"+
		"\2\2\u02fa\u02fb\7\u01d4\2\2\u02fb\u02fe\5Z.\2\u02fc\u02fd\7\u01d6\2\2"+
		"\u02fd\u02ff\5Z.\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0300"+
		"\3\2\2\2\u0300\u0301\7\u01d5\2\2\u0301\u0305\3\2\2\2\u0302\u0303\7\u01a9"+
		"\2\2\u0303\u0304\7\u00a3\2\2\u0304\u0306\5Z.\2\u0305\u0302\3\2\2\2\u0305"+
		"\u0306\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0308\7\36\2\2\u0308\u030a\5"+
		"Z.\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u031f\3\2\2\2\u030b"+
		"\u030c\7\u00a3\2\2\u030c\u030d\7\u01d4\2\2\u030d\u0310\5Z.\2\u030e\u030f"+
		"\7\u01d6\2\2\u030f\u0311\5Z.\2\u0310\u030e\3\2\2\2\u0310\u0311\3\2\2\2"+
		"\u0311\u0312\3\2\2\2\u0312\u0313\7\u01d5\2\2\u0313\u0317\3\2\2\2\u0314"+
		"\u0315\7\u01a9\2\2\u0315\u0316\7\u00a3\2\2\u0316\u0318\5Z.\2\u0317\u0314"+
		"\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u031a\7\36\2\2"+
		"\u031a\u031c\5Z.\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031f"+
		"\3\2\2\2\u031d\u031f\7\u01b5\2\2\u031e\u01e6\3\2\2\2\u031e\u01ea\3\2\2"+
		"\2\u031e\u01f6\3\2\2\2\u031e\u0202\3\2\2\2\u031e\u020e\3\2\2\2\u031e\u021a"+
		"\3\2\2\2\u031e\u0226\3\2\2\2\u031e\u0232\3\2\2\2\u031e\u0240\3\2\2\2\u031e"+
		"\u024e\3\2\2\2\u031e\u025c\3\2\2\2\u031e\u026c\3\2\2\2\u031e\u027c\3\2"+
		"\2\2\u031e\u027d\3\2\2\2\u031e\u0283\3\2\2\2\u031e\u0289\3\2\2\2\u031e"+
		"\u028f\3\2\2\2\u031e\u0290\3\2\2\2\u031e\u02a2\3\2\2\2\u031e\u02b4\3\2"+
		"\2\2\u031e\u02ba\3\2\2\2\u031e\u02c0\3\2\2\2\u031e\u02c1\3\2\2\2\u031e"+
		"\u02c2\3\2\2\2\u031e\u02c3\3\2\2\2\u031e\u02c4\3\2\2\2\u031e\u02c5\3\2"+
		"\2\2\u031e\u02d2\3\2\2\2\u031e\u02df\3\2\2\2\u031e\u02ec\3\2\2\2\u031e"+
		"\u02f9\3\2\2\2\u031e\u030b\3\2\2\2\u031e\u031d\3\2\2\2\u031fS\3\2\2\2"+
		"\u0320\u0323\7q\2\2\u0321\u0323\5V,\2\u0322\u0320\3\2\2\2\u0322\u0321"+
		"\3\2\2\2\u0323U\3\2\2\2\u0324\u0334\7\u01bf\2\2\u0325\u0334\7\u01c0\2"+
		"\2\u0326\u0328\5X-\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329"+
		"\3\2\2\2\u0329\u0334\7\u01bd\2\2\u032a\u032c\5X-\2\u032b\u032a\3\2\2\2"+
		"\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u0334\t\b\2\2\u032e\u0330"+
		"\5X-\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0332\7\u01d3\2\2\u0332\u0334\t\t\2\2\u0333\u0324\3\2\2\2\u0333\u0325"+
		"\3\2\2\2\u0333\u0327\3\2\2\2\u0333\u032b\3\2\2\2\u0333\u032f\3\2\2\2\u0334"+
		"W\3\2\2\2\u0335\u0336\t\n\2\2\u0336Y\3\2\2\2\u0337\u033b\5\\/\2\u0338"+
		"\u033b\7\u01b9\2\2\u0339\u033b\7\u01ba\2\2\u033a\u0337\3\2\2\2\u033a\u0338"+
		"\3\2\2\2\u033a\u0339\3\2\2\2\u033b[\3\2\2\2\u033c\u033d\t\13\2\2\u033d"+
		"]\3\2\2\2\u033e\u034e\7\u01c3\2\2\u033f\u034e\7\u01c4\2\2\u0340\u034e"+
		"\7\u01c5\2\2\u0341\u0342\7\u01c5\2\2\u0342\u034e\7\u01c3\2\2\u0343\u0344"+
		"\7\u01c4\2\2\u0344\u034e\7\u01c3\2\2\u0345\u0346\7\u01c5\2\2\u0346\u034e"+
		"\7\u01c4\2\2\u0347\u0348\7\u01c6\2\2\u0348\u034e\7\u01c3\2\2\u0349\u034a"+
		"\7\u01c6\2\2\u034a\u034e\7\u01c4\2\2\u034b\u034c\7\u01c6\2\2\u034c\u034e"+
		"\7\u01c5\2\2\u034d\u033e\3\2\2\2\u034d\u033f\3\2\2\2\u034d\u0340\3\2\2"+
		"\2\u034d\u0341\3\2\2\2\u034d\u0343\3\2\2\2\u034d\u0345\3\2\2\2\u034d\u0347"+
		"\3\2\2\2\u034d\u0349\3\2\2\2\u034d\u034b\3\2\2\2\u034e_\3\2\2\2\u034f"+
		"\u0350\t\f\2\2\u0350a\3\2\2\2\u0351\u0353\7\u01bd\2\2\u0352\u0354\t\r"+
		"\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354c\3\2\2\2\u008fgox|"+
		"\u0083\u0087\u008a\u0093\u00a0\u00a5\u00a8\u00ad\u00b2\u00b7\u00ba\u00be"+
		"\u00c6\u00d7\u00dc\u00df\u00e5\u00eb\u00f0\u00f3\u00f6\u00fa\u00fc\u0100"+
		"\u0105\u010a\u0117\u011b\u011e\u0123\u0126\u012b\u012f\u0134\u0137\u013e"+
		"\u0142\u014a\u0158\u015a\u0163\u016a\u0176\u017d\u0184\u018b\u0192\u0199"+
		"\u01a0\u01a6\u01ab\u01b4\u01b9\u01be\u01c2\u01c7\u01ce\u01d7\u01db\u01e1"+
		"\u01e4\u01e8\u01ee\u01f1\u01f4\u01fa\u01fd\u0200\u0206\u0209\u020c\u0212"+
		"\u0215\u0218\u021e\u0221\u0224\u022a\u022d\u0230\u0238\u023b\u023e\u0246"+
		"\u0249\u024c\u0254\u0257\u025a\u0261\u0264\u0267\u026a\u0271\u0274\u0277"+
		"\u027a\u0281\u0287\u028d\u0294\u0297\u029c\u02a0\u02a6\u02a9\u02ae\u02b2"+
		"\u02b8\u02be\u02c7\u02cc\u02d0\u02d4\u02d9\u02dd\u02e1\u02e6\u02ea\u02ee"+
		"\u02f3\u02f7\u02fe\u0305\u0309\u0310\u0317\u031b\u031e\u0322\u0327\u032b"+
		"\u032f\u0333\u033a\u034d\u0353";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}