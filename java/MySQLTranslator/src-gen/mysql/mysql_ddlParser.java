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
		T__0=1, ADD=2, ALL=3, ALTER=4, AND=5, ANY=6, AS=7, ASC=8, AUTHORIZATION=9, 
		AUTO_INCREMENT=10, BACKUP=11, BEGIN=12, BETWEEN=13, BREAK=14, BROWSE=15, 
		BULK=16, BY=17, CASCADE=18, CASE=19, CHANGETABLE=20, CHANGES=21, CHECK=22, 
		CHECKPOINT=23, CLOSE=24, CLUSTERED=25, COALESCE=26, COLLATE=27, COLUMN=28, 
		COMMIT=29, COMPUTE=30, CONSTRAINT=31, CONTAINMENT=32, CONTAINS=33, CONTAINSTABLE=34, 
		CONTINUE=35, CONVERT=36, CREATE=37, CROSS=38, CURRENT=39, CURRENT_DATE=40, 
		CURRENT_TIME=41, CURRENT_TIMESTAMP=42, CURRENT_USER=43, CURSOR=44, DATABASE=45, 
		DBCC=46, DEALLOCATE=47, DECLARE=48, DEFAULT=49, DELETE=50, DENY=51, DESC=52, 
		DISK=53, DISTINCT=54, DISTRIBUTED=55, DROP=56, DUMP=57, ELSE=58, END=59, 
		ERRLVL=60, ESCAPE=61, EXCEPT=62, EXECUTE=63, EXISTS=64, EXIT=65, EXTERNAL=66, 
		FETCH=67, FILE=68, FILENAME=69, FILLFACTOR=70, FOR=71, FORCESEEK=72, FOREIGN=73, 
		FREETEXT=74, FREETEXTTABLE=75, FROM=76, FULL=77, FUNCTION=78, GOTO=79, 
		GRANT=80, GROUP=81, HAVING=82, IDENTITY=83, IDENTITYCOL=84, IDENTITY_INSERT=85, 
		IF=86, IN=87, INDEX=88, INNER=89, INSERT=90, INTERSECT=91, INTO=92, IS=93, 
		JOIN=94, KEY=95, KILL=96, LEFT=97, LIKE=98, LINENO=99, LOAD=100, LOG=101, 
		MERGE=102, NATIONAL=103, NOCHECK=104, NONCLUSTERED=105, NONE=106, NOT=107, 
		NULL=108, NULLIF=109, OF=110, OFF=111, OFFSETS=112, ON=113, OPEN=114, 
		OPENDATASOURCE=115, OPENQUERY=116, OPENROWSET=117, OPENXML=118, OPTION=119, 
		OR=120, ORDER=121, OUTER=122, OVER=123, PARTIAL=124, PERCENT=125, PIVOT=126, 
		PLAN=127, PRECISION=128, PRIMARY=129, PRINT=130, PROC=131, PROCEDURE=132, 
		PUBLIC=133, RAISERROR=134, READ=135, READTEXT=136, RECONFIGURE=137, REFERENCES=138, 
		REPLICATION=139, RESTORE=140, RESTRICT=141, RETURN=142, REVERT=143, REVOKE=144, 
		RIGHT=145, ROLLBACK=146, ROWCOUNT=147, ROWGUIDCOL=148, RULE=149, SAVE=150, 
		SCHEMA=151, SECURITYAUDIT=152, SELECT=153, SEMANTICKEYPHRASETABLE=154, 
		SEMANTICSIMILARITYDETAILSTABLE=155, SEMANTICSIMILARITYTABLE=156, SESSION_USER=157, 
		SET=158, SETUSER=159, SHUTDOWN=160, SOME=161, STATISTICS=162, SYSTEM_USER=163, 
		TABLE=164, TABLESAMPLE=165, TEXTSIZE=166, THEN=167, TO=168, TOP=169, TRAN=170, 
		TRANSACTION=171, TRIGGER=172, TRUNCATE=173, TRY_CONVERT=174, TSEQUAL=175, 
		UNION=176, UNIQUE=177, UNPIVOT=178, UNSIGNED=179, UPDATE=180, UPDATETEXT=181, 
		USE=182, USER=183, VALUES=184, VARYING=185, VIEW=186, WAITFOR=187, WHEN=188, 
		WHERE=189, WHILE=190, WITH=191, WITHIN=192, WRITETEXT=193, ABSOLUTE=194, 
		AFTER=195, ALLOWED=196, ALLOW_SNAPSHOT_ISOLATION=197, ANSI_NULLS=198, 
		ANSI_NULL_DEFAULT=199, ANSI_PADDING=200, ANSI_WARNINGS=201, APPLY=202, 
		ARITHABORT=203, AUTO=204, AUTO_CLEANUP=205, AUTO_CLOSE=206, AUTO_CREATE_STATISTICS=207, 
		AUTO_SHRINK=208, AUTO_UPDATE_STATISTICS=209, AUTO_UPDATE_STATISTICS_ASYNC=210, 
		AVG=211, BASE64=212, BINARY_CHECKSUM=213, BULK_LOGGED=214, CALLER=215, 
		CAST=216, CATCH=217, CHANGE_RETENTION=218, CHANGE_TRACKING=219, CHARSET=220, 
		CHECKSUM=221, CHECKSUM_AGG=222, COMMENT=223, COMMITTED=224, COMPATIBILITY_LEVEL=225, 
		CONCAT=226, CONCAT_NULL_YIELDS_NULL=227, CONTROL=228, COOKIE=229, COUNT=230, 
		COUNT_BIG=231, CURSOR_CLOSE_ON_COMMIT=232, CURSOR_DEFAULT=233, DATEADD=234, 
		DATEDIFF=235, DATENAME=236, DATEPART=237, DATE_CORRELATION_OPTIMIZATION=238, 
		DAYS=239, DB_CHAINING=240, DEFAULT_FULLTEXT_LANGUAGE=241, DEFAULT_LANGUAGE=242, 
		DELAY=243, DELAYED_DURABILITY=244, DELETED=245, DENSE_RANK=246, DIRECTORY_NAME=247, 
		DISABLE=248, DISABLED=249, DISABLE_BROKER=250, DYNAMIC=251, EMERGENCY=252, 
		ENABLE_BROKER=253, ENCRYPTION=254, ERROR_BROKER_CONVERSATIONS=255, EXPAND=256, 
		FAST=257, FAST_FORWARD=258, FILEGROUP=259, FILEGROWTH=260, FILESTREAM=261, 
		FIRST=262, FOLLOWING=263, FORCE=264, FORCED=265, FORWARD_ONLY=266, FULLSCAN=267, 
		GB=268, GLOBAL=269, GO=270, GROUPING=271, GROUPING_ID=272, HADR=273, HASH=274, 
		HONOR_BROKER_PRIORITY=275, HOURS=276, IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX=277, 
		IMMEDIATE=278, IMPERSONATE=279, INCREMENTAL=280, INSENSITIVE=281, INSERTED=282, 
		ISOLATION=283, KB=284, KEEP=285, KEEPFIXED=286, KEYSET=287, LAST=288, 
		LEVEL=289, LOCAL=290, LOCK_ESCALATION=291, LOGIN=292, LOOP=293, MARK=294, 
		MAX=295, MAXDOP=296, MAXRECURSION=297, MAXSIZE=298, MB=299, MEMORY_OPTIMIZED_DATA=300, 
		MIN=301, MINUTES=302, MIN_ACTIVE_ROWVERSION=303, MIXED_PAGE_ALLOCATION=304, 
		MODIFY=305, MULTI_USER=306, NAME=307, NESTED_TRIGGERS=308, NEW_BROKER=309, 
		NEXT=310, NOCOUNT=311, NOEXPAND=312, NON_TRANSACTED_ACCESS=313, NORECOMPUTE=314, 
		NO_WAIT=315, NTILE=316, NUMBER=317, NUMERIC_ROUNDABORT=318, OFFLINE=319, 
		OFFSET=320, ONLINE=321, ONLY=322, OPTIMISTIC=323, OPTIMIZE=324, OUT=325, 
		OUTPUT=326, OWNER=327, PAGE_VERIFY=328, PARAMETERIZATION=329, PARTITION=330, 
		PATH=331, PRECEDING=332, PRIOR=333, PRIVILEGES=334, QUOTED_IDENTIFIER=335, 
		RANGE=336, RANK=337, READONLY=338, READ_COMMITTED_SNAPSHOT=339, READ_ONLY=340, 
		READ_WRITE=341, RECOMPILE=342, RECOVERY=343, RECURSIVE_TRIGGERS=344, RELATIVE=345, 
		REMOTE=346, REPEATABLE=347, RESTRICTED_USER=348, ROBUST=349, ROOT=350, 
		ROW=351, ROWGUID=352, ROWS=353, ROW_NUMBER=354, SAMPLE=355, SCHEMABINDING=356, 
		SCROLL=357, SCROLL_LOCKS=358, SECONDS=359, SELF=360, SERIALIZABLE=361, 
		SHOWPLAN=362, SIMPLE=363, SINGLE_USER=364, SIZE=365, SNAPSHOT=366, SPATIAL_WINDOW_MAX_CELLS=367, 
		STATIC=368, STATS_STREAM=369, STDEV=370, STDEVP=371, SUM=372, TAKE=373, 
		TARGET_RECOVERY_TIME=374, TB=375, TEXTIMAGE_ON=376, THROW=377, TIES=378, 
		TIME=379, TORN_PAGE_DETECTION=380, TRANSFORM_NOISE_WORDS=381, TRUSTWORTHY=382, 
		TRY=383, TWO_DIGIT_YEAR_CUTOFF=384, TYPE=385, TYPE_WARNING=386, UNBOUNDED=387, 
		UNCOMMITTED=388, UNKNOWN=389, UNLIMITED=390, USING=391, VAR=392, VARP=393, 
		VIEWS=394, VIEW_METADATA=395, WORK=396, XML=397, XMLNAMESPACES=398, ZEROFILL=399, 
		DOLLAR_ACTION=400, BIT=401, BINARY=402, BOOLEAN=403, TINYINT=404, SMALLINT=405, 
		MEDIUMINT=406, INT=407, INTEGER=408, BIGINT=409, REAL=410, FLOAT=411, 
		DOUBLE=412, DECIMAL=413, NUMERIC=414, DATE=415, DATETIME=416, TIMESTAMP=417, 
		YEAR=418, CHAR=419, CHARACTER=420, VARCHAR=421, VARBINARY=422, TINYBLOB=423, 
		BLOB=424, MEDIUMBLOB=425, LONGBLOB=426, TINYTEXT=427, TEXT=428, MEDIUMTEXT=429, 
		LONGTEXT=430, ENUM=431, JSON=432, SPACE=433, MULTILINE_COMMENT=434, LINE_COMMENT=435, 
		DOUBLE_QUOTE_ID=436, LEFT_QUOTE_ID=437, SQUARE_BRACKET_ID=438, LOCAL_ID=439, 
		DECIMAL_LITERAL=440, ID=441, STRING=442, BINARY_LITERAL=443, FLOAT_LITERAL=444, 
		REAL_LITERAL=445, EQUAL=446, GREATER=447, LESS=448, EXCLAMATION=449, PLUS_ASSIGN=450, 
		MINUS_ASSIGN=451, MULT_ASSIGN=452, DIV_ASSIGN=453, MOD_ASSIGN=454, AND_ASSIGN=455, 
		XOR_ASSIGN=456, OR_ASSIGN=457, DOT=458, UNDERLINE=459, AT=460, SHARP=461, 
		DOLLAR=462, LR_BRACKET=463, RR_BRACKET=464, COMMA=465, SEMI=466, COLON=467, 
		STAR=468, DIVIDE=469, MODULE=470, PLUS=471, MINUS=472, BIT_NOT=473, BIT_OR=474, 
		BIT_AND=475, BIT_XOR=476;
	public static final int
		RULE_mysql_ddl_file = 0, RULE_batch = 1, RULE_ddl_clauses = 2, RULE_ddl_clause = 3, 
		RULE_create_index = 4, RULE_create_table = 5, RULE_table_options = 6, 
		RULE_table_option = 7, RULE_char_set = 8, RULE_table_comment = 9, RULE_column_comment = 10, 
		RULE_alter_table = 11, RULE_drop_index = 12, RULE_drop_table = 13, RULE_column_def_table_constraint = 14, 
		RULE_column_definition = 15, RULE_column_definition1 = 16, RULE_column_default = 17, 
		RULE_constant_expression = 18, RULE_column_constraint = 19, RULE_table_constraint = 20, 
		RULE_table_foreign_key_def = 21, RULE_fk_on_delete = 22, RULE_full_table_name = 23, 
		RULE_table_name = 24, RULE_simple_name = 25, RULE_func_proc_name = 26, 
		RULE_ddl_object = 27, RULE_full_column_name = 28, RULE_column_name_list = 29, 
		RULE_cursor_name = 30, RULE_on_off = 31, RULE_clustered = 32, RULE_null_notnull = 33, 
		RULE_scalar_function_name = 34, RULE_ms_data_type = 35, RULE_data_type = 36, 
		RULE_default_value = 37, RULE_constant = 38, RULE_sign = 39, RULE_id = 40, 
		RULE_simple_id = 41, RULE_comparison_operator = 42, RULE_assignment_operator = 43, 
		RULE_file_size = 44;
	public static final String[] ruleNames = {
		"mysql_ddl_file", "batch", "ddl_clauses", "ddl_clause", "create_index", 
		"create_table", "table_options", "table_option", "char_set", "table_comment", 
		"column_comment", "alter_table", "drop_index", "drop_table", "column_def_table_constraint", 
		"column_definition", "column_definition1", "column_default", "constant_expression", 
		"column_constraint", "table_constraint", "table_foreign_key_def", "fk_on_delete", 
		"full_table_name", "table_name", "simple_name", "func_proc_name", "ddl_object", 
		"full_column_name", "column_name_list", "cursor_name", "on_off", "clustered", 
		"null_notnull", "scalar_function_name", "ms_data_type", "data_type", "default_value", 
		"constant", "sign", "id", "simple_id", "comparison_operator", "assignment_operator", 
		"file_size"
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
		null, null, null, "'='", "'>'", "'<'", "'!'", "'+='", "'-='", "'*='", 
		"'/='", "'%='", "'&='", "'^='", "'|='", "'.'", "'_'", "'@'", "'#'", "'$'", 
		"'('", "')'", "','", "';'", "':'", "'*'", "'/'", "'%'", "'+'", "'-'", 
		"'~'", "'|'", "'&'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ADD", "ALL", "ALTER", "AND", "ANY", "AS", "ASC", "AUTHORIZATION", 
		"AUTO_INCREMENT", "BACKUP", "BEGIN", "BETWEEN", "BREAK", "BROWSE", "BULK", 
		"BY", "CASCADE", "CASE", "CHANGETABLE", "CHANGES", "CHECK", "CHECKPOINT", 
		"CLOSE", "CLUSTERED", "COALESCE", "COLLATE", "COLUMN", "COMMIT", "COMPUTE", 
		"CONSTRAINT", "CONTAINMENT", "CONTAINS", "CONTAINSTABLE", "CONTINUE", 
		"CONVERT", "CREATE", "CROSS", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", 
		"CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "DATABASE", "DBCC", "DEALLOCATE", 
		"DECLARE", "DEFAULT", "DELETE", "DENY", "DESC", "DISK", "DISTINCT", "DISTRIBUTED", 
		"DROP", "DUMP", "ELSE", "END", "ERRLVL", "ESCAPE", "EXCEPT", "EXECUTE", 
		"EXISTS", "EXIT", "EXTERNAL", "FETCH", "FILE", "FILENAME", "FILLFACTOR", 
		"FOR", "FORCESEEK", "FOREIGN", "FREETEXT", "FREETEXTTABLE", "FROM", "FULL", 
		"FUNCTION", "GOTO", "GRANT", "GROUP", "HAVING", "IDENTITY", "IDENTITYCOL", 
		"IDENTITY_INSERT", "IF", "IN", "INDEX", "INNER", "INSERT", "INTERSECT", 
		"INTO", "IS", "JOIN", "KEY", "KILL", "LEFT", "LIKE", "LINENO", "LOAD", 
		"LOG", "MERGE", "NATIONAL", "NOCHECK", "NONCLUSTERED", "NONE", "NOT", 
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
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << CREATE) | (1L << DROP))) != 0)) {
				{
				{
				setState(90);
				batch();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
			setState(98);
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
			setState(103); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(100);
					ddl_clause();
					setState(101);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(105); 
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				create_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				create_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				alter_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				drop_index();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
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
			setState(114);
			match(CREATE);
			setState(116);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(115);
				match(UNIQUE);
				}
			}

			setState(119);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(118);
				clustered();
				}
			}

			setState(121);
			match(INDEX);
			setState(122);
			id();
			setState(123);
			match(ON);
			setState(124);
			table_name();
			setState(125);
			match(LR_BRACKET);
			setState(126);
			column_name_list();
			setState(128);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(127);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(130);
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
			setState(132);
			match(CREATE);
			setState(133);
			match(TABLE);
			setState(134);
			table_name();
			setState(135);
			match(LR_BRACKET);
			setState(136);
			column_def_table_constraint();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(137);
				match(COMMA);
				setState(138);
				column_def_table_constraint();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(RR_BRACKET);
			setState(146);
			_la = _input.LA(1);
			if (_la==DEFAULT || _la==CHARSET) {
				{
				setState(145);
				table_options();
				}
			}

			setState(149);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(148);
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
			setState(151);
			table_option();
			setState(154);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(152);
				match(COMMA);
				setState(153);
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
			setState(157);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(156);
				match(DEFAULT);
				}
			}

			setState(159);
			match(CHARSET);
			setState(161);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(160);
				match(EQUAL);
				}
			}

			setState(163);
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
			setState(165);
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
			setState(167);
			match(COMMENT);
			setState(169);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(168);
				match(EQUAL);
				}
			}

			setState(171);
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
			setState(173);
			match(COMMENT);
			setState(174);
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
			setState(176);
			match(ALTER);
			setState(177);
			match(TABLE);
			setState(178);
			table_name();
			setState(179);
			match(ADD);
			setState(180);
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
			setState(182);
			match(DROP);
			setState(183);
			match(INDEX);
			setState(186);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(184);
				match(IF);
				setState(185);
				match(EXISTS);
				}
			}

			setState(188);
			((Drop_indexContext)_localctx).name = id();
			setState(191);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(189);
				match(ON);
				setState(190);
				table_name();
				}
			}

			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(193);
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
			setState(196);
			match(DROP);
			setState(197);
			match(TABLE);
			setState(200);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(198);
				match(IF);
				setState(199);
				match(EXISTS);
				}
			}

			setState(202);
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
			setState(206);
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
				setState(204);
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
				setState(205);
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
			setState(208);
			id();
			setState(209);
			data_type();
			setState(211);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(210);
				null_notnull();
				}
			}

			setState(214);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(213);
				column_default();
				}
			}

			setState(217);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(216);
				match(AUTO_INCREMENT);
				}
			}

			setState(223);
			_la = _input.LA(1);
			if (_la==PRIMARY || _la==UNIQUE) {
				{
				setState(219);
				_la = _input.LA(1);
				if ( !(_la==PRIMARY || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(221);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(220);
					match(KEY);
					}
				}

				}
			}

			setState(227);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(225);
				match(COMMENT);
				setState(226);
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
			setState(229);
			id();
			setState(230);
			data_type();
			setState(232);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(231);
				null_notnull();
				}
			}

			setState(237);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(234);
				match(DEFAULT);
				setState(235);
				constant_expression();
				}
				break;
			case AUTO_INCREMENT:
				{
				setState(236);
				match(AUTO_INCREMENT);
				}
				break;
			case COMMENT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(239);
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
			setState(241);
			match(DEFAULT);
			setState(242);
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
			setState(250);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
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
				setState(245);
				constant();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(LR_BRACKET);
				setState(247);
				constant_expression();
				setState(248);
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
			setState(254);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(252);
				match(CONSTRAINT);
				setState(253);
				id();
				}
			}

			setState(257);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(256);
				null_notnull();
				}
			}

			{
			setState(262);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(259);
				match(PRIMARY);
				setState(260);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(261);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(264);
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
		public Column_name_listContext column_name_list() {
			return getRuleContext(Column_name_listContext.class,0);
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
		public TerminalNode ASC() { return getToken(mysql_ddlParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(mysql_ddlParser.DESC, 0); }
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
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(267);
					match(CONSTRAINT);
					setState(268);
					id();
					}
				}

				{
				setState(274);
				switch (_input.LA(1)) {
				case PRIMARY:
					{
					setState(271);
					match(PRIMARY);
					setState(272);
					match(KEY);
					}
					break;
				case UNIQUE:
					{
					setState(273);
					match(UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(277);
				_la = _input.LA(1);
				if (_la==CLUSTERED || _la==NONCLUSTERED) {
					{
					setState(276);
					clustered();
					}
				}

				setState(279);
				match(LR_BRACKET);
				setState(280);
				column_name_list();
				setState(282);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(281);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(284);
				match(RR_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(286);
					match(UNIQUE);
					}
				}

				setState(289);
				match(KEY);
				setState(291);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (FAST_FORWARD - 258)) | (1L << (FIRST - 258)) | (1L << (FOLLOWING - 258)) | (1L << (FORCE - 258)) | (1L << (FORCED - 258)) | (1L << (FORWARD_ONLY - 258)) | (1L << (FULLSCAN - 258)) | (1L << (GLOBAL - 258)) | (1L << (GO - 258)) | (1L << (GROUPING - 258)) | (1L << (GROUPING_ID - 258)) | (1L << (HASH - 258)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 258)) | (1L << (IMPERSONATE - 258)) | (1L << (INSENSITIVE - 258)) | (1L << (INSERTED - 258)) | (1L << (ISOLATION - 258)) | (1L << (KEEP - 258)) | (1L << (KEEPFIXED - 258)) | (1L << (KEYSET - 258)) | (1L << (LAST - 258)) | (1L << (LEVEL - 258)) | (1L << (LOCAL - 258)) | (1L << (LOCK_ESCALATION - 258)) | (1L << (LOGIN - 258)) | (1L << (LOOP - 258)) | (1L << (MARK - 258)) | (1L << (MAX - 258)) | (1L << (MAXDOP - 258)) | (1L << (MAXRECURSION - 258)) | (1L << (MIN - 258)) | (1L << (MODIFY - 258)) | (1L << (NAME - 258)) | (1L << (NEXT - 258)) | (1L << (NOCOUNT - 258)) | (1L << (NOEXPAND - 258)) | (1L << (NORECOMPUTE - 258)) | (1L << (NTILE - 258)) | (1L << (NUMBER - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLINE - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (ONLY - 322)) | (1L << (OPTIMISTIC - 322)) | (1L << (OPTIMIZE - 322)) | (1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (OWNER - 322)) | (1L << (PARAMETERIZATION - 322)) | (1L << (PARTITION - 322)) | (1L << (PATH - 322)) | (1L << (PRECEDING - 322)) | (1L << (PRIOR - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (RANGE - 322)) | (1L << (RANK - 322)) | (1L << (READONLY - 322)) | (1L << (READ_ONLY - 322)) | (1L << (RECOMPILE - 322)) | (1L << (RELATIVE - 322)) | (1L << (REMOTE - 322)) | (1L << (REPEATABLE - 322)) | (1L << (ROBUST - 322)) | (1L << (ROOT - 322)) | (1L << (ROW - 322)) | (1L << (ROWGUID - 322)) | (1L << (ROWS - 322)) | (1L << (ROW_NUMBER - 322)) | (1L << (SAMPLE - 322)) | (1L << (SCHEMABINDING - 322)) | (1L << (SCROLL - 322)) | (1L << (SCROLL_LOCKS - 322)) | (1L << (SELF - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SIMPLE - 322)) | (1L << (SNAPSHOT - 322)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 322)) | (1L << (STATIC - 322)) | (1L << (STATS_STREAM - 322)) | (1L << (STDEV - 322)) | (1L << (STDEVP - 322)) | (1L << (SUM - 322)) | (1L << (TEXTIMAGE_ON - 322)) | (1L << (THROW - 322)) | (1L << (TIES - 322)) | (1L << (TIME - 322)) | (1L << (TRY - 322)) | (1L << (TYPE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (TYPE_WARNING - 386)) | (1L << (UNBOUNDED - 386)) | (1L << (UNCOMMITTED - 386)) | (1L << (UNKNOWN - 386)) | (1L << (USING - 386)) | (1L << (VAR - 386)) | (1L << (VARP - 386)) | (1L << (VIEWS - 386)) | (1L << (VIEW_METADATA - 386)) | (1L << (WORK - 386)) | (1L << (XML - 386)) | (1L << (XMLNAMESPACES - 386)) | (1L << (DOUBLE_QUOTE_ID - 386)) | (1L << (LEFT_QUOTE_ID - 386)) | (1L << (ID - 386)))) != 0)) {
					{
					setState(290);
					id();
					}
				}

				setState(293);
				match(LR_BRACKET);
				setState(294);
				column_name_list();
				setState(296);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(295);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(298);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(300);
					match(UNIQUE);
					}
				}

				setState(303);
				match(INDEX);
				setState(305);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (FAST_FORWARD - 258)) | (1L << (FIRST - 258)) | (1L << (FOLLOWING - 258)) | (1L << (FORCE - 258)) | (1L << (FORCED - 258)) | (1L << (FORWARD_ONLY - 258)) | (1L << (FULLSCAN - 258)) | (1L << (GLOBAL - 258)) | (1L << (GO - 258)) | (1L << (GROUPING - 258)) | (1L << (GROUPING_ID - 258)) | (1L << (HASH - 258)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 258)) | (1L << (IMPERSONATE - 258)) | (1L << (INSENSITIVE - 258)) | (1L << (INSERTED - 258)) | (1L << (ISOLATION - 258)) | (1L << (KEEP - 258)) | (1L << (KEEPFIXED - 258)) | (1L << (KEYSET - 258)) | (1L << (LAST - 258)) | (1L << (LEVEL - 258)) | (1L << (LOCAL - 258)) | (1L << (LOCK_ESCALATION - 258)) | (1L << (LOGIN - 258)) | (1L << (LOOP - 258)) | (1L << (MARK - 258)) | (1L << (MAX - 258)) | (1L << (MAXDOP - 258)) | (1L << (MAXRECURSION - 258)) | (1L << (MIN - 258)) | (1L << (MODIFY - 258)) | (1L << (NAME - 258)) | (1L << (NEXT - 258)) | (1L << (NOCOUNT - 258)) | (1L << (NOEXPAND - 258)) | (1L << (NORECOMPUTE - 258)) | (1L << (NTILE - 258)) | (1L << (NUMBER - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLINE - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (ONLY - 322)) | (1L << (OPTIMISTIC - 322)) | (1L << (OPTIMIZE - 322)) | (1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (OWNER - 322)) | (1L << (PARAMETERIZATION - 322)) | (1L << (PARTITION - 322)) | (1L << (PATH - 322)) | (1L << (PRECEDING - 322)) | (1L << (PRIOR - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (RANGE - 322)) | (1L << (RANK - 322)) | (1L << (READONLY - 322)) | (1L << (READ_ONLY - 322)) | (1L << (RECOMPILE - 322)) | (1L << (RELATIVE - 322)) | (1L << (REMOTE - 322)) | (1L << (REPEATABLE - 322)) | (1L << (ROBUST - 322)) | (1L << (ROOT - 322)) | (1L << (ROW - 322)) | (1L << (ROWGUID - 322)) | (1L << (ROWS - 322)) | (1L << (ROW_NUMBER - 322)) | (1L << (SAMPLE - 322)) | (1L << (SCHEMABINDING - 322)) | (1L << (SCROLL - 322)) | (1L << (SCROLL_LOCKS - 322)) | (1L << (SELF - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SIMPLE - 322)) | (1L << (SNAPSHOT - 322)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 322)) | (1L << (STATIC - 322)) | (1L << (STATS_STREAM - 322)) | (1L << (STDEV - 322)) | (1L << (STDEVP - 322)) | (1L << (SUM - 322)) | (1L << (TEXTIMAGE_ON - 322)) | (1L << (THROW - 322)) | (1L << (TIES - 322)) | (1L << (TIME - 322)) | (1L << (TRY - 322)) | (1L << (TYPE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (TYPE_WARNING - 386)) | (1L << (UNBOUNDED - 386)) | (1L << (UNCOMMITTED - 386)) | (1L << (UNKNOWN - 386)) | (1L << (USING - 386)) | (1L << (VAR - 386)) | (1L << (VARP - 386)) | (1L << (VIEWS - 386)) | (1L << (VIEW_METADATA - 386)) | (1L << (WORK - 386)) | (1L << (XML - 386)) | (1L << (XMLNAMESPACES - 386)) | (1L << (DOUBLE_QUOTE_ID - 386)) | (1L << (LEFT_QUOTE_ID - 386)) | (1L << (ID - 386)))) != 0)) {
					{
					setState(304);
					id();
					}
				}

				setState(307);
				match(LR_BRACKET);
				setState(308);
				column_name_list();
				setState(310);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(309);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(312);
				match(RR_BRACKET);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
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
		public Fk_on_deleteContext fk_on_delete() {
			return getRuleContext(Fk_on_deleteContext.class,0);
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
			setState(317);
			match(FOREIGN);
			setState(318);
			match(KEY);
			setState(319);
			match(LR_BRACKET);
			setState(320);
			column_name_list();
			setState(321);
			match(RR_BRACKET);
			setState(322);
			match(REFERENCES);
			setState(323);
			id();
			setState(324);
			match(LR_BRACKET);
			setState(325);
			column_name_list();
			setState(326);
			match(RR_BRACKET);
			setState(328);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(327);
				fk_on_delete();
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

	public static class Fk_on_deleteContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(mysql_ddlParser.ON, 0); }
		public TerminalNode DELETE() { return getToken(mysql_ddlParser.DELETE, 0); }
		public TerminalNode CASCADE() { return getToken(mysql_ddlParser.CASCADE, 0); }
		public TerminalNode RESTRICT() { return getToken(mysql_ddlParser.RESTRICT, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(ON);
			setState(331);
			match(DELETE);
			setState(332);
			_la = _input.LA(1);
			if ( !(_la==CASCADE || _la==RESTRICT) ) {
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
		enterRule(_localctx, 46, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(334);
				((Full_table_nameContext)_localctx).server = id();
				setState(335);
				match(DOT);
				setState(336);
				((Full_table_nameContext)_localctx).database = id();
				setState(337);
				match(DOT);
				setState(338);
				((Full_table_nameContext)_localctx).schema = id();
				setState(339);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(341);
				((Full_table_nameContext)_localctx).database = id();
				setState(342);
				match(DOT);
				setState(344);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (FAST_FORWARD - 258)) | (1L << (FIRST - 258)) | (1L << (FOLLOWING - 258)) | (1L << (FORCE - 258)) | (1L << (FORCED - 258)) | (1L << (FORWARD_ONLY - 258)) | (1L << (FULLSCAN - 258)) | (1L << (GLOBAL - 258)) | (1L << (GO - 258)) | (1L << (GROUPING - 258)) | (1L << (GROUPING_ID - 258)) | (1L << (HASH - 258)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 258)) | (1L << (IMPERSONATE - 258)) | (1L << (INSENSITIVE - 258)) | (1L << (INSERTED - 258)) | (1L << (ISOLATION - 258)) | (1L << (KEEP - 258)) | (1L << (KEEPFIXED - 258)) | (1L << (KEYSET - 258)) | (1L << (LAST - 258)) | (1L << (LEVEL - 258)) | (1L << (LOCAL - 258)) | (1L << (LOCK_ESCALATION - 258)) | (1L << (LOGIN - 258)) | (1L << (LOOP - 258)) | (1L << (MARK - 258)) | (1L << (MAX - 258)) | (1L << (MAXDOP - 258)) | (1L << (MAXRECURSION - 258)) | (1L << (MIN - 258)) | (1L << (MODIFY - 258)) | (1L << (NAME - 258)) | (1L << (NEXT - 258)) | (1L << (NOCOUNT - 258)) | (1L << (NOEXPAND - 258)) | (1L << (NORECOMPUTE - 258)) | (1L << (NTILE - 258)) | (1L << (NUMBER - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLINE - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (ONLY - 322)) | (1L << (OPTIMISTIC - 322)) | (1L << (OPTIMIZE - 322)) | (1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (OWNER - 322)) | (1L << (PARAMETERIZATION - 322)) | (1L << (PARTITION - 322)) | (1L << (PATH - 322)) | (1L << (PRECEDING - 322)) | (1L << (PRIOR - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (RANGE - 322)) | (1L << (RANK - 322)) | (1L << (READONLY - 322)) | (1L << (READ_ONLY - 322)) | (1L << (RECOMPILE - 322)) | (1L << (RELATIVE - 322)) | (1L << (REMOTE - 322)) | (1L << (REPEATABLE - 322)) | (1L << (ROBUST - 322)) | (1L << (ROOT - 322)) | (1L << (ROW - 322)) | (1L << (ROWGUID - 322)) | (1L << (ROWS - 322)) | (1L << (ROW_NUMBER - 322)) | (1L << (SAMPLE - 322)) | (1L << (SCHEMABINDING - 322)) | (1L << (SCROLL - 322)) | (1L << (SCROLL_LOCKS - 322)) | (1L << (SELF - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SIMPLE - 322)) | (1L << (SNAPSHOT - 322)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 322)) | (1L << (STATIC - 322)) | (1L << (STATS_STREAM - 322)) | (1L << (STDEV - 322)) | (1L << (STDEVP - 322)) | (1L << (SUM - 322)) | (1L << (TEXTIMAGE_ON - 322)) | (1L << (THROW - 322)) | (1L << (TIES - 322)) | (1L << (TIME - 322)) | (1L << (TRY - 322)) | (1L << (TYPE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (TYPE_WARNING - 386)) | (1L << (UNBOUNDED - 386)) | (1L << (UNCOMMITTED - 386)) | (1L << (UNKNOWN - 386)) | (1L << (USING - 386)) | (1L << (VAR - 386)) | (1L << (VARP - 386)) | (1L << (VIEWS - 386)) | (1L << (VIEW_METADATA - 386)) | (1L << (WORK - 386)) | (1L << (XML - 386)) | (1L << (XMLNAMESPACES - 386)) | (1L << (DOUBLE_QUOTE_ID - 386)) | (1L << (LEFT_QUOTE_ID - 386)) | (1L << (ID - 386)))) != 0)) {
					{
					setState(343);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(346);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(348);
				((Full_table_nameContext)_localctx).schema = id();
				setState(349);
				match(DOT);
				}
				break;
			}
			setState(353);
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
		enterRule(_localctx, 48, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(355);
				((Table_nameContext)_localctx).database = id();
				setState(356);
				match(DOT);
				setState(358);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (FAST_FORWARD - 258)) | (1L << (FIRST - 258)) | (1L << (FOLLOWING - 258)) | (1L << (FORCE - 258)) | (1L << (FORCED - 258)) | (1L << (FORWARD_ONLY - 258)) | (1L << (FULLSCAN - 258)) | (1L << (GLOBAL - 258)) | (1L << (GO - 258)) | (1L << (GROUPING - 258)) | (1L << (GROUPING_ID - 258)) | (1L << (HASH - 258)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 258)) | (1L << (IMPERSONATE - 258)) | (1L << (INSENSITIVE - 258)) | (1L << (INSERTED - 258)) | (1L << (ISOLATION - 258)) | (1L << (KEEP - 258)) | (1L << (KEEPFIXED - 258)) | (1L << (KEYSET - 258)) | (1L << (LAST - 258)) | (1L << (LEVEL - 258)) | (1L << (LOCAL - 258)) | (1L << (LOCK_ESCALATION - 258)) | (1L << (LOGIN - 258)) | (1L << (LOOP - 258)) | (1L << (MARK - 258)) | (1L << (MAX - 258)) | (1L << (MAXDOP - 258)) | (1L << (MAXRECURSION - 258)) | (1L << (MIN - 258)) | (1L << (MODIFY - 258)) | (1L << (NAME - 258)) | (1L << (NEXT - 258)) | (1L << (NOCOUNT - 258)) | (1L << (NOEXPAND - 258)) | (1L << (NORECOMPUTE - 258)) | (1L << (NTILE - 258)) | (1L << (NUMBER - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLINE - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (ONLY - 322)) | (1L << (OPTIMISTIC - 322)) | (1L << (OPTIMIZE - 322)) | (1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (OWNER - 322)) | (1L << (PARAMETERIZATION - 322)) | (1L << (PARTITION - 322)) | (1L << (PATH - 322)) | (1L << (PRECEDING - 322)) | (1L << (PRIOR - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (RANGE - 322)) | (1L << (RANK - 322)) | (1L << (READONLY - 322)) | (1L << (READ_ONLY - 322)) | (1L << (RECOMPILE - 322)) | (1L << (RELATIVE - 322)) | (1L << (REMOTE - 322)) | (1L << (REPEATABLE - 322)) | (1L << (ROBUST - 322)) | (1L << (ROOT - 322)) | (1L << (ROW - 322)) | (1L << (ROWGUID - 322)) | (1L << (ROWS - 322)) | (1L << (ROW_NUMBER - 322)) | (1L << (SAMPLE - 322)) | (1L << (SCHEMABINDING - 322)) | (1L << (SCROLL - 322)) | (1L << (SCROLL_LOCKS - 322)) | (1L << (SELF - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SIMPLE - 322)) | (1L << (SNAPSHOT - 322)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 322)) | (1L << (STATIC - 322)) | (1L << (STATS_STREAM - 322)) | (1L << (STDEV - 322)) | (1L << (STDEVP - 322)) | (1L << (SUM - 322)) | (1L << (TEXTIMAGE_ON - 322)) | (1L << (THROW - 322)) | (1L << (TIES - 322)) | (1L << (TIME - 322)) | (1L << (TRY - 322)) | (1L << (TYPE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (TYPE_WARNING - 386)) | (1L << (UNBOUNDED - 386)) | (1L << (UNCOMMITTED - 386)) | (1L << (UNKNOWN - 386)) | (1L << (USING - 386)) | (1L << (VAR - 386)) | (1L << (VARP - 386)) | (1L << (VIEWS - 386)) | (1L << (VIEW_METADATA - 386)) | (1L << (WORK - 386)) | (1L << (XML - 386)) | (1L << (XMLNAMESPACES - 386)) | (1L << (DOUBLE_QUOTE_ID - 386)) | (1L << (LEFT_QUOTE_ID - 386)) | (1L << (ID - 386)))) != 0)) {
					{
					setState(357);
					((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(360);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(362);
				((Table_nameContext)_localctx).schema = id();
				setState(363);
				match(DOT);
				}
				break;
			}
			setState(367);
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
		enterRule(_localctx, 50, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(369);
				((Simple_nameContext)_localctx).schema = id();
				setState(370);
				match(DOT);
				}
				break;
			}
			setState(374);
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
		enterRule(_localctx, 52, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(376);
				((Func_proc_nameContext)_localctx).database = id();
				setState(377);
				match(DOT);
				setState(379);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (FAST_FORWARD - 258)) | (1L << (FIRST - 258)) | (1L << (FOLLOWING - 258)) | (1L << (FORCE - 258)) | (1L << (FORCED - 258)) | (1L << (FORWARD_ONLY - 258)) | (1L << (FULLSCAN - 258)) | (1L << (GLOBAL - 258)) | (1L << (GO - 258)) | (1L << (GROUPING - 258)) | (1L << (GROUPING_ID - 258)) | (1L << (HASH - 258)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 258)) | (1L << (IMPERSONATE - 258)) | (1L << (INSENSITIVE - 258)) | (1L << (INSERTED - 258)) | (1L << (ISOLATION - 258)) | (1L << (KEEP - 258)) | (1L << (KEEPFIXED - 258)) | (1L << (KEYSET - 258)) | (1L << (LAST - 258)) | (1L << (LEVEL - 258)) | (1L << (LOCAL - 258)) | (1L << (LOCK_ESCALATION - 258)) | (1L << (LOGIN - 258)) | (1L << (LOOP - 258)) | (1L << (MARK - 258)) | (1L << (MAX - 258)) | (1L << (MAXDOP - 258)) | (1L << (MAXRECURSION - 258)) | (1L << (MIN - 258)) | (1L << (MODIFY - 258)) | (1L << (NAME - 258)) | (1L << (NEXT - 258)) | (1L << (NOCOUNT - 258)) | (1L << (NOEXPAND - 258)) | (1L << (NORECOMPUTE - 258)) | (1L << (NTILE - 258)) | (1L << (NUMBER - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLINE - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (ONLY - 322)) | (1L << (OPTIMISTIC - 322)) | (1L << (OPTIMIZE - 322)) | (1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (OWNER - 322)) | (1L << (PARAMETERIZATION - 322)) | (1L << (PARTITION - 322)) | (1L << (PATH - 322)) | (1L << (PRECEDING - 322)) | (1L << (PRIOR - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (RANGE - 322)) | (1L << (RANK - 322)) | (1L << (READONLY - 322)) | (1L << (READ_ONLY - 322)) | (1L << (RECOMPILE - 322)) | (1L << (RELATIVE - 322)) | (1L << (REMOTE - 322)) | (1L << (REPEATABLE - 322)) | (1L << (ROBUST - 322)) | (1L << (ROOT - 322)) | (1L << (ROW - 322)) | (1L << (ROWGUID - 322)) | (1L << (ROWS - 322)) | (1L << (ROW_NUMBER - 322)) | (1L << (SAMPLE - 322)) | (1L << (SCHEMABINDING - 322)) | (1L << (SCROLL - 322)) | (1L << (SCROLL_LOCKS - 322)) | (1L << (SELF - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SIMPLE - 322)) | (1L << (SNAPSHOT - 322)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 322)) | (1L << (STATIC - 322)) | (1L << (STATS_STREAM - 322)) | (1L << (STDEV - 322)) | (1L << (STDEVP - 322)) | (1L << (SUM - 322)) | (1L << (TEXTIMAGE_ON - 322)) | (1L << (THROW - 322)) | (1L << (TIES - 322)) | (1L << (TIME - 322)) | (1L << (TRY - 322)) | (1L << (TYPE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (TYPE_WARNING - 386)) | (1L << (UNBOUNDED - 386)) | (1L << (UNCOMMITTED - 386)) | (1L << (UNKNOWN - 386)) | (1L << (USING - 386)) | (1L << (VAR - 386)) | (1L << (VARP - 386)) | (1L << (VIEWS - 386)) | (1L << (VIEW_METADATA - 386)) | (1L << (WORK - 386)) | (1L << (XML - 386)) | (1L << (XMLNAMESPACES - 386)) | (1L << (DOUBLE_QUOTE_ID - 386)) | (1L << (LEFT_QUOTE_ID - 386)) | (1L << (ID - 386)))) != 0)) {
					{
					setState(378);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(381);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(383);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(384);
				match(DOT);
				}
				break;
			}
			setState(388);
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
		enterRule(_localctx, 54, RULE_ddl_object);
		try {
			setState(392);
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
				setState(390);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
		enterRule(_localctx, 56, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(394);
				table_name();
				setState(395);
				match(DOT);
				}
				break;
			}
			setState(399);
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
		enterRule(_localctx, 58, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			id();
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(402);
				match(COMMA);
				setState(403);
				id();
				}
				}
				setState(408);
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
		enterRule(_localctx, 60, RULE_cursor_name);
		try {
			setState(411);
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
				setState(409);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
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
		enterRule(_localctx, 62, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		enterRule(_localctx, 64, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
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
		enterRule(_localctx, 66, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(417);
				match(NOT);
				}
			}

			setState(420);
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
		enterRule(_localctx, 68, RULE_scalar_function_name);
		try {
			setState(427);
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
				setState(422);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(424);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
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
		enterRule(_localctx, 70, RULE_ms_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			id();
			setState(431);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(430);
				match(IDENTITY);
				}
			}

			setState(440);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(433);
				match(LR_BRACKET);
				setState(434);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(437);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(435);
					match(COMMA);
					setState(436);
					match(DECIMAL_LITERAL);
					}
				}

				setState(439);
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
		enterRule(_localctx, 72, RULE_data_type);
		int _la;
		try {
			setState(754);
			switch (_input.LA(1)) {
			case BIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				match(BIT);
				setState(444);
				_la = _input.LA(1);
				if (_la==DECIMAL_LITERAL) {
					{
					setState(443);
					match(DECIMAL_LITERAL);
					}
				}

				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(TINYINT);
				setState(450);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(447);
					match(LR_BRACKET);
					setState(448);
					match(DECIMAL_LITERAL);
					setState(449);
					match(RR_BRACKET);
					}
				}

				setState(453);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(452);
					match(UNSIGNED);
					}
				}

				setState(456);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(455);
					match(ZEROFILL);
					}
				}

				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				match(SMALLINT);
				setState(462);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(459);
					match(LR_BRACKET);
					setState(460);
					match(DECIMAL_LITERAL);
					setState(461);
					match(RR_BRACKET);
					}
				}

				setState(465);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(464);
					match(UNSIGNED);
					}
				}

				setState(468);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(467);
					match(ZEROFILL);
					}
				}

				}
				break;
			case MEDIUMINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(470);
				match(MEDIUMINT);
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
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(482);
				match(INT);
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
			case INTEGER:
				enterOuterAlt(_localctx, 6);
				{
				setState(494);
				match(INTEGER);
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
			case BIGINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(506);
				match(BIGINT);
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
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(518);
				match(REAL);
				setState(524);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(519);
					match(LR_BRACKET);
					setState(520);
					match(DECIMAL_LITERAL);
					setState(521);
					match(COMMA);
					setState(522);
					match(DECIMAL_LITERAL);
					setState(523);
					match(RR_BRACKET);
					}
				}

				setState(527);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(526);
					match(UNSIGNED);
					}
				}

				setState(530);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(529);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(532);
				match(DOUBLE);
				setState(538);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(533);
					match(LR_BRACKET);
					setState(534);
					match(DECIMAL_LITERAL);
					setState(535);
					match(COMMA);
					setState(536);
					match(DECIMAL_LITERAL);
					setState(537);
					match(RR_BRACKET);
					}
				}

				setState(541);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(540);
					match(UNSIGNED);
					}
				}

				setState(544);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(543);
					match(ZEROFILL);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(546);
				match(FLOAT);
				setState(552);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(547);
					match(LR_BRACKET);
					setState(548);
					match(DECIMAL_LITERAL);
					setState(549);
					match(COMMA);
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
			case DECIMAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(560);
				match(DECIMAL);
				setState(568);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(561);
					match(LR_BRACKET);
					setState(562);
					match(DECIMAL_LITERAL);
					setState(565);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(563);
						match(COMMA);
						setState(564);
						match(DECIMAL_LITERAL);
						}
					}

					setState(567);
					match(RR_BRACKET);
					}
				}

				setState(571);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(570);
					match(UNSIGNED);
					}
				}

				setState(574);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(573);
					match(ZEROFILL);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 12);
				{
				setState(576);
				match(NUMERIC);
				setState(584);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(577);
					match(LR_BRACKET);
					setState(578);
					match(DECIMAL_LITERAL);
					setState(581);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(579);
						match(COMMA);
						setState(580);
						match(DECIMAL_LITERAL);
						}
					}

					setState(583);
					match(RR_BRACKET);
					}
				}

				setState(587);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(586);
					match(UNSIGNED);
					}
				}

				setState(590);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(589);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 13);
				{
				setState(592);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(593);
				match(TIME);
				setState(597);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(594);
					match(LR_BRACKET);
					setState(595);
					match(DECIMAL_LITERAL);
					setState(596);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 15);
				{
				setState(599);
				match(TIMESTAMP);
				setState(603);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(600);
					match(LR_BRACKET);
					setState(601);
					match(DECIMAL_LITERAL);
					setState(602);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(605);
				match(DATETIME);
				setState(609);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(606);
					match(LR_BRACKET);
					setState(607);
					match(DECIMAL_LITERAL);
					setState(608);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(611);
				match(YEAR);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(612);
				match(CHAR);
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

				setState(619);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(618);
					match(BINARY);
					}
				}

				setState(624);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(621);
					match(CHARACTER);
					setState(622);
					match(SET);
					setState(623);
					id();
					}
				}

				setState(628);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(626);
					match(COLLATE);
					setState(627);
					id();
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(630);
				match(VARCHAR);
				setState(634);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(631);
					match(LR_BRACKET);
					setState(632);
					match(DECIMAL_LITERAL);
					setState(633);
					match(RR_BRACKET);
					}
				}

				setState(637);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(636);
					match(BINARY);
					}
				}

				setState(642);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(639);
					match(CHARACTER);
					setState(640);
					match(SET);
					setState(641);
					id();
					}
				}

				setState(646);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(644);
					match(COLLATE);
					setState(645);
					id();
					}
				}

				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 20);
				{
				setState(648);
				match(BINARY);
				setState(652);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(649);
					match(LR_BRACKET);
					setState(650);
					match(DECIMAL_LITERAL);
					setState(651);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 21);
				{
				setState(654);
				match(VARBINARY);
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

				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 22);
				{
				setState(660);
				match(BOOLEAN);
				}
				break;
			case TINYBLOB:
				enterOuterAlt(_localctx, 23);
				{
				setState(661);
				match(TINYBLOB);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 24);
				{
				setState(662);
				match(BLOB);
				}
				break;
			case MEDIUMBLOB:
				enterOuterAlt(_localctx, 25);
				{
				setState(663);
				match(MEDIUMBLOB);
				}
				break;
			case LONGBLOB:
				enterOuterAlt(_localctx, 26);
				{
				setState(664);
				match(LONGBLOB);
				}
				break;
			case TINYTEXT:
				enterOuterAlt(_localctx, 27);
				{
				setState(665);
				match(TINYTEXT);
				setState(667);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(666);
					match(BINARY);
					}
				}

				setState(672);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(669);
					match(CHARACTER);
					setState(670);
					match(SET);
					setState(671);
					id();
					}
				}

				setState(676);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(674);
					match(COLLATE);
					setState(675);
					id();
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(678);
				match(TEXT);
				setState(680);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(679);
					match(BINARY);
					}
				}

				setState(685);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(682);
					match(CHARACTER);
					setState(683);
					match(SET);
					setState(684);
					id();
					}
				}

				setState(689);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(687);
					match(COLLATE);
					setState(688);
					id();
					}
				}

				}
				break;
			case MEDIUMTEXT:
				enterOuterAlt(_localctx, 29);
				{
				setState(691);
				match(MEDIUMTEXT);
				setState(693);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(692);
					match(BINARY);
					}
				}

				setState(698);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(695);
					match(CHARACTER);
					setState(696);
					match(SET);
					setState(697);
					id();
					}
				}

				setState(702);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(700);
					match(COLLATE);
					setState(701);
					id();
					}
				}

				}
				break;
			case LONGTEXT:
				enterOuterAlt(_localctx, 30);
				{
				setState(704);
				match(LONGTEXT);
				setState(706);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(705);
					match(BINARY);
					}
				}

				setState(711);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(708);
					match(CHARACTER);
					setState(709);
					match(SET);
					setState(710);
					id();
					}
				}

				setState(715);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(713);
					match(COLLATE);
					setState(714);
					id();
					}
				}

				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 31);
				{
				setState(717);
				match(ENUM);
				{
				setState(718);
				match(LR_BRACKET);
				setState(719);
				id();
				setState(722);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(720);
					match(COMMA);
					setState(721);
					id();
					}
				}

				setState(724);
				match(RR_BRACKET);
				}
				setState(729);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(726);
					match(CHARACTER);
					setState(727);
					match(SET);
					setState(728);
					id();
					}
				}

				setState(733);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(731);
					match(COLLATE);
					setState(732);
					id();
					}
				}

				}
				break;
			case SET:
				enterOuterAlt(_localctx, 32);
				{
				setState(735);
				match(SET);
				{
				setState(736);
				match(LR_BRACKET);
				setState(737);
				id();
				setState(740);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(738);
					match(COMMA);
					setState(739);
					id();
					}
				}

				setState(742);
				match(RR_BRACKET);
				}
				setState(747);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(744);
					match(CHARACTER);
					setState(745);
					match(SET);
					setState(746);
					id();
					}
				}

				setState(751);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(749);
					match(COLLATE);
					setState(750);
					id();
					}
				}

				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 33);
				{
				setState(753);
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
		enterRule(_localctx, 74, RULE_default_value);
		try {
			setState(758);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(756);
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
				setState(757);
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
		enterRule(_localctx, 76, RULE_constant);
		int _la;
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(761);
				match(BINARY_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(763);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(762);
					sign();
					}
				}

				setState(765);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(767);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(766);
					sign();
					}
				}

				setState(769);
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
				setState(771);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(770);
					sign();
					}
				}

				setState(773);
				((ConstantContext)_localctx).dollar = match(DOLLAR);
				setState(774);
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
		enterRule(_localctx, 78, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
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
		enterRule(_localctx, 80, RULE_id);
		try {
			setState(782);
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
				setState(779);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case LEFT_QUOTE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
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
		enterRule(_localctx, 82, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_la = _input.LA(1);
			if ( !(_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)))) != 0) || ((((_la - 258)) & ~0x3f) == 0 && ((1L << (_la - 258)) & ((1L << (FAST_FORWARD - 258)) | (1L << (FIRST - 258)) | (1L << (FOLLOWING - 258)) | (1L << (FORCE - 258)) | (1L << (FORCED - 258)) | (1L << (FORWARD_ONLY - 258)) | (1L << (FULLSCAN - 258)) | (1L << (GLOBAL - 258)) | (1L << (GO - 258)) | (1L << (GROUPING - 258)) | (1L << (GROUPING_ID - 258)) | (1L << (HASH - 258)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 258)) | (1L << (IMPERSONATE - 258)) | (1L << (INSENSITIVE - 258)) | (1L << (INSERTED - 258)) | (1L << (ISOLATION - 258)) | (1L << (KEEP - 258)) | (1L << (KEEPFIXED - 258)) | (1L << (KEYSET - 258)) | (1L << (LAST - 258)) | (1L << (LEVEL - 258)) | (1L << (LOCAL - 258)) | (1L << (LOCK_ESCALATION - 258)) | (1L << (LOGIN - 258)) | (1L << (LOOP - 258)) | (1L << (MARK - 258)) | (1L << (MAX - 258)) | (1L << (MAXDOP - 258)) | (1L << (MAXRECURSION - 258)) | (1L << (MIN - 258)) | (1L << (MODIFY - 258)) | (1L << (NAME - 258)) | (1L << (NEXT - 258)) | (1L << (NOCOUNT - 258)) | (1L << (NOEXPAND - 258)) | (1L << (NORECOMPUTE - 258)) | (1L << (NTILE - 258)) | (1L << (NUMBER - 258)) | (1L << (OFFSET - 258)) | (1L << (ONLINE - 258)))) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & ((1L << (ONLY - 322)) | (1L << (OPTIMISTIC - 322)) | (1L << (OPTIMIZE - 322)) | (1L << (OUT - 322)) | (1L << (OUTPUT - 322)) | (1L << (OWNER - 322)) | (1L << (PARAMETERIZATION - 322)) | (1L << (PARTITION - 322)) | (1L << (PATH - 322)) | (1L << (PRECEDING - 322)) | (1L << (PRIOR - 322)) | (1L << (PRIVILEGES - 322)) | (1L << (RANGE - 322)) | (1L << (RANK - 322)) | (1L << (READONLY - 322)) | (1L << (READ_ONLY - 322)) | (1L << (RECOMPILE - 322)) | (1L << (RELATIVE - 322)) | (1L << (REMOTE - 322)) | (1L << (REPEATABLE - 322)) | (1L << (ROBUST - 322)) | (1L << (ROOT - 322)) | (1L << (ROW - 322)) | (1L << (ROWGUID - 322)) | (1L << (ROWS - 322)) | (1L << (ROW_NUMBER - 322)) | (1L << (SAMPLE - 322)) | (1L << (SCHEMABINDING - 322)) | (1L << (SCROLL - 322)) | (1L << (SCROLL_LOCKS - 322)) | (1L << (SELF - 322)) | (1L << (SERIALIZABLE - 322)) | (1L << (SIMPLE - 322)) | (1L << (SNAPSHOT - 322)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 322)) | (1L << (STATIC - 322)) | (1L << (STATS_STREAM - 322)) | (1L << (STDEV - 322)) | (1L << (STDEVP - 322)) | (1L << (SUM - 322)) | (1L << (TEXTIMAGE_ON - 322)) | (1L << (THROW - 322)) | (1L << (TIES - 322)) | (1L << (TIME - 322)) | (1L << (TRY - 322)) | (1L << (TYPE - 322)))) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & ((1L << (TYPE_WARNING - 386)) | (1L << (UNBOUNDED - 386)) | (1L << (UNCOMMITTED - 386)) | (1L << (UNKNOWN - 386)) | (1L << (USING - 386)) | (1L << (VAR - 386)) | (1L << (VARP - 386)) | (1L << (VIEWS - 386)) | (1L << (VIEW_METADATA - 386)) | (1L << (WORK - 386)) | (1L << (XML - 386)) | (1L << (XMLNAMESPACES - 386)) | (1L << (ID - 386)))) != 0)) ) {
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
		enterRule(_localctx, 84, RULE_comparison_operator);
		try {
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				match(LESS);
				setState(790);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(791);
				match(GREATER);
				setState(792);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(793);
				match(LESS);
				setState(794);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(795);
				match(EXCLAMATION);
				setState(796);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(797);
				match(EXCLAMATION);
				setState(798);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(799);
				match(EXCLAMATION);
				setState(800);
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
		enterRule(_localctx, 86, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_la = _input.LA(1);
			if ( !(((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & ((1L << (PLUS_ASSIGN - 450)) | (1L << (MINUS_ASSIGN - 450)) | (1L << (MULT_ASSIGN - 450)) | (1L << (DIV_ASSIGN - 450)) | (1L << (MOD_ASSIGN - 450)) | (1L << (AND_ASSIGN - 450)) | (1L << (XOR_ASSIGN - 450)) | (1L << (OR_ASSIGN - 450)))) != 0)) ) {
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
		enterRule(_localctx, 88, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(DECIMAL_LITERAL);
			setState(807);
			_la = _input.LA(1);
			if (((((_la - 268)) & ~0x3f) == 0 && ((1L << (_la - 268)) & ((1L << (GB - 268)) | (1L << (KB - 268)) | (1L << (MB - 268)))) != 0) || _la==TB || _la==MODULE) {
				{
				setState(806);
				_la = _input.LA(1);
				if ( !(((((_la - 268)) & ~0x3f) == 0 && ((1L << (_la - 268)) & ((1L << (GB - 268)) | (1L << (KB - 268)) | (1L << (MB - 268)))) != 0) || _la==TB || _la==MODULE) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01de\u032c\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\7\2^\n\2\f\2\16\2a\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\6\4j\n\4\r\4\16\4k\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\5\6w\n\6\3"+
		"\6\5\6z\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0083\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3\7\3\7\5\7\u0095"+
		"\n\7\3\7\5\7\u0098\n\7\3\b\3\b\3\b\5\b\u009d\n\b\3\t\5\t\u00a0\n\t\3\t"+
		"\3\t\5\t\u00a4\n\t\3\t\3\t\3\n\3\n\3\13\3\13\5\13\u00ac\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u00bd\n"+
		"\16\3\16\3\16\3\16\5\16\u00c2\n\16\3\16\5\16\u00c5\n\16\3\17\3\17\3\17"+
		"\3\17\5\17\u00cb\n\17\3\17\3\17\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3"+
		"\21\5\21\u00d6\n\21\3\21\5\21\u00d9\n\21\3\21\5\21\u00dc\n\21\3\21\3\21"+
		"\5\21\u00e0\n\21\5\21\u00e2\n\21\3\21\3\21\5\21\u00e6\n\21\3\22\3\22\3"+
		"\22\5\22\u00eb\n\22\3\22\3\22\3\22\5\22\u00f0\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fd\n\24\3\25\3\25\5\25\u0101"+
		"\n\25\3\25\5\25\u0104\n\25\3\25\3\25\3\25\5\25\u0109\n\25\3\25\5\25\u010c"+
		"\n\25\3\26\3\26\5\26\u0110\n\26\3\26\3\26\3\26\5\26\u0115\n\26\3\26\5"+
		"\26\u0118\n\26\3\26\3\26\3\26\5\26\u011d\n\26\3\26\3\26\3\26\5\26\u0122"+
		"\n\26\3\26\3\26\5\26\u0126\n\26\3\26\3\26\3\26\5\26\u012b\n\26\3\26\3"+
		"\26\3\26\5\26\u0130\n\26\3\26\3\26\5\26\u0134\n\26\3\26\3\26\3\26\5\26"+
		"\u0139\n\26\3\26\3\26\3\26\5\26\u013e\n\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u014b\n\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u015b\n\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u0162\n\31\3\31\3\31\3\32\3\32\3\32\5\32\u0169\n"+
		"\32\3\32\3\32\3\32\3\32\3\32\5\32\u0170\n\32\3\32\3\32\3\33\3\33\3\33"+
		"\5\33\u0177\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u017e\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0185\n\34\3\34\3\34\3\35\3\35\5\35\u018b\n\35\3\36"+
		"\3\36\3\36\5\36\u0190\n\36\3\36\3\36\3\37\3\37\3\37\7\37\u0197\n\37\f"+
		"\37\16\37\u019a\13\37\3 \3 \5 \u019e\n \3!\3!\3\"\3\"\3#\5#\u01a5\n#\3"+
		"#\3#\3$\3$\3$\3$\3$\5$\u01ae\n$\3%\3%\5%\u01b2\n%\3%\3%\3%\3%\5%\u01b8"+
		"\n%\3%\5%\u01bb\n%\3&\3&\5&\u01bf\n&\3&\3&\3&\3&\5&\u01c5\n&\3&\5&\u01c8"+
		"\n&\3&\5&\u01cb\n&\3&\3&\3&\3&\5&\u01d1\n&\3&\5&\u01d4\n&\3&\5&\u01d7"+
		"\n&\3&\3&\3&\3&\5&\u01dd\n&\3&\5&\u01e0\n&\3&\5&\u01e3\n&\3&\3&\3&\3&"+
		"\5&\u01e9\n&\3&\5&\u01ec\n&\3&\5&\u01ef\n&\3&\3&\3&\3&\5&\u01f5\n&\3&"+
		"\5&\u01f8\n&\3&\5&\u01fb\n&\3&\3&\3&\3&\5&\u0201\n&\3&\5&\u0204\n&\3&"+
		"\5&\u0207\n&\3&\3&\3&\3&\3&\3&\5&\u020f\n&\3&\5&\u0212\n&\3&\5&\u0215"+
		"\n&\3&\3&\3&\3&\3&\3&\5&\u021d\n&\3&\5&\u0220\n&\3&\5&\u0223\n&\3&\3&"+
		"\3&\3&\3&\3&\5&\u022b\n&\3&\5&\u022e\n&\3&\5&\u0231\n&\3&\3&\3&\3&\3&"+
		"\5&\u0238\n&\3&\5&\u023b\n&\3&\5&\u023e\n&\3&\5&\u0241\n&\3&\3&\3&\3&"+
		"\3&\5&\u0248\n&\3&\5&\u024b\n&\3&\5&\u024e\n&\3&\5&\u0251\n&\3&\3&\3&"+
		"\3&\3&\5&\u0258\n&\3&\3&\3&\3&\5&\u025e\n&\3&\3&\3&\3&\5&\u0264\n&\3&"+
		"\3&\3&\3&\3&\5&\u026b\n&\3&\5&\u026e\n&\3&\3&\3&\5&\u0273\n&\3&\3&\5&"+
		"\u0277\n&\3&\3&\3&\3&\5&\u027d\n&\3&\5&\u0280\n&\3&\3&\3&\5&\u0285\n&"+
		"\3&\3&\5&\u0289\n&\3&\3&\3&\3&\5&\u028f\n&\3&\3&\3&\3&\5&\u0295\n&\3&"+
		"\3&\3&\3&\3&\3&\3&\5&\u029e\n&\3&\3&\3&\5&\u02a3\n&\3&\3&\5&\u02a7\n&"+
		"\3&\3&\5&\u02ab\n&\3&\3&\3&\5&\u02b0\n&\3&\3&\5&\u02b4\n&\3&\3&\5&\u02b8"+
		"\n&\3&\3&\3&\5&\u02bd\n&\3&\3&\5&\u02c1\n&\3&\3&\5&\u02c5\n&\3&\3&\3&"+
		"\5&\u02ca\n&\3&\3&\5&\u02ce\n&\3&\3&\3&\3&\3&\5&\u02d5\n&\3&\3&\3&\3&"+
		"\3&\5&\u02dc\n&\3&\3&\5&\u02e0\n&\3&\3&\3&\3&\3&\5&\u02e7\n&\3&\3&\3&"+
		"\3&\3&\5&\u02ee\n&\3&\3&\5&\u02f2\n&\3&\5&\u02f5\n&\3\'\3\'\5\'\u02f9"+
		"\n\'\3(\3(\3(\5(\u02fe\n(\3(\3(\5(\u0302\n(\3(\3(\5(\u0306\n(\3(\3(\5"+
		"(\u030a\n(\3)\3)\3*\3*\3*\5*\u0311\n*\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\3,\5,\u0324\n,\3-\3-\3.\3.\5.\u032a\n.\3.\2\2/\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\2\16\4\2\n\n\66\66\4\2\u0083\u0083\u00b3\u00b3\4\2\24\24\u008f\u008f"+
		"\4\2qqss\4\2\33\33kk\4\2\u0129\u0129\u01ba\u01ba\3\2\u01be\u01bf\4\2\u01ba"+
		"\u01ba\u01be\u01be\3\2\u01d9\u01da.\2JJ\u00c4\u00c4\u00cc\u00cc\u00ce"+
		"\u00ce\u00d5\u00d6\u00d9\u00db\u00e0\u00e0\u00e2\u00e2\u00e4\u00e4\u00e6"+
		"\u00e9\u00f5\u00f5\u00f7\u00f8\u00fa\u00fa\u00fd\u00fd\u0100\u0100\u0102"+
		"\u0104\u0108\u010d\u010f\u0112\u0114\u0114\u0117\u0117\u0119\u0119\u011b"+
		"\u011d\u011f\u012b\u012f\u012f\u0133\u0133\u0135\u0135\u0138\u013a\u013c"+
		"\u013c\u013e\u013f\u0142\u0149\u014b\u0150\u0152\u0154\u0156\u0156\u0158"+
		"\u0158\u015b\u015d\u015f\u0168\u016a\u016b\u016d\u016d\u0170\u0176\u017a"+
		"\u017d\u0181\u0181\u0183\u0187\u0189\u0190\u01bb\u01bb\3\2\u01c4\u01cb"+
		"\7\2\u010e\u010e\u011e\u011e\u012d\u012d\u0179\u0179\u01d8\u01d8\u03bd"+
		"\2_\3\2\2\2\4d\3\2\2\2\6i\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\f\u0086\3\2\2"+
		"\2\16\u0099\3\2\2\2\20\u009f\3\2\2\2\22\u00a7\3\2\2\2\24\u00a9\3\2\2\2"+
		"\26\u00af\3\2\2\2\30\u00b2\3\2\2\2\32\u00b8\3\2\2\2\34\u00c6\3\2\2\2\36"+
		"\u00d0\3\2\2\2 \u00d2\3\2\2\2\"\u00e7\3\2\2\2$\u00f3\3\2\2\2&\u00fc\3"+
		"\2\2\2(\u0100\3\2\2\2*\u013d\3\2\2\2,\u013f\3\2\2\2.\u014c\3\2\2\2\60"+
		"\u0161\3\2\2\2\62\u016f\3\2\2\2\64\u0176\3\2\2\2\66\u0184\3\2\2\28\u018a"+
		"\3\2\2\2:\u018f\3\2\2\2<\u0193\3\2\2\2>\u019d\3\2\2\2@\u019f\3\2\2\2B"+
		"\u01a1\3\2\2\2D\u01a4\3\2\2\2F\u01ad\3\2\2\2H\u01af\3\2\2\2J\u02f4\3\2"+
		"\2\2L\u02f8\3\2\2\2N\u0309\3\2\2\2P\u030b\3\2\2\2R\u0310\3\2\2\2T\u0312"+
		"\3\2\2\2V\u0323\3\2\2\2X\u0325\3\2\2\2Z\u0327\3\2\2\2\\^\5\4\3\2]\\\3"+
		"\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2a_\3\2\2\2bc\7\2\2\3c\3"+
		"\3\2\2\2de\5\6\4\2e\5\3\2\2\2fg\5\b\5\2gh\7\u01d4\2\2hj\3\2\2\2if\3\2"+
		"\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\7\3\2\2\2ms\5\n\6\2ns\5\f\7\2os\5"+
		"\30\r\2ps\5\32\16\2qs\5\34\17\2rm\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2"+
		"\2rq\3\2\2\2s\t\3\2\2\2tv\7\'\2\2uw\7\u00b3\2\2vu\3\2\2\2vw\3\2\2\2wy"+
		"\3\2\2\2xz\5B\"\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7Z\2\2|}\5R*\2}~\7s"+
		"\2\2~\177\5\62\32\2\177\u0080\7\u01d1\2\2\u0080\u0082\5<\37\2\u0081\u0083"+
		"\t\2\2\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\7\u01d2\2\2\u0085\13\3\2\2\2\u0086\u0087\7\'\2\2\u0087\u0088\7"+
		"\u00a6\2\2\u0088\u0089\5\62\32\2\u0089\u008a\7\u01d1\2\2\u008a\u008f\5"+
		"\36\20\2\u008b\u008c\7\u01d3\2\2\u008c\u008e\5\36\20\2\u008d\u008b\3\2"+
		"\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\u01d2\2\2\u0093\u0095"+
		"\5\16\b\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0098\5\24\13\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\r"+
		"\3\2\2\2\u0099\u009c\5\20\t\2\u009a\u009b\7\u01d3\2\2\u009b\u009d\5\16"+
		"\b\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\17\3\2\2\2\u009e\u00a0"+
		"\7\63\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2"+
		"\u00a1\u00a3\7\u00de\2\2\u00a2\u00a4\7\u01c0\2\2\u00a3\u00a2\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\22\n\2\u00a6\21\3\2\2"+
		"\2\u00a7\u00a8\7\3\2\2\u00a8\23\3\2\2\2\u00a9\u00ab\7\u00e1\2\2\u00aa"+
		"\u00ac\7\u01c0\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad\u00ae\7\u01bc\2\2\u00ae\25\3\2\2\2\u00af\u00b0\7\u00e1"+
		"\2\2\u00b0\u00b1\7\u01bc\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\u00b4\7\u00a6\2\2\u00b4\u00b5\5\62\32\2\u00b5\u00b6\7\4\2\2\u00b6\u00b7"+
		"\5\36\20\2\u00b7\31\3\2\2\2\u00b8\u00b9\7:\2\2\u00b9\u00bc\7Z\2\2\u00ba"+
		"\u00bb\7X\2\2\u00bb\u00bd\7B\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2"+
		"\2\u00bd\u00be\3\2\2\2\u00be\u00c1\5R*\2\u00bf\u00c0\7s\2\2\u00c0\u00c2"+
		"\5\62\32\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2"+
		"\u00c3\u00c5\7\u01d4\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\33\3\2\2\2\u00c6\u00c7\7:\2\2\u00c7\u00ca\7\u00a6\2\2\u00c8\u00c9\7X"+
		"\2\2\u00c9\u00cb\7B\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\5\62\32\2\u00cd\35\3\2\2\2\u00ce\u00d1\5 \21"+
		"\2\u00cf\u00d1\5*\26\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\37"+
		"\3\2\2\2\u00d2\u00d3\5R*\2\u00d3\u00d5\5J&\2\u00d4\u00d6\5D#\2\u00d5\u00d4"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\5$\23\2\u00d8"+
		"\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2\2\2\u00da\u00dc\7\f"+
		"\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e1\3\2\2\2\u00dd"+
		"\u00df\t\3\2\2\u00de\u00e0\7a\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2"+
		"\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e4\7\u00e1\2\2\u00e4\u00e6\7\u01bc\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00e8\5R*\2\u00e8\u00ea"+
		"\5J&\2\u00e9\u00eb\5D#\2\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ef\3\2\2\2\u00ec\u00ed\7\63\2\2\u00ed\u00f0\5&\24\2\u00ee\u00f0\7"+
		"\f\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\5\26\f\2\u00f2#\3\2\2\2\u00f3\u00f4\7\63\2"+
		"\2\u00f4\u00f5\5&\24\2\u00f5%\3\2\2\2\u00f6\u00fd\7n\2\2\u00f7\u00fd\5"+
		"N(\2\u00f8\u00f9\7\u01d1\2\2\u00f9\u00fa\5&\24\2\u00fa\u00fb\7\u01d2\2"+
		"\2\u00fb\u00fd\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fc\u00f7\3\2\2\2\u00fc\u00f8"+
		"\3\2\2\2\u00fd\'\3\2\2\2\u00fe\u00ff\7!\2\2\u00ff\u0101\5R*\2\u0100\u00fe"+
		"\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0104\5D#\2\u0103"+
		"\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0108\3\2\2\2\u0105\u0106\7\u0083"+
		"\2\2\u0106\u0109\7a\2\2\u0107\u0109\7\u00b3\2\2\u0108\u0105\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u010c\5B\"\2\u010b\u010a\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c)\3\2\2\2\u010d\u010e\7!\2\2\u010e\u0110"+
		"\5R*\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0114\3\2\2\2\u0111"+
		"\u0112\7\u0083\2\2\u0112\u0115\7a\2\2\u0113\u0115\7\u00b3\2\2\u0114\u0111"+
		"\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0118\5B\"\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\7\u01d1"+
		"\2\2\u011a\u011c\5<\37\2\u011b\u011d\t\2\2\2\u011c\u011b\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\7\u01d2\2\2\u011f\u013e"+
		"\3\2\2\2\u0120\u0122\7\u00b3\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2"+
		"\2\u0122\u0123\3\2\2\2\u0123\u0125\7a\2\2\u0124\u0126\5R*\2\u0125\u0124"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\u01d1\2"+
		"\2\u0128\u012a\5<\37\2\u0129\u012b\t\2\2\2\u012a\u0129\3\2\2\2\u012a\u012b"+
		"\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7\u01d2\2\2\u012d\u013e\3\2\2"+
		"\2\u012e\u0130\7\u00b3\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0133\7Z\2\2\u0132\u0134\5R*\2\u0133\u0132\3\2\2"+
		"\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\7\u01d1\2\2\u0136"+
		"\u0138\5<\37\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7\u01d2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013e\5,\27\2\u013d\u010f\3\2\2\2\u013d\u0121\3\2\2\2\u013d\u012f\3\2"+
		"\2\2\u013d\u013c\3\2\2\2\u013e+\3\2\2\2\u013f\u0140\7K\2\2\u0140\u0141"+
		"\7a\2\2\u0141\u0142\7\u01d1\2\2\u0142\u0143\5<\37\2\u0143\u0144\7\u01d2"+
		"\2\2\u0144\u0145\7\u008c\2\2\u0145\u0146\5R*\2\u0146\u0147\7\u01d1\2\2"+
		"\u0147\u0148\5<\37\2\u0148\u014a\7\u01d2\2\2\u0149\u014b\5.\30\2\u014a"+
		"\u0149\3\2\2\2\u014a\u014b\3\2\2\2\u014b-\3\2\2\2\u014c\u014d\7s\2\2\u014d"+
		"\u014e\7\64\2\2\u014e\u014f\t\4\2\2\u014f/\3\2\2\2\u0150\u0151\5R*\2\u0151"+
		"\u0152\7\u01cc\2\2\u0152\u0153\5R*\2\u0153\u0154\7\u01cc\2\2\u0154\u0155"+
		"\5R*\2\u0155\u0156\7\u01cc\2\2\u0156\u0162\3\2\2\2\u0157\u0158\5R*\2\u0158"+
		"\u015a\7\u01cc\2\2\u0159\u015b\5R*\2\u015a\u0159\3\2\2\2\u015a\u015b\3"+
		"\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7\u01cc\2\2\u015d\u0162\3\2\2\2"+
		"\u015e\u015f\5R*\2\u015f\u0160\7\u01cc\2\2\u0160\u0162\3\2\2\2\u0161\u0150"+
		"\3\2\2\2\u0161\u0157\3\2\2\2\u0161\u015e\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\5R*\2\u0164\61\3\2\2\2\u0165\u0166\5R*\2\u0166"+
		"\u0168\7\u01cc\2\2\u0167\u0169\5R*\2\u0168\u0167\3\2\2\2\u0168\u0169\3"+
		"\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7\u01cc\2\2\u016b\u0170\3\2\2\2"+
		"\u016c\u016d\5R*\2\u016d\u016e\7\u01cc\2\2\u016e\u0170\3\2\2\2\u016f\u0165"+
		"\3\2\2\2\u016f\u016c\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0172\5R*\2\u0172\63\3\2\2\2\u0173\u0174\5R*\2\u0174\u0175\7\u01cc\2"+
		"\2\u0175\u0177\3\2\2\2\u0176\u0173\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u0179\5R*\2\u0179\65\3\2\2\2\u017a\u017b\5R*\2\u017b\u017d"+
		"\7\u01cc\2\2\u017c\u017e\5R*\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2"+
		"\u017e\u017f\3\2\2\2\u017f\u0180\7\u01cc\2\2\u0180\u0185\3\2\2\2\u0181"+
		"\u0182\5R*\2\u0182\u0183\7\u01cc\2\2\u0183\u0185\3\2\2\2\u0184\u017a\3"+
		"\2\2\2\u0184\u0181\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186"+
		"\u0187\5R*\2\u0187\67\3\2\2\2\u0188\u018b\5\60\31\2\u0189\u018b\7\u01b9"+
		"\2\2\u018a\u0188\3\2\2\2\u018a\u0189\3\2\2\2\u018b9\3\2\2\2\u018c\u018d"+
		"\5\62\32\2\u018d\u018e\7\u01cc\2\2\u018e\u0190\3\2\2\2\u018f\u018c\3\2"+
		"\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\5R*\2\u0192;"+
		"\3\2\2\2\u0193\u0198\5R*\2\u0194\u0195\7\u01d3\2\2\u0195\u0197\5R*\2\u0196"+
		"\u0194\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199=\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019e\5R*\2\u019c\u019e"+
		"\7\u01b9\2\2\u019d\u019b\3\2\2\2\u019d\u019c\3\2\2\2\u019e?\3\2\2\2\u019f"+
		"\u01a0\t\5\2\2\u01a0A\3\2\2\2\u01a1\u01a2\t\6\2\2\u01a2C\3\2\2\2\u01a3"+
		"\u01a5\7m\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\7n\2\2\u01a7E\3\2\2\2\u01a8\u01ae\5\66\34\2\u01a9\u01ae"+
		"\7\u0093\2\2\u01aa\u01ae\7c\2\2\u01ab\u01ae\7\u00d7\2\2\u01ac\u01ae\7"+
		"\u00df\2\2\u01ad\u01a8\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01aa\3\2\2\2"+
		"\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01aeG\3\2\2\2\u01af\u01b1\5"+
		"R*\2\u01b0\u01b2\7U\2\2\u01b1\u01b0\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"\u01ba\3\2\2\2\u01b3\u01b4\7\u01d1\2\2\u01b4\u01b7\t\7\2\2\u01b5\u01b6"+
		"\7\u01d3\2\2\u01b6\u01b8\7\u01ba\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3"+
		"\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7\u01d2\2\2\u01ba\u01b3\3\2\2\2"+
		"\u01ba\u01bb\3\2\2\2\u01bbI\3\2\2\2\u01bc\u01be\7\u0193\2\2\u01bd\u01bf"+
		"\7\u01ba\2\2\u01be\u01bd\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u02f5\3\2\2"+
		"\2\u01c0\u01c4\7\u0196\2\2\u01c1\u01c2\7\u01d1\2\2\u01c2\u01c3\7\u01ba"+
		"\2\2\u01c3\u01c5\7\u01d2\2\2\u01c4\u01c1\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01c8\7\u00b5\2\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8"+
		"\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01cb\7\u0191\2\2\u01ca\u01c9\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u02f5\3\2\2\2\u01cc\u01d0\7\u0197\2\2\u01cd"+
		"\u01ce\7\u01d1\2\2\u01ce\u01cf\7\u01ba\2\2\u01cf\u01d1\7\u01d2\2\2\u01d0"+
		"\u01cd\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d4\7\u00b5"+
		"\2\2\u01d3\u01d2\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5"+
		"\u01d7\7\u0191\2\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u02f5"+
		"\3\2\2\2\u01d8\u01dc\7\u0198\2\2\u01d9\u01da\7\u01d1\2\2\u01da\u01db\7"+
		"\u01ba\2\2\u01db\u01dd\7\u01d2\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\7\u00b5\2\2\u01df\u01de\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\7\u0191\2\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u02f5\3\2\2\2\u01e4\u01e8\7\u0199\2"+
		"\2\u01e5\u01e6\7\u01d1\2\2\u01e6\u01e7\7\u01ba\2\2\u01e7\u01e9\7\u01d2"+
		"\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea"+
		"\u01ec\7\u00b5\2\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee"+
		"\3\2\2\2\u01ed\u01ef\7\u0191\2\2\u01ee\u01ed\3\2\2\2\u01ee\u01ef\3\2\2"+
		"\2\u01ef\u02f5\3\2\2\2\u01f0\u01f4\7\u019a\2\2\u01f1\u01f2\7\u01d1\2\2"+
		"\u01f2\u01f3\7\u01ba\2\2\u01f3\u01f5\7\u01d2\2\2\u01f4\u01f1\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f8\7\u00b5\2\2\u01f7\u01f6"+
		"\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01fb\7\u0191\2"+
		"\2\u01fa\u01f9\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u02f5\3\2\2\2\u01fc\u0200"+
		"\7\u019b\2\2\u01fd\u01fe\7\u01d1\2\2\u01fe\u01ff\7\u01ba\2\2\u01ff\u0201"+
		"\7\u01d2\2\2\u0200\u01fd\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2"+
		"\2\u0202\u0204\7\u00b5\2\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204"+
		"\u0206\3\2\2\2\u0205\u0207\7\u0191\2\2\u0206\u0205\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\u02f5\3\2\2\2\u0208\u020e\7\u019c\2\2\u0209\u020a\7\u01d1"+
		"\2\2\u020a\u020b\7\u01ba\2\2\u020b\u020c\7\u01d3\2\2\u020c\u020d\7\u01ba"+
		"\2\2\u020d\u020f\7\u01d2\2\2\u020e\u0209\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u0212\7\u00b5\2\2\u0211\u0210\3\2\2\2\u0211\u0212"+
		"\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\7\u0191\2\2\u0214\u0213\3\2\2"+
		"\2\u0214\u0215\3\2\2\2\u0215\u02f5\3\2\2\2\u0216\u021c\7\u019e\2\2\u0217"+
		"\u0218\7\u01d1\2\2\u0218\u0219\7\u01ba\2\2\u0219\u021a\7\u01d3\2\2\u021a"+
		"\u021b\7\u01ba\2\2\u021b\u021d\7\u01d2\2\2\u021c\u0217\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u0220\7\u00b5\2\2\u021f\u021e\3\2\2"+
		"\2\u021f\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u0223\7\u0191\2\2\u0222"+
		"\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u02f5\3\2\2\2\u0224\u022a\7\u019d"+
		"\2\2\u0225\u0226\7\u01d1\2\2\u0226\u0227\7\u01ba\2\2\u0227\u0228\7\u01d3"+
		"\2\2\u0228\u0229\7\u01ba\2\2\u0229\u022b\7\u01d2\2\2\u022a\u0225\3\2\2"+
		"\2\u022a\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022e\7\u00b5\2\2\u022d"+
		"\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0231\7\u0191"+
		"\2\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u02f5\3\2\2\2\u0232"+
		"\u023a\7\u019f\2\2\u0233\u0234\7\u01d1\2\2\u0234\u0237\7\u01ba\2\2\u0235"+
		"\u0236\7\u01d3\2\2\u0236\u0238\7\u01ba\2\2\u0237\u0235\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\7\u01d2\2\2\u023a\u0233\3\2\2"+
		"\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023e\7\u00b5\2\2\u023d"+
		"\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u0241\7\u0191"+
		"\2\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u02f5\3\2\2\2\u0242"+
		"\u024a\7\u01a0\2\2\u0243\u0244\7\u01d1\2\2\u0244\u0247\7\u01ba\2\2\u0245"+
		"\u0246\7\u01d3\2\2\u0246\u0248\7\u01ba\2\2\u0247\u0245\3\2\2\2\u0247\u0248"+
		"\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\7\u01d2\2\2\u024a\u0243\3\2\2"+
		"\2\u024a\u024b\3\2\2\2\u024b\u024d\3\2\2\2\u024c\u024e\7\u00b5\2\2\u024d"+
		"\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2\u024f\u0251\7\u0191"+
		"\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u02f5\3\2\2\2\u0252"+
		"\u02f5\7\u01a1\2\2\u0253\u0257\7\u017d\2\2\u0254\u0255\7\u01d1\2\2\u0255"+
		"\u0256\7\u01ba\2\2\u0256\u0258\7\u01d2\2\2\u0257\u0254\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\u02f5\3\2\2\2\u0259\u025d\7\u01a3\2\2\u025a\u025b\7\u01d1"+
		"\2\2\u025b\u025c\7\u01ba\2\2\u025c\u025e\7\u01d2\2\2\u025d\u025a\3\2\2"+
		"\2\u025d\u025e\3\2\2\2\u025e\u02f5\3\2\2\2\u025f\u0263\7\u01a2\2\2\u0260"+
		"\u0261\7\u01d1\2\2\u0261\u0262\7\u01ba\2\2\u0262\u0264\7\u01d2\2\2\u0263"+
		"\u0260\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u02f5\3\2\2\2\u0265\u02f5\7\u01a4"+
		"\2\2\u0266\u026a\7\u01a5\2\2\u0267\u0268\7\u01d1\2\2\u0268\u0269\7\u01ba"+
		"\2\2\u0269\u026b\7\u01d2\2\2\u026a\u0267\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026d\3\2\2\2\u026c\u026e\7\u0194\2\2\u026d\u026c\3\2\2\2\u026d\u026e"+
		"\3\2\2\2\u026e\u0272\3\2\2\2\u026f\u0270\7\u01a6\2\2\u0270\u0271\7\u00a0"+
		"\2\2\u0271\u0273\5R*\2\u0272\u026f\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276"+
		"\3\2\2\2\u0274\u0275\7\35\2\2\u0275\u0277\5R*\2\u0276\u0274\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u02f5\3\2\2\2\u0278\u027c\7\u01a7\2\2\u0279\u027a"+
		"\7\u01d1\2\2\u027a\u027b\7\u01ba\2\2\u027b\u027d\7\u01d2\2\2\u027c\u0279"+
		"\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0280\7\u0194\2"+
		"\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0284\3\2\2\2\u0281\u0282"+
		"\7\u01a6\2\2\u0282\u0283\7\u00a0\2\2\u0283\u0285\5R*\2\u0284\u0281\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0287\7\35\2\2\u0287"+
		"\u0289\5R*\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u02f5\3\2\2"+
		"\2\u028a\u028e\7\u0194\2\2\u028b\u028c\7\u01d1\2\2\u028c\u028d\7\u01ba"+
		"\2\2\u028d\u028f\7\u01d2\2\2\u028e\u028b\3\2\2\2\u028e\u028f\3\2\2\2\u028f"+
		"\u02f5\3\2\2\2\u0290\u0294\7\u01a8\2\2\u0291\u0292\7\u01d1\2\2\u0292\u0293"+
		"\7\u01ba\2\2\u0293\u0295\7\u01d2\2\2\u0294\u0291\3\2\2\2\u0294\u0295\3"+
		"\2\2\2\u0295\u02f5\3\2\2\2\u0296\u02f5\7\u0195\2\2\u0297\u02f5\7\u01a9"+
		"\2\2\u0298\u02f5\7\u01aa\2\2\u0299\u02f5\7\u01ab\2\2\u029a\u02f5\7\u01ac"+
		"\2\2\u029b\u029d\7\u01ad\2\2\u029c\u029e\7\u0194\2\2\u029d\u029c\3\2\2"+
		"\2\u029d\u029e\3\2\2\2\u029e\u02a2\3\2\2\2\u029f\u02a0\7\u01a6\2\2\u02a0"+
		"\u02a1\7\u00a0\2\2\u02a1\u02a3\5R*\2\u02a2\u029f\3\2\2\2\u02a2\u02a3\3"+
		"\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a5\7\35\2\2\u02a5\u02a7\5R*\2\u02a6"+
		"\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02f5\3\2\2\2\u02a8\u02aa\7\u01ae"+
		"\2\2\u02a9\u02ab\7\u0194\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02af\3\2\2\2\u02ac\u02ad\7\u01a6\2\2\u02ad\u02ae\7\u00a0\2\2\u02ae\u02b0"+
		"\5R*\2\u02af\u02ac\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1"+
		"\u02b2\7\35\2\2\u02b2\u02b4\5R*\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u02f5\3\2\2\2\u02b5\u02b7\7\u01af\2\2\u02b6\u02b8\7\u0194\2"+
		"\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bc\3\2\2\2\u02b9\u02ba"+
		"\7\u01a6\2\2\u02ba\u02bb\7\u00a0\2\2\u02bb\u02bd\5R*\2\u02bc\u02b9\3\2"+
		"\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02c0\3\2\2\2\u02be\u02bf\7\35\2\2\u02bf"+
		"\u02c1\5R*\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02f5\3\2\2"+
		"\2\u02c2\u02c4\7\u01b0\2\2\u02c3\u02c5\7\u0194\2\2\u02c4\u02c3\3\2\2\2"+
		"\u02c4\u02c5\3\2\2\2\u02c5\u02c9\3\2\2\2\u02c6\u02c7\7\u01a6\2\2\u02c7"+
		"\u02c8\7\u00a0\2\2\u02c8\u02ca\5R*\2\u02c9\u02c6\3\2\2\2\u02c9\u02ca\3"+
		"\2\2\2\u02ca\u02cd\3\2\2\2\u02cb\u02cc\7\35\2\2\u02cc\u02ce\5R*\2\u02cd"+
		"\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02f5\3\2\2\2\u02cf\u02d0\7\u01b1"+
		"\2\2\u02d0\u02d1\7\u01d1\2\2\u02d1\u02d4\5R*\2\u02d2\u02d3\7\u01d3\2\2"+
		"\u02d3\u02d5\5R*\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6"+
		"\3\2\2\2\u02d6\u02d7\7\u01d2\2\2\u02d7\u02db\3\2\2\2\u02d8\u02d9\7\u01a6"+
		"\2\2\u02d9\u02da\7\u00a0\2\2\u02da\u02dc\5R*\2\u02db\u02d8\3\2\2\2\u02db"+
		"\u02dc\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02de\7\35\2\2\u02de\u02e0\5"+
		"R*\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02f5\3\2\2\2\u02e1"+
		"\u02e2\7\u00a0\2\2\u02e2\u02e3\7\u01d1\2\2\u02e3\u02e6\5R*\2\u02e4\u02e5"+
		"\7\u01d3\2\2\u02e5\u02e7\5R*\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2"+
		"\u02e7\u02e8\3\2\2\2\u02e8\u02e9\7\u01d2\2\2\u02e9\u02ed\3\2\2\2\u02ea"+
		"\u02eb\7\u01a6\2\2\u02eb\u02ec\7\u00a0\2\2\u02ec\u02ee\5R*\2\u02ed\u02ea"+
		"\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02f0\7\35\2\2"+
		"\u02f0\u02f2\5R*\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f5"+
		"\3\2\2\2\u02f3\u02f5\7\u01b2\2\2\u02f4\u01bc\3\2\2\2\u02f4\u01c0\3\2\2"+
		"\2\u02f4\u01cc\3\2\2\2\u02f4\u01d8\3\2\2\2\u02f4\u01e4\3\2\2\2\u02f4\u01f0"+
		"\3\2\2\2\u02f4\u01fc\3\2\2\2\u02f4\u0208\3\2\2\2\u02f4\u0216\3\2\2\2\u02f4"+
		"\u0224\3\2\2\2\u02f4\u0232\3\2\2\2\u02f4\u0242\3\2\2\2\u02f4\u0252\3\2"+
		"\2\2\u02f4\u0253\3\2\2\2\u02f4\u0259\3\2\2\2\u02f4\u025f\3\2\2\2\u02f4"+
		"\u0265\3\2\2\2\u02f4\u0266\3\2\2\2\u02f4\u0278\3\2\2\2\u02f4\u028a\3\2"+
		"\2\2\u02f4\u0290\3\2\2\2\u02f4\u0296\3\2\2\2\u02f4\u0297\3\2\2\2\u02f4"+
		"\u0298\3\2\2\2\u02f4\u0299\3\2\2\2\u02f4\u029a\3\2\2\2\u02f4\u029b\3\2"+
		"\2\2\u02f4\u02a8\3\2\2\2\u02f4\u02b5\3\2\2\2\u02f4\u02c2\3\2\2\2\u02f4"+
		"\u02cf\3\2\2\2\u02f4\u02e1\3\2\2\2\u02f4\u02f3\3\2\2\2\u02f5K\3\2\2\2"+
		"\u02f6\u02f9\7n\2\2\u02f7\u02f9\5N(\2\u02f8\u02f6\3\2\2\2\u02f8\u02f7"+
		"\3\2\2\2\u02f9M\3\2\2\2\u02fa\u030a\7\u01bc\2\2\u02fb\u030a\7\u01bd\2"+
		"\2\u02fc\u02fe\5P)\2\u02fd\u02fc\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u030a\7\u01ba\2\2\u0300\u0302\5P)\2\u0301\u0300\3\2\2\2"+
		"\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u030a\t\b\2\2\u0304\u0306"+
		"\5P)\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0308\7\u01d0\2\2\u0308\u030a\t\t\2\2\u0309\u02fa\3\2\2\2\u0309\u02fb"+
		"\3\2\2\2\u0309\u02fd\3\2\2\2\u0309\u0301\3\2\2\2\u0309\u0305\3\2\2\2\u030a"+
		"O\3\2\2\2\u030b\u030c\t\n\2\2\u030cQ\3\2\2\2\u030d\u0311\5T+\2\u030e\u0311"+
		"\7\u01b6\2\2\u030f\u0311\7\u01b7\2\2\u0310\u030d\3\2\2\2\u0310\u030e\3"+
		"\2\2\2\u0310\u030f\3\2\2\2\u0311S\3\2\2\2\u0312\u0313\t\13\2\2\u0313U"+
		"\3\2\2\2\u0314\u0324\7\u01c0\2\2\u0315\u0324\7\u01c1\2\2\u0316\u0324\7"+
		"\u01c2\2\2\u0317\u0318\7\u01c2\2\2\u0318\u0324\7\u01c0\2\2\u0319\u031a"+
		"\7\u01c1\2\2\u031a\u0324\7\u01c0\2\2\u031b\u031c\7\u01c2\2\2\u031c\u0324"+
		"\7\u01c1\2\2\u031d\u031e\7\u01c3\2\2\u031e\u0324\7\u01c0\2\2\u031f\u0320"+
		"\7\u01c3\2\2\u0320\u0324\7\u01c1\2\2\u0321\u0322\7\u01c3\2\2\u0322\u0324"+
		"\7\u01c2\2\2\u0323\u0314\3\2\2\2\u0323\u0315\3\2\2\2\u0323\u0316\3\2\2"+
		"\2\u0323\u0317\3\2\2\2\u0323\u0319\3\2\2\2\u0323\u031b\3\2\2\2\u0323\u031d"+
		"\3\2\2\2\u0323\u031f\3\2\2\2\u0323\u0321\3\2\2\2\u0324W\3\2\2\2\u0325"+
		"\u0326\t\f\2\2\u0326Y\3\2\2\2\u0327\u0329\7\u01ba\2\2\u0328\u032a\t\r"+
		"\2\2\u0329\u0328\3\2\2\2\u0329\u032a\3\2\2\2\u032a[\3\2\2\2\u0089_krv"+
		"y\u0082\u008f\u0094\u0097\u009c\u009f\u00a3\u00ab\u00bc\u00c1\u00c4\u00ca"+
		"\u00d0\u00d5\u00d8\u00db\u00df\u00e1\u00e5\u00ea\u00ef\u00fc\u0100\u0103"+
		"\u0108\u010b\u010f\u0114\u0117\u011c\u0121\u0125\u012a\u012f\u0133\u0138"+
		"\u013d\u014a\u015a\u0161\u0168\u016f\u0176\u017d\u0184\u018a\u018f\u0198"+
		"\u019d\u01a4\u01ad\u01b1\u01b7\u01ba\u01be\u01c4\u01c7\u01ca\u01d0\u01d3"+
		"\u01d6\u01dc\u01df\u01e2\u01e8\u01eb\u01ee\u01f4\u01f7\u01fa\u0200\u0203"+
		"\u0206\u020e\u0211\u0214\u021c\u021f\u0222\u022a\u022d\u0230\u0237\u023a"+
		"\u023d\u0240\u0247\u024a\u024d\u0250\u0257\u025d\u0263\u026a\u026d\u0272"+
		"\u0276\u027c\u027f\u0284\u0288\u028e\u0294\u029d\u02a2\u02a6\u02aa\u02af"+
		"\u02b3\u02b7\u02bc\u02c0\u02c4\u02c9\u02cd\u02d4\u02db\u02df\u02e6\u02ed"+
		"\u02f1\u02f4\u02f8\u02fd\u0301\u0305\u0309\u0310\u0323\u0329";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}