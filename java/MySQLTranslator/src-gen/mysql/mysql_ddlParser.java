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
		ERRLVL=61, ESCAPE=62, EXCEPT=63, EXECUTE=64, EXISTS=65, EXIT=66, EXTERNAL=67, 
		FETCH=68, FILE=69, FILENAME=70, FILLFACTOR=71, FOR=72, FORCESEEK=73, FOREIGN=74, 
		FREETEXT=75, FREETEXTTABLE=76, FROM=77, FULL=78, FUNCTION=79, GOTO=80, 
		GRANT=81, GROUP=82, HAVING=83, IDENTITY=84, IDENTITYCOL=85, IDENTITY_INSERT=86, 
		IF=87, IN=88, INDEX=89, INNER=90, INSERT=91, INTERSECT=92, INTO=93, IS=94, 
		JOIN=95, KEY=96, KILL=97, LEFT=98, LIKE=99, LINENO=100, LOAD=101, LOG=102, 
		MERGE=103, NATIONAL=104, NOCHECK=105, NONCLUSTERED=106, NONE=107, NO=108, 
		NOT=109, NULL=110, NULLIF=111, OF=112, OFF=113, OFFSETS=114, ON=115, OPEN=116, 
		OPENDATASOURCE=117, OPENQUERY=118, OPENROWSET=119, OPENXML=120, OPTION=121, 
		OR=122, ORDER=123, OUTER=124, OVER=125, PARTIAL=126, PERCENT=127, PIVOT=128, 
		PLAN=129, PRECISION=130, PRIMARY=131, PRINT=132, PROC=133, PROCEDURE=134, 
		PUBLIC=135, RAISERROR=136, READ=137, READTEXT=138, RECONFIGURE=139, REFERENCES=140, 
		REPLICATION=141, RESTORE=142, RESTRICT=143, RETURN=144, REVERT=145, REVOKE=146, 
		RIGHT=147, ROLLBACK=148, ROWCOUNT=149, ROWGUIDCOL=150, RULE=151, SAVE=152, 
		SCHEMA=153, SECURITYAUDIT=154, SELECT=155, SEMANTICKEYPHRASETABLE=156, 
		SEMANTICSIMILARITYDETAILSTABLE=157, SEMANTICSIMILARITYTABLE=158, SESSION_USER=159, 
		SET=160, SETUSER=161, SHUTDOWN=162, SOME=163, STATISTICS=164, SYSTEM_USER=165, 
		TABLE=166, TABLESAMPLE=167, TEXTSIZE=168, THEN=169, TO=170, TOP=171, TRAN=172, 
		TRANSACTION=173, TRIGGER=174, TRUNCATE=175, TRY_CONVERT=176, TSEQUAL=177, 
		UNION=178, UNIQUE=179, UNPIVOT=180, UNSIGNED=181, UPDATE=182, UPDATETEXT=183, 
		USE=184, USER=185, VALUES=186, VARYING=187, VIEW=188, WAITFOR=189, WHEN=190, 
		WHERE=191, WHILE=192, WITH=193, WITHIN=194, WRITETEXT=195, ABSOLUTE=196, 
		AFTER=197, ALLOWED=198, ALLOW_SNAPSHOT_ISOLATION=199, ANSI_NULLS=200, 
		ANSI_NULL_DEFAULT=201, ANSI_PADDING=202, ANSI_WARNINGS=203, APPLY=204, 
		ARITHABORT=205, AUTO=206, AUTO_CLEANUP=207, AUTO_CLOSE=208, AUTO_CREATE_STATISTICS=209, 
		AUTO_SHRINK=210, AUTO_UPDATE_STATISTICS=211, AUTO_UPDATE_STATISTICS_ASYNC=212, 
		AVG=213, BASE64=214, BINARY_CHECKSUM=215, BULK_LOGGED=216, CALLER=217, 
		CAST=218, CATCH=219, CHANGE_RETENTION=220, CHANGE_TRACKING=221, CHARSET=222, 
		CHECKSUM=223, CHECKSUM_AGG=224, COMMENT=225, COMMITTED=226, COMPATIBILITY_LEVEL=227, 
		CONCAT=228, CONCAT_NULL_YIELDS_NULL=229, CONTROL=230, COOKIE=231, COUNT=232, 
		COUNT_BIG=233, CURSOR_CLOSE_ON_COMMIT=234, CURSOR_DEFAULT=235, DATEADD=236, 
		DATEDIFF=237, DATENAME=238, DATEPART=239, DATE_CORRELATION_OPTIMIZATION=240, 
		DAYS=241, DB_CHAINING=242, DEFAULT_FULLTEXT_LANGUAGE=243, DEFAULT_LANGUAGE=244, 
		DELAY=245, DELAYED_DURABILITY=246, DELETED=247, DENSE_RANK=248, DIRECTORY_NAME=249, 
		DISABLE=250, DISABLED=251, DISABLE_BROKER=252, DYNAMIC=253, EMERGENCY=254, 
		ENABLE_BROKER=255, ENCRYPTION=256, ERROR_BROKER_CONVERSATIONS=257, EXPAND=258, 
		FAST=259, FAST_FORWARD=260, FILEGROUP=261, FILEGROWTH=262, FILESTREAM=263, 
		FIRST=264, FOLLOWING=265, FORCE=266, FORCED=267, FORWARD_ONLY=268, FULLSCAN=269, 
		GB=270, GLOBAL=271, GO=272, GROUPING=273, GROUPING_ID=274, HADR=275, HASH=276, 
		HONOR_BROKER_PRIORITY=277, HOURS=278, IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX=279, 
		IMMEDIATE=280, IMPERSONATE=281, INCREMENTAL=282, INSENSITIVE=283, INSERTED=284, 
		ISOLATION=285, KB=286, KEEP=287, KEEPFIXED=288, KEYSET=289, LAST=290, 
		LEVEL=291, LOCAL=292, LOCK_ESCALATION=293, LOGIN=294, LOOP=295, MARK=296, 
		MAX=297, MAXDOP=298, MAXRECURSION=299, MAXSIZE=300, MB=301, MEMORY_OPTIMIZED_DATA=302, 
		MIN=303, MINUTES=304, MIN_ACTIVE_ROWVERSION=305, MIXED_PAGE_ALLOCATION=306, 
		MODIFY=307, MULTI_USER=308, NAME=309, NESTED_TRIGGERS=310, NEW_BROKER=311, 
		NEXT=312, NOCOUNT=313, NOEXPAND=314, NON_TRANSACTED_ACCESS=315, NORECOMPUTE=316, 
		NO_WAIT=317, NTILE=318, NUMBER=319, NUMERIC_ROUNDABORT=320, OFFLINE=321, 
		OFFSET=322, ONLINE=323, ONLY=324, OPTIMISTIC=325, OPTIMIZE=326, OUT=327, 
		OUTPUT=328, OWNER=329, PAGE_VERIFY=330, PARAMETERIZATION=331, PARTITION=332, 
		PATH=333, PRECEDING=334, PRIOR=335, PRIVILEGES=336, QUOTED_IDENTIFIER=337, 
		RANGE=338, RANK=339, READONLY=340, READ_COMMITTED_SNAPSHOT=341, READ_ONLY=342, 
		READ_WRITE=343, RECOMPILE=344, RECOVERY=345, RECURSIVE_TRIGGERS=346, RELATIVE=347, 
		REMOTE=348, REPEATABLE=349, RESTRICTED_USER=350, ROBUST=351, ROOT=352, 
		ROW=353, ROWGUID=354, ROWS=355, ROW_NUMBER=356, SAMPLE=357, SCHEMABINDING=358, 
		SCROLL=359, SCROLL_LOCKS=360, SECONDS=361, SELF=362, SERIALIZABLE=363, 
		SHOWPLAN=364, SIMPLE=365, SINGLE_USER=366, SIZE=367, SNAPSHOT=368, SPATIAL_WINDOW_MAX_CELLS=369, 
		STATIC=370, STATS_STREAM=371, STDEV=372, STDEVP=373, SUM=374, TAKE=375, 
		TARGET_RECOVERY_TIME=376, TB=377, TEXTIMAGE_ON=378, THROW=379, TIES=380, 
		TIME=381, TORN_PAGE_DETECTION=382, TRANSFORM_NOISE_WORDS=383, TRUSTWORTHY=384, 
		TRY=385, TWO_DIGIT_YEAR_CUTOFF=386, TYPE=387, TYPE_WARNING=388, UNBOUNDED=389, 
		UNCOMMITTED=390, UNKNOWN=391, UNLIMITED=392, USING=393, VAR=394, VARP=395, 
		VIEWS=396, VIEW_METADATA=397, WORK=398, XML=399, XMLNAMESPACES=400, ZEROFILL=401, 
		DOLLAR_ACTION=402, BIT=403, BINARY=404, BOOLEAN=405, TINYINT=406, SMALLINT=407, 
		MEDIUMINT=408, INT=409, INTEGER=410, BIGINT=411, REAL=412, FLOAT=413, 
		DOUBLE=414, DECIMAL=415, NUMERIC=416, DATE=417, DATETIME=418, TIMESTAMP=419, 
		YEAR=420, CHAR=421, CHARACTER=422, VARCHAR=423, VARBINARY=424, TINYBLOB=425, 
		BLOB=426, MEDIUMBLOB=427, LONGBLOB=428, TINYTEXT=429, TEXT=430, MEDIUMTEXT=431, 
		LONGTEXT=432, ENUM=433, JSON=434, SPACE=435, MULTILINE_COMMENT=436, LINE_COMMENT=437, 
		DOUBLE_QUOTE_ID=438, LEFT_QUOTE_ID=439, SQUARE_BRACKET_ID=440, LOCAL_ID=441, 
		DECIMAL_LITERAL=442, ID=443, STRING=444, BINARY_LITERAL=445, FLOAT_LITERAL=446, 
		REAL_LITERAL=447, EQUAL=448, GREATER=449, LESS=450, EXCLAMATION=451, PLUS_ASSIGN=452, 
		MINUS_ASSIGN=453, MULT_ASSIGN=454, DIV_ASSIGN=455, MOD_ASSIGN=456, AND_ASSIGN=457, 
		XOR_ASSIGN=458, OR_ASSIGN=459, DOT=460, UNDERLINE=461, AT=462, SHARP=463, 
		DOLLAR=464, LR_BRACKET=465, RR_BRACKET=466, COMMA=467, SEMI=468, COLON=469, 
		STAR=470, DIVIDE=471, MODULE=472, PLUS=473, MINUS=474, BIT_NOT=475, BIT_OR=476, 
		BIT_AND=477, BIT_XOR=478;
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
		null, null, null, null, null, "'='", "'>'", "'<'", "'!'", "'+='", "'-='", 
		"'*='", "'/='", "'%='", "'&='", "'^='", "'|='", "'.'", "'_'", "'@'", "'#'", 
		"'$'", "'('", "')'", "','", "';'", "':'", "'*'", "'/'", "'%'", "'+'", 
		"'-'", "'~'", "'|'", "'&'", "'^'"
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
		"DROP", "DUMP", "ELSE", "END", "ERRLVL", "ESCAPE", "EXCEPT", "EXECUTE", 
		"EXISTS", "EXIT", "EXTERNAL", "FETCH", "FILE", "FILENAME", "FILLFACTOR", 
		"FOR", "FORCESEEK", "FOREIGN", "FREETEXT", "FREETEXTTABLE", "FROM", "FULL", 
		"FUNCTION", "GOTO", "GRANT", "GROUP", "HAVING", "IDENTITY", "IDENTITYCOL", 
		"IDENTITY_INSERT", "IF", "IN", "INDEX", "INNER", "INSERT", "INTERSECT", 
		"INTO", "IS", "JOIN", "KEY", "KILL", "LEFT", "LIKE", "LINENO", "LOAD", 
		"LOG", "MERGE", "NATIONAL", "NOCHECK", "NONCLUSTERED", "NONE", "NO", "NOT", 
		"NULL", "NULLIF", "OF", "OFF", "OFFSETS", "ON", "OPEN", "OPENDATASOURCE", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << CREATE) | (1L << DROP))) != 0)) {
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
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
			setState(111); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(108);
					ddl_clause();
					setState(109);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(113); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				create_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				create_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				alter_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				drop_index();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
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
			setState(122);
			match(CREATE);
			setState(124);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(123);
				match(UNIQUE);
				}
			}

			setState(127);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(126);
				clustered();
				}
			}

			setState(129);
			match(INDEX);
			setState(130);
			id();
			setState(131);
			match(ON);
			setState(132);
			table_name();
			setState(133);
			match(LR_BRACKET);
			setState(134);
			column_name_list();
			setState(136);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(135);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(138);
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
			setState(140);
			match(CREATE);
			setState(141);
			match(TABLE);
			setState(142);
			table_name();
			setState(143);
			match(LR_BRACKET);
			setState(144);
			column_def_table_constraint();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(145);
				match(COMMA);
				setState(146);
				column_def_table_constraint();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(RR_BRACKET);
			setState(154);
			_la = _input.LA(1);
			if (_la==DEFAULT || _la==CHARSET) {
				{
				setState(153);
				table_options();
				}
			}

			setState(157);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(156);
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
			setState(159);
			table_option();
			setState(162);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(160);
				match(COMMA);
				setState(161);
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
			setState(165);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(164);
				match(DEFAULT);
				}
			}

			setState(167);
			match(CHARSET);
			setState(169);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(168);
				match(EQUAL);
				}
			}

			setState(171);
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
			setState(173);
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
			setState(175);
			match(COMMENT);
			setState(177);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(176);
				match(EQUAL);
				}
			}

			setState(179);
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
			setState(181);
			match(COMMENT);
			setState(182);
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
			setState(184);
			match(ALTER);
			setState(185);
			match(TABLE);
			setState(186);
			table_name();
			setState(187);
			match(ADD);
			setState(188);
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
			setState(190);
			match(DROP);
			setState(191);
			match(INDEX);
			setState(194);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(192);
				match(IF);
				setState(193);
				match(EXISTS);
				}
			}

			setState(196);
			((Drop_indexContext)_localctx).name = id();
			setState(199);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(197);
				match(ON);
				setState(198);
				table_name();
				}
			}

			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(201);
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
			setState(204);
			match(DROP);
			setState(205);
			match(TABLE);
			setState(208);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(206);
				match(IF);
				setState(207);
				match(EXISTS);
				}
			}

			setState(210);
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
			setState(214);
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
				setState(212);
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
				setState(213);
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
			setState(216);
			id();
			setState(217);
			data_type();
			setState(219);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(218);
				null_notnull();
				}
			}

			setState(222);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(221);
				column_default();
				}
			}

			setState(225);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(224);
				match(AUTO_INCREMENT);
				}
			}

			setState(231);
			_la = _input.LA(1);
			if (_la==PRIMARY || _la==UNIQUE) {
				{
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==PRIMARY || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(229);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(228);
					match(KEY);
					}
				}

				}
			}

			setState(235);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(233);
				match(COMMENT);
				setState(234);
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
			setState(237);
			id();
			setState(238);
			data_type();
			setState(240);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(239);
				null_notnull();
				}
			}

			setState(245);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(242);
				match(DEFAULT);
				setState(243);
				constant_expression();
				}
				break;
			case AUTO_INCREMENT:
				{
				setState(244);
				match(AUTO_INCREMENT);
				}
				break;
			case COMMENT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(247);
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
			setState(249);
			match(DEFAULT);
			setState(250);
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
			setState(258);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
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
				setState(253);
				constant();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(LR_BRACKET);
				setState(255);
				constant_expression();
				setState(256);
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
			setState(262);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(260);
				match(CONSTRAINT);
				setState(261);
				id();
				}
			}

			setState(265);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(264);
				null_notnull();
				}
			}

			{
			setState(270);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(267);
				match(PRIMARY);
				setState(268);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(269);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(273);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(272);
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				table_unique_constraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				table_index_constraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
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
			setState(282);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(280);
				match(CONSTRAINT);
				setState(281);
				id();
				}
			}

			{
			setState(287);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(284);
				match(PRIMARY);
				setState(285);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(286);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(290);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(289);
				clustered();
				}
			}

			setState(292);
			match(LR_BRACKET);
			setState(293);
			sorted_column_name_list();
			setState(294);
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
			setState(297);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(296);
				match(UNIQUE);
				}
			}

			setState(299);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(301);
			_la = _input.LA(1);
			if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
				{
				setState(300);
				id();
				}
			}

			setState(303);
			match(LR_BRACKET);
			setState(304);
			sorted_column_name_list();
			setState(305);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
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
			setState(307);
			match(FOREIGN);
			setState(308);
			match(KEY);
			setState(309);
			match(LR_BRACKET);
			setState(310);
			column_name_list();
			setState(311);
			match(RR_BRACKET);
			setState(312);
			match(REFERENCES);
			setState(313);
			id();
			setState(314);
			match(LR_BRACKET);
			setState(315);
			column_name_list();
			setState(316);
			match(RR_BRACKET);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				setState(319);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(317);
					fk_on_delete();
					}
					break;
				case 2:
					{
					setState(318);
					fk_on_update();
					}
					break;
				}
				}
				setState(323);
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
			setState(324);
			match(ON);
			setState(325);
			match(DELETE);
			setState(330);
			switch (_input.LA(1)) {
			case CASCADE:
				{
				setState(326);
				match(CASCADE);
				}
				break;
			case RESTRICT:
				{
				setState(327);
				match(RESTRICT);
				}
				break;
			case NO:
				{
				setState(328);
				match(NO);
				setState(329);
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
			setState(332);
			match(ON);
			setState(333);
			match(UPDATE);
			setState(337);
			switch (_input.LA(1)) {
			case RESTRICT:
				{
				setState(334);
				match(RESTRICT);
				}
				break;
			case NO:
				{
				setState(335);
				match(NO);
				setState(336);
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(339);
				((Full_table_nameContext)_localctx).server = id();
				setState(340);
				match(DOT);
				setState(341);
				((Full_table_nameContext)_localctx).database = id();
				setState(342);
				match(DOT);
				setState(343);
				((Full_table_nameContext)_localctx).schema = id();
				setState(344);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(346);
				((Full_table_nameContext)_localctx).database = id();
				setState(347);
				match(DOT);
				setState(349);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(348);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(351);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(353);
				((Full_table_nameContext)_localctx).schema = id();
				setState(354);
				match(DOT);
				}
				break;
			}
			setState(358);
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
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(360);
				((Table_nameContext)_localctx).database = id();
				setState(361);
				match(DOT);
				setState(363);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(362);
					((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(365);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(367);
				((Table_nameContext)_localctx).schema = id();
				setState(368);
				match(DOT);
				}
				break;
			}
			setState(372);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(374);
				((Simple_nameContext)_localctx).schema = id();
				setState(375);
				match(DOT);
				}
				break;
			}
			setState(379);
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
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(381);
				((Func_proc_nameContext)_localctx).database = id();
				setState(382);
				match(DOT);
				setState(384);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(383);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(386);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(388);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(389);
				match(DOT);
				}
				break;
			}
			setState(393);
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
			setState(397);
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
				setState(395);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
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
			setState(402);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(399);
				table_name();
				setState(400);
				match(DOT);
				}
				break;
			}
			setState(404);
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
			setState(406);
			id();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(407);
				match(COMMA);
				setState(408);
				id();
				}
				}
				setState(413);
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
			setState(414);
			id();
			setState(416);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(415);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(418);
				match(COMMA);
				setState(419);
				id();
				setState(421);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(420);
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
				setState(427);
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
			setState(430);
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
				setState(428);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
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
			setState(432);
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
			setState(434);
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
			setState(437);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(436);
				match(NOT);
				}
			}

			setState(439);
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
			setState(446);
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
				setState(441);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(445);
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
			setState(448);
			id();
			setState(450);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(449);
				match(IDENTITY);
				}
			}

			setState(459);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(452);
				match(LR_BRACKET);
				setState(453);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(456);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(454);
					match(COMMA);
					setState(455);
					match(DECIMAL_LITERAL);
					}
				}

				setState(458);
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
			setState(773);
			switch (_input.LA(1)) {
			case BIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				match(BIT);
				setState(463);
				_la = _input.LA(1);
				if (_la==DECIMAL_LITERAL) {
					{
					setState(462);
					match(DECIMAL_LITERAL);
					}
				}

				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(TINYINT);
				setState(469);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(466);
					match(LR_BRACKET);
					setState(467);
					match(DECIMAL_LITERAL);
					setState(468);
					match(RR_BRACKET);
					}
				}

				setState(472);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(471);
					match(UNSIGNED);
					}
				}

				setState(475);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(474);
					match(ZEROFILL);
					}
				}

				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				match(SMALLINT);
				setState(481);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(478);
					match(LR_BRACKET);
					setState(479);
					match(DECIMAL_LITERAL);
					setState(480);
					match(RR_BRACKET);
					}
				}

				setState(484);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(483);
					match(UNSIGNED);
					}
				}

				setState(487);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(486);
					match(ZEROFILL);
					}
				}

				}
				break;
			case MEDIUMINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(MEDIUMINT);
				setState(493);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(490);
					match(LR_BRACKET);
					setState(491);
					match(DECIMAL_LITERAL);
					setState(492);
					match(RR_BRACKET);
					}
				}

				setState(496);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(495);
					match(UNSIGNED);
					}
				}

				setState(499);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(498);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(501);
				match(INT);
				setState(505);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(502);
					match(LR_BRACKET);
					setState(503);
					match(DECIMAL_LITERAL);
					setState(504);
					match(RR_BRACKET);
					}
				}

				setState(508);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(507);
					match(UNSIGNED);
					}
				}

				setState(511);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(510);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 6);
				{
				setState(513);
				match(INTEGER);
				setState(517);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(514);
					match(LR_BRACKET);
					setState(515);
					match(DECIMAL_LITERAL);
					setState(516);
					match(RR_BRACKET);
					}
				}

				setState(520);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(519);
					match(UNSIGNED);
					}
				}

				setState(523);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(522);
					match(ZEROFILL);
					}
				}

				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(525);
				match(BIGINT);
				setState(529);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(526);
					match(LR_BRACKET);
					setState(527);
					match(DECIMAL_LITERAL);
					setState(528);
					match(RR_BRACKET);
					}
				}

				setState(532);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(531);
					match(UNSIGNED);
					}
				}

				setState(535);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(534);
					match(ZEROFILL);
					}
				}

				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(537);
				match(REAL);
				setState(543);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(538);
					match(LR_BRACKET);
					setState(539);
					match(DECIMAL_LITERAL);
					setState(540);
					match(COMMA);
					setState(541);
					match(DECIMAL_LITERAL);
					setState(542);
					match(RR_BRACKET);
					}
				}

				setState(546);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(545);
					match(UNSIGNED);
					}
				}

				setState(549);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(548);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(551);
				match(DOUBLE);
				setState(557);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(552);
					match(LR_BRACKET);
					setState(553);
					match(DECIMAL_LITERAL);
					setState(554);
					match(COMMA);
					setState(555);
					match(DECIMAL_LITERAL);
					setState(556);
					match(RR_BRACKET);
					}
				}

				setState(560);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(559);
					match(UNSIGNED);
					}
				}

				setState(563);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(562);
					match(ZEROFILL);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(565);
				match(FLOAT);
				setState(571);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(566);
					match(LR_BRACKET);
					setState(567);
					match(DECIMAL_LITERAL);
					setState(568);
					match(COMMA);
					setState(569);
					match(DECIMAL_LITERAL);
					setState(570);
					match(RR_BRACKET);
					}
				}

				setState(574);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(573);
					match(UNSIGNED);
					}
				}

				setState(577);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(576);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(579);
				match(DECIMAL);
				setState(587);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(580);
					match(LR_BRACKET);
					setState(581);
					match(DECIMAL_LITERAL);
					setState(584);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(582);
						match(COMMA);
						setState(583);
						match(DECIMAL_LITERAL);
						}
					}

					setState(586);
					match(RR_BRACKET);
					}
				}

				setState(590);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(589);
					match(UNSIGNED);
					}
				}

				setState(593);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(592);
					match(ZEROFILL);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 12);
				{
				setState(595);
				match(NUMERIC);
				setState(603);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(596);
					match(LR_BRACKET);
					setState(597);
					match(DECIMAL_LITERAL);
					setState(600);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(598);
						match(COMMA);
						setState(599);
						match(DECIMAL_LITERAL);
						}
					}

					setState(602);
					match(RR_BRACKET);
					}
				}

				setState(606);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(605);
					match(UNSIGNED);
					}
				}

				setState(609);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(608);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 13);
				{
				setState(611);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(612);
				match(TIME);
				setState(616);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(613);
					match(LR_BRACKET);
					setState(614);
					match(DECIMAL_LITERAL);
					setState(615);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 15);
				{
				setState(618);
				match(TIMESTAMP);
				setState(622);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(619);
					match(LR_BRACKET);
					setState(620);
					match(DECIMAL_LITERAL);
					setState(621);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(624);
				match(DATETIME);
				setState(628);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(625);
					match(LR_BRACKET);
					setState(626);
					match(DECIMAL_LITERAL);
					setState(627);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(630);
				match(YEAR);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(631);
				match(CHAR);
				setState(635);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(632);
					match(LR_BRACKET);
					setState(633);
					match(DECIMAL_LITERAL);
					setState(634);
					match(RR_BRACKET);
					}
				}

				setState(638);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(637);
					match(BINARY);
					}
				}

				setState(643);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(640);
					match(CHARACTER);
					setState(641);
					match(SET);
					setState(642);
					id();
					}
				}

				setState(647);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(645);
					match(COLLATE);
					setState(646);
					id();
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(649);
				match(VARCHAR);
				setState(653);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(650);
					match(LR_BRACKET);
					setState(651);
					match(DECIMAL_LITERAL);
					setState(652);
					match(RR_BRACKET);
					}
				}

				setState(656);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(655);
					match(BINARY);
					}
				}

				setState(661);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(658);
					match(CHARACTER);
					setState(659);
					match(SET);
					setState(660);
					id();
					}
				}

				setState(665);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(663);
					match(COLLATE);
					setState(664);
					id();
					}
				}

				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 20);
				{
				setState(667);
				match(BINARY);
				setState(671);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(668);
					match(LR_BRACKET);
					setState(669);
					match(DECIMAL_LITERAL);
					setState(670);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 21);
				{
				setState(673);
				match(VARBINARY);
				setState(677);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(674);
					match(LR_BRACKET);
					setState(675);
					match(DECIMAL_LITERAL);
					setState(676);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 22);
				{
				setState(679);
				match(BOOLEAN);
				}
				break;
			case TINYBLOB:
				enterOuterAlt(_localctx, 23);
				{
				setState(680);
				match(TINYBLOB);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 24);
				{
				setState(681);
				match(BLOB);
				}
				break;
			case MEDIUMBLOB:
				enterOuterAlt(_localctx, 25);
				{
				setState(682);
				match(MEDIUMBLOB);
				}
				break;
			case LONGBLOB:
				enterOuterAlt(_localctx, 26);
				{
				setState(683);
				match(LONGBLOB);
				}
				break;
			case TINYTEXT:
				enterOuterAlt(_localctx, 27);
				{
				setState(684);
				match(TINYTEXT);
				setState(686);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(685);
					match(BINARY);
					}
				}

				setState(691);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(688);
					match(CHARACTER);
					setState(689);
					match(SET);
					setState(690);
					id();
					}
				}

				setState(695);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(693);
					match(COLLATE);
					setState(694);
					id();
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(697);
				match(TEXT);
				setState(699);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(698);
					match(BINARY);
					}
				}

				setState(704);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(701);
					match(CHARACTER);
					setState(702);
					match(SET);
					setState(703);
					id();
					}
				}

				setState(708);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(706);
					match(COLLATE);
					setState(707);
					id();
					}
				}

				}
				break;
			case MEDIUMTEXT:
				enterOuterAlt(_localctx, 29);
				{
				setState(710);
				match(MEDIUMTEXT);
				setState(712);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(711);
					match(BINARY);
					}
				}

				setState(717);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(714);
					match(CHARACTER);
					setState(715);
					match(SET);
					setState(716);
					id();
					}
				}

				setState(721);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(719);
					match(COLLATE);
					setState(720);
					id();
					}
				}

				}
				break;
			case LONGTEXT:
				enterOuterAlt(_localctx, 30);
				{
				setState(723);
				match(LONGTEXT);
				setState(725);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(724);
					match(BINARY);
					}
				}

				setState(730);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(727);
					match(CHARACTER);
					setState(728);
					match(SET);
					setState(729);
					id();
					}
				}

				setState(734);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(732);
					match(COLLATE);
					setState(733);
					id();
					}
				}

				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 31);
				{
				setState(736);
				match(ENUM);
				{
				setState(737);
				match(LR_BRACKET);
				setState(738);
				id();
				setState(741);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(739);
					match(COMMA);
					setState(740);
					id();
					}
				}

				setState(743);
				match(RR_BRACKET);
				}
				setState(748);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(745);
					match(CHARACTER);
					setState(746);
					match(SET);
					setState(747);
					id();
					}
				}

				setState(752);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(750);
					match(COLLATE);
					setState(751);
					id();
					}
				}

				}
				break;
			case SET:
				enterOuterAlt(_localctx, 32);
				{
				setState(754);
				match(SET);
				{
				setState(755);
				match(LR_BRACKET);
				setState(756);
				id();
				setState(759);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(757);
					match(COMMA);
					setState(758);
					id();
					}
				}

				setState(761);
				match(RR_BRACKET);
				}
				setState(766);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(763);
					match(CHARACTER);
					setState(764);
					match(SET);
					setState(765);
					id();
					}
				}

				setState(770);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(768);
					match(COLLATE);
					setState(769);
					id();
					}
				}

				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 33);
				{
				setState(772);
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
			setState(777);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(775);
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
				setState(776);
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
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(BINARY_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(781);
					sign();
					}
				}

				setState(784);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(786);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(785);
					sign();
					}
				}

				setState(788);
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
				setState(790);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(789);
					sign();
					}
				}

				setState(792);
				((ConstantContext)_localctx).dollar = match(DOLLAR);
				setState(793);
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
			setState(796);
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
			setState(801);
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
				setState(798);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(799);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case LEFT_QUOTE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(800);
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
			setState(803);
			_la = _input.LA(1);
			if ( !(_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (ID - 388)))) != 0)) ) {
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
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(805);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(807);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(808);
				match(LESS);
				setState(809);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				match(GREATER);
				setState(811);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				match(LESS);
				setState(813);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(814);
				match(EXCLAMATION);
				setState(815);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(816);
				match(EXCLAMATION);
				setState(817);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(818);
				match(EXCLAMATION);
				setState(819);
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
			setState(822);
			_la = _input.LA(1);
			if ( !(((((_la - 452)) & ~0x3f) == 0 && ((1L << (_la - 452)) & ((1L << (PLUS_ASSIGN - 452)) | (1L << (MINUS_ASSIGN - 452)) | (1L << (MULT_ASSIGN - 452)) | (1L << (DIV_ASSIGN - 452)) | (1L << (MOD_ASSIGN - 452)) | (1L << (AND_ASSIGN - 452)) | (1L << (XOR_ASSIGN - 452)) | (1L << (OR_ASSIGN - 452)))) != 0)) ) {
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
			setState(824);
			match(DECIMAL_LITERAL);
			setState(826);
			_la = _input.LA(1);
			if (((((_la - 270)) & ~0x3f) == 0 && ((1L << (_la - 270)) & ((1L << (GB - 270)) | (1L << (KB - 270)) | (1L << (MB - 270)))) != 0) || _la==TB || _la==MODULE) {
				{
				setState(825);
				_la = _input.LA(1);
				if ( !(((((_la - 270)) & ~0x3f) == 0 && ((1L << (_la - 270)) & ((1L << (GB - 270)) | (1L << (KB - 270)) | (1L << (MB - 270)))) != 0) || _la==TB || _la==MODULE) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01e0\u033f\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\7\2f\n\2\f\2"+
		"\16\2i\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4r\n\4\r\4\16\4s\3\5\3\5\3\5"+
		"\3\5\3\5\5\5{\n\5\3\6\3\6\5\6\177\n\6\3\6\5\6\u0082\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0096"+
		"\n\7\f\7\16\7\u0099\13\7\3\7\3\7\5\7\u009d\n\7\3\7\5\7\u00a0\n\7\3\b\3"+
		"\b\3\b\5\b\u00a5\n\b\3\t\5\t\u00a8\n\t\3\t\3\t\5\t\u00ac\n\t\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\5\13\u00b4\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00c5\n\16\3\16\3\16\3\16\5\16\u00ca"+
		"\n\16\3\16\5\16\u00cd\n\16\3\17\3\17\3\17\3\17\5\17\u00d3\n\17\3\17\3"+
		"\17\3\20\3\20\5\20\u00d9\n\20\3\21\3\21\3\21\5\21\u00de\n\21\3\21\5\21"+
		"\u00e1\n\21\3\21\5\21\u00e4\n\21\3\21\3\21\5\21\u00e8\n\21\5\21\u00ea"+
		"\n\21\3\21\3\21\5\21\u00ee\n\21\3\22\3\22\3\22\5\22\u00f3\n\22\3\22\3"+
		"\22\3\22\5\22\u00f8\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u0105\n\24\3\25\3\25\5\25\u0109\n\25\3\25\5\25\u010c\n"+
		"\25\3\25\3\25\3\25\5\25\u0111\n\25\3\25\5\25\u0114\n\25\3\26\3\26\3\26"+
		"\5\26\u0119\n\26\3\27\3\27\5\27\u011d\n\27\3\27\3\27\3\27\5\27\u0122\n"+
		"\27\3\27\5\27\u0125\n\27\3\27\3\27\3\27\3\27\3\30\5\30\u012c\n\30\3\30"+
		"\3\30\5\30\u0130\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0142\n\31\f\31\16\31\u0145\13\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u014d\n\32\3\33\3\33\3\33\3\33\3\33"+
		"\5\33\u0154\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u0160\n\34\3\34\3\34\3\34\3\34\3\34\5\34\u0167\n\34\3\34\3\34\3\35\3"+
		"\35\3\35\5\35\u016e\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0175\n\35\3\35"+
		"\3\35\3\36\3\36\3\36\5\36\u017c\n\36\3\36\3\36\3\37\3\37\3\37\5\37\u0183"+
		"\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u018a\n\37\3\37\3\37\3 \3 \5 \u0190"+
		"\n \3!\3!\3!\5!\u0195\n!\3!\3!\3\"\3\"\3\"\7\"\u019c\n\"\f\"\16\"\u019f"+
		"\13\"\3#\3#\5#\u01a3\n#\3#\3#\3#\5#\u01a8\n#\7#\u01aa\n#\f#\16#\u01ad"+
		"\13#\3$\3$\5$\u01b1\n$\3%\3%\3&\3&\3\'\5\'\u01b8\n\'\3\'\3\'\3(\3(\3("+
		"\3(\3(\5(\u01c1\n(\3)\3)\5)\u01c5\n)\3)\3)\3)\3)\5)\u01cb\n)\3)\5)\u01ce"+
		"\n)\3*\3*\5*\u01d2\n*\3*\3*\3*\3*\5*\u01d8\n*\3*\5*\u01db\n*\3*\5*\u01de"+
		"\n*\3*\3*\3*\3*\5*\u01e4\n*\3*\5*\u01e7\n*\3*\5*\u01ea\n*\3*\3*\3*\3*"+
		"\5*\u01f0\n*\3*\5*\u01f3\n*\3*\5*\u01f6\n*\3*\3*\3*\3*\5*\u01fc\n*\3*"+
		"\5*\u01ff\n*\3*\5*\u0202\n*\3*\3*\3*\3*\5*\u0208\n*\3*\5*\u020b\n*\3*"+
		"\5*\u020e\n*\3*\3*\3*\3*\5*\u0214\n*\3*\5*\u0217\n*\3*\5*\u021a\n*\3*"+
		"\3*\3*\3*\3*\3*\5*\u0222\n*\3*\5*\u0225\n*\3*\5*\u0228\n*\3*\3*\3*\3*"+
		"\3*\3*\5*\u0230\n*\3*\5*\u0233\n*\3*\5*\u0236\n*\3*\3*\3*\3*\3*\3*\5*"+
		"\u023e\n*\3*\5*\u0241\n*\3*\5*\u0244\n*\3*\3*\3*\3*\3*\5*\u024b\n*\3*"+
		"\5*\u024e\n*\3*\5*\u0251\n*\3*\5*\u0254\n*\3*\3*\3*\3*\3*\5*\u025b\n*"+
		"\3*\5*\u025e\n*\3*\5*\u0261\n*\3*\5*\u0264\n*\3*\3*\3*\3*\3*\5*\u026b"+
		"\n*\3*\3*\3*\3*\5*\u0271\n*\3*\3*\3*\3*\5*\u0277\n*\3*\3*\3*\3*\3*\5*"+
		"\u027e\n*\3*\5*\u0281\n*\3*\3*\3*\5*\u0286\n*\3*\3*\5*\u028a\n*\3*\3*"+
		"\3*\3*\5*\u0290\n*\3*\5*\u0293\n*\3*\3*\3*\5*\u0298\n*\3*\3*\5*\u029c"+
		"\n*\3*\3*\3*\3*\5*\u02a2\n*\3*\3*\3*\3*\5*\u02a8\n*\3*\3*\3*\3*\3*\3*"+
		"\3*\5*\u02b1\n*\3*\3*\3*\5*\u02b6\n*\3*\3*\5*\u02ba\n*\3*\3*\5*\u02be"+
		"\n*\3*\3*\3*\5*\u02c3\n*\3*\3*\5*\u02c7\n*\3*\3*\5*\u02cb\n*\3*\3*\3*"+
		"\5*\u02d0\n*\3*\3*\5*\u02d4\n*\3*\3*\5*\u02d8\n*\3*\3*\3*\5*\u02dd\n*"+
		"\3*\3*\5*\u02e1\n*\3*\3*\3*\3*\3*\5*\u02e8\n*\3*\3*\3*\3*\3*\5*\u02ef"+
		"\n*\3*\3*\5*\u02f3\n*\3*\3*\3*\3*\3*\5*\u02fa\n*\3*\3*\3*\3*\3*\5*\u0301"+
		"\n*\3*\3*\5*\u0305\n*\3*\5*\u0308\n*\3+\3+\5+\u030c\n+\3,\3,\3,\5,\u0311"+
		"\n,\3,\3,\5,\u0315\n,\3,\3,\5,\u0319\n,\3,\3,\5,\u031d\n,\3-\3-\3.\3."+
		"\3.\5.\u0324\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u0337\n\60\3\61\3\61\3\62\3\62\5\62\u033d"+
		"\n\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\16\4\2\13\13\67\67\4\2\u0085\u0085\u00b5"+
		"\u00b5\4\2[[bb\4\2ssuu\4\2\34\34ll\4\2\u012b\u012b\u01bc\u01bc\3\2\u01c0"+
		"\u01c1\4\2\u01bc\u01bc\u01c0\u01c0\3\2\u01db\u01dc.\2KK\u00c6\u00c6\u00ce"+
		"\u00ce\u00d0\u00d0\u00d7\u00d8\u00db\u00dd\u00e2\u00e2\u00e4\u00e4\u00e6"+
		"\u00e6\u00e8\u00eb\u00f7\u00f7\u00f9\u00fa\u00fc\u00fc\u00ff\u00ff\u0102"+
		"\u0102\u0104\u0106\u010a\u010f\u0111\u0114\u0116\u0116\u0119\u0119\u011b"+
		"\u011b\u011d\u011f\u0121\u012d\u0131\u0131\u0135\u0135\u0137\u0137\u013a"+
		"\u013c\u013e\u013e\u0140\u0141\u0144\u014b\u014d\u0152\u0154\u0156\u0158"+
		"\u0158\u015a\u015a\u015d\u015f\u0161\u016a\u016c\u016d\u016f\u016f\u0172"+
		"\u0178\u017c\u017f\u0183\u0183\u0185\u0189\u018b\u0192\u01bd\u01bd\3\2"+
		"\u01c6\u01cd\7\2\u0110\u0110\u0120\u0120\u012f\u012f\u017b\u017b\u01da"+
		"\u01da\u03cd\2g\3\2\2\2\4l\3\2\2\2\6q\3\2\2\2\bz\3\2\2\2\n|\3\2\2\2\f"+
		"\u008e\3\2\2\2\16\u00a1\3\2\2\2\20\u00a7\3\2\2\2\22\u00af\3\2\2\2\24\u00b1"+
		"\3\2\2\2\26\u00b7\3\2\2\2\30\u00ba\3\2\2\2\32\u00c0\3\2\2\2\34\u00ce\3"+
		"\2\2\2\36\u00d8\3\2\2\2 \u00da\3\2\2\2\"\u00ef\3\2\2\2$\u00fb\3\2\2\2"+
		"&\u0104\3\2\2\2(\u0108\3\2\2\2*\u0118\3\2\2\2,\u011c\3\2\2\2.\u012b\3"+
		"\2\2\2\60\u0135\3\2\2\2\62\u0146\3\2\2\2\64\u014e\3\2\2\2\66\u0166\3\2"+
		"\2\28\u0174\3\2\2\2:\u017b\3\2\2\2<\u0189\3\2\2\2>\u018f\3\2\2\2@\u0194"+
		"\3\2\2\2B\u0198\3\2\2\2D\u01a0\3\2\2\2F\u01b0\3\2\2\2H\u01b2\3\2\2\2J"+
		"\u01b4\3\2\2\2L\u01b7\3\2\2\2N\u01c0\3\2\2\2P\u01c2\3\2\2\2R\u0307\3\2"+
		"\2\2T\u030b\3\2\2\2V\u031c\3\2\2\2X\u031e\3\2\2\2Z\u0323\3\2\2\2\\\u0325"+
		"\3\2\2\2^\u0336\3\2\2\2`\u0338\3\2\2\2b\u033a\3\2\2\2df\5\4\3\2ed\3\2"+
		"\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\2\2\3k\3\3"+
		"\2\2\2lm\5\6\4\2m\5\3\2\2\2no\5\b\5\2op\7\u01d6\2\2pr\3\2\2\2qn\3\2\2"+
		"\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\7\3\2\2\2u{\5\n\6\2v{\5\f\7\2w{\5\30"+
		"\r\2x{\5\32\16\2y{\5\34\17\2zu\3\2\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2\2\2z"+
		"y\3\2\2\2{\t\3\2\2\2|~\7(\2\2}\177\7\u00b5\2\2~}\3\2\2\2~\177\3\2\2\2"+
		"\177\u0081\3\2\2\2\u0080\u0082\5J&\2\u0081\u0080\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7[\2\2\u0084\u0085\5Z.\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\58\35\2\u0087\u0088\7\u01d3\2\2\u0088\u008a"+
		"\5B\"\2\u0089\u008b\t\2\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7\u01d4\2\2\u008d\13\3\2\2\2\u008e\u008f\7"+
		"(\2\2\u008f\u0090\7\u00a8\2\2\u0090\u0091\58\35\2\u0091\u0092\7\u01d3"+
		"\2\2\u0092\u0097\5\36\20\2\u0093\u0094\7\u01d5\2\2\u0094\u0096\5\36\20"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\7\u01d4\2"+
		"\2\u009b\u009d\5\16\b\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u00a0\5\24\13\2\u009f\u009e\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\r\3\2\2\2\u00a1\u00a4\5\20\t\2\u00a2\u00a3\7\u01d5\2\2\u00a3"+
		"\u00a5\5\16\b\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\17\3\2\2"+
		"\2\u00a6\u00a8\7\64\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\7\u00e0\2\2\u00aa\u00ac\7\u01c2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5\22\n\2"+
		"\u00ae\21\3\2\2\2\u00af\u00b0\7\3\2\2\u00b0\23\3\2\2\2\u00b1\u00b3\7\u00e3"+
		"\2\2\u00b2\u00b4\7\u01c2\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\7\u01be\2\2\u00b6\25\3\2\2\2\u00b7\u00b8\7"+
		"\u00e3\2\2\u00b8\u00b9\7\u01be\2\2\u00b9\27\3\2\2\2\u00ba\u00bb\7\7\2"+
		"\2\u00bb\u00bc\7\u00a8\2\2\u00bc\u00bd\58\35\2\u00bd\u00be\7\5\2\2\u00be"+
		"\u00bf\5\36\20\2\u00bf\31\3\2\2\2\u00c0\u00c1\7;\2\2\u00c1\u00c4\7[\2"+
		"\2\u00c2\u00c3\7Y\2\2\u00c3\u00c5\7C\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5"+
		"\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\5Z.\2\u00c7\u00c8\7u\2\2\u00c8"+
		"\u00ca\58\35\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00cd\7\u01d6\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\33\3\2\2\2\u00ce\u00cf\7;\2\2\u00cf\u00d2\7\u00a8\2\2\u00d0\u00d1\7Y"+
		"\2\2\u00d1\u00d3\7C\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\58\35\2\u00d5\35\3\2\2\2\u00d6\u00d9\5 \21"+
		"\2\u00d7\u00d9\5*\26\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\37"+
		"\3\2\2\2\u00da\u00db\5Z.\2\u00db\u00dd\5R*\2\u00dc\u00de\5L\'\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00e1\5$"+
		"\23\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2"+
		"\u00e4\7\r\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e9\3\2"+
		"\2\2\u00e5\u00e7\t\3\2\2\u00e6\u00e8\7b\2\2\u00e7\u00e6\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\7\u00e3\2\2\u00ec\u00ee\7\u01be\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee!\3\2\2\2\u00ef\u00f0"+
		"\5Z.\2\u00f0\u00f2\5R*\2\u00f1\u00f3\5L\'\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f7\3\2\2\2\u00f4\u00f5\7\64\2\2\u00f5\u00f8\5"+
		"&\24\2\u00f6\u00f8\7\r\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\5\26\f\2\u00fa#\3\2\2\2"+
		"\u00fb\u00fc\7\64\2\2\u00fc\u00fd\5&\24\2\u00fd%\3\2\2\2\u00fe\u0105\7"+
		"p\2\2\u00ff\u0105\5V,\2\u0100\u0101\7\u01d3\2\2\u0101\u0102\5&\24\2\u0102"+
		"\u0103\7\u01d4\2\2\u0103\u0105\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff"+
		"\3\2\2\2\u0104\u0100\3\2\2\2\u0105\'\3\2\2\2\u0106\u0107\7\"\2\2\u0107"+
		"\u0109\5Z.\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2"+
		"\2\u010a\u010c\5L\'\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0110"+
		"\3\2\2\2\u010d\u010e\7\u0085\2\2\u010e\u0111\7b\2\2\u010f\u0111\7\u00b5"+
		"\2\2\u0110\u010d\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u0114\5J&\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114)\3\2\2\2\u0115"+
		"\u0119\5,\27\2\u0116\u0119\5.\30\2\u0117\u0119\5\60\31\2\u0118\u0115\3"+
		"\2\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119+\3\2\2\2\u011a\u011b"+
		"\7\"\2\2\u011b\u011d\5Z.\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u0121\3\2\2\2\u011e\u011f\7\u0085\2\2\u011f\u0122\7b\2\2\u0120\u0122"+
		"\7\u00b5\2\2\u0121\u011e\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0124\3\2\2"+
		"\2\u0123\u0125\5J&\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126"+
		"\3\2\2\2\u0126\u0127\7\u01d3\2\2\u0127\u0128\5D#\2\u0128\u0129\7\u01d4"+
		"\2\2\u0129-\3\2\2\2\u012a\u012c\7\u00b5\2\2\u012b\u012a\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\t\4\2\2\u012e\u0130\5Z"+
		".\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\7\u01d3\2\2\u0132\u0133\5D#\2\u0133\u0134\7\u01d4\2\2\u0134/\3"+
		"\2\2\2\u0135\u0136\7L\2\2\u0136\u0137\7b\2\2\u0137\u0138\7\u01d3\2\2\u0138"+
		"\u0139\5B\"\2\u0139\u013a\7\u01d4\2\2\u013a\u013b\7\u008e\2\2\u013b\u013c"+
		"\5Z.\2\u013c\u013d\7\u01d3\2\2\u013d\u013e\5B\"\2\u013e\u0143\7\u01d4"+
		"\2\2\u013f\u0142\5\62\32\2\u0140\u0142\5\64\33\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0140\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2"+
		"\2\2\u0144\61\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\7u\2\2\u0147\u014c"+
		"\7\65\2\2\u0148\u014d\7\25\2\2\u0149\u014d\7\u0091\2\2\u014a\u014b\7n"+
		"\2\2\u014b\u014d\7\4\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\63\3\2\2\2\u014e\u014f\7u\2\2\u014f\u0153\7\u00b8"+
		"\2\2\u0150\u0154\7\u0091\2\2\u0151\u0152\7n\2\2\u0152\u0154\7\4\2\2\u0153"+
		"\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0154\65\3\2\2\2\u0155\u0156\5Z.\2"+
		"\u0156\u0157\7\u01ce\2\2\u0157\u0158\5Z.\2\u0158\u0159\7\u01ce\2\2\u0159"+
		"\u015a\5Z.\2\u015a\u015b\7\u01ce\2\2\u015b\u0167\3\2\2\2\u015c\u015d\5"+
		"Z.\2\u015d\u015f\7\u01ce\2\2\u015e\u0160\5Z.\2\u015f\u015e\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\7\u01ce\2\2\u0162\u0167"+
		"\3\2\2\2\u0163\u0164\5Z.\2\u0164\u0165\7\u01ce\2\2\u0165\u0167\3\2\2\2"+
		"\u0166\u0155\3\2\2\2\u0166\u015c\3\2\2\2\u0166\u0163\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\5Z.\2\u0169\67\3\2\2\2\u016a"+
		"\u016b\5Z.\2\u016b\u016d\7\u01ce\2\2\u016c\u016e\5Z.\2\u016d\u016c\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\u01ce\2\2\u0170"+
		"\u0175\3\2\2\2\u0171\u0172\5Z.\2\u0172\u0173\7\u01ce\2\2\u0173\u0175\3"+
		"\2\2\2\u0174\u016a\3\2\2\2\u0174\u0171\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176\u0177\5Z.\2\u01779\3\2\2\2\u0178\u0179\5Z.\2\u0179"+
		"\u017a\7\u01ce\2\2\u017a\u017c\3\2\2\2\u017b\u0178\3\2\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5Z.\2\u017e;\3\2\2\2\u017f\u0180"+
		"\5Z.\2\u0180\u0182\7\u01ce\2\2\u0181\u0183\5Z.\2\u0182\u0181\3\2\2\2\u0182"+
		"\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\u01ce\2\2\u0185\u018a"+
		"\3\2\2\2\u0186\u0187\5Z.\2\u0187\u0188\7\u01ce\2\2\u0188\u018a\3\2\2\2"+
		"\u0189\u017f\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018c\5Z.\2\u018c=\3\2\2\2\u018d\u0190\5\66\34\2\u018e"+
		"\u0190\7\u01bb\2\2\u018f\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190?\3\2"+
		"\2\2\u0191\u0192\58\35\2\u0192\u0193\7\u01ce\2\2\u0193\u0195\3\2\2\2\u0194"+
		"\u0191\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\5Z"+
		".\2\u0197A\3\2\2\2\u0198\u019d\5Z.\2\u0199\u019a\7\u01d5\2\2\u019a\u019c"+
		"\5Z.\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019eC\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a2\5Z.\2\u01a1"+
		"\u01a3\t\2\2\2\u01a2\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01ab\3\2"+
		"\2\2\u01a4\u01a5\7\u01d5\2\2\u01a5\u01a7\5Z.\2\u01a6\u01a8\t\2\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a4\3\2"+
		"\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"E\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b1\5Z.\2\u01af\u01b1\7\u01bb\2"+
		"\2\u01b0\u01ae\3\2\2\2\u01b0\u01af\3\2\2\2\u01b1G\3\2\2\2\u01b2\u01b3"+
		"\t\5\2\2\u01b3I\3\2\2\2\u01b4\u01b5\t\6\2\2\u01b5K\3\2\2\2\u01b6\u01b8"+
		"\7o\2\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\7p\2\2\u01baM\3\2\2\2\u01bb\u01c1\5<\37\2\u01bc\u01c1\7\u0095\2"+
		"\2\u01bd\u01c1\7d\2\2\u01be\u01c1\7\u00d9\2\2\u01bf\u01c1\7\u00e1\2\2"+
		"\u01c0\u01bb\3\2\2\2\u01c0\u01bc\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c1O\3\2\2\2\u01c2\u01c4\5Z.\2\u01c3\u01c5"+
		"\7V\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01cd\3\2\2\2\u01c6"+
		"\u01c7\7\u01d3\2\2\u01c7\u01ca\t\7\2\2\u01c8\u01c9\7\u01d5\2\2\u01c9\u01cb"+
		"\7\u01bc\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2"+
		"\2\u01cc\u01ce\7\u01d4\2\2\u01cd\u01c6\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"Q\3\2\2\2\u01cf\u01d1\7\u0195\2\2\u01d0\u01d2\7\u01bc\2\2\u01d1\u01d0"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u0308\3\2\2\2\u01d3\u01d7\7\u0198\2"+
		"\2\u01d4\u01d5\7\u01d3\2\2\u01d5\u01d6\7\u01bc\2\2\u01d6\u01d8\7\u01d4"+
		"\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9"+
		"\u01db\7\u00b7\2\2\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd"+
		"\3\2\2\2\u01dc\u01de\7\u0193\2\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2"+
		"\2\u01de\u0308\3\2\2\2\u01df\u01e3\7\u0199\2\2\u01e0\u01e1\7\u01d3\2\2"+
		"\u01e1\u01e2\7\u01bc\2\2\u01e2\u01e4\7\u01d4\2\2\u01e3\u01e0\3\2\2\2\u01e3"+
		"\u01e4\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\7\u00b7\2\2\u01e6\u01e5"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea\7\u0193\2"+
		"\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u0308\3\2\2\2\u01eb\u01ef"+
		"\7\u019a\2\2\u01ec\u01ed\7\u01d3\2\2\u01ed\u01ee\7\u01bc\2\2\u01ee\u01f0"+
		"\7\u01d4\2\2\u01ef\u01ec\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\3\2\2"+
		"\2\u01f1\u01f3\7\u00b7\2\2\u01f2\u01f1\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3"+
		"\u01f5\3\2\2\2\u01f4\u01f6\7\u0193\2\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u0308\3\2\2\2\u01f7\u01fb\7\u019b\2\2\u01f8\u01f9\7\u01d3"+
		"\2\2\u01f9\u01fa\7\u01bc\2\2\u01fa\u01fc\7\u01d4\2\2\u01fb\u01f8\3\2\2"+
		"\2\u01fb\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\7\u00b7\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\7\u0193"+
		"\2\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0308\3\2\2\2\u0203"+
		"\u0207\7\u019c\2\2\u0204\u0205\7\u01d3\2\2\u0205\u0206\7\u01bc\2\2\u0206"+
		"\u0208\7\u01d4\2\2\u0207\u0204\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a"+
		"\3\2\2\2\u0209\u020b\7\u00b7\2\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2"+
		"\2\u020b\u020d\3\2\2\2\u020c\u020e\7\u0193\2\2\u020d\u020c\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u0308\3\2\2\2\u020f\u0213\7\u019d\2\2\u0210\u0211"+
		"\7\u01d3\2\2\u0211\u0212\7\u01bc\2\2\u0212\u0214\7\u01d4\2\2\u0213\u0210"+
		"\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0216\3\2\2\2\u0215\u0217\7\u00b7\2"+
		"\2\u0216\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a"+
		"\7\u0193\2\2\u0219\u0218\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0308\3\2\2"+
		"\2\u021b\u0221\7\u019e\2\2\u021c\u021d\7\u01d3\2\2\u021d\u021e\7\u01bc"+
		"\2\2\u021e\u021f\7\u01d5\2\2\u021f\u0220\7\u01bc\2\2\u0220\u0222\7\u01d4"+
		"\2\2\u0221\u021c\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0224\3\2\2\2\u0223"+
		"\u0225\7\u00b7\2\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227"+
		"\3\2\2\2\u0226\u0228\7\u0193\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2"+
		"\2\u0228\u0308\3\2\2\2\u0229\u022f\7\u01a0\2\2\u022a\u022b\7\u01d3\2\2"+
		"\u022b\u022c\7\u01bc\2\2\u022c\u022d\7\u01d5\2\2\u022d\u022e\7\u01bc\2"+
		"\2\u022e\u0230\7\u01d4\2\2\u022f\u022a\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0232\3\2\2\2\u0231\u0233\7\u00b7\2\2\u0232\u0231\3\2\2\2\u0232\u0233"+
		"\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0236\7\u0193\2\2\u0235\u0234\3\2\2"+
		"\2\u0235\u0236\3\2\2\2\u0236\u0308\3\2\2\2\u0237\u023d\7\u019f\2\2\u0238"+
		"\u0239\7\u01d3\2\2\u0239\u023a\7\u01bc\2\2\u023a\u023b\7\u01d5\2\2\u023b"+
		"\u023c\7\u01bc\2\2\u023c\u023e\7\u01d4\2\2\u023d\u0238\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\7\u00b7\2\2\u0240\u023f\3\2\2"+
		"\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0244\7\u0193\2\2\u0243"+
		"\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0308\3\2\2\2\u0245\u024d\7\u01a1"+
		"\2\2\u0246\u0247\7\u01d3\2\2\u0247\u024a\7\u01bc\2\2\u0248\u0249\7\u01d5"+
		"\2\2\u0249\u024b\7\u01bc\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024e\7\u01d4\2\2\u024d\u0246\3\2\2\2\u024d\u024e"+
		"\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\7\u00b7\2\2\u0250\u024f\3\2\2"+
		"\2\u0250\u0251\3\2\2\2\u0251\u0253\3\2\2\2\u0252\u0254\7\u0193\2\2\u0253"+
		"\u0252\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0308\3\2\2\2\u0255\u025d\7\u01a2"+
		"\2\2\u0256\u0257\7\u01d3\2\2\u0257\u025a\7\u01bc\2\2\u0258\u0259\7\u01d5"+
		"\2\2\u0259\u025b\7\u01bc\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025e\7\u01d4\2\2\u025d\u0256\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u0261\7\u00b7\2\2\u0260\u025f\3\2\2"+
		"\2\u0260\u0261\3\2\2\2\u0261\u0263\3\2\2\2\u0262\u0264\7\u0193\2\2\u0263"+
		"\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0308\3\2\2\2\u0265\u0308\7\u01a3"+
		"\2\2\u0266\u026a\7\u017f\2\2\u0267\u0268\7\u01d3\2\2\u0268\u0269\7\u01bc"+
		"\2\2\u0269\u026b\7\u01d4\2\2\u026a\u0267\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u0308\3\2\2\2\u026c\u0270\7\u01a5\2\2\u026d\u026e\7\u01d3\2\2\u026e\u026f"+
		"\7\u01bc\2\2\u026f\u0271\7\u01d4\2\2\u0270\u026d\3\2\2\2\u0270\u0271\3"+
		"\2\2\2\u0271\u0308\3\2\2\2\u0272\u0276\7\u01a4\2\2\u0273\u0274\7\u01d3"+
		"\2\2\u0274\u0275\7\u01bc\2\2\u0275\u0277\7\u01d4\2\2\u0276\u0273\3\2\2"+
		"\2\u0276\u0277\3\2\2\2\u0277\u0308\3\2\2\2\u0278\u0308\7\u01a6\2\2\u0279"+
		"\u027d\7\u01a7\2\2\u027a\u027b\7\u01d3\2\2\u027b\u027c\7\u01bc\2\2\u027c"+
		"\u027e\7\u01d4\2\2\u027d\u027a\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280"+
		"\3\2\2\2\u027f\u0281\7\u0196\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2"+
		"\2\u0281\u0285\3\2\2\2\u0282\u0283\7\u01a8\2\2\u0283\u0284\7\u00a2\2\2"+
		"\u0284\u0286\5Z.\2\u0285\u0282\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289"+
		"\3\2\2\2\u0287\u0288\7\36\2\2\u0288\u028a\5Z.\2\u0289\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u0308\3\2\2\2\u028b\u028f\7\u01a9\2\2\u028c\u028d"+
		"\7\u01d3\2\2\u028d\u028e\7\u01bc\2\2\u028e\u0290\7\u01d4\2\2\u028f\u028c"+
		"\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0292\3\2\2\2\u0291\u0293\7\u0196\2"+
		"\2\u0292\u0291\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0297\3\2\2\2\u0294\u0295"+
		"\7\u01a8\2\2\u0295\u0296\7\u00a2\2\2\u0296\u0298\5Z.\2\u0297\u0294\3\2"+
		"\2\2\u0297\u0298\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u029a\7\36\2\2\u029a"+
		"\u029c\5Z.\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u0308\3\2\2"+
		"\2\u029d\u02a1\7\u0196\2\2\u029e\u029f\7\u01d3\2\2\u029f\u02a0\7\u01bc"+
		"\2\2\u02a0\u02a2\7\u01d4\2\2\u02a1\u029e\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2"+
		"\u0308\3\2\2\2\u02a3\u02a7\7\u01aa\2\2\u02a4\u02a5\7\u01d3\2\2\u02a5\u02a6"+
		"\7\u01bc\2\2\u02a6\u02a8\7\u01d4\2\2\u02a7\u02a4\3\2\2\2\u02a7\u02a8\3"+
		"\2\2\2\u02a8\u0308\3\2\2\2\u02a9\u0308\7\u0197\2\2\u02aa\u0308\7\u01ab"+
		"\2\2\u02ab\u0308\7\u01ac\2\2\u02ac\u0308\7\u01ad\2\2\u02ad\u0308\7\u01ae"+
		"\2\2\u02ae\u02b0\7\u01af\2\2\u02af\u02b1\7\u0196\2\2\u02b0\u02af\3\2\2"+
		"\2\u02b0\u02b1\3\2\2\2\u02b1\u02b5\3\2\2\2\u02b2\u02b3\7\u01a8\2\2\u02b3"+
		"\u02b4\7\u00a2\2\2\u02b4\u02b6\5Z.\2\u02b5\u02b2\3\2\2\2\u02b5\u02b6\3"+
		"\2\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b8\7\36\2\2\u02b8\u02ba\5Z.\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u0308\3\2\2\2\u02bb\u02bd\7\u01b0"+
		"\2\2\u02bc\u02be\7\u0196\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c2\3\2\2\2\u02bf\u02c0\7\u01a8\2\2\u02c0\u02c1\7\u00a2\2\2\u02c1\u02c3"+
		"\5Z.\2\u02c2\u02bf\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4"+
		"\u02c5\7\36\2\2\u02c5\u02c7\5Z.\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2"+
		"\2\2\u02c7\u0308\3\2\2\2\u02c8\u02ca\7\u01b1\2\2\u02c9\u02cb\7\u0196\2"+
		"\2\u02ca\u02c9\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cf\3\2\2\2\u02cc\u02cd"+
		"\7\u01a8\2\2\u02cd\u02ce\7\u00a2\2\2\u02ce\u02d0\5Z.\2\u02cf\u02cc\3\2"+
		"\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02d2\7\36\2\2\u02d2"+
		"\u02d4\5Z.\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u0308\3\2\2"+
		"\2\u02d5\u02d7\7\u01b2\2\2\u02d6\u02d8\7\u0196\2\2\u02d7\u02d6\3\2\2\2"+
		"\u02d7\u02d8\3\2\2\2\u02d8\u02dc\3\2\2\2\u02d9\u02da\7\u01a8\2\2\u02da"+
		"\u02db\7\u00a2\2\2\u02db\u02dd\5Z.\2\u02dc\u02d9\3\2\2\2\u02dc\u02dd\3"+
		"\2\2\2\u02dd\u02e0\3\2\2\2\u02de\u02df\7\36\2\2\u02df\u02e1\5Z.\2\u02e0"+
		"\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u0308\3\2\2\2\u02e2\u02e3\7\u01b3"+
		"\2\2\u02e3\u02e4\7\u01d3\2\2\u02e4\u02e7\5Z.\2\u02e5\u02e6\7\u01d5\2\2"+
		"\u02e6\u02e8\5Z.\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9"+
		"\3\2\2\2\u02e9\u02ea\7\u01d4\2\2\u02ea\u02ee\3\2\2\2\u02eb\u02ec\7\u01a8"+
		"\2\2\u02ec\u02ed\7\u00a2\2\2\u02ed\u02ef\5Z.\2\u02ee\u02eb\3\2\2\2\u02ee"+
		"\u02ef\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0\u02f1\7\36\2\2\u02f1\u02f3\5"+
		"Z.\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u0308\3\2\2\2\u02f4"+
		"\u02f5\7\u00a2\2\2\u02f5\u02f6\7\u01d3\2\2\u02f6\u02f9\5Z.\2\u02f7\u02f8"+
		"\7\u01d5\2\2\u02f8\u02fa\5Z.\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2"+
		"\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7\u01d4\2\2\u02fc\u0300\3\2\2\2\u02fd"+
		"\u02fe\7\u01a8\2\2\u02fe\u02ff\7\u00a2\2\2\u02ff\u0301\5Z.\2\u0300\u02fd"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0303\7\36\2\2"+
		"\u0303\u0305\5Z.\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0308"+
		"\3\2\2\2\u0306\u0308\7\u01b4\2\2\u0307\u01cf\3\2\2\2\u0307\u01d3\3\2\2"+
		"\2\u0307\u01df\3\2\2\2\u0307\u01eb\3\2\2\2\u0307\u01f7\3\2\2\2\u0307\u0203"+
		"\3\2\2\2\u0307\u020f\3\2\2\2\u0307\u021b\3\2\2\2\u0307\u0229\3\2\2\2\u0307"+
		"\u0237\3\2\2\2\u0307\u0245\3\2\2\2\u0307\u0255\3\2\2\2\u0307\u0265\3\2"+
		"\2\2\u0307\u0266\3\2\2\2\u0307\u026c\3\2\2\2\u0307\u0272\3\2\2\2\u0307"+
		"\u0278\3\2\2\2\u0307\u0279\3\2\2\2\u0307\u028b\3\2\2\2\u0307\u029d\3\2"+
		"\2\2\u0307\u02a3\3\2\2\2\u0307\u02a9\3\2\2\2\u0307\u02aa\3\2\2\2\u0307"+
		"\u02ab\3\2\2\2\u0307\u02ac\3\2\2\2\u0307\u02ad\3\2\2\2\u0307\u02ae\3\2"+
		"\2\2\u0307\u02bb\3\2\2\2\u0307\u02c8\3\2\2\2\u0307\u02d5\3\2\2\2\u0307"+
		"\u02e2\3\2\2\2\u0307\u02f4\3\2\2\2\u0307\u0306\3\2\2\2\u0308S\3\2\2\2"+
		"\u0309\u030c\7p\2\2\u030a\u030c\5V,\2\u030b\u0309\3\2\2\2\u030b\u030a"+
		"\3\2\2\2\u030cU\3\2\2\2\u030d\u031d\7\u01be\2\2\u030e\u031d\7\u01bf\2"+
		"\2\u030f\u0311\5X-\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312"+
		"\3\2\2\2\u0312\u031d\7\u01bc\2\2\u0313\u0315\5X-\2\u0314\u0313\3\2\2\2"+
		"\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u031d\t\b\2\2\u0317\u0319"+
		"\5X-\2\u0318\u0317\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031b\7\u01d2\2\2\u031b\u031d\t\t\2\2\u031c\u030d\3\2\2\2\u031c\u030e"+
		"\3\2\2\2\u031c\u0310\3\2\2\2\u031c\u0314\3\2\2\2\u031c\u0318\3\2\2\2\u031d"+
		"W\3\2\2\2\u031e\u031f\t\n\2\2\u031fY\3\2\2\2\u0320\u0324\5\\/\2\u0321"+
		"\u0324\7\u01b8\2\2\u0322\u0324\7\u01b9\2\2\u0323\u0320\3\2\2\2\u0323\u0321"+
		"\3\2\2\2\u0323\u0322\3\2\2\2\u0324[\3\2\2\2\u0325\u0326\t\13\2\2\u0326"+
		"]\3\2\2\2\u0327\u0337\7\u01c2\2\2\u0328\u0337\7\u01c3\2\2\u0329\u0337"+
		"\7\u01c4\2\2\u032a\u032b\7\u01c4\2\2\u032b\u0337\7\u01c2\2\2\u032c\u032d"+
		"\7\u01c3\2\2\u032d\u0337\7\u01c2\2\2\u032e\u032f\7\u01c4\2\2\u032f\u0337"+
		"\7\u01c3\2\2\u0330\u0331\7\u01c5\2\2\u0331\u0337\7\u01c2\2\2\u0332\u0333"+
		"\7\u01c5\2\2\u0333\u0337\7\u01c3\2\2\u0334\u0335\7\u01c5\2\2\u0335\u0337"+
		"\7\u01c4\2\2\u0336\u0327\3\2\2\2\u0336\u0328\3\2\2\2\u0336\u0329\3\2\2"+
		"\2\u0336\u032a\3\2\2\2\u0336\u032c\3\2\2\2\u0336\u032e\3\2\2\2\u0336\u0330"+
		"\3\2\2\2\u0336\u0332\3\2\2\2\u0336\u0334\3\2\2\2\u0337_\3\2\2\2\u0338"+
		"\u0339\t\f\2\2\u0339a\3\2\2\2\u033a\u033c\7\u01bc\2\2\u033b\u033d\t\r"+
		"\2\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033dc\3\2\2\2\u008agsz~"+
		"\u0081\u008a\u0097\u009c\u009f\u00a4\u00a7\u00ab\u00b3\u00c4\u00c9\u00cc"+
		"\u00d2\u00d8\u00dd\u00e0\u00e3\u00e7\u00e9\u00ed\u00f2\u00f7\u0104\u0108"+
		"\u010b\u0110\u0113\u0118\u011c\u0121\u0124\u012b\u012f\u0141\u0143\u014c"+
		"\u0153\u015f\u0166\u016d\u0174\u017b\u0182\u0189\u018f\u0194\u019d\u01a2"+
		"\u01a7\u01ab\u01b0\u01b7\u01c0\u01c4\u01ca\u01cd\u01d1\u01d7\u01da\u01dd"+
		"\u01e3\u01e6\u01e9\u01ef\u01f2\u01f5\u01fb\u01fe\u0201\u0207\u020a\u020d"+
		"\u0213\u0216\u0219\u0221\u0224\u0227\u022f\u0232\u0235\u023d\u0240\u0243"+
		"\u024a\u024d\u0250\u0253\u025a\u025d\u0260\u0263\u026a\u0270\u0276\u027d"+
		"\u0280\u0285\u0289\u028f\u0292\u0297\u029b\u02a1\u02a7\u02b0\u02b5\u02b9"+
		"\u02bd\u02c2\u02c6\u02ca\u02cf\u02d3\u02d7\u02dc\u02e0\u02e7\u02ee\u02f2"+
		"\u02f9\u0300\u0304\u0307\u030b\u0310\u0314\u0318\u031c\u0323\u0336\u033c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}