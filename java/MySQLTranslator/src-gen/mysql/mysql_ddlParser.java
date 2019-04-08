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
		RULE_table_foreign_key_def = 21, RULE_fk_on_delete = 22, RULE_fk_on_update = 23, 
		RULE_full_table_name = 24, RULE_table_name = 25, RULE_simple_name = 26, 
		RULE_func_proc_name = 27, RULE_ddl_object = 28, RULE_full_column_name = 29, 
		RULE_column_name_list = 30, RULE_sorted_column_name_list = 31, RULE_cursor_name = 32, 
		RULE_on_off = 33, RULE_clustered = 34, RULE_null_notnull = 35, RULE_scalar_function_name = 36, 
		RULE_ms_data_type = 37, RULE_data_type = 38, RULE_default_value = 39, 
		RULE_constant = 40, RULE_sign = 41, RULE_id = 42, RULE_simple_id = 43, 
		RULE_comparison_operator = 44, RULE_assignment_operator = 45, RULE_file_size = 46;
	public static final String[] ruleNames = {
		"mysql_ddl_file", "batch", "ddl_clauses", "ddl_clause", "create_index", 
		"create_table", "table_options", "table_option", "char_set", "table_comment", 
		"column_comment", "alter_table", "drop_index", "drop_table", "column_def_table_constraint", 
		"column_definition", "column_definition1", "column_default", "constant_expression", 
		"column_constraint", "table_constraint", "table_foreign_key_def", "fk_on_delete", 
		"fk_on_update", "full_table_name", "table_name", "simple_name", "func_proc_name", 
		"ddl_object", "full_column_name", "column_name_list", "sorted_column_name_list", 
		"cursor_name", "on_off", "clustered", "null_notnull", "scalar_function_name", 
		"ms_data_type", "data_type", "default_value", "constant", "sign", "id", 
		"simple_id", "comparison_operator", "assignment_operator", "file_size"
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
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << CREATE) | (1L << DROP))) != 0)) {
				{
				{
				setState(94);
				batch();
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
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
			setState(102);
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
			setState(107); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(104);
					ddl_clause();
					setState(105);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(109); 
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
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				create_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				create_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				alter_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				drop_index();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
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
			setState(118);
			match(CREATE);
			setState(120);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(119);
				match(UNIQUE);
				}
			}

			setState(123);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(122);
				clustered();
				}
			}

			setState(125);
			match(INDEX);
			setState(126);
			id();
			setState(127);
			match(ON);
			setState(128);
			table_name();
			setState(129);
			match(LR_BRACKET);
			setState(130);
			column_name_list();
			setState(132);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(131);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(134);
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
			setState(136);
			match(CREATE);
			setState(137);
			match(TABLE);
			setState(138);
			table_name();
			setState(139);
			match(LR_BRACKET);
			setState(140);
			column_def_table_constraint();
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(141);
				match(COMMA);
				setState(142);
				column_def_table_constraint();
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(148);
			match(RR_BRACKET);
			setState(150);
			_la = _input.LA(1);
			if (_la==DEFAULT || _la==CHARSET) {
				{
				setState(149);
				table_options();
				}
			}

			setState(153);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(152);
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
			setState(155);
			table_option();
			setState(158);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(156);
				match(COMMA);
				setState(157);
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
			setState(161);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(160);
				match(DEFAULT);
				}
			}

			setState(163);
			match(CHARSET);
			setState(165);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(164);
				match(EQUAL);
				}
			}

			setState(167);
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
			setState(169);
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
			setState(171);
			match(COMMENT);
			setState(173);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(172);
				match(EQUAL);
				}
			}

			setState(175);
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
			setState(177);
			match(COMMENT);
			setState(178);
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
			setState(180);
			match(ALTER);
			setState(181);
			match(TABLE);
			setState(182);
			table_name();
			setState(183);
			match(ADD);
			setState(184);
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
			setState(186);
			match(DROP);
			setState(187);
			match(INDEX);
			setState(190);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(188);
				match(IF);
				setState(189);
				match(EXISTS);
				}
			}

			setState(192);
			((Drop_indexContext)_localctx).name = id();
			setState(195);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(193);
				match(ON);
				setState(194);
				table_name();
				}
			}

			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(197);
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
			setState(200);
			match(DROP);
			setState(201);
			match(TABLE);
			setState(204);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(202);
				match(IF);
				setState(203);
				match(EXISTS);
				}
			}

			setState(206);
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
			setState(210);
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
				setState(208);
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
				setState(209);
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
			setState(212);
			id();
			setState(213);
			data_type();
			setState(215);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(214);
				null_notnull();
				}
			}

			setState(218);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(217);
				column_default();
				}
			}

			setState(221);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(220);
				match(AUTO_INCREMENT);
				}
			}

			setState(227);
			_la = _input.LA(1);
			if (_la==PRIMARY || _la==UNIQUE) {
				{
				setState(223);
				_la = _input.LA(1);
				if ( !(_la==PRIMARY || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(225);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(224);
					match(KEY);
					}
				}

				}
			}

			setState(231);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(229);
				match(COMMENT);
				setState(230);
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
			setState(233);
			id();
			setState(234);
			data_type();
			setState(236);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(235);
				null_notnull();
				}
			}

			setState(241);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(238);
				match(DEFAULT);
				setState(239);
				constant_expression();
				}
				break;
			case AUTO_INCREMENT:
				{
				setState(240);
				match(AUTO_INCREMENT);
				}
				break;
			case COMMENT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(243);
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
			setState(245);
			match(DEFAULT);
			setState(246);
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
			setState(254);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
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
				setState(249);
				constant();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(LR_BRACKET);
				setState(251);
				constant_expression();
				setState(252);
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
			setState(258);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(256);
				match(CONSTRAINT);
				setState(257);
				id();
				}
			}

			setState(261);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(260);
				null_notnull();
				}
			}

			{
			setState(266);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(263);
				match(PRIMARY);
				setState(264);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(265);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(269);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(268);
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
		public TerminalNode INDEX() { return getToken(mysql_ddlParser.INDEX, 0); }
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
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(271);
					match(CONSTRAINT);
					setState(272);
					id();
					}
				}

				{
				setState(278);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(275);
					match(PRIMARY);
					setState(276);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(277);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(280);
					clustered();
					}
				}

				setState(283);
				match(LR_BRACKET);
				setState(284);
				sorted_column_name_list();
				setState(285);
				match(RR_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(287);
					match(UNIQUE);
					}
				}

				setState(290);
				match(KEY);
				setState(292);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(291);
					id();
					}
				}

				setState(294);
				match(LR_BRACKET);
				setState(295);
				sorted_column_name_list();
				setState(296);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(298);
					match(UNIQUE);
					}
				}

				setState(301);
				match(INDEX);
				setState(303);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(302);
					id();
					}
				}

				setState(305);
				match(LR_BRACKET);
				setState(306);
				sorted_column_name_list();
				setState(307);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(309);
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
		enterRule(_localctx, 42, RULE_table_foreign_key_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(FOREIGN);
			setState(313);
			match(KEY);
			setState(314);
			match(LR_BRACKET);
			setState(315);
			column_name_list();
			setState(316);
			match(RR_BRACKET);
			setState(317);
			match(REFERENCES);
			setState(318);
			id();
			setState(319);
			match(LR_BRACKET);
			setState(320);
			column_name_list();
			setState(321);
			match(RR_BRACKET);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ON) {
				{
				setState(324);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(322);
					fk_on_delete();
					}
					break;
				case 2:
					{
					setState(323);
					fk_on_update();
					}
					break;
				}
				}
				setState(328);
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
		enterRule(_localctx, 44, RULE_fk_on_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ON);
			setState(330);
			match(DELETE);
			setState(335);
			switch (_input.LA(1)) {
			case CASCADE:
				{
				setState(331);
				match(CASCADE);
				}
				break;
			case RESTRICT:
				{
				setState(332);
				match(RESTRICT);
				}
				break;
			case NO:
				{
				setState(333);
				match(NO);
				setState(334);
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
		enterRule(_localctx, 46, RULE_fk_on_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ON);
			setState(338);
			match(UPDATE);
			setState(342);
			switch (_input.LA(1)) {
			case RESTRICT:
				{
				setState(339);
				match(RESTRICT);
				}
				break;
			case NO:
				{
				setState(340);
				match(NO);
				setState(341);
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
		enterRule(_localctx, 48, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(344);
				((Full_table_nameContext)_localctx).server = id();
				setState(345);
				match(DOT);
				setState(346);
				((Full_table_nameContext)_localctx).database = id();
				setState(347);
				match(DOT);
				setState(348);
				((Full_table_nameContext)_localctx).schema = id();
				setState(349);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(351);
				((Full_table_nameContext)_localctx).database = id();
				setState(352);
				match(DOT);
				setState(354);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(353);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(356);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(358);
				((Full_table_nameContext)_localctx).schema = id();
				setState(359);
				match(DOT);
				}
				break;
			}
			setState(363);
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
		enterRule(_localctx, 50, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(365);
				((Table_nameContext)_localctx).database = id();
				setState(366);
				match(DOT);
				setState(368);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(367);
					((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(370);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(372);
				((Table_nameContext)_localctx).schema = id();
				setState(373);
				match(DOT);
				}
				break;
			}
			setState(377);
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
		enterRule(_localctx, 52, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(379);
				((Simple_nameContext)_localctx).schema = id();
				setState(380);
				match(DOT);
				}
				break;
			}
			setState(384);
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
		enterRule(_localctx, 54, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(386);
				((Func_proc_nameContext)_localctx).database = id();
				setState(387);
				match(DOT);
				setState(389);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & ((1L << (ABSOLUTE - 196)) | (1L << (APPLY - 196)) | (1L << (AUTO - 196)) | (1L << (AVG - 196)) | (1L << (BASE64 - 196)) | (1L << (CALLER - 196)) | (1L << (CAST - 196)) | (1L << (CATCH - 196)) | (1L << (CHECKSUM_AGG - 196)) | (1L << (COMMITTED - 196)) | (1L << (CONCAT - 196)) | (1L << (CONTROL - 196)) | (1L << (COOKIE - 196)) | (1L << (COUNT - 196)) | (1L << (COUNT_BIG - 196)) | (1L << (DELAY - 196)) | (1L << (DELETED - 196)) | (1L << (DENSE_RANK - 196)) | (1L << (DISABLE - 196)) | (1L << (DYNAMIC - 196)) | (1L << (ENCRYPTION - 196)) | (1L << (EXPAND - 196)) | (1L << (FAST - 196)))) != 0) || ((((_la - 260)) & ~0x3f) == 0 && ((1L << (_la - 260)) & ((1L << (FAST_FORWARD - 260)) | (1L << (FIRST - 260)) | (1L << (FOLLOWING - 260)) | (1L << (FORCE - 260)) | (1L << (FORCED - 260)) | (1L << (FORWARD_ONLY - 260)) | (1L << (FULLSCAN - 260)) | (1L << (GLOBAL - 260)) | (1L << (GO - 260)) | (1L << (GROUPING - 260)) | (1L << (GROUPING_ID - 260)) | (1L << (HASH - 260)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 260)) | (1L << (IMPERSONATE - 260)) | (1L << (INSENSITIVE - 260)) | (1L << (INSERTED - 260)) | (1L << (ISOLATION - 260)) | (1L << (KEEP - 260)) | (1L << (KEEPFIXED - 260)) | (1L << (KEYSET - 260)) | (1L << (LAST - 260)) | (1L << (LEVEL - 260)) | (1L << (LOCAL - 260)) | (1L << (LOCK_ESCALATION - 260)) | (1L << (LOGIN - 260)) | (1L << (LOOP - 260)) | (1L << (MARK - 260)) | (1L << (MAX - 260)) | (1L << (MAXDOP - 260)) | (1L << (MAXRECURSION - 260)) | (1L << (MIN - 260)) | (1L << (MODIFY - 260)) | (1L << (NAME - 260)) | (1L << (NEXT - 260)) | (1L << (NOCOUNT - 260)) | (1L << (NOEXPAND - 260)) | (1L << (NORECOMPUTE - 260)) | (1L << (NTILE - 260)) | (1L << (NUMBER - 260)) | (1L << (OFFSET - 260)) | (1L << (ONLINE - 260)))) != 0) || ((((_la - 324)) & ~0x3f) == 0 && ((1L << (_la - 324)) & ((1L << (ONLY - 324)) | (1L << (OPTIMISTIC - 324)) | (1L << (OPTIMIZE - 324)) | (1L << (OUT - 324)) | (1L << (OUTPUT - 324)) | (1L << (OWNER - 324)) | (1L << (PARAMETERIZATION - 324)) | (1L << (PARTITION - 324)) | (1L << (PATH - 324)) | (1L << (PRECEDING - 324)) | (1L << (PRIOR - 324)) | (1L << (PRIVILEGES - 324)) | (1L << (RANGE - 324)) | (1L << (RANK - 324)) | (1L << (READONLY - 324)) | (1L << (READ_ONLY - 324)) | (1L << (RECOMPILE - 324)) | (1L << (RELATIVE - 324)) | (1L << (REMOTE - 324)) | (1L << (REPEATABLE - 324)) | (1L << (ROBUST - 324)) | (1L << (ROOT - 324)) | (1L << (ROW - 324)) | (1L << (ROWGUID - 324)) | (1L << (ROWS - 324)) | (1L << (ROW_NUMBER - 324)) | (1L << (SAMPLE - 324)) | (1L << (SCHEMABINDING - 324)) | (1L << (SCROLL - 324)) | (1L << (SCROLL_LOCKS - 324)) | (1L << (SELF - 324)) | (1L << (SERIALIZABLE - 324)) | (1L << (SIMPLE - 324)) | (1L << (SNAPSHOT - 324)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 324)) | (1L << (STATIC - 324)) | (1L << (STATS_STREAM - 324)) | (1L << (STDEV - 324)) | (1L << (STDEVP - 324)) | (1L << (SUM - 324)) | (1L << (TEXTIMAGE_ON - 324)) | (1L << (THROW - 324)) | (1L << (TIES - 324)) | (1L << (TIME - 324)) | (1L << (TRY - 324)) | (1L << (TYPE - 324)))) != 0) || ((((_la - 388)) & ~0x3f) == 0 && ((1L << (_la - 388)) & ((1L << (TYPE_WARNING - 388)) | (1L << (UNBOUNDED - 388)) | (1L << (UNCOMMITTED - 388)) | (1L << (UNKNOWN - 388)) | (1L << (USING - 388)) | (1L << (VAR - 388)) | (1L << (VARP - 388)) | (1L << (VIEWS - 388)) | (1L << (VIEW_METADATA - 388)) | (1L << (WORK - 388)) | (1L << (XML - 388)) | (1L << (XMLNAMESPACES - 388)) | (1L << (DOUBLE_QUOTE_ID - 388)) | (1L << (LEFT_QUOTE_ID - 388)) | (1L << (ID - 388)))) != 0)) {
					{
					setState(388);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(391);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(393);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(394);
				match(DOT);
				}
				break;
			}
			setState(398);
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
		enterRule(_localctx, 56, RULE_ddl_object);
		try {
			setState(402);
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
				setState(400);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
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
		enterRule(_localctx, 58, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(404);
				table_name();
				setState(405);
				match(DOT);
				}
				break;
			}
			setState(409);
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
		enterRule(_localctx, 60, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			id();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(412);
				match(COMMA);
				setState(413);
				id();
				}
				}
				setState(418);
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
		enterRule(_localctx, 62, RULE_sorted_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
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

			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(423);
				match(COMMA);
				setState(424);
				id();
				setState(426);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(425);
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
				setState(432);
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
		enterRule(_localctx, 64, RULE_cursor_name);
		try {
			setState(435);
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
				setState(433);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
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
		enterRule(_localctx, 66, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
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
		enterRule(_localctx, 68, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
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
		enterRule(_localctx, 70, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(441);
				match(NOT);
				}
			}

			setState(444);
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
		enterRule(_localctx, 72, RULE_scalar_function_name);
		try {
			setState(451);
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
				setState(446);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
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
		enterRule(_localctx, 74, RULE_ms_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			id();
			setState(455);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(454);
				match(IDENTITY);
				}
			}

			setState(464);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(457);
				match(LR_BRACKET);
				setState(458);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(461);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(459);
					match(COMMA);
					setState(460);
					match(DECIMAL_LITERAL);
					}
				}

				setState(463);
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
		enterRule(_localctx, 76, RULE_data_type);
		int _la;
		try {
			setState(778);
			switch (_input.LA(1)) {
			case BIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				match(BIT);
				setState(468);
				_la = _input.LA(1);
				if (_la==DECIMAL_LITERAL) {
					{
					setState(467);
					match(DECIMAL_LITERAL);
					}
				}

				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(TINYINT);
				setState(474);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(471);
					match(LR_BRACKET);
					setState(472);
					match(DECIMAL_LITERAL);
					setState(473);
					match(RR_BRACKET);
					}
				}

				setState(477);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(476);
					match(UNSIGNED);
					}
				}

				setState(480);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(479);
					match(ZEROFILL);
					}
				}

				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(SMALLINT);
				setState(486);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(483);
					match(LR_BRACKET);
					setState(484);
					match(DECIMAL_LITERAL);
					setState(485);
					match(RR_BRACKET);
					}
				}

				setState(489);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(488);
					match(UNSIGNED);
					}
				}

				setState(492);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(491);
					match(ZEROFILL);
					}
				}

				}
				break;
			case MEDIUMINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(494);
				match(MEDIUMINT);
				setState(498);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(495);
					match(LR_BRACKET);
					setState(496);
					match(DECIMAL_LITERAL);
					setState(497);
					match(RR_BRACKET);
					}
				}

				setState(501);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(500);
					match(UNSIGNED);
					}
				}

				setState(504);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(503);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				match(INT);
				setState(510);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(507);
					match(LR_BRACKET);
					setState(508);
					match(DECIMAL_LITERAL);
					setState(509);
					match(RR_BRACKET);
					}
				}

				setState(513);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(512);
					match(UNSIGNED);
					}
				}

				setState(516);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(515);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 6);
				{
				setState(518);
				match(INTEGER);
				setState(522);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(519);
					match(LR_BRACKET);
					setState(520);
					match(DECIMAL_LITERAL);
					setState(521);
					match(RR_BRACKET);
					}
				}

				setState(525);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(524);
					match(UNSIGNED);
					}
				}

				setState(528);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(527);
					match(ZEROFILL);
					}
				}

				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(530);
				match(BIGINT);
				setState(534);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(531);
					match(LR_BRACKET);
					setState(532);
					match(DECIMAL_LITERAL);
					setState(533);
					match(RR_BRACKET);
					}
				}

				setState(537);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(536);
					match(UNSIGNED);
					}
				}

				setState(540);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(539);
					match(ZEROFILL);
					}
				}

				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(542);
				match(REAL);
				setState(548);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(543);
					match(LR_BRACKET);
					setState(544);
					match(DECIMAL_LITERAL);
					setState(545);
					match(COMMA);
					setState(546);
					match(DECIMAL_LITERAL);
					setState(547);
					match(RR_BRACKET);
					}
				}

				setState(551);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(550);
					match(UNSIGNED);
					}
				}

				setState(554);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(553);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(556);
				match(DOUBLE);
				setState(562);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(557);
					match(LR_BRACKET);
					setState(558);
					match(DECIMAL_LITERAL);
					setState(559);
					match(COMMA);
					setState(560);
					match(DECIMAL_LITERAL);
					setState(561);
					match(RR_BRACKET);
					}
				}

				setState(565);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(564);
					match(UNSIGNED);
					}
				}

				setState(568);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(567);
					match(ZEROFILL);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(570);
				match(FLOAT);
				setState(576);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(571);
					match(LR_BRACKET);
					setState(572);
					match(DECIMAL_LITERAL);
					setState(573);
					match(COMMA);
					setState(574);
					match(DECIMAL_LITERAL);
					setState(575);
					match(RR_BRACKET);
					}
				}

				setState(579);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(578);
					match(UNSIGNED);
					}
				}

				setState(582);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(581);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(584);
				match(DECIMAL);
				setState(592);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(585);
					match(LR_BRACKET);
					setState(586);
					match(DECIMAL_LITERAL);
					setState(589);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(587);
						match(COMMA);
						setState(588);
						match(DECIMAL_LITERAL);
						}
					}

					setState(591);
					match(RR_BRACKET);
					}
				}

				setState(595);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(594);
					match(UNSIGNED);
					}
				}

				setState(598);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(597);
					match(ZEROFILL);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 12);
				{
				setState(600);
				match(NUMERIC);
				setState(608);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(601);
					match(LR_BRACKET);
					setState(602);
					match(DECIMAL_LITERAL);
					setState(605);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(603);
						match(COMMA);
						setState(604);
						match(DECIMAL_LITERAL);
						}
					}

					setState(607);
					match(RR_BRACKET);
					}
				}

				setState(611);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(610);
					match(UNSIGNED);
					}
				}

				setState(614);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(613);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 13);
				{
				setState(616);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(617);
				match(TIME);
				setState(621);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(618);
					match(LR_BRACKET);
					setState(619);
					match(DECIMAL_LITERAL);
					setState(620);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 15);
				{
				setState(623);
				match(TIMESTAMP);
				setState(627);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(624);
					match(LR_BRACKET);
					setState(625);
					match(DECIMAL_LITERAL);
					setState(626);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(629);
				match(DATETIME);
				setState(633);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(630);
					match(LR_BRACKET);
					setState(631);
					match(DECIMAL_LITERAL);
					setState(632);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(635);
				match(YEAR);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(636);
				match(CHAR);
				setState(640);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(637);
					match(LR_BRACKET);
					setState(638);
					match(DECIMAL_LITERAL);
					setState(639);
					match(RR_BRACKET);
					}
				}

				setState(643);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(642);
					match(BINARY);
					}
				}

				setState(648);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(645);
					match(CHARACTER);
					setState(646);
					match(SET);
					setState(647);
					id();
					}
				}

				setState(652);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(650);
					match(COLLATE);
					setState(651);
					id();
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(654);
				match(VARCHAR);
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
			case BINARY:
				enterOuterAlt(_localctx, 20);
				{
				setState(672);
				match(BINARY);
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

				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 21);
				{
				setState(678);
				match(VARBINARY);
				setState(682);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(679);
					match(LR_BRACKET);
					setState(680);
					match(DECIMAL_LITERAL);
					setState(681);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 22);
				{
				setState(684);
				match(BOOLEAN);
				}
				break;
			case TINYBLOB:
				enterOuterAlt(_localctx, 23);
				{
				setState(685);
				match(TINYBLOB);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 24);
				{
				setState(686);
				match(BLOB);
				}
				break;
			case MEDIUMBLOB:
				enterOuterAlt(_localctx, 25);
				{
				setState(687);
				match(MEDIUMBLOB);
				}
				break;
			case LONGBLOB:
				enterOuterAlt(_localctx, 26);
				{
				setState(688);
				match(LONGBLOB);
				}
				break;
			case TINYTEXT:
				enterOuterAlt(_localctx, 27);
				{
				setState(689);
				match(TINYTEXT);
				setState(691);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(690);
					match(BINARY);
					}
				}

				setState(696);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(693);
					match(CHARACTER);
					setState(694);
					match(SET);
					setState(695);
					id();
					}
				}

				setState(700);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(698);
					match(COLLATE);
					setState(699);
					id();
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(702);
				match(TEXT);
				setState(704);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(703);
					match(BINARY);
					}
				}

				setState(709);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(706);
					match(CHARACTER);
					setState(707);
					match(SET);
					setState(708);
					id();
					}
				}

				setState(713);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(711);
					match(COLLATE);
					setState(712);
					id();
					}
				}

				}
				break;
			case MEDIUMTEXT:
				enterOuterAlt(_localctx, 29);
				{
				setState(715);
				match(MEDIUMTEXT);
				setState(717);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(716);
					match(BINARY);
					}
				}

				setState(722);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(719);
					match(CHARACTER);
					setState(720);
					match(SET);
					setState(721);
					id();
					}
				}

				setState(726);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(724);
					match(COLLATE);
					setState(725);
					id();
					}
				}

				}
				break;
			case LONGTEXT:
				enterOuterAlt(_localctx, 30);
				{
				setState(728);
				match(LONGTEXT);
				setState(730);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(729);
					match(BINARY);
					}
				}

				setState(735);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(732);
					match(CHARACTER);
					setState(733);
					match(SET);
					setState(734);
					id();
					}
				}

				setState(739);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(737);
					match(COLLATE);
					setState(738);
					id();
					}
				}

				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 31);
				{
				setState(741);
				match(ENUM);
				{
				setState(742);
				match(LR_BRACKET);
				setState(743);
				id();
				setState(746);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(744);
					match(COMMA);
					setState(745);
					id();
					}
				}

				setState(748);
				match(RR_BRACKET);
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
			case SET:
				enterOuterAlt(_localctx, 32);
				{
				setState(759);
				match(SET);
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
			case JSON:
				enterOuterAlt(_localctx, 33);
				{
				setState(777);
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
		enterRule(_localctx, 78, RULE_default_value);
		try {
			setState(782);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
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
				setState(781);
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
		enterRule(_localctx, 80, RULE_constant);
		int _la;
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				match(BINARY_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(787);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(786);
					sign();
					}
				}

				setState(789);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(791);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(790);
					sign();
					}
				}

				setState(793);
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
				setState(795);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(794);
					sign();
					}
				}

				setState(797);
				((ConstantContext)_localctx).dollar = match(DOLLAR);
				setState(798);
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
		enterRule(_localctx, 82, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
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
		enterRule(_localctx, 84, RULE_id);
		try {
			setState(806);
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
				setState(803);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case LEFT_QUOTE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
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
		enterRule(_localctx, 86, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
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
		enterRule(_localctx, 88, RULE_comparison_operator);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(811);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(812);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(813);
				match(LESS);
				setState(814);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(815);
				match(GREATER);
				setState(816);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(817);
				match(LESS);
				setState(818);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(819);
				match(EXCLAMATION);
				setState(820);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(821);
				match(EXCLAMATION);
				setState(822);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(823);
				match(EXCLAMATION);
				setState(824);
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
		enterRule(_localctx, 90, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
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
		enterRule(_localctx, 92, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			match(DECIMAL_LITERAL);
			setState(831);
			_la = _input.LA(1);
			if (((((_la - 270)) & ~0x3f) == 0 && ((1L << (_la - 270)) & ((1L << (GB - 270)) | (1L << (KB - 270)) | (1L << (MB - 270)))) != 0) || _la==TB || _la==MODULE) {
				{
				setState(830);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01e0\u0344\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\7\2b\n\2\f\2\16\2e\13\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\6\4n\n\4\r\4\16\4o\3\5\3\5\3\5\3\5\3\5\5\5w\n\5\3\6"+
		"\3\6\5\6{\n\6\3\6\5\6~\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0087\n\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0092\n\7\f\7\16\7\u0095\13\7\3"+
		"\7\3\7\5\7\u0099\n\7\3\7\5\7\u009c\n\7\3\b\3\b\3\b\5\b\u00a1\n\b\3\t\5"+
		"\t\u00a4\n\t\3\t\3\t\5\t\u00a8\n\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u00b0"+
		"\n\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\5\16\u00c1\n\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\16\5\16\u00c9\n\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00cf\n\17\3\17\3\17\3\20\3\20\5\20\u00d5\n\20"+
		"\3\21\3\21\3\21\5\21\u00da\n\21\3\21\5\21\u00dd\n\21\3\21\5\21\u00e0\n"+
		"\21\3\21\3\21\5\21\u00e4\n\21\5\21\u00e6\n\21\3\21\3\21\5\21\u00ea\n\21"+
		"\3\22\3\22\3\22\5\22\u00ef\n\22\3\22\3\22\3\22\5\22\u00f4\n\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0101\n\24\3\25"+
		"\3\25\5\25\u0105\n\25\3\25\5\25\u0108\n\25\3\25\3\25\3\25\5\25\u010d\n"+
		"\25\3\25\5\25\u0110\n\25\3\26\3\26\5\26\u0114\n\26\3\26\3\26\3\26\5\26"+
		"\u0119\n\26\3\26\5\26\u011c\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0123\n"+
		"\26\3\26\3\26\5\26\u0127\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u012e\n\26"+
		"\3\26\3\26\5\26\u0132\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0139\n\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0147"+
		"\n\27\f\27\16\27\u014a\13\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0152"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0159\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0165\n\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u016c\n\32\3\32\3\32\3\33\3\33\3\33\5\33\u0173\n\33\3\33\3\33\3\33\3"+
		"\33\3\33\5\33\u017a\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u0181\n\34\3\34"+
		"\3\34\3\35\3\35\3\35\5\35\u0188\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u018f"+
		"\n\35\3\35\3\35\3\36\3\36\5\36\u0195\n\36\3\37\3\37\3\37\5\37\u019a\n"+
		"\37\3\37\3\37\3 \3 \3 \7 \u01a1\n \f \16 \u01a4\13 \3!\3!\5!\u01a8\n!"+
		"\3!\3!\3!\5!\u01ad\n!\7!\u01af\n!\f!\16!\u01b2\13!\3\"\3\"\5\"\u01b6\n"+
		"\"\3#\3#\3$\3$\3%\5%\u01bd\n%\3%\3%\3&\3&\3&\3&\3&\5&\u01c6\n&\3\'\3\'"+
		"\5\'\u01ca\n\'\3\'\3\'\3\'\3\'\5\'\u01d0\n\'\3\'\5\'\u01d3\n\'\3(\3(\5"+
		"(\u01d7\n(\3(\3(\3(\3(\5(\u01dd\n(\3(\5(\u01e0\n(\3(\5(\u01e3\n(\3(\3"+
		"(\3(\3(\5(\u01e9\n(\3(\5(\u01ec\n(\3(\5(\u01ef\n(\3(\3(\3(\3(\5(\u01f5"+
		"\n(\3(\5(\u01f8\n(\3(\5(\u01fb\n(\3(\3(\3(\3(\5(\u0201\n(\3(\5(\u0204"+
		"\n(\3(\5(\u0207\n(\3(\3(\3(\3(\5(\u020d\n(\3(\5(\u0210\n(\3(\5(\u0213"+
		"\n(\3(\3(\3(\3(\5(\u0219\n(\3(\5(\u021c\n(\3(\5(\u021f\n(\3(\3(\3(\3("+
		"\3(\3(\5(\u0227\n(\3(\5(\u022a\n(\3(\5(\u022d\n(\3(\3(\3(\3(\3(\3(\5("+
		"\u0235\n(\3(\5(\u0238\n(\3(\5(\u023b\n(\3(\3(\3(\3(\3(\3(\5(\u0243\n("+
		"\3(\5(\u0246\n(\3(\5(\u0249\n(\3(\3(\3(\3(\3(\5(\u0250\n(\3(\5(\u0253"+
		"\n(\3(\5(\u0256\n(\3(\5(\u0259\n(\3(\3(\3(\3(\3(\5(\u0260\n(\3(\5(\u0263"+
		"\n(\3(\5(\u0266\n(\3(\5(\u0269\n(\3(\3(\3(\3(\3(\5(\u0270\n(\3(\3(\3("+
		"\3(\5(\u0276\n(\3(\3(\3(\3(\5(\u027c\n(\3(\3(\3(\3(\3(\5(\u0283\n(\3("+
		"\5(\u0286\n(\3(\3(\3(\5(\u028b\n(\3(\3(\5(\u028f\n(\3(\3(\3(\3(\5(\u0295"+
		"\n(\3(\5(\u0298\n(\3(\3(\3(\5(\u029d\n(\3(\3(\5(\u02a1\n(\3(\3(\3(\3("+
		"\5(\u02a7\n(\3(\3(\3(\3(\5(\u02ad\n(\3(\3(\3(\3(\3(\3(\3(\5(\u02b6\n("+
		"\3(\3(\3(\5(\u02bb\n(\3(\3(\5(\u02bf\n(\3(\3(\5(\u02c3\n(\3(\3(\3(\5("+
		"\u02c8\n(\3(\3(\5(\u02cc\n(\3(\3(\5(\u02d0\n(\3(\3(\3(\5(\u02d5\n(\3("+
		"\3(\5(\u02d9\n(\3(\3(\5(\u02dd\n(\3(\3(\3(\5(\u02e2\n(\3(\3(\5(\u02e6"+
		"\n(\3(\3(\3(\3(\3(\5(\u02ed\n(\3(\3(\3(\3(\3(\5(\u02f4\n(\3(\3(\5(\u02f8"+
		"\n(\3(\3(\3(\3(\3(\5(\u02ff\n(\3(\3(\3(\3(\3(\5(\u0306\n(\3(\3(\5(\u030a"+
		"\n(\3(\5(\u030d\n(\3)\3)\5)\u0311\n)\3*\3*\3*\5*\u0316\n*\3*\3*\5*\u031a"+
		"\n*\3*\3*\5*\u031e\n*\3*\3*\5*\u0322\n*\3+\3+\3,\3,\3,\5,\u0329\n,\3-"+
		"\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u033c\n.\3/\3/\3\60"+
		"\3\60\5\60\u0342\n\60\3\60\2\2\61\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^\2\r\4\2\13\13\67\67\4\2"+
		"\u0085\u0085\u00b5\u00b5\4\2ssuu\4\2\34\34ll\4\2\u012b\u012b\u01bc\u01bc"+
		"\3\2\u01c0\u01c1\4\2\u01bc\u01bc\u01c0\u01c0\3\2\u01db\u01dc.\2KK\u00c6"+
		"\u00c6\u00ce\u00ce\u00d0\u00d0\u00d7\u00d8\u00db\u00dd\u00e2\u00e2\u00e4"+
		"\u00e4\u00e6\u00e6\u00e8\u00eb\u00f7\u00f7\u00f9\u00fa\u00fc\u00fc\u00ff"+
		"\u00ff\u0102\u0102\u0104\u0106\u010a\u010f\u0111\u0114\u0116\u0116\u0119"+
		"\u0119\u011b\u011b\u011d\u011f\u0121\u012d\u0131\u0131\u0135\u0135\u0137"+
		"\u0137\u013a\u013c\u013e\u013e\u0140\u0141\u0144\u014b\u014d\u0152\u0154"+
		"\u0156\u0158\u0158\u015a\u015a\u015d\u015f\u0161\u016a\u016c\u016d\u016f"+
		"\u016f\u0172\u0178\u017c\u017f\u0183\u0183\u0185\u0189\u018b\u0192\u01bd"+
		"\u01bd\3\2\u01c6\u01cd\7\2\u0110\u0110\u0120\u0120\u012f\u012f\u017b\u017b"+
		"\u01da\u01da\u03d7\2c\3\2\2\2\4h\3\2\2\2\6m\3\2\2\2\bv\3\2\2\2\nx\3\2"+
		"\2\2\f\u008a\3\2\2\2\16\u009d\3\2\2\2\20\u00a3\3\2\2\2\22\u00ab\3\2\2"+
		"\2\24\u00ad\3\2\2\2\26\u00b3\3\2\2\2\30\u00b6\3\2\2\2\32\u00bc\3\2\2\2"+
		"\34\u00ca\3\2\2\2\36\u00d4\3\2\2\2 \u00d6\3\2\2\2\"\u00eb\3\2\2\2$\u00f7"+
		"\3\2\2\2&\u0100\3\2\2\2(\u0104\3\2\2\2*\u0138\3\2\2\2,\u013a\3\2\2\2."+
		"\u014b\3\2\2\2\60\u0153\3\2\2\2\62\u016b\3\2\2\2\64\u0179\3\2\2\2\66\u0180"+
		"\3\2\2\28\u018e\3\2\2\2:\u0194\3\2\2\2<\u0199\3\2\2\2>\u019d\3\2\2\2@"+
		"\u01a5\3\2\2\2B\u01b5\3\2\2\2D\u01b7\3\2\2\2F\u01b9\3\2\2\2H\u01bc\3\2"+
		"\2\2J\u01c5\3\2\2\2L\u01c7\3\2\2\2N\u030c\3\2\2\2P\u0310\3\2\2\2R\u0321"+
		"\3\2\2\2T\u0323\3\2\2\2V\u0328\3\2\2\2X\u032a\3\2\2\2Z\u033b\3\2\2\2\\"+
		"\u033d\3\2\2\2^\u033f\3\2\2\2`b\5\4\3\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hi\5\6\4\2i\5\3\2\2"+
		"\2jk\5\b\5\2kl\7\u01d6\2\2ln\3\2\2\2mj\3\2\2\2no\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2p\7\3\2\2\2qw\5\n\6\2rw\5\f\7\2sw\5\30\r\2tw\5\32\16\2uw\5\34\17"+
		"\2vq\3\2\2\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2\2\2w\t\3\2\2\2xz\7(\2"+
		"\2y{\7\u00b5\2\2zy\3\2\2\2z{\3\2\2\2{}\3\2\2\2|~\5F$\2}|\3\2\2\2}~\3\2"+
		"\2\2~\177\3\2\2\2\177\u0080\7[\2\2\u0080\u0081\5V,\2\u0081\u0082\7u\2"+
		"\2\u0082\u0083\5\64\33\2\u0083\u0084\7\u01d3\2\2\u0084\u0086\5> \2\u0085"+
		"\u0087\t\2\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0089\7\u01d4\2\2\u0089\13\3\2\2\2\u008a\u008b\7(\2\2\u008b"+
		"\u008c\7\u00a8\2\2\u008c\u008d\5\64\33\2\u008d\u008e\7\u01d3\2\2\u008e"+
		"\u0093\5\36\20\2\u008f\u0090\7\u01d5\2\2\u0090\u0092\5\36\20\2\u0091\u008f"+
		"\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\u01d4\2\2\u0097\u0099"+
		"\5\16\b\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2"+
		"\u009a\u009c\5\24\13\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\r"+
		"\3\2\2\2\u009d\u00a0\5\20\t\2\u009e\u009f\7\u01d5\2\2\u009f\u00a1\5\16"+
		"\b\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\17\3\2\2\2\u00a2\u00a4"+
		"\7\64\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5\u00a7\7\u00e0\2\2\u00a6\u00a8\7\u01c2\2\2\u00a7\u00a6\3\2\2\2\u00a7"+
		"\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\5\22\n\2\u00aa\21\3\2\2"+
		"\2\u00ab\u00ac\7\3\2\2\u00ac\23\3\2\2\2\u00ad\u00af\7\u00e3\2\2\u00ae"+
		"\u00b0\7\u01c2\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\7\u01be\2\2\u00b2\25\3\2\2\2\u00b3\u00b4\7\u00e3"+
		"\2\2\u00b4\u00b5\7\u01be\2\2\u00b5\27\3\2\2\2\u00b6\u00b7\7\7\2\2\u00b7"+
		"\u00b8\7\u00a8\2\2\u00b8\u00b9\5\64\33\2\u00b9\u00ba\7\5\2\2\u00ba\u00bb"+
		"\5\36\20\2\u00bb\31\3\2\2\2\u00bc\u00bd\7;\2\2\u00bd\u00c0\7[\2\2\u00be"+
		"\u00bf\7Y\2\2\u00bf\u00c1\7C\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\5V,\2\u00c3\u00c4\7u\2\2\u00c4\u00c6"+
		"\5\64\33\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2"+
		"\u00c7\u00c9\7\u01d6\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\33\3\2\2\2\u00ca\u00cb\7;\2\2\u00cb\u00ce\7\u00a8\2\2\u00cc\u00cd\7Y"+
		"\2\2\u00cd\u00cf\7C\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\5\64\33\2\u00d1\35\3\2\2\2\u00d2\u00d5\5 \21"+
		"\2\u00d3\u00d5\5*\26\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\37"+
		"\3\2\2\2\u00d6\u00d7\5V,\2\u00d7\u00d9\5N(\2\u00d8\u00da\5H%\2\u00d9\u00d8"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\5$\23\2\u00dc"+
		"\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00e0\7\r"+
		"\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e5\3\2\2\2\u00e1"+
		"\u00e3\t\3\2\2\u00e2\u00e4\7b\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e8\7\u00e3\2\2\u00e8\u00ea\7\u01be\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea!\3\2\2\2\u00eb\u00ec\5V,\2\u00ec\u00ee"+
		"\5N(\2\u00ed\u00ef\5H%\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f3\3\2\2\2\u00f0\u00f1\7\64\2\2\u00f1\u00f4\5&\24\2\u00f2\u00f4\7"+
		"\r\2\2\u00f3\u00f0\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\5\26\f\2\u00f6#\3\2\2\2\u00f7\u00f8\7\64\2"+
		"\2\u00f8\u00f9\5&\24\2\u00f9%\3\2\2\2\u00fa\u0101\7p\2\2\u00fb\u0101\5"+
		"R*\2\u00fc\u00fd\7\u01d3\2\2\u00fd\u00fe\5&\24\2\u00fe\u00ff\7\u01d4\2"+
		"\2\u00ff\u0101\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fb\3\2\2\2\u0100\u00fc"+
		"\3\2\2\2\u0101\'\3\2\2\2\u0102\u0103\7\"\2\2\u0103\u0105\5V,\2\u0104\u0102"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\5H%\2\u0107"+
		"\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010c\3\2\2\2\u0109\u010a\7\u0085"+
		"\2\2\u010a\u010d\7b\2\2\u010b\u010d\7\u00b5\2\2\u010c\u0109\3\2\2\2\u010c"+
		"\u010b\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110\5F$\2\u010f\u010e\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110)\3\2\2\2\u0111\u0112\7\"\2\2\u0112\u0114"+
		"\5V,\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0118\3\2\2\2\u0115"+
		"\u0116\7\u0085\2\2\u0116\u0119\7b\2\2\u0117\u0119\7\u00b5\2\2\u0118\u0115"+
		"\3\2\2\2\u0118\u0117\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u011c\5F$\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\u01d3"+
		"\2\2\u011e\u011f\5@!\2\u011f\u0120\7\u01d4\2\2\u0120\u0139\3\2\2\2\u0121"+
		"\u0123\7\u00b5\2\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0126\7b\2\2\u0125\u0127\5V,\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\u01d3\2\2\u0129\u012a"+
		"\5@!\2\u012a\u012b\7\u01d4\2\2\u012b\u0139\3\2\2\2\u012c\u012e\7\u00b5"+
		"\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\7[\2\2\u0130\u0132\5V,\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0134\7\u01d3\2\2\u0134\u0135\5@!\2\u0135"+
		"\u0136\7\u01d4\2\2\u0136\u0139\3\2\2\2\u0137\u0139\5,\27\2\u0138\u0113"+
		"\3\2\2\2\u0138\u0122\3\2\2\2\u0138\u012d\3\2\2\2\u0138\u0137\3\2\2\2\u0139"+
		"+\3\2\2\2\u013a\u013b\7L\2\2\u013b\u013c\7b\2\2\u013c\u013d\7\u01d3\2"+
		"\2\u013d\u013e\5> \2\u013e\u013f\7\u01d4\2\2\u013f\u0140\7\u008e\2\2\u0140"+
		"\u0141\5V,\2\u0141\u0142\7\u01d3\2\2\u0142\u0143\5> \2\u0143\u0148\7\u01d4"+
		"\2\2\u0144\u0147\5.\30\2\u0145\u0147\5\60\31\2\u0146\u0144\3\2\2\2\u0146"+
		"\u0145\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149-\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014c\7u\2\2\u014c\u0151"+
		"\7\65\2\2\u014d\u0152\7\25\2\2\u014e\u0152\7\u0091\2\2\u014f\u0150\7n"+
		"\2\2\u0150\u0152\7\4\2\2\u0151\u014d\3\2\2\2\u0151\u014e\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0152/\3\2\2\2\u0153\u0154\7u\2\2\u0154\u0158\7\u00b8\2"+
		"\2\u0155\u0159\7\u0091\2\2\u0156\u0157\7n\2\2\u0157\u0159\7\4\2\2\u0158"+
		"\u0155\3\2\2\2\u0158\u0156\3\2\2\2\u0159\61\3\2\2\2\u015a\u015b\5V,\2"+
		"\u015b\u015c\7\u01ce\2\2\u015c\u015d\5V,\2\u015d\u015e\7\u01ce\2\2\u015e"+
		"\u015f\5V,\2\u015f\u0160\7\u01ce\2\2\u0160\u016c\3\2\2\2\u0161\u0162\5"+
		"V,\2\u0162\u0164\7\u01ce\2\2\u0163\u0165\5V,\2\u0164\u0163\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7\u01ce\2\2\u0167\u016c"+
		"\3\2\2\2\u0168\u0169\5V,\2\u0169\u016a\7\u01ce\2\2\u016a\u016c\3\2\2\2"+
		"\u016b\u015a\3\2\2\2\u016b\u0161\3\2\2\2\u016b\u0168\3\2\2\2\u016b\u016c"+
		"\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\5V,\2\u016e\63\3\2\2\2\u016f"+
		"\u0170\5V,\2\u0170\u0172\7\u01ce\2\2\u0171\u0173\5V,\2\u0172\u0171\3\2"+
		"\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\u01ce\2\2\u0175"+
		"\u017a\3\2\2\2\u0176\u0177\5V,\2\u0177\u0178\7\u01ce\2\2\u0178\u017a\3"+
		"\2\2\2\u0179\u016f\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\5V,\2\u017c\65\3\2\2\2\u017d\u017e\5V,\2\u017e"+
		"\u017f\7\u01ce\2\2\u017f\u0181\3\2\2\2\u0180\u017d\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5V,\2\u0183\67\3\2\2\2\u0184"+
		"\u0185\5V,\2\u0185\u0187\7\u01ce\2\2\u0186\u0188\5V,\2\u0187\u0186\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\7\u01ce\2\2\u018a"+
		"\u018f\3\2\2\2\u018b\u018c\5V,\2\u018c\u018d\7\u01ce\2\2\u018d\u018f\3"+
		"\2\2\2\u018e\u0184\3\2\2\2\u018e\u018b\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u0191\5V,\2\u01919\3\2\2\2\u0192\u0195\5\62\32\2"+
		"\u0193\u0195\7\u01bb\2\2\u0194\u0192\3\2\2\2\u0194\u0193\3\2\2\2\u0195"+
		";\3\2\2\2\u0196\u0197\5\64\33\2\u0197\u0198\7\u01ce\2\2\u0198\u019a\3"+
		"\2\2\2\u0199\u0196\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		"\u019c\5V,\2\u019c=\3\2\2\2\u019d\u01a2\5V,\2\u019e\u019f\7\u01d5\2\2"+
		"\u019f\u01a1\5V,\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0"+
		"\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3?\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5"+
		"\u01a7\5V,\2\u01a6\u01a8\t\2\2\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8\3\2\2"+
		"\2\u01a8\u01b0\3\2\2\2\u01a9\u01aa\7\u01d5\2\2\u01aa\u01ac\5V,\2\u01ab"+
		"\u01ad\t\2\2\2\u01ac\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01a9\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1A\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\5V,\2\u01b4"+
		"\u01b6\7\u01bb\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6C\3\2"+
		"\2\2\u01b7\u01b8\t\4\2\2\u01b8E\3\2\2\2\u01b9\u01ba\t\5\2\2\u01baG\3\2"+
		"\2\2\u01bb\u01bd\7o\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be\u01bf\7p\2\2\u01bfI\3\2\2\2\u01c0\u01c6\58\35\2\u01c1"+
		"\u01c6\7\u0095\2\2\u01c2\u01c6\7d\2\2\u01c3\u01c6\7\u00d9\2\2\u01c4\u01c6"+
		"\7\u00e1\2\2\u01c5\u01c0\3\2\2\2\u01c5\u01c1\3\2\2\2\u01c5\u01c2\3\2\2"+
		"\2\u01c5\u01c3\3\2\2\2\u01c5\u01c4\3\2\2\2\u01c6K\3\2\2\2\u01c7\u01c9"+
		"\5V,\2\u01c8\u01ca\7V\2\2\u01c9\u01c8\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01d2\3\2\2\2\u01cb\u01cc\7\u01d3\2\2\u01cc\u01cf\t\6\2\2\u01cd\u01ce"+
		"\7\u01d5\2\2\u01ce\u01d0\7\u01bc\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3"+
		"\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\7\u01d4\2\2\u01d2\u01cb\3\2\2\2"+
		"\u01d2\u01d3\3\2\2\2\u01d3M\3\2\2\2\u01d4\u01d6\7\u0195\2\2\u01d5\u01d7"+
		"\7\u01bc\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u030d\3\2\2"+
		"\2\u01d8\u01dc\7\u0198\2\2\u01d9\u01da\7\u01d3\2\2\u01da\u01db\7\u01bc"+
		"\2\2\u01db\u01dd\7\u01d4\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01df\3\2\2\2\u01de\u01e0\7\u00b7\2\2\u01df\u01de\3\2\2\2\u01df\u01e0"+
		"\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\7\u0193\2\2\u01e2\u01e1\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u030d\3\2\2\2\u01e4\u01e8\7\u0199\2\2\u01e5"+
		"\u01e6\7\u01d3\2\2\u01e6\u01e7\7\u01bc\2\2\u01e7\u01e9\7\u01d4\2\2\u01e8"+
		"\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\7\u00b7"+
		"\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed"+
		"\u01ef\7\u0193\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u030d"+
		"\3\2\2\2\u01f0\u01f4\7\u019a\2\2\u01f1\u01f2\7\u01d3\2\2\u01f2\u01f3\7"+
		"\u01bc\2\2\u01f3\u01f5\7\u01d4\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f5\3\2"+
		"\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f8\7\u00b7\2\2\u01f7\u01f6\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\7\u0193\2\2\u01fa\u01f9"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u030d\3\2\2\2\u01fc\u0200\7\u019b\2"+
		"\2\u01fd\u01fe\7\u01d3\2\2\u01fe\u01ff\7\u01bc\2\2\u01ff\u0201\7\u01d4"+
		"\2\2\u0200\u01fd\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u0204\7\u00b7\2\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206"+
		"\3\2\2\2\u0205\u0207\7\u0193\2\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2"+
		"\2\u0207\u030d\3\2\2\2\u0208\u020c\7\u019c\2\2\u0209\u020a\7\u01d3\2\2"+
		"\u020a\u020b\7\u01bc\2\2\u020b\u020d\7\u01d4\2\2\u020c\u0209\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0210\7\u00b7\2\2\u020f\u020e"+
		"\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u0213\7\u0193\2"+
		"\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u030d\3\2\2\2\u0214\u0218"+
		"\7\u019d\2\2\u0215\u0216\7\u01d3\2\2\u0216\u0217\7\u01bc\2\2\u0217\u0219"+
		"\7\u01d4\2\2\u0218\u0215\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2"+
		"\2\u021a\u021c\7\u00b7\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c"+
		"\u021e\3\2\2\2\u021d\u021f\7\u0193\2\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u030d\3\2\2\2\u0220\u0226\7\u019e\2\2\u0221\u0222\7\u01d3"+
		"\2\2\u0222\u0223\7\u01bc\2\2\u0223\u0224\7\u01d5\2\2\u0224\u0225\7\u01bc"+
		"\2\2\u0225\u0227\7\u01d4\2\2\u0226\u0221\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0229\3\2\2\2\u0228\u022a\7\u00b7\2\2\u0229\u0228\3\2\2\2\u0229\u022a"+
		"\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u022d\7\u0193\2\2\u022c\u022b\3\2\2"+
		"\2\u022c\u022d\3\2\2\2\u022d\u030d\3\2\2\2\u022e\u0234\7\u01a0\2\2\u022f"+
		"\u0230\7\u01d3\2\2\u0230\u0231\7\u01bc\2\2\u0231\u0232\7\u01d5\2\2\u0232"+
		"\u0233\7\u01bc\2\2\u0233\u0235\7\u01d4\2\2\u0234\u022f\3\2\2\2\u0234\u0235"+
		"\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0238\7\u00b7\2\2\u0237\u0236\3\2\2"+
		"\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u023b\7\u0193\2\2\u023a"+
		"\u0239\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u030d\3\2\2\2\u023c\u0242\7\u019f"+
		"\2\2\u023d\u023e\7\u01d3\2\2\u023e\u023f\7\u01bc\2\2\u023f\u0240\7\u01d5"+
		"\2\2\u0240\u0241\7\u01bc\2\2\u0241\u0243\7\u01d4\2\2\u0242\u023d\3\2\2"+
		"\2\u0242\u0243\3\2\2\2\u0243\u0245\3\2\2\2\u0244\u0246\7\u00b7\2\2\u0245"+
		"\u0244\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0248\3\2\2\2\u0247\u0249\7\u0193"+
		"\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u030d\3\2\2\2\u024a"+
		"\u0252\7\u01a1\2\2\u024b\u024c\7\u01d3\2\2\u024c\u024f\7\u01bc\2\2\u024d"+
		"\u024e\7\u01d5\2\2\u024e\u0250\7\u01bc\2\2\u024f\u024d\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0253\7\u01d4\2\2\u0252\u024b\3\2\2"+
		"\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0256\7\u00b7\2\2\u0255"+
		"\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u0259\7\u0193"+
		"\2\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u030d\3\2\2\2\u025a"+
		"\u0262\7\u01a2\2\2\u025b\u025c\7\u01d3\2\2\u025c\u025f\7\u01bc\2\2\u025d"+
		"\u025e\7\u01d5\2\2\u025e\u0260\7\u01bc\2\2\u025f\u025d\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0263\7\u01d4\2\2\u0262\u025b\3\2\2"+
		"\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0266\7\u00b7\2\2\u0265"+
		"\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0269\7\u0193"+
		"\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u030d\3\2\2\2\u026a"+
		"\u030d\7\u01a3\2\2\u026b\u026f\7\u017f\2\2\u026c\u026d\7\u01d3\2\2\u026d"+
		"\u026e\7\u01bc\2\2\u026e\u0270\7\u01d4\2\2\u026f\u026c\3\2\2\2\u026f\u0270"+
		"\3\2\2\2\u0270\u030d\3\2\2\2\u0271\u0275\7\u01a5\2\2\u0272\u0273\7\u01d3"+
		"\2\2\u0273\u0274\7\u01bc\2\2\u0274\u0276\7\u01d4\2\2\u0275\u0272\3\2\2"+
		"\2\u0275\u0276\3\2\2\2\u0276\u030d\3\2\2\2\u0277\u027b\7\u01a4\2\2\u0278"+
		"\u0279\7\u01d3\2\2\u0279\u027a\7\u01bc\2\2\u027a\u027c\7\u01d4\2\2\u027b"+
		"\u0278\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u030d\3\2\2\2\u027d\u030d\7\u01a6"+
		"\2\2\u027e\u0282\7\u01a7\2\2\u027f\u0280\7\u01d3\2\2\u0280\u0281\7\u01bc"+
		"\2\2\u0281\u0283\7\u01d4\2\2\u0282\u027f\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0285\3\2\2\2\u0284\u0286\7\u0196\2\2\u0285\u0284\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u028a\3\2\2\2\u0287\u0288\7\u01a8\2\2\u0288\u0289\7\u00a2"+
		"\2\2\u0289\u028b\5V,\2\u028a\u0287\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028e"+
		"\3\2\2\2\u028c\u028d\7\36\2\2\u028d\u028f\5V,\2\u028e\u028c\3\2\2\2\u028e"+
		"\u028f\3\2\2\2\u028f\u030d\3\2\2\2\u0290\u0294\7\u01a9\2\2\u0291\u0292"+
		"\7\u01d3\2\2\u0292\u0293\7\u01bc\2\2\u0293\u0295\7\u01d4\2\2\u0294\u0291"+
		"\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0297\3\2\2\2\u0296\u0298\7\u0196\2"+
		"\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u029c\3\2\2\2\u0299\u029a"+
		"\7\u01a8\2\2\u029a\u029b\7\u00a2\2\2\u029b\u029d\5V,\2\u029c\u0299\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029f\7\36\2\2\u029f"+
		"\u02a1\5V,\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u030d\3\2\2"+
		"\2\u02a2\u02a6\7\u0196\2\2\u02a3\u02a4\7\u01d3\2\2\u02a4\u02a5\7\u01bc"+
		"\2\2\u02a5\u02a7\7\u01d4\2\2\u02a6\u02a3\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u030d\3\2\2\2\u02a8\u02ac\7\u01aa\2\2\u02a9\u02aa\7\u01d3\2\2\u02aa\u02ab"+
		"\7\u01bc\2\2\u02ab\u02ad\7\u01d4\2\2\u02ac\u02a9\3\2\2\2\u02ac\u02ad\3"+
		"\2\2\2\u02ad\u030d\3\2\2\2\u02ae\u030d\7\u0197\2\2\u02af\u030d\7\u01ab"+
		"\2\2\u02b0\u030d\7\u01ac\2\2\u02b1\u030d\7\u01ad\2\2\u02b2\u030d\7\u01ae"+
		"\2\2\u02b3\u02b5\7\u01af\2\2\u02b4\u02b6\7\u0196\2\2\u02b5\u02b4\3\2\2"+
		"\2\u02b5\u02b6\3\2\2\2\u02b6\u02ba\3\2\2\2\u02b7\u02b8\7\u01a8\2\2\u02b8"+
		"\u02b9\7\u00a2\2\2\u02b9\u02bb\5V,\2\u02ba\u02b7\3\2\2\2\u02ba\u02bb\3"+
		"\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02bd\7\36\2\2\u02bd\u02bf\5V,\2\u02be"+
		"\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u030d\3\2\2\2\u02c0\u02c2\7\u01b0"+
		"\2\2\u02c1\u02c3\7\u0196\2\2\u02c2\u02c1\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3"+
		"\u02c7\3\2\2\2\u02c4\u02c5\7\u01a8\2\2\u02c5\u02c6\7\u00a2\2\2\u02c6\u02c8"+
		"\5V,\2\u02c7\u02c4\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9"+
		"\u02ca\7\36\2\2\u02ca\u02cc\5V,\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2"+
		"\2\2\u02cc\u030d\3\2\2\2\u02cd\u02cf\7\u01b1\2\2\u02ce\u02d0\7\u0196\2"+
		"\2\u02cf\u02ce\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d4\3\2\2\2\u02d1\u02d2"+
		"\7\u01a8\2\2\u02d2\u02d3\7\u00a2\2\2\u02d3\u02d5\5V,\2\u02d4\u02d1\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d8\3\2\2\2\u02d6\u02d7\7\36\2\2\u02d7"+
		"\u02d9\5V,\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u030d\3\2\2"+
		"\2\u02da\u02dc\7\u01b2\2\2\u02db\u02dd\7\u0196\2\2\u02dc\u02db\3\2\2\2"+
		"\u02dc\u02dd\3\2\2\2\u02dd\u02e1\3\2\2\2\u02de\u02df\7\u01a8\2\2\u02df"+
		"\u02e0\7\u00a2\2\2\u02e0\u02e2\5V,\2\u02e1\u02de\3\2\2\2\u02e1\u02e2\3"+
		"\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e4\7\36\2\2\u02e4\u02e6\5V,\2\u02e5"+
		"\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u030d\3\2\2\2\u02e7\u02e8\7\u01b3"+
		"\2\2\u02e8\u02e9\7\u01d3\2\2\u02e9\u02ec\5V,\2\u02ea\u02eb\7\u01d5\2\2"+
		"\u02eb\u02ed\5V,\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\7\u01d4\2\2\u02ef\u02f3\3\2\2\2\u02f0\u02f1\7\u01a8"+
		"\2\2\u02f1\u02f2\7\u00a2\2\2\u02f2\u02f4\5V,\2\u02f3\u02f0\3\2\2\2\u02f3"+
		"\u02f4\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f6\7\36\2\2\u02f6\u02f8\5"+
		"V,\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u030d\3\2\2\2\u02f9"+
		"\u02fa\7\u00a2\2\2\u02fa\u02fb\7\u01d3\2\2\u02fb\u02fe\5V,\2\u02fc\u02fd"+
		"\7\u01d5\2\2\u02fd\u02ff\5V,\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2\2\2"+
		"\u02ff\u0300\3\2\2\2\u0300\u0301\7\u01d4\2\2\u0301\u0305\3\2\2\2\u0302"+
		"\u0303\7\u01a8\2\2\u0303\u0304\7\u00a2\2\2\u0304\u0306\5V,\2\u0305\u0302"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0308\7\36\2\2"+
		"\u0308\u030a\5V,\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030d"+
		"\3\2\2\2\u030b\u030d\7\u01b4\2\2\u030c\u01d4\3\2\2\2\u030c\u01d8\3\2\2"+
		"\2\u030c\u01e4\3\2\2\2\u030c\u01f0\3\2\2\2\u030c\u01fc\3\2\2\2\u030c\u0208"+
		"\3\2\2\2\u030c\u0214\3\2\2\2\u030c\u0220\3\2\2\2\u030c\u022e\3\2\2\2\u030c"+
		"\u023c\3\2\2\2\u030c\u024a\3\2\2\2\u030c\u025a\3\2\2\2\u030c\u026a\3\2"+
		"\2\2\u030c\u026b\3\2\2\2\u030c\u0271\3\2\2\2\u030c\u0277\3\2\2\2\u030c"+
		"\u027d\3\2\2\2\u030c\u027e\3\2\2\2\u030c\u0290\3\2\2\2\u030c\u02a2\3\2"+
		"\2\2\u030c\u02a8\3\2\2\2\u030c\u02ae\3\2\2\2\u030c\u02af\3\2\2\2\u030c"+
		"\u02b0\3\2\2\2\u030c\u02b1\3\2\2\2\u030c\u02b2\3\2\2\2\u030c\u02b3\3\2"+
		"\2\2\u030c\u02c0\3\2\2\2\u030c\u02cd\3\2\2\2\u030c\u02da\3\2\2\2\u030c"+
		"\u02e7\3\2\2\2\u030c\u02f9\3\2\2\2\u030c\u030b\3\2\2\2\u030dO\3\2\2\2"+
		"\u030e\u0311\7p\2\2\u030f\u0311\5R*\2\u0310\u030e\3\2\2\2\u0310\u030f"+
		"\3\2\2\2\u0311Q\3\2\2\2\u0312\u0322\7\u01be\2\2\u0313\u0322\7\u01bf\2"+
		"\2\u0314\u0316\5T+\2\u0315\u0314\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317"+
		"\3\2\2\2\u0317\u0322\7\u01bc\2\2\u0318\u031a\5T+\2\u0319\u0318\3\2\2\2"+
		"\u0319\u031a\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0322\t\7\2\2\u031c\u031e"+
		"\5T+\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0320\7\u01d2\2\2\u0320\u0322\t\b\2\2\u0321\u0312\3\2\2\2\u0321\u0313"+
		"\3\2\2\2\u0321\u0315\3\2\2\2\u0321\u0319\3\2\2\2\u0321\u031d\3\2\2\2\u0322"+
		"S\3\2\2\2\u0323\u0324\t\t\2\2\u0324U\3\2\2\2\u0325\u0329\5X-\2\u0326\u0329"+
		"\7\u01b8\2\2\u0327\u0329\7\u01b9\2\2\u0328\u0325\3\2\2\2\u0328\u0326\3"+
		"\2\2\2\u0328\u0327\3\2\2\2\u0329W\3\2\2\2\u032a\u032b\t\n\2\2\u032bY\3"+
		"\2\2\2\u032c\u033c\7\u01c2\2\2\u032d\u033c\7\u01c3\2\2\u032e\u033c\7\u01c4"+
		"\2\2\u032f\u0330\7\u01c4\2\2\u0330\u033c\7\u01c2\2\2\u0331\u0332\7\u01c3"+
		"\2\2\u0332\u033c\7\u01c2\2\2\u0333\u0334\7\u01c4\2\2\u0334\u033c\7\u01c3"+
		"\2\2\u0335\u0336\7\u01c5\2\2\u0336\u033c\7\u01c2\2\2\u0337\u0338\7\u01c5"+
		"\2\2\u0338\u033c\7\u01c3\2\2\u0339\u033a\7\u01c5\2\2\u033a\u033c\7\u01c4"+
		"\2\2\u033b\u032c\3\2\2\2\u033b\u032d\3\2\2\2\u033b\u032e\3\2\2\2\u033b"+
		"\u032f\3\2\2\2\u033b\u0331\3\2\2\2\u033b\u0333\3\2\2\2\u033b\u0335\3\2"+
		"\2\2\u033b\u0337\3\2\2\2\u033b\u0339\3\2\2\2\u033c[\3\2\2\2\u033d\u033e"+
		"\t\13\2\2\u033e]\3\2\2\2\u033f\u0341\7\u01bc\2\2\u0340\u0342\t\f\2\2\u0341"+
		"\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342_\3\2\2\2\u008ccovz}\u0086\u0093"+
		"\u0098\u009b\u00a0\u00a3\u00a7\u00af\u00c0\u00c5\u00c8\u00ce\u00d4\u00d9"+
		"\u00dc\u00df\u00e3\u00e5\u00e9\u00ee\u00f3\u0100\u0104\u0107\u010c\u010f"+
		"\u0113\u0118\u011b\u0122\u0126\u012d\u0131\u0138\u0146\u0148\u0151\u0158"+
		"\u0164\u016b\u0172\u0179\u0180\u0187\u018e\u0194\u0199\u01a2\u01a7\u01ac"+
		"\u01b0\u01b5\u01bc\u01c5\u01c9\u01cf\u01d2\u01d6\u01dc\u01df\u01e2\u01e8"+
		"\u01eb\u01ee\u01f4\u01f7\u01fa\u0200\u0203\u0206\u020c\u020f\u0212\u0218"+
		"\u021b\u021e\u0226\u0229\u022c\u0234\u0237\u023a\u0242\u0245\u0248\u024f"+
		"\u0252\u0255\u0258\u025f\u0262\u0265\u0268\u026f\u0275\u027b\u0282\u0285"+
		"\u028a\u028e\u0294\u0297\u029c\u02a0\u02a6\u02ac\u02b5\u02ba\u02be\u02c2"+
		"\u02c7\u02cb\u02cf\u02d4\u02d8\u02dc\u02e1\u02e5\u02ec\u02f3\u02f7\u02fe"+
		"\u0305\u0309\u030c\u0310\u0315\u0319\u031d\u0321\u0328\u033b\u0341";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}