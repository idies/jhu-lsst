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
		CAST=216, CATCH=217, CHANGE_RETENTION=218, CHANGE_TRACKING=219, CHECKSUM=220, 
		CHECKSUM_AGG=221, COMMENT=222, COMMITTED=223, COMPATIBILITY_LEVEL=224, 
		CONCAT=225, CONCAT_NULL_YIELDS_NULL=226, CONTROL=227, COOKIE=228, COUNT=229, 
		COUNT_BIG=230, CURSOR_CLOSE_ON_COMMIT=231, CURSOR_DEFAULT=232, DATEADD=233, 
		DATEDIFF=234, DATENAME=235, DATEPART=236, DATE_CORRELATION_OPTIMIZATION=237, 
		DAYS=238, DB_CHAINING=239, DEFAULT_FULLTEXT_LANGUAGE=240, DEFAULT_LANGUAGE=241, 
		DELAY=242, DELAYED_DURABILITY=243, DELETED=244, DENSE_RANK=245, DIRECTORY_NAME=246, 
		DISABLE=247, DISABLED=248, DISABLE_BROKER=249, DYNAMIC=250, EMERGENCY=251, 
		ENABLE_BROKER=252, ENCRYPTION=253, ERROR_BROKER_CONVERSATIONS=254, EXPAND=255, 
		FAST=256, FAST_FORWARD=257, FILEGROUP=258, FILEGROWTH=259, FILESTREAM=260, 
		FIRST=261, FOLLOWING=262, FORCE=263, FORCED=264, FORWARD_ONLY=265, FULLSCAN=266, 
		GB=267, GLOBAL=268, GO=269, GROUPING=270, GROUPING_ID=271, HADR=272, HASH=273, 
		HONOR_BROKER_PRIORITY=274, HOURS=275, IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX=276, 
		IMMEDIATE=277, IMPERSONATE=278, INCREMENTAL=279, INSENSITIVE=280, INSERTED=281, 
		ISOLATION=282, KB=283, KEEP=284, KEEPFIXED=285, KEYSET=286, LAST=287, 
		LEVEL=288, LOCAL=289, LOCK_ESCALATION=290, LOGIN=291, LOOP=292, MARK=293, 
		MAX=294, MAXDOP=295, MAXRECURSION=296, MAXSIZE=297, MB=298, MEMORY_OPTIMIZED_DATA=299, 
		MIN=300, MINUTES=301, MIN_ACTIVE_ROWVERSION=302, MIXED_PAGE_ALLOCATION=303, 
		MODIFY=304, MULTI_USER=305, NAME=306, NESTED_TRIGGERS=307, NEW_BROKER=308, 
		NEXT=309, NOCOUNT=310, NOEXPAND=311, NON_TRANSACTED_ACCESS=312, NORECOMPUTE=313, 
		NO_WAIT=314, NTILE=315, NUMBER=316, NUMERIC_ROUNDABORT=317, OFFLINE=318, 
		OFFSET=319, ONLINE=320, ONLY=321, OPTIMISTIC=322, OPTIMIZE=323, OUT=324, 
		OUTPUT=325, OWNER=326, PAGE_VERIFY=327, PARAMETERIZATION=328, PARTITION=329, 
		PATH=330, PRECEDING=331, PRIOR=332, PRIVILEGES=333, QUOTED_IDENTIFIER=334, 
		RANGE=335, RANK=336, READONLY=337, READ_COMMITTED_SNAPSHOT=338, READ_ONLY=339, 
		READ_WRITE=340, RECOMPILE=341, RECOVERY=342, RECURSIVE_TRIGGERS=343, RELATIVE=344, 
		REMOTE=345, REPEATABLE=346, RESTRICTED_USER=347, ROBUST=348, ROOT=349, 
		ROW=350, ROWGUID=351, ROWS=352, ROW_NUMBER=353, SAMPLE=354, SCHEMABINDING=355, 
		SCROLL=356, SCROLL_LOCKS=357, SECONDS=358, SELF=359, SERIALIZABLE=360, 
		SHOWPLAN=361, SIMPLE=362, SINGLE_USER=363, SIZE=364, SNAPSHOT=365, SPATIAL_WINDOW_MAX_CELLS=366, 
		STATIC=367, STATS_STREAM=368, STDEV=369, STDEVP=370, SUM=371, TAKE=372, 
		TARGET_RECOVERY_TIME=373, TB=374, TEXTIMAGE_ON=375, THROW=376, TIES=377, 
		TIME=378, TORN_PAGE_DETECTION=379, TRANSFORM_NOISE_WORDS=380, TRUSTWORTHY=381, 
		TRY=382, TWO_DIGIT_YEAR_CUTOFF=383, TYPE=384, TYPE_WARNING=385, UNBOUNDED=386, 
		UNCOMMITTED=387, UNKNOWN=388, UNLIMITED=389, USING=390, VAR=391, VARP=392, 
		VIEWS=393, VIEW_METADATA=394, WORK=395, XML=396, XMLNAMESPACES=397, ZEROFILL=398, 
		DOLLAR_ACTION=399, BIT=400, TINYINT=401, SMALLINT=402, MEDIUMINT=403, 
		INT=404, INTEGER=405, BIGINT=406, REAL=407, FLOAT=408, DOUBLE=409, DECIMAL=410, 
		NUMERIC=411, DATE=412, DATETIME=413, TIMESTAMP=414, YEAR=415, CHAR=416, 
		CHARACTER=417, VARCHAR=418, VARBINARY=419, TINYBLOB=420, BLOB=421, MEDIUMBLOB=422, 
		LONGBLOB=423, TINYTEXT=424, TEXT=425, MEDIUMTEXT=426, LONGTEXT=427, ENUM=428, 
		JSON=429, SPACE=430, MULTILINE_COMMENT=431, LINE_COMMENT=432, DOUBLE_QUOTE_ID=433, 
		LEFT_QUOTE_ID=434, SQUARE_BRACKET_ID=435, LOCAL_ID=436, DECIMAL_LITERAL=437, 
		ID=438, STRING=439, BINARY=440, FLOAT_LITERAL=441, REAL_LITERAL=442, EQUAL=443, 
		GREATER=444, LESS=445, EXCLAMATION=446, PLUS_ASSIGN=447, MINUS_ASSIGN=448, 
		MULT_ASSIGN=449, DIV_ASSIGN=450, MOD_ASSIGN=451, AND_ASSIGN=452, XOR_ASSIGN=453, 
		OR_ASSIGN=454, DOT=455, UNDERLINE=456, AT=457, SHARP=458, DOLLAR=459, 
		LR_BRACKET=460, RR_BRACKET=461, COMMA=462, SEMI=463, COLON=464, STAR=465, 
		DIVIDE=466, MODULE=467, PLUS=468, MINUS=469, BIT_NOT=470, BIT_OR=471, 
		BIT_AND=472, BIT_XOR=473;
	public static final int
		RULE_mysql_ddl_file = 0, RULE_batch = 1, RULE_ddl_clauses = 2, RULE_ddl_clause = 3, 
		RULE_create_index = 4, RULE_create_table = 5, RULE_table_comment = 6, 
		RULE_column_comment = 7, RULE_alter_table = 8, RULE_drop_index = 9, RULE_drop_table = 10, 
		RULE_column_def_table_constraint = 11, RULE_column_definition = 12, RULE_column_definition1 = 13, 
		RULE_constant_expression = 14, RULE_column_constraint = 15, RULE_table_constraint = 16, 
		RULE_full_table_name = 17, RULE_table_name = 18, RULE_simple_name = 19, 
		RULE_func_proc_name = 20, RULE_ddl_object = 21, RULE_full_column_name = 22, 
		RULE_column_name_list = 23, RULE_cursor_name = 24, RULE_on_off = 25, RULE_clustered = 26, 
		RULE_null_notnull = 27, RULE_scalar_function_name = 28, RULE_ms_data_type = 29, 
		RULE_data_type = 30, RULE_default_value = 31, RULE_constant = 32, RULE_sign = 33, 
		RULE_id = 34, RULE_simple_id = 35, RULE_comparison_operator = 36, RULE_assignment_operator = 37, 
		RULE_file_size = 38;
	public static final String[] ruleNames = {
		"mysql_ddl_file", "batch", "ddl_clauses", "ddl_clause", "create_index", 
		"create_table", "table_comment", "column_comment", "alter_table", "drop_index", 
		"drop_table", "column_def_table_constraint", "column_definition", "column_definition1", 
		"constant_expression", "column_constraint", "table_constraint", "full_table_name", 
		"table_name", "simple_name", "func_proc_name", "ddl_object", "full_column_name", 
		"column_name_list", "cursor_name", "on_off", "clustered", "null_notnull", 
		"scalar_function_name", "ms_data_type", "data_type", "default_value", 
		"constant", "sign", "id", "simple_id", "comparison_operator", "assignment_operator", 
		"file_size"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", null, null, null, null, null, null, null, null, null, null, 
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
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		"'>'", "'<'", "'!'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'^='", 
		"'|='", "'.'", "'_'", "'@'", "'#'", "'$'", "'('", "')'", "','", "';'", 
		"':'", "'*'", "'/'", "'%'", "'+'", "'-'", "'~'", "'|'", "'&'", "'^'"
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
		"CHANGE_TRACKING", "CHECKSUM", "CHECKSUM_AGG", "COMMENT", "COMMITTED", 
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
		"ZEROFILL", "DOLLAR_ACTION", "BIT", "TINYINT", "SMALLINT", "MEDIUMINT", 
		"INT", "INTEGER", "BIGINT", "REAL", "FLOAT", "DOUBLE", "DECIMAL", "NUMERIC", 
		"DATE", "DATETIME", "TIMESTAMP", "YEAR", "CHAR", "CHARACTER", "VARCHAR", 
		"VARBINARY", "TINYBLOB", "BLOB", "MEDIUMBLOB", "LONGBLOB", "TINYTEXT", 
		"TEXT", "MEDIUMTEXT", "LONGTEXT", "ENUM", "JSON", "SPACE", "MULTILINE_COMMENT", 
		"LINE_COMMENT", "DOUBLE_QUOTE_ID", "LEFT_QUOTE_ID", "SQUARE_BRACKET_ID", 
		"LOCAL_ID", "DECIMAL_LITERAL", "ID", "STRING", "BINARY", "FLOAT_LITERAL", 
		"REAL_LITERAL", "EQUAL", "GREATER", "LESS", "EXCLAMATION", "PLUS_ASSIGN", 
		"MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", "AND_ASSIGN", 
		"XOR_ASSIGN", "OR_ASSIGN", "DOT", "UNDERLINE", "AT", "SHARP", "DOLLAR", 
		"LR_BRACKET", "RR_BRACKET", "COMMA", "SEMI", "COLON", "STAR", "DIVIDE", 
		"MODULE", "PLUS", "MINUS", "BIT_NOT", "BIT_OR", "BIT_AND", "BIT_XOR"
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
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALTER) | (1L << CREATE) | (1L << DROP))) != 0)) {
				{
				{
				setState(78);
				batch();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
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
			setState(86);
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
			setState(91); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(88);
					ddl_clause();
					setState(89);
					match(SEMI);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(93); 
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				create_index();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				create_table();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				alter_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				drop_index();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
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
			setState(102);
			match(CREATE);
			setState(104);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(103);
				match(UNIQUE);
				}
			}

			setState(107);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(106);
				clustered();
				}
			}

			setState(109);
			match(INDEX);
			setState(110);
			id();
			setState(111);
			match(ON);
			setState(112);
			table_name();
			setState(113);
			match(LR_BRACKET);
			setState(114);
			column_name_list();
			setState(116);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(115);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(118);
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
			setState(120);
			match(CREATE);
			setState(121);
			match(TABLE);
			setState(122);
			table_name();
			setState(123);
			match(LR_BRACKET);
			setState(124);
			column_def_table_constraint();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(125);
				match(COMMA);
				setState(126);
				column_def_table_constraint();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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

	public static class Table_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(mysql_ddlParser.COMMENT, 0); }
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
		enterRule(_localctx, 12, RULE_table_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(COMMENT);
			setState(135);
			match(EQUAL);
			setState(136);
			match(T__0);
			setState(137);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(138);
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

	public static class Column_commentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(mysql_ddlParser.COMMENT, 0); }
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
		enterRule(_localctx, 14, RULE_column_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(COMMENT);
			setState(141);
			match(T__0);
			setState(142);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==T__0) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(143);
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
		enterRule(_localctx, 16, RULE_alter_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ALTER);
			setState(146);
			match(TABLE);
			setState(147);
			table_name();
			setState(148);
			match(ADD);
			setState(149);
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
		enterRule(_localctx, 18, RULE_drop_index);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(DROP);
			setState(152);
			match(INDEX);
			setState(155);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(153);
				match(IF);
				setState(154);
				match(EXISTS);
				}
			}

			setState(157);
			((Drop_indexContext)_localctx).name = id();
			setState(160);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(158);
				match(ON);
				setState(159);
				table_name();
				}
			}

			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(162);
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
		enterRule(_localctx, 20, RULE_drop_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(DROP);
			setState(166);
			match(TABLE);
			setState(169);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(167);
				match(IF);
				setState(168);
				match(EXISTS);
				}
			}

			setState(171);
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
		enterRule(_localctx, 22, RULE_column_def_table_constraint);
		try {
			setState(175);
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
				setState(173);
				column_definition();
				}
				break;
			case CONSTRAINT:
			case PRIMARY:
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
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
		public TerminalNode DEFAULT() { return getToken(mysql_ddlParser.DEFAULT, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
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
		enterRule(_localctx, 24, RULE_column_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			id();
			setState(178);
			data_type();
			setState(180);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(179);
				null_notnull();
				}
			}

			setState(184);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(182);
				match(DEFAULT);
				setState(183);
				constant_expression();
				}
			}

			setState(187);
			_la = _input.LA(1);
			if (_la==AUTO_INCREMENT) {
				{
				setState(186);
				match(AUTO_INCREMENT);
				}
			}

			setState(193);
			_la = _input.LA(1);
			if (_la==PRIMARY || _la==UNIQUE) {
				{
				setState(189);
				_la = _input.LA(1);
				if ( !(_la==PRIMARY || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(191);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(190);
					match(KEY);
					}
				}

				}
			}

			setState(197);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(195);
				match(COMMENT);
				setState(196);
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
		enterRule(_localctx, 26, RULE_column_definition1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			id();
			setState(200);
			data_type();
			setState(202);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(201);
				null_notnull();
				}
			}

			setState(207);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(204);
				match(DEFAULT);
				setState(205);
				constant_expression();
				}
				break;
			case AUTO_INCREMENT:
				{
				setState(206);
				match(AUTO_INCREMENT);
				}
				break;
			case COMMENT:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
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
		enterRule(_localctx, 28, RULE_constant_expression);
		try {
			setState(217);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(NULL);
				}
				break;
			case DECIMAL_LITERAL:
			case STRING:
			case BINARY:
			case FLOAT_LITERAL:
			case REAL_LITERAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				constant();
				}
				break;
			case LR_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(LR_BRACKET);
				setState(214);
				constant_expression();
				setState(215);
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
		enterRule(_localctx, 30, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(219);
				match(CONSTRAINT);
				setState(220);
				id();
				}
			}

			setState(224);
			_la = _input.LA(1);
			if (_la==NOT || _la==NULL) {
				{
				setState(223);
				null_notnull();
				}
			}

			{
			setState(229);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(226);
				match(PRIMARY);
				setState(227);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(228);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(232);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(231);
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
		enterRule(_localctx, 32, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(234);
				match(CONSTRAINT);
				setState(235);
				id();
				}
			}

			{
			setState(241);
			switch (_input.LA(1)) {
			case PRIMARY:
				{
				setState(238);
				match(PRIMARY);
				setState(239);
				match(KEY);
				}
				break;
			case UNIQUE:
				{
				setState(240);
				match(UNIQUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			_la = _input.LA(1);
			if (_la==CLUSTERED || _la==NONCLUSTERED) {
				{
				setState(243);
				clustered();
				}
			}

			setState(246);
			match(LR_BRACKET);
			setState(247);
			column_name_list();
			setState(249);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(248);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(251);
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
		enterRule(_localctx, 34, RULE_full_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(253);
				((Full_table_nameContext)_localctx).server = id();
				setState(254);
				match(DOT);
				setState(255);
				((Full_table_nameContext)_localctx).database = id();
				setState(256);
				match(DOT);
				setState(257);
				((Full_table_nameContext)_localctx).schema = id();
				setState(258);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(260);
				((Full_table_nameContext)_localctx).database = id();
				setState(261);
				match(DOT);
				setState(263);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)) | (1L << (FAST_FORWARD - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)) | (1L << (ONLY - 261)) | (1L << (OPTIMISTIC - 261)) | (1L << (OPTIMIZE - 261)) | (1L << (OUT - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)) | (1L << (TYPE_WARNING - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNKNOWN - 325)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (USING - 390)) | (1L << (VAR - 390)) | (1L << (VARP - 390)) | (1L << (VIEWS - 390)) | (1L << (VIEW_METADATA - 390)) | (1L << (WORK - 390)) | (1L << (XML - 390)) | (1L << (XMLNAMESPACES - 390)) | (1L << (DOUBLE_QUOTE_ID - 390)) | (1L << (LEFT_QUOTE_ID - 390)) | (1L << (ID - 390)))) != 0)) {
					{
					setState(262);
					((Full_table_nameContext)_localctx).schema = id();
					}
				}

				setState(265);
				match(DOT);
				}
				break;
			case 3:
				{
				setState(267);
				((Full_table_nameContext)_localctx).schema = id();
				setState(268);
				match(DOT);
				}
				break;
			}
			setState(272);
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
		enterRule(_localctx, 36, RULE_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(274);
				((Table_nameContext)_localctx).database = id();
				setState(275);
				match(DOT);
				setState(277);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)) | (1L << (FAST_FORWARD - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)) | (1L << (ONLY - 261)) | (1L << (OPTIMISTIC - 261)) | (1L << (OPTIMIZE - 261)) | (1L << (OUT - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)) | (1L << (TYPE_WARNING - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNKNOWN - 325)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (USING - 390)) | (1L << (VAR - 390)) | (1L << (VARP - 390)) | (1L << (VIEWS - 390)) | (1L << (VIEW_METADATA - 390)) | (1L << (WORK - 390)) | (1L << (XML - 390)) | (1L << (XMLNAMESPACES - 390)) | (1L << (DOUBLE_QUOTE_ID - 390)) | (1L << (LEFT_QUOTE_ID - 390)) | (1L << (ID - 390)))) != 0)) {
					{
					setState(276);
					((Table_nameContext)_localctx).schema = id();
					}
				}

				setState(279);
				match(DOT);
				}
				break;
			case 2:
				{
				setState(281);
				((Table_nameContext)_localctx).schema = id();
				setState(282);
				match(DOT);
				}
				break;
			}
			setState(286);
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
		enterRule(_localctx, 38, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(288);
				((Simple_nameContext)_localctx).schema = id();
				setState(289);
				match(DOT);
				}
				break;
			}
			setState(293);
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
		enterRule(_localctx, 40, RULE_func_proc_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(295);
				((Func_proc_nameContext)_localctx).database = id();
				setState(296);
				match(DOT);
				setState(298);
				_la = _input.LA(1);
				if (_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)) | (1L << (FAST_FORWARD - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)) | (1L << (ONLY - 261)) | (1L << (OPTIMISTIC - 261)) | (1L << (OPTIMIZE - 261)) | (1L << (OUT - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)) | (1L << (TYPE_WARNING - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNKNOWN - 325)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (USING - 390)) | (1L << (VAR - 390)) | (1L << (VARP - 390)) | (1L << (VIEWS - 390)) | (1L << (VIEW_METADATA - 390)) | (1L << (WORK - 390)) | (1L << (XML - 390)) | (1L << (XMLNAMESPACES - 390)) | (1L << (DOUBLE_QUOTE_ID - 390)) | (1L << (LEFT_QUOTE_ID - 390)) | (1L << (ID - 390)))) != 0)) {
					{
					setState(297);
					((Func_proc_nameContext)_localctx).schema = id();
					}
				}

				setState(300);
				match(DOT);
				}
				break;
			case 2:
				{
				{
				setState(302);
				((Func_proc_nameContext)_localctx).schema = id();
				}
				setState(303);
				match(DOT);
				}
				break;
			}
			setState(307);
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
		enterRule(_localctx, 42, RULE_ddl_object);
		try {
			setState(311);
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
				setState(309);
				full_table_name();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
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
		enterRule(_localctx, 44, RULE_full_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(313);
				table_name();
				setState(314);
				match(DOT);
				}
				break;
			}
			setState(318);
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
		enterRule(_localctx, 46, RULE_column_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			id();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(321);
				match(COMMA);
				setState(322);
				id();
				}
				}
				setState(327);
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
		enterRule(_localctx, 48, RULE_cursor_name);
		try {
			setState(330);
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
				setState(328);
				id();
				}
				break;
			case LOCAL_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
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
		enterRule(_localctx, 50, RULE_on_off);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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
		enterRule(_localctx, 52, RULE_clustered);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
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
		enterRule(_localctx, 54, RULE_null_notnull);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(336);
				match(NOT);
				}
			}

			setState(339);
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
		enterRule(_localctx, 56, RULE_scalar_function_name);
		try {
			setState(346);
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
				setState(341);
				func_proc_name();
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(342);
				match(RIGHT);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 3);
				{
				setState(343);
				match(LEFT);
				}
				break;
			case BINARY_CHECKSUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(344);
				match(BINARY_CHECKSUM);
				}
				break;
			case CHECKSUM:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
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
		enterRule(_localctx, 58, RULE_ms_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			id();
			setState(350);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(349);
				match(IDENTITY);
				}
			}

			setState(359);
			_la = _input.LA(1);
			if (_la==LR_BRACKET) {
				{
				setState(352);
				match(LR_BRACKET);
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==MAX || _la==DECIMAL_LITERAL) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(356);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(354);
					match(COMMA);
					setState(355);
					match(DECIMAL_LITERAL);
					}
				}

				setState(358);
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
		enterRule(_localctx, 60, RULE_data_type);
		int _la;
		try {
			setState(672);
			switch (_input.LA(1)) {
			case BIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(BIT);
				setState(363);
				_la = _input.LA(1);
				if (_la==DECIMAL_LITERAL) {
					{
					setState(362);
					match(DECIMAL_LITERAL);
					}
				}

				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(TINYINT);
				setState(369);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(366);
					match(LR_BRACKET);
					setState(367);
					match(DECIMAL_LITERAL);
					setState(368);
					match(RR_BRACKET);
					}
				}

				setState(372);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(371);
					match(UNSIGNED);
					}
				}

				setState(375);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(374);
					match(ZEROFILL);
					}
				}

				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(377);
				match(SMALLINT);
				setState(381);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(378);
					match(LR_BRACKET);
					setState(379);
					match(DECIMAL_LITERAL);
					setState(380);
					match(RR_BRACKET);
					}
				}

				setState(384);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(383);
					match(UNSIGNED);
					}
				}

				setState(387);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(386);
					match(ZEROFILL);
					}
				}

				}
				break;
			case MEDIUMINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				match(MEDIUMINT);
				setState(393);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(390);
					match(LR_BRACKET);
					setState(391);
					match(DECIMAL_LITERAL);
					setState(392);
					match(RR_BRACKET);
					}
				}

				setState(396);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(395);
					match(UNSIGNED);
					}
				}

				setState(399);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(398);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				match(INT);
				setState(405);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(402);
					match(LR_BRACKET);
					setState(403);
					match(DECIMAL_LITERAL);
					setState(404);
					match(RR_BRACKET);
					}
				}

				setState(408);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(407);
					match(UNSIGNED);
					}
				}

				setState(411);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(410);
					match(ZEROFILL);
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 6);
				{
				setState(413);
				match(INTEGER);
				setState(417);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(414);
					match(LR_BRACKET);
					setState(415);
					match(DECIMAL_LITERAL);
					setState(416);
					match(RR_BRACKET);
					}
				}

				setState(420);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(419);
					match(UNSIGNED);
					}
				}

				setState(423);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(422);
					match(ZEROFILL);
					}
				}

				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 7);
				{
				setState(425);
				match(BIGINT);
				setState(429);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(426);
					match(LR_BRACKET);
					setState(427);
					match(DECIMAL_LITERAL);
					setState(428);
					match(RR_BRACKET);
					}
				}

				setState(432);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(431);
					match(UNSIGNED);
					}
				}

				setState(435);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(434);
					match(ZEROFILL);
					}
				}

				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				match(REAL);
				setState(443);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(438);
					match(LR_BRACKET);
					setState(439);
					match(DECIMAL_LITERAL);
					setState(440);
					match(COMMA);
					setState(441);
					match(DECIMAL_LITERAL);
					setState(442);
					match(RR_BRACKET);
					}
				}

				setState(446);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(445);
					match(UNSIGNED);
					}
				}

				setState(449);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(448);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 9);
				{
				setState(451);
				match(DOUBLE);
				setState(457);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(452);
					match(LR_BRACKET);
					setState(453);
					match(DECIMAL_LITERAL);
					setState(454);
					match(COMMA);
					setState(455);
					match(DECIMAL_LITERAL);
					setState(456);
					match(RR_BRACKET);
					}
				}

				setState(460);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(459);
					match(UNSIGNED);
					}
				}

				setState(463);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(462);
					match(ZEROFILL);
					}
				}

				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 10);
				{
				setState(465);
				match(FLOAT);
				setState(471);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(466);
					match(LR_BRACKET);
					setState(467);
					match(DECIMAL_LITERAL);
					setState(468);
					match(COMMA);
					setState(469);
					match(DECIMAL_LITERAL);
					setState(470);
					match(RR_BRACKET);
					}
				}

				setState(474);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(473);
					match(UNSIGNED);
					}
				}

				setState(477);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(476);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(479);
				match(DECIMAL);
				setState(487);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(480);
					match(LR_BRACKET);
					setState(481);
					match(DECIMAL_LITERAL);
					setState(484);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(482);
						match(COMMA);
						setState(483);
						match(DECIMAL_LITERAL);
						}
					}

					setState(486);
					match(RR_BRACKET);
					}
				}

				setState(490);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(489);
					match(UNSIGNED);
					}
				}

				setState(493);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(492);
					match(ZEROFILL);
					}
				}

				}
				break;
			case NUMERIC:
				enterOuterAlt(_localctx, 12);
				{
				setState(495);
				match(NUMERIC);
				setState(503);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(496);
					match(LR_BRACKET);
					setState(497);
					match(DECIMAL_LITERAL);
					setState(500);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(498);
						match(COMMA);
						setState(499);
						match(DECIMAL_LITERAL);
						}
					}

					setState(502);
					match(RR_BRACKET);
					}
				}

				setState(506);
				_la = _input.LA(1);
				if (_la==UNSIGNED) {
					{
					setState(505);
					match(UNSIGNED);
					}
				}

				setState(509);
				_la = _input.LA(1);
				if (_la==ZEROFILL) {
					{
					setState(508);
					match(ZEROFILL);
					}
				}

				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 13);
				{
				setState(511);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 14);
				{
				setState(512);
				match(TIME);
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

				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 15);
				{
				setState(518);
				match(TIMESTAMP);
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

				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 16);
				{
				setState(524);
				match(DATETIME);
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

				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 17);
				{
				setState(530);
				match(YEAR);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(531);
				match(CHAR);
				setState(535);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(532);
					match(LR_BRACKET);
					setState(533);
					match(DECIMAL_LITERAL);
					setState(534);
					match(RR_BRACKET);
					}
				}

				setState(538);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(537);
					match(BINARY);
					}
				}

				setState(543);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(540);
					match(CHARACTER);
					setState(541);
					match(SET);
					setState(542);
					id();
					}
				}

				setState(547);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(545);
					match(COLLATE);
					setState(546);
					id();
					}
				}

				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(549);
				match(VARCHAR);
				setState(553);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(550);
					match(LR_BRACKET);
					setState(551);
					match(DECIMAL_LITERAL);
					setState(552);
					match(RR_BRACKET);
					}
				}

				setState(556);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(555);
					match(BINARY);
					}
				}

				setState(561);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(558);
					match(CHARACTER);
					setState(559);
					match(SET);
					setState(560);
					id();
					}
				}

				setState(565);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(563);
					match(COLLATE);
					setState(564);
					id();
					}
				}

				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 20);
				{
				setState(567);
				match(BINARY);
				setState(571);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(568);
					match(LR_BRACKET);
					setState(569);
					match(DECIMAL_LITERAL);
					setState(570);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case VARBINARY:
				enterOuterAlt(_localctx, 21);
				{
				setState(573);
				match(VARBINARY);
				setState(577);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(574);
					match(LR_BRACKET);
					setState(575);
					match(DECIMAL_LITERAL);
					setState(576);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case TINYBLOB:
				enterOuterAlt(_localctx, 22);
				{
				setState(579);
				match(TINYBLOB);
				}
				break;
			case BLOB:
				enterOuterAlt(_localctx, 23);
				{
				setState(580);
				match(BLOB);
				}
				break;
			case MEDIUMBLOB:
				enterOuterAlt(_localctx, 24);
				{
				setState(581);
				match(MEDIUMBLOB);
				}
				break;
			case LONGBLOB:
				enterOuterAlt(_localctx, 25);
				{
				setState(582);
				match(LONGBLOB);
				}
				break;
			case TINYTEXT:
				enterOuterAlt(_localctx, 26);
				{
				setState(583);
				match(TINYTEXT);
				setState(585);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(584);
					match(BINARY);
					}
				}

				setState(590);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(587);
					match(CHARACTER);
					setState(588);
					match(SET);
					setState(589);
					id();
					}
				}

				setState(594);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(592);
					match(COLLATE);
					setState(593);
					id();
					}
				}

				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 27);
				{
				setState(596);
				match(TEXT);
				setState(598);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(597);
					match(BINARY);
					}
				}

				setState(603);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(600);
					match(CHARACTER);
					setState(601);
					match(SET);
					setState(602);
					id();
					}
				}

				setState(607);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(605);
					match(COLLATE);
					setState(606);
					id();
					}
				}

				}
				break;
			case MEDIUMTEXT:
				enterOuterAlt(_localctx, 28);
				{
				setState(609);
				match(MEDIUMTEXT);
				setState(611);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(610);
					match(BINARY);
					}
				}

				setState(616);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(613);
					match(CHARACTER);
					setState(614);
					match(SET);
					setState(615);
					id();
					}
				}

				setState(620);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(618);
					match(COLLATE);
					setState(619);
					id();
					}
				}

				}
				break;
			case LONGTEXT:
				enterOuterAlt(_localctx, 29);
				{
				setState(622);
				match(LONGTEXT);
				setState(624);
				_la = _input.LA(1);
				if (_la==BINARY) {
					{
					setState(623);
					match(BINARY);
					}
				}

				setState(629);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(626);
					match(CHARACTER);
					setState(627);
					match(SET);
					setState(628);
					id();
					}
				}

				setState(633);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(631);
					match(COLLATE);
					setState(632);
					id();
					}
				}

				}
				break;
			case ENUM:
				enterOuterAlt(_localctx, 30);
				{
				setState(635);
				match(ENUM);
				{
				setState(636);
				match(LR_BRACKET);
				setState(637);
				id();
				setState(640);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(638);
					match(COMMA);
					setState(639);
					id();
					}
				}

				setState(642);
				match(RR_BRACKET);
				}
				setState(647);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(644);
					match(CHARACTER);
					setState(645);
					match(SET);
					setState(646);
					id();
					}
				}

				setState(651);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(649);
					match(COLLATE);
					setState(650);
					id();
					}
				}

				}
				break;
			case SET:
				enterOuterAlt(_localctx, 31);
				{
				setState(653);
				match(SET);
				{
				setState(654);
				match(LR_BRACKET);
				setState(655);
				id();
				setState(658);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(656);
					match(COMMA);
					setState(657);
					id();
					}
				}

				setState(660);
				match(RR_BRACKET);
				}
				setState(665);
				_la = _input.LA(1);
				if (_la==CHARACTER) {
					{
					setState(662);
					match(CHARACTER);
					setState(663);
					match(SET);
					setState(664);
					id();
					}
				}

				setState(669);
				_la = _input.LA(1);
				if (_la==COLLATE) {
					{
					setState(667);
					match(COLLATE);
					setState(668);
					id();
					}
				}

				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 32);
				{
				setState(671);
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
		enterRule(_localctx, 62, RULE_default_value);
		try {
			setState(676);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(NULL);
				}
				break;
			case DECIMAL_LITERAL:
			case STRING:
			case BINARY:
			case FLOAT_LITERAL:
			case REAL_LITERAL:
			case DOLLAR:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
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
		public TerminalNode BINARY() { return getToken(mysql_ddlParser.BINARY, 0); }
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
		enterRule(_localctx, 64, RULE_constant);
		int _la;
		try {
			setState(693);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(679);
				match(BINARY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(680);
					sign();
					}
				}

				setState(683);
				match(DECIMAL_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(685);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(684);
					sign();
					}
				}

				setState(687);
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
				setState(689);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(688);
					sign();
					}
				}

				setState(691);
				((ConstantContext)_localctx).dollar = match(DOLLAR);
				setState(692);
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
		enterRule(_localctx, 66, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
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
		enterRule(_localctx, 68, RULE_id);
		try {
			setState(700);
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
				setState(697);
				simple_id();
				}
				break;
			case DOUBLE_QUOTE_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(698);
				match(DOUBLE_QUOTE_ID);
				}
				break;
			case LEFT_QUOTE_ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(699);
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
		enterRule(_localctx, 70, RULE_simple_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !(_la==FORCESEEK || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (ABSOLUTE - 194)) | (1L << (APPLY - 194)) | (1L << (AUTO - 194)) | (1L << (AVG - 194)) | (1L << (BASE64 - 194)) | (1L << (CALLER - 194)) | (1L << (CAST - 194)) | (1L << (CATCH - 194)) | (1L << (CHECKSUM_AGG - 194)) | (1L << (COMMITTED - 194)) | (1L << (CONCAT - 194)) | (1L << (CONTROL - 194)) | (1L << (COOKIE - 194)) | (1L << (COUNT - 194)) | (1L << (COUNT_BIG - 194)) | (1L << (DELAY - 194)) | (1L << (DELETED - 194)) | (1L << (DENSE_RANK - 194)) | (1L << (DISABLE - 194)) | (1L << (DYNAMIC - 194)) | (1L << (ENCRYPTION - 194)) | (1L << (EXPAND - 194)) | (1L << (FAST - 194)) | (1L << (FAST_FORWARD - 194)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (FIRST - 261)) | (1L << (FOLLOWING - 261)) | (1L << (FORCE - 261)) | (1L << (FORCED - 261)) | (1L << (FORWARD_ONLY - 261)) | (1L << (FULLSCAN - 261)) | (1L << (GLOBAL - 261)) | (1L << (GO - 261)) | (1L << (GROUPING - 261)) | (1L << (GROUPING_ID - 261)) | (1L << (HASH - 261)) | (1L << (IGNORE_NONCLUSTERED_COLUMNSTORE_INDEX - 261)) | (1L << (IMPERSONATE - 261)) | (1L << (INSENSITIVE - 261)) | (1L << (INSERTED - 261)) | (1L << (ISOLATION - 261)) | (1L << (KEEP - 261)) | (1L << (KEEPFIXED - 261)) | (1L << (KEYSET - 261)) | (1L << (LAST - 261)) | (1L << (LEVEL - 261)) | (1L << (LOCAL - 261)) | (1L << (LOCK_ESCALATION - 261)) | (1L << (LOGIN - 261)) | (1L << (LOOP - 261)) | (1L << (MARK - 261)) | (1L << (MAX - 261)) | (1L << (MAXDOP - 261)) | (1L << (MAXRECURSION - 261)) | (1L << (MIN - 261)) | (1L << (MODIFY - 261)) | (1L << (NAME - 261)) | (1L << (NEXT - 261)) | (1L << (NOCOUNT - 261)) | (1L << (NOEXPAND - 261)) | (1L << (NORECOMPUTE - 261)) | (1L << (NTILE - 261)) | (1L << (NUMBER - 261)) | (1L << (OFFSET - 261)) | (1L << (ONLINE - 261)) | (1L << (ONLY - 261)) | (1L << (OPTIMISTIC - 261)) | (1L << (OPTIMIZE - 261)) | (1L << (OUT - 261)))) != 0) || ((((_la - 325)) & ~0x3f) == 0 && ((1L << (_la - 325)) & ((1L << (OUTPUT - 325)) | (1L << (OWNER - 325)) | (1L << (PARAMETERIZATION - 325)) | (1L << (PARTITION - 325)) | (1L << (PATH - 325)) | (1L << (PRECEDING - 325)) | (1L << (PRIOR - 325)) | (1L << (PRIVILEGES - 325)) | (1L << (RANGE - 325)) | (1L << (RANK - 325)) | (1L << (READONLY - 325)) | (1L << (READ_ONLY - 325)) | (1L << (RECOMPILE - 325)) | (1L << (RELATIVE - 325)) | (1L << (REMOTE - 325)) | (1L << (REPEATABLE - 325)) | (1L << (ROBUST - 325)) | (1L << (ROOT - 325)) | (1L << (ROW - 325)) | (1L << (ROWGUID - 325)) | (1L << (ROWS - 325)) | (1L << (ROW_NUMBER - 325)) | (1L << (SAMPLE - 325)) | (1L << (SCHEMABINDING - 325)) | (1L << (SCROLL - 325)) | (1L << (SCROLL_LOCKS - 325)) | (1L << (SELF - 325)) | (1L << (SERIALIZABLE - 325)) | (1L << (SIMPLE - 325)) | (1L << (SNAPSHOT - 325)) | (1L << (SPATIAL_WINDOW_MAX_CELLS - 325)) | (1L << (STATIC - 325)) | (1L << (STATS_STREAM - 325)) | (1L << (STDEV - 325)) | (1L << (STDEVP - 325)) | (1L << (SUM - 325)) | (1L << (TEXTIMAGE_ON - 325)) | (1L << (THROW - 325)) | (1L << (TIES - 325)) | (1L << (TIME - 325)) | (1L << (TRY - 325)) | (1L << (TYPE - 325)) | (1L << (TYPE_WARNING - 325)) | (1L << (UNBOUNDED - 325)) | (1L << (UNCOMMITTED - 325)) | (1L << (UNKNOWN - 325)))) != 0) || ((((_la - 390)) & ~0x3f) == 0 && ((1L << (_la - 390)) & ((1L << (USING - 390)) | (1L << (VAR - 390)) | (1L << (VARP - 390)) | (1L << (VIEWS - 390)) | (1L << (VIEW_METADATA - 390)) | (1L << (WORK - 390)) | (1L << (XML - 390)) | (1L << (XMLNAMESPACES - 390)) | (1L << (ID - 390)))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_comparison_operator);
		try {
			setState(719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(EQUAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				match(GREATER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(706);
				match(LESS);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(707);
				match(LESS);
				setState(708);
				match(EQUAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
				match(GREATER);
				setState(710);
				match(EQUAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(711);
				match(LESS);
				setState(712);
				match(GREATER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(713);
				match(EXCLAMATION);
				setState(714);
				match(EQUAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(715);
				match(EXCLAMATION);
				setState(716);
				match(GREATER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(717);
				match(EXCLAMATION);
				setState(718);
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
		enterRule(_localctx, 74, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_la = _input.LA(1);
			if ( !(((((_la - 447)) & ~0x3f) == 0 && ((1L << (_la - 447)) & ((1L << (PLUS_ASSIGN - 447)) | (1L << (MINUS_ASSIGN - 447)) | (1L << (MULT_ASSIGN - 447)) | (1L << (DIV_ASSIGN - 447)) | (1L << (MOD_ASSIGN - 447)) | (1L << (AND_ASSIGN - 447)) | (1L << (XOR_ASSIGN - 447)) | (1L << (OR_ASSIGN - 447)))) != 0)) ) {
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
		enterRule(_localctx, 76, RULE_file_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(DECIMAL_LITERAL);
			setState(725);
			_la = _input.LA(1);
			if (((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (GB - 267)) | (1L << (KB - 267)) | (1L << (MB - 267)))) != 0) || _la==TB || _la==MODULE) {
				{
				setState(724);
				_la = _input.LA(1);
				if ( !(((((_la - 267)) & ~0x3f) == 0 && ((1L << (_la - 267)) & ((1L << (GB - 267)) | (1L << (KB - 267)) | (1L << (MB - 267)))) != 0) || _la==TB || _la==MODULE) ) {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u01db\u02da\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\7\2R\n\2\f\2\16"+
		"\2U\13\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4^\n\4\r\4\16\4_\3\5\3\5\3\5\3"+
		"\5\3\5\5\5g\n\5\3\6\3\6\5\6k\n\6\3\6\5\6n\n\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6w\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0082\n\7\f\7\16"+
		"\7\u0085\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\13\3\13\3\13"+
		"\5\13\u00a3\n\13\3\13\5\13\u00a6\n\13\3\f\3\f\3\f\3\f\5\f\u00ac\n\f\3"+
		"\f\3\f\3\r\3\r\5\r\u00b2\n\r\3\16\3\16\3\16\5\16\u00b7\n\16\3\16\3\16"+
		"\5\16\u00bb\n\16\3\16\5\16\u00be\n\16\3\16\3\16\5\16\u00c2\n\16\5\16\u00c4"+
		"\n\16\3\16\3\16\5\16\u00c8\n\16\3\17\3\17\3\17\5\17\u00cd\n\17\3\17\3"+
		"\17\3\17\5\17\u00d2\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00dc\n\20\3\21\3\21\5\21\u00e0\n\21\3\21\5\21\u00e3\n\21\3\21\3\21\3"+
		"\21\5\21\u00e8\n\21\3\21\5\21\u00eb\n\21\3\22\3\22\5\22\u00ef\n\22\3\22"+
		"\3\22\3\22\5\22\u00f4\n\22\3\22\5\22\u00f7\n\22\3\22\3\22\3\22\5\22\u00fc"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u010a\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u0111\n\23\3\23\3\23\3\24\3"+
		"\24\3\24\5\24\u0118\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u011f\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\5\25\u0126\n\25\3\25\3\25\3\26\3\26\3\26\5\26\u012d"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u0134\n\26\3\26\3\26\3\27\3\27\5\27"+
		"\u013a\n\27\3\30\3\30\3\30\5\30\u013f\n\30\3\30\3\30\3\31\3\31\3\31\7"+
		"\31\u0146\n\31\f\31\16\31\u0149\13\31\3\32\3\32\5\32\u014d\n\32\3\33\3"+
		"\33\3\34\3\34\3\35\5\35\u0154\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u015d\n\36\3\37\3\37\5\37\u0161\n\37\3\37\3\37\3\37\3\37\5\37\u0167"+
		"\n\37\3\37\5\37\u016a\n\37\3 \3 \5 \u016e\n \3 \3 \3 \3 \5 \u0174\n \3"+
		" \5 \u0177\n \3 \5 \u017a\n \3 \3 \3 \3 \5 \u0180\n \3 \5 \u0183\n \3"+
		" \5 \u0186\n \3 \3 \3 \3 \5 \u018c\n \3 \5 \u018f\n \3 \5 \u0192\n \3"+
		" \3 \3 \3 \5 \u0198\n \3 \5 \u019b\n \3 \5 \u019e\n \3 \3 \3 \3 \5 \u01a4"+
		"\n \3 \5 \u01a7\n \3 \5 \u01aa\n \3 \3 \3 \3 \5 \u01b0\n \3 \5 \u01b3"+
		"\n \3 \5 \u01b6\n \3 \3 \3 \3 \3 \3 \5 \u01be\n \3 \5 \u01c1\n \3 \5 "+
		"\u01c4\n \3 \3 \3 \3 \3 \3 \5 \u01cc\n \3 \5 \u01cf\n \3 \5 \u01d2\n "+
		"\3 \3 \3 \3 \3 \3 \5 \u01da\n \3 \5 \u01dd\n \3 \5 \u01e0\n \3 \3 \3 "+
		"\3 \3 \5 \u01e7\n \3 \5 \u01ea\n \3 \5 \u01ed\n \3 \5 \u01f0\n \3 \3 "+
		"\3 \3 \3 \5 \u01f7\n \3 \5 \u01fa\n \3 \5 \u01fd\n \3 \5 \u0200\n \3 "+
		"\3 \3 \3 \3 \5 \u0207\n \3 \3 \3 \3 \5 \u020d\n \3 \3 \3 \3 \5 \u0213"+
		"\n \3 \3 \3 \3 \3 \5 \u021a\n \3 \5 \u021d\n \3 \3 \3 \5 \u0222\n \3 "+
		"\3 \5 \u0226\n \3 \3 \3 \3 \5 \u022c\n \3 \5 \u022f\n \3 \3 \3 \5 \u0234"+
		"\n \3 \3 \5 \u0238\n \3 \3 \3 \3 \5 \u023e\n \3 \3 \3 \3 \5 \u0244\n "+
		"\3 \3 \3 \3 \3 \3 \5 \u024c\n \3 \3 \3 \5 \u0251\n \3 \3 \5 \u0255\n "+
		"\3 \3 \5 \u0259\n \3 \3 \3 \5 \u025e\n \3 \3 \5 \u0262\n \3 \3 \5 \u0266"+
		"\n \3 \3 \3 \5 \u026b\n \3 \3 \5 \u026f\n \3 \3 \5 \u0273\n \3 \3 \3 "+
		"\5 \u0278\n \3 \3 \5 \u027c\n \3 \3 \3 \3 \3 \5 \u0283\n \3 \3 \3 \3 "+
		"\3 \5 \u028a\n \3 \3 \5 \u028e\n \3 \3 \3 \3 \3 \5 \u0295\n \3 \3 \3 "+
		"\3 \3 \5 \u029c\n \3 \3 \5 \u02a0\n \3 \5 \u02a3\n \3!\3!\5!\u02a7\n!"+
		"\3\"\3\"\3\"\5\"\u02ac\n\"\3\"\3\"\5\"\u02b0\n\"\3\"\3\"\5\"\u02b4\n\""+
		"\3\"\3\"\5\"\u02b8\n\"\3#\3#\3$\3$\3$\5$\u02bf\n$\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02d2\n&\3\'\3\'\3(\3(\5(\u02d8\n("+
		"\3(\2\2)\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@BDFHJLN\2\16\4\2\n\n\66\66\3\2\3\3\4\2\u0083\u0083\u00b3\u00b3\4\2"+
		"qqss\4\2\33\33kk\4\2\u0128\u0128\u01b7\u01b7\3\2\u01bb\u01bc\4\2\u01b7"+
		"\u01b7\u01bb\u01bb\3\2\u01d6\u01d7.\2JJ\u00c4\u00c4\u00cc\u00cc\u00ce"+
		"\u00ce\u00d5\u00d6\u00d9\u00db\u00df\u00df\u00e1\u00e1\u00e3\u00e3\u00e5"+
		"\u00e8\u00f4\u00f4\u00f6\u00f7\u00f9\u00f9\u00fc\u00fc\u00ff\u00ff\u0101"+
		"\u0103\u0107\u010c\u010e\u0111\u0113\u0113\u0116\u0116\u0118\u0118\u011a"+
		"\u011c\u011e\u012a\u012e\u012e\u0132\u0132\u0134\u0134\u0137\u0139\u013b"+
		"\u013b\u013d\u013e\u0141\u0148\u014a\u014f\u0151\u0153\u0155\u0155\u0157"+
		"\u0157\u015a\u015c\u015e\u0167\u0169\u016a\u016c\u016c\u016f\u0175\u0179"+
		"\u017c\u0180\u0180\u0182\u0186\u0188\u018f\u01b8\u01b8\3\2\u01c1\u01c8"+
		"\7\2\u010d\u010d\u011d\u011d\u012c\u012c\u0178\u0178\u01d5\u01d5\u0360"+
		"\2S\3\2\2\2\4X\3\2\2\2\6]\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fz\3\2\2\2\16"+
		"\u0088\3\2\2\2\20\u008e\3\2\2\2\22\u0093\3\2\2\2\24\u0099\3\2\2\2\26\u00a7"+
		"\3\2\2\2\30\u00b1\3\2\2\2\32\u00b3\3\2\2\2\34\u00c9\3\2\2\2\36\u00db\3"+
		"\2\2\2 \u00df\3\2\2\2\"\u00ee\3\2\2\2$\u0110\3\2\2\2&\u011e\3\2\2\2(\u0125"+
		"\3\2\2\2*\u0133\3\2\2\2,\u0139\3\2\2\2.\u013e\3\2\2\2\60\u0142\3\2\2\2"+
		"\62\u014c\3\2\2\2\64\u014e\3\2\2\2\66\u0150\3\2\2\28\u0153\3\2\2\2:\u015c"+
		"\3\2\2\2<\u015e\3\2\2\2>\u02a2\3\2\2\2@\u02a6\3\2\2\2B\u02b7\3\2\2\2D"+
		"\u02b9\3\2\2\2F\u02be\3\2\2\2H\u02c0\3\2\2\2J\u02d1\3\2\2\2L\u02d3\3\2"+
		"\2\2N\u02d5\3\2\2\2PR\5\4\3\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TV\3\2\2\2US\3\2\2\2VW\7\2\2\3W\3\3\2\2\2XY\5\6\4\2Y\5\3\2\2\2Z[\5\b\5"+
		"\2[\\\7\u01d1\2\2\\^\3\2\2\2]Z\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`"+
		"\7\3\2\2\2ag\5\n\6\2bg\5\f\7\2cg\5\22\n\2dg\5\24\13\2eg\5\26\f\2fa\3\2"+
		"\2\2fb\3\2\2\2fc\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\t\3\2\2\2hj\7\'\2\2ik\7"+
		"\u00b3\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5\66\34\2ml\3\2\2\2mn\3\2\2"+
		"\2no\3\2\2\2op\7Z\2\2pq\5F$\2qr\7s\2\2rs\5&\24\2st\7\u01ce\2\2tv\5\60"+
		"\31\2uw\t\2\2\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\u01cf\2\2y\13\3\2\2"+
		"\2z{\7\'\2\2{|\7\u00a6\2\2|}\5&\24\2}~\7\u01ce\2\2~\u0083\5\30\r\2\177"+
		"\u0080\7\u01d0\2\2\u0080\u0082\5\30\r\2\u0081\177\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\7\u01cf\2\2\u0087\r\3\2\2\2\u0088\u0089\7\u00e0"+
		"\2\2\u0089\u008a\7\u01bd\2\2\u008a\u008b\7\3\2\2\u008b\u008c\n\3\2\2\u008c"+
		"\u008d\7\3\2\2\u008d\17\3\2\2\2\u008e\u008f\7\u00e0\2\2\u008f\u0090\7"+
		"\3\2\2\u0090\u0091\n\3\2\2\u0091\u0092\7\3\2\2\u0092\21\3\2\2\2\u0093"+
		"\u0094\7\6\2\2\u0094\u0095\7\u00a6\2\2\u0095\u0096\5&\24\2\u0096\u0097"+
		"\7\4\2\2\u0097\u0098\5\30\r\2\u0098\23\3\2\2\2\u0099\u009a\7:\2\2\u009a"+
		"\u009d\7Z\2\2\u009b\u009c\7X\2\2\u009c\u009e\7B\2\2\u009d\u009b\3\2\2"+
		"\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\5F$\2\u00a0\u00a1"+
		"\7s\2\2\u00a1\u00a3\5&\24\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a6\7\u01d1\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00a8\7:\2\2\u00a8\u00ab\7\u00a6\2\2\u00a9"+
		"\u00aa\7X\2\2\u00aa\u00ac\7B\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2"+
		"\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\5&\24\2\u00ae\27\3\2\2\2\u00af\u00b2"+
		"\5\32\16\2\u00b0\u00b2\5\"\22\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\31\3\2\2\2\u00b3\u00b4\5F$\2\u00b4\u00b6\5> \2\u00b5\u00b7\5"+
		"8\35\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b9\7\63\2\2\u00b9\u00bb\5\36\20\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00be\7\f\2\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00c3\3\2\2\2\u00bf\u00c1\t\4\2\2\u00c0\u00c2\7a"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3"+
		"\u00bf\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c6\7\u00e0"+
		"\2\2\u00c6\u00c8\7\u01b9\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\33\3\2\2\2\u00c9\u00ca\5F$\2\u00ca\u00cc\5> \2\u00cb\u00cd\58\35\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d1\3\2\2\2\u00ce\u00cf\7\63"+
		"\2\2\u00cf\u00d2\5\36\20\2\u00d0\u00d2\7\f\2\2\u00d1\u00ce\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\5\20"+
		"\t\2\u00d4\35\3\2\2\2\u00d5\u00dc\7n\2\2\u00d6\u00dc\5B\"\2\u00d7\u00d8"+
		"\7\u01ce\2\2\u00d8\u00d9\5\36\20\2\u00d9\u00da\7\u01cf\2\2\u00da\u00dc"+
		"\3\2\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00dc"+
		"\37\3\2\2\2\u00dd\u00de\7!\2\2\u00de\u00e0\5F$\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\58\35\2\u00e2\u00e1\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\3\2\2\2\u00e4\u00e5\7\u0083\2\2\u00e5"+
		"\u00e8\7a\2\2\u00e6\u00e8\7\u00b3\2\2\u00e7\u00e4\3\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00eb\5\66\34\2\u00ea\u00e9\3\2\2\2"+
		"\u00ea\u00eb\3\2\2\2\u00eb!\3\2\2\2\u00ec\u00ed\7!\2\2\u00ed\u00ef\5F"+
		"$\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\3\2\2\2\u00f0"+
		"\u00f1\7\u0083\2\2\u00f1\u00f4\7a\2\2\u00f2\u00f4\7\u00b3\2\2\u00f3\u00f0"+
		"\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f7\5\66\34\2"+
		"\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9"+
		"\7\u01ce\2\2\u00f9\u00fb\5\60\31\2\u00fa\u00fc\t\2\2\2\u00fb\u00fa\3\2"+
		"\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\u01cf\2\2\u00fe"+
		"#\3\2\2\2\u00ff\u0100\5F$\2\u0100\u0101\7\u01c9\2\2\u0101\u0102\5F$\2"+
		"\u0102\u0103\7\u01c9\2\2\u0103\u0104\5F$\2\u0104\u0105\7\u01c9\2\2\u0105"+
		"\u0111\3\2\2\2\u0106\u0107\5F$\2\u0107\u0109\7\u01c9\2\2\u0108\u010a\5"+
		"F$\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\7\u01c9\2\2\u010c\u0111\3\2\2\2\u010d\u010e\5F$\2\u010e\u010f\7"+
		"\u01c9\2\2\u010f\u0111\3\2\2\2\u0110\u00ff\3\2\2\2\u0110\u0106\3\2\2\2"+
		"\u0110\u010d\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113"+
		"\5F$\2\u0113%\3\2\2\2\u0114\u0115\5F$\2\u0115\u0117\7\u01c9\2\2\u0116"+
		"\u0118\5F$\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2"+
		"\2\u0119\u011a\7\u01c9\2\2\u011a\u011f\3\2\2\2\u011b\u011c\5F$\2\u011c"+
		"\u011d\7\u01c9\2\2\u011d\u011f\3\2\2\2\u011e\u0114\3\2\2\2\u011e\u011b"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\5F$\2\u0121"+
		"\'\3\2\2\2\u0122\u0123\5F$\2\u0123\u0124\7\u01c9\2\2\u0124\u0126\3\2\2"+
		"\2\u0125\u0122\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\5F$\2\u0128)\3\2\2\2\u0129\u012a\5F$\2\u012a\u012c\7\u01c9\2\2\u012b"+
		"\u012d\5F$\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2"+
		"\2\u012e\u012f\7\u01c9\2\2\u012f\u0134\3\2\2\2\u0130\u0131\5F$\2\u0131"+
		"\u0132\7\u01c9\2\2\u0132\u0134\3\2\2\2\u0133\u0129\3\2\2\2\u0133\u0130"+
		"\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\5F$\2\u0136"+
		"+\3\2\2\2\u0137\u013a\5$\23\2\u0138\u013a\7\u01b6\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u0138\3\2\2\2\u013a-\3\2\2\2\u013b\u013c\5&\24\2\u013c\u013d"+
		"\7\u01c9\2\2\u013d\u013f\3\2\2\2\u013e\u013b\3\2\2\2\u013e\u013f\3\2\2"+
		"\2\u013f\u0140\3\2\2\2\u0140\u0141\5F$\2\u0141/\3\2\2\2\u0142\u0147\5"+
		"F$\2\u0143\u0144\7\u01d0\2\2\u0144\u0146\5F$\2\u0145\u0143\3\2\2\2\u0146"+
		"\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\61\3\2\2"+
		"\2\u0149\u0147\3\2\2\2\u014a\u014d\5F$\2\u014b\u014d\7\u01b6\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\63\3\2\2\2\u014e\u014f\t\5\2"+
		"\2\u014f\65\3\2\2\2\u0150\u0151\t\6\2\2\u0151\67\3\2\2\2\u0152\u0154\7"+
		"m\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0156\7n\2\2\u01569\3\2\2\2\u0157\u015d\5*\26\2\u0158\u015d\7\u0093\2"+
		"\2\u0159\u015d\7c\2\2\u015a\u015d\7\u00d7\2\2\u015b\u015d\7\u00de\2\2"+
		"\u015c\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015c\u015a"+
		"\3\2\2\2\u015c\u015b\3\2\2\2\u015d;\3\2\2\2\u015e\u0160\5F$\2\u015f\u0161"+
		"\7U\2\2\u0160\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0169\3\2\2\2\u0162"+
		"\u0163\7\u01ce\2\2\u0163\u0166\t\7\2\2\u0164\u0165\7\u01d0\2\2\u0165\u0167"+
		"\7\u01b7\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2"+
		"\2\u0168\u016a\7\u01cf\2\2\u0169\u0162\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"=\3\2\2\2\u016b\u016d\7\u0192\2\2\u016c\u016e\7\u01b7\2\2\u016d\u016c"+
		"\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u02a3\3\2\2\2\u016f\u0173\7\u0193\2"+
		"\2\u0170\u0171\7\u01ce\2\2\u0171\u0172\7\u01b7\2\2\u0172\u0174\7\u01cf"+
		"\2\2\u0173\u0170\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0176\3\2\2\2\u0175"+
		"\u0177\7\u00b5\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179"+
		"\3\2\2\2\u0178\u017a\7\u0190\2\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2"+
		"\2\u017a\u02a3\3\2\2\2\u017b\u017f\7\u0194\2\2\u017c\u017d\7\u01ce\2\2"+
		"\u017d\u017e\7\u01b7\2\2\u017e\u0180\7\u01cf\2\2\u017f\u017c\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\7\u00b5\2\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0186\7\u0190\2"+
		"\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u02a3\3\2\2\2\u0187\u018b"+
		"\7\u0195\2\2\u0188\u0189\7\u01ce\2\2\u0189\u018a\7\u01b7\2\2\u018a\u018c"+
		"\7\u01cf\2\2\u018b\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2"+
		"\2\u018d\u018f\7\u00b5\2\2\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\u0191\3\2\2\2\u0190\u0192\7\u0190\2\2\u0191\u0190\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u02a3\3\2\2\2\u0193\u0197\7\u0196\2\2\u0194\u0195\7\u01ce"+
		"\2\2\u0195\u0196\7\u01b7\2\2\u0196\u0198\7\u01cf\2\2\u0197\u0194\3\2\2"+
		"\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\7\u00b5\2\2\u019a"+
		"\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019e\7\u0190"+
		"\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u02a3\3\2\2\2\u019f"+
		"\u01a3\7\u0197\2\2\u01a0\u01a1\7\u01ce\2\2\u01a1\u01a2\7\u01b7\2\2\u01a2"+
		"\u01a4\7\u01cf\2\2\u01a3\u01a0\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6"+
		"\3\2\2\2\u01a5\u01a7\7\u00b5\2\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2"+
		"\2\u01a7\u01a9\3\2\2\2\u01a8\u01aa\7\u0190\2\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u02a3\3\2\2\2\u01ab\u01af\7\u0198\2\2\u01ac\u01ad"+
		"\7\u01ce\2\2\u01ad\u01ae\7\u01b7\2\2\u01ae\u01b0\7\u01cf\2\2\u01af\u01ac"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01b3\7\u00b5\2"+
		"\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b5\3\2\2\2\u01b4\u01b6"+
		"\7\u0190\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u02a3\3\2\2"+
		"\2\u01b7\u01bd\7\u0199\2\2\u01b8\u01b9\7\u01ce\2\2\u01b9\u01ba\7\u01b7"+
		"\2\2\u01ba\u01bb\7\u01d0\2\2\u01bb\u01bc\7\u01b7\2\2\u01bc\u01be\7\u01cf"+
		"\2\2\u01bd\u01b8\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c0\3\2\2\2\u01bf"+
		"\u01c1\7\u00b5\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3"+
		"\3\2\2\2\u01c2\u01c4\7\u0190\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2"+
		"\2\u01c4\u02a3\3\2\2\2\u01c5\u01cb\7\u019b\2\2\u01c6\u01c7\7\u01ce\2\2"+
		"\u01c7\u01c8\7\u01b7\2\2\u01c8\u01c9\7\u01d0\2\2\u01c9\u01ca\7\u01b7\2"+
		"\2\u01ca\u01cc\7\u01cf\2\2\u01cb\u01c6\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cf\7\u00b5\2\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01d2\7\u0190\2\2\u01d1\u01d0\3\2\2"+
		"\2\u01d1\u01d2\3\2\2\2\u01d2\u02a3\3\2\2\2\u01d3\u01d9\7\u019a\2\2\u01d4"+
		"\u01d5\7\u01ce\2\2\u01d5\u01d6\7\u01b7\2\2\u01d6\u01d7\7\u01d0\2\2\u01d7"+
		"\u01d8\7\u01b7\2\2\u01d8\u01da\7\u01cf\2\2\u01d9\u01d4\3\2\2\2\u01d9\u01da"+
		"\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01dd\7\u00b5\2\2\u01dc\u01db\3\2\2"+
		"\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01e0\7\u0190\2\2\u01df"+
		"\u01de\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u02a3\3\2\2\2\u01e1\u01e9\7\u019c"+
		"\2\2\u01e2\u01e3\7\u01ce\2\2\u01e3\u01e6\7\u01b7\2\2\u01e4\u01e5\7\u01d0"+
		"\2\2\u01e5\u01e7\7\u01b7\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\u01ea\7\u01cf\2\2\u01e9\u01e2\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01ed\7\u00b5\2\2\u01ec\u01eb\3\2\2"+
		"\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\3\2\2\2\u01ee\u01f0\7\u0190\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u02a3\3\2\2\2\u01f1\u01f9\7\u019d"+
		"\2\2\u01f2\u01f3\7\u01ce\2\2\u01f3\u01f6\7\u01b7\2\2\u01f4\u01f5\7\u01d0"+
		"\2\2\u01f5\u01f7\7\u01b7\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"\u01f8\3\2\2\2\u01f8\u01fa\7\u01cf\2\2\u01f9\u01f2\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\7\u00b5\2\2\u01fc\u01fb\3\2\2"+
		"\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\3\2\2\2\u01fe\u0200\7\u0190\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u02a3\3\2\2\2\u0201\u02a3\7\u019e"+
		"\2\2\u0202\u0206\7\u017c\2\2\u0203\u0204\7\u01ce\2\2\u0204\u0205\7\u01b7"+
		"\2\2\u0205\u0207\7\u01cf\2\2\u0206\u0203\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u02a3\3\2\2\2\u0208\u020c\7\u01a0\2\2\u0209\u020a\7\u01ce\2\2\u020a\u020b"+
		"\7\u01b7\2\2\u020b\u020d\7\u01cf\2\2\u020c\u0209\3\2\2\2\u020c\u020d\3"+
		"\2\2\2\u020d\u02a3\3\2\2\2\u020e\u0212\7\u019f\2\2\u020f\u0210\7\u01ce"+
		"\2\2\u0210\u0211\7\u01b7\2\2\u0211\u0213\7\u01cf\2\2\u0212\u020f\3\2\2"+
		"\2\u0212\u0213\3\2\2\2\u0213\u02a3\3\2\2\2\u0214\u02a3\7\u01a1\2\2\u0215"+
		"\u0219\7\u01a2\2\2\u0216\u0217\7\u01ce\2\2\u0217\u0218\7\u01b7\2\2\u0218"+
		"\u021a\7\u01cf\2\2\u0219\u0216\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021c"+
		"\3\2\2\2\u021b\u021d\7\u01ba\2\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2"+
		"\2\u021d\u0221\3\2\2\2\u021e\u021f\7\u01a3\2\2\u021f\u0220\7\u00a0\2\2"+
		"\u0220\u0222\5F$\2\u0221\u021e\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0225"+
		"\3\2\2\2\u0223\u0224\7\35\2\2\u0224\u0226\5F$\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u02a3\3\2\2\2\u0227\u022b\7\u01a4\2\2\u0228\u0229"+
		"\7\u01ce\2\2\u0229\u022a\7\u01b7\2\2\u022a\u022c\7\u01cf\2\2\u022b\u0228"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022f\7\u01ba\2"+
		"\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0233\3\2\2\2\u0230\u0231"+
		"\7\u01a3\2\2\u0231\u0232\7\u00a0\2\2\u0232\u0234\5F$\2\u0233\u0230\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0236\7\35\2\2\u0236"+
		"\u0238\5F$\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u02a3\3\2\2"+
		"\2\u0239\u023d\7\u01ba\2\2\u023a\u023b\7\u01ce\2\2\u023b\u023c\7\u01b7"+
		"\2\2\u023c\u023e\7\u01cf\2\2\u023d\u023a\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u02a3\3\2\2\2\u023f\u0243\7\u01a5\2\2\u0240\u0241\7\u01ce\2\2\u0241\u0242"+
		"\7\u01b7\2\2\u0242\u0244\7\u01cf\2\2\u0243\u0240\3\2\2\2\u0243\u0244\3"+
		"\2\2\2\u0244\u02a3\3\2\2\2\u0245\u02a3\7\u01a6\2\2\u0246\u02a3\7\u01a7"+
		"\2\2\u0247\u02a3\7\u01a8\2\2\u0248\u02a3\7\u01a9\2\2\u0249\u024b\7\u01aa"+
		"\2\2\u024a\u024c\7\u01ba\2\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u0250\3\2\2\2\u024d\u024e\7\u01a3\2\2\u024e\u024f\7\u00a0\2\2\u024f\u0251"+
		"\5F$\2\u0250\u024d\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0253\7\35\2\2\u0253\u0255\5F$\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u02a3\3\2\2\2\u0256\u0258\7\u01ab\2\2\u0257\u0259\7\u01ba\2"+
		"\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025d\3\2\2\2\u025a\u025b"+
		"\7\u01a3\2\2\u025b\u025c\7\u00a0\2\2\u025c\u025e\5F$\2\u025d\u025a\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f\u0260\7\35\2\2\u0260"+
		"\u0262\5F$\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u02a3\3\2\2"+
		"\2\u0263\u0265\7\u01ac\2\2\u0264\u0266\7\u01ba\2\2\u0265\u0264\3\2\2\2"+
		"\u0265\u0266\3\2\2\2\u0266\u026a\3\2\2\2\u0267\u0268\7\u01a3\2\2\u0268"+
		"\u0269\7\u00a0\2\2\u0269\u026b\5F$\2\u026a\u0267\3\2\2\2\u026a\u026b\3"+
		"\2\2\2\u026b\u026e\3\2\2\2\u026c\u026d\7\35\2\2\u026d\u026f\5F$\2\u026e"+
		"\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u02a3\3\2\2\2\u0270\u0272\7\u01ad"+
		"\2\2\u0271\u0273\7\u01ba\2\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0277\3\2\2\2\u0274\u0275\7\u01a3\2\2\u0275\u0276\7\u00a0\2\2\u0276\u0278"+
		"\5F$\2\u0277\u0274\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u027b\3\2\2\2\u0279"+
		"\u027a\7\35\2\2\u027a\u027c\5F$\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2"+
		"\2\2\u027c\u02a3\3\2\2\2\u027d\u027e\7\u01ae\2\2\u027e\u027f\7\u01ce\2"+
		"\2\u027f\u0282\5F$\2\u0280\u0281\7\u01d0\2\2\u0281\u0283\5F$\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284\u0285\7\u01cf\2"+
		"\2\u0285\u0289\3\2\2\2\u0286\u0287\7\u01a3\2\2\u0287\u0288\7\u00a0\2\2"+
		"\u0288\u028a\5F$\2\u0289\u0286\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028d"+
		"\3\2\2\2\u028b\u028c\7\35\2\2\u028c\u028e\5F$\2\u028d\u028b\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u02a3\3\2\2\2\u028f\u0290\7\u00a0\2\2\u0290\u0291"+
		"\7\u01ce\2\2\u0291\u0294\5F$\2\u0292\u0293\7\u01d0\2\2\u0293\u0295\5F"+
		"$\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0297\7\u01cf\2\2\u0297\u029b\3\2\2\2\u0298\u0299\7\u01a3\2\2\u0299\u029a"+
		"\7\u00a0\2\2\u029a\u029c\5F$\2\u029b\u0298\3\2\2\2\u029b\u029c\3\2\2\2"+
		"\u029c\u029f\3\2\2\2\u029d\u029e\7\35\2\2\u029e\u02a0\5F$\2\u029f\u029d"+
		"\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1\u02a3\7\u01af\2"+
		"\2\u02a2\u016b\3\2\2\2\u02a2\u016f\3\2\2\2\u02a2\u017b\3\2\2\2\u02a2\u0187"+
		"\3\2\2\2\u02a2\u0193\3\2\2\2\u02a2\u019f\3\2\2\2\u02a2\u01ab\3\2\2\2\u02a2"+
		"\u01b7\3\2\2\2\u02a2\u01c5\3\2\2\2\u02a2\u01d3\3\2\2\2\u02a2\u01e1\3\2"+
		"\2\2\u02a2\u01f1\3\2\2\2\u02a2\u0201\3\2\2\2\u02a2\u0202\3\2\2\2\u02a2"+
		"\u0208\3\2\2\2\u02a2\u020e\3\2\2\2\u02a2\u0214\3\2\2\2\u02a2\u0215\3\2"+
		"\2\2\u02a2\u0227\3\2\2\2\u02a2\u0239\3\2\2\2\u02a2\u023f\3\2\2\2\u02a2"+
		"\u0245\3\2\2\2\u02a2\u0246\3\2\2\2\u02a2\u0247\3\2\2\2\u02a2\u0248\3\2"+
		"\2\2\u02a2\u0249\3\2\2\2\u02a2\u0256\3\2\2\2\u02a2\u0263\3\2\2\2\u02a2"+
		"\u0270\3\2\2\2\u02a2\u027d\3\2\2\2\u02a2\u028f\3\2\2\2\u02a2\u02a1\3\2"+
		"\2\2\u02a3?\3\2\2\2\u02a4\u02a7\7n\2\2\u02a5\u02a7\5B\"\2\u02a6\u02a4"+
		"\3\2\2\2\u02a6\u02a5\3\2\2\2\u02a7A\3\2\2\2\u02a8\u02b8\7\u01b9\2\2\u02a9"+
		"\u02b8\7\u01ba\2\2\u02aa\u02ac\5D#\2\u02ab\u02aa\3\2\2\2\u02ab\u02ac\3"+
		"\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02b8\7\u01b7\2\2\u02ae\u02b0\5D#\2\u02af"+
		"\u02ae\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b8\t\b"+
		"\2\2\u02b2\u02b4\5D#\2\u02b3\u02b2\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5"+
		"\3\2\2\2\u02b5\u02b6\7\u01cd\2\2\u02b6\u02b8\t\t\2\2\u02b7\u02a8\3\2\2"+
		"\2\u02b7\u02a9\3\2\2\2\u02b7\u02ab\3\2\2\2\u02b7\u02af\3\2\2\2\u02b7\u02b3"+
		"\3\2\2\2\u02b8C\3\2\2\2\u02b9\u02ba\t\n\2\2\u02baE\3\2\2\2\u02bb\u02bf"+
		"\5H%\2\u02bc\u02bf\7\u01b3\2\2\u02bd\u02bf\7\u01b4\2\2\u02be\u02bb\3\2"+
		"\2\2\u02be\u02bc\3\2\2\2\u02be\u02bd\3\2\2\2\u02bfG\3\2\2\2\u02c0\u02c1"+
		"\t\13\2\2\u02c1I\3\2\2\2\u02c2\u02d2\7\u01bd\2\2\u02c3\u02d2\7\u01be\2"+
		"\2\u02c4\u02d2\7\u01bf\2\2\u02c5\u02c6\7\u01bf\2\2\u02c6\u02d2\7\u01bd"+
		"\2\2\u02c7\u02c8\7\u01be\2\2\u02c8\u02d2\7\u01bd\2\2\u02c9\u02ca\7\u01bf"+
		"\2\2\u02ca\u02d2\7\u01be\2\2\u02cb\u02cc\7\u01c0\2\2\u02cc\u02d2\7\u01bd"+
		"\2\2\u02cd\u02ce\7\u01c0\2\2\u02ce\u02d2\7\u01be\2\2\u02cf\u02d0\7\u01c0"+
		"\2\2\u02d0\u02d2\7\u01bf\2\2\u02d1\u02c2\3\2\2\2\u02d1\u02c3\3\2\2\2\u02d1"+
		"\u02c4\3\2\2\2\u02d1\u02c5\3\2\2\2\u02d1\u02c7\3\2\2\2\u02d1\u02c9\3\2"+
		"\2\2\u02d1\u02cb\3\2\2\2\u02d1\u02cd\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d2"+
		"K\3\2\2\2\u02d3\u02d4\t\f\2\2\u02d4M\3\2\2\2\u02d5\u02d7\7\u01b7\2\2\u02d6"+
		"\u02d8\t\r\2\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8O\3\2\2\2"+
		"{S_fjmv\u0083\u009d\u00a2\u00a5\u00ab\u00b1\u00b6\u00ba\u00bd\u00c1\u00c3"+
		"\u00c7\u00cc\u00d1\u00db\u00df\u00e2\u00e7\u00ea\u00ee\u00f3\u00f6\u00fb"+
		"\u0109\u0110\u0117\u011e\u0125\u012c\u0133\u0139\u013e\u0147\u014c\u0153"+
		"\u015c\u0160\u0166\u0169\u016d\u0173\u0176\u0179\u017f\u0182\u0185\u018b"+
		"\u018e\u0191\u0197\u019a\u019d\u01a3\u01a6\u01a9\u01af\u01b2\u01b5\u01bd"+
		"\u01c0\u01c3\u01cb\u01ce\u01d1\u01d9\u01dc\u01df\u01e6\u01e9\u01ec\u01ef"+
		"\u01f6\u01f9\u01fc\u01ff\u0206\u020c\u0212\u0219\u021c\u0221\u0225\u022b"+
		"\u022e\u0233\u0237\u023d\u0243\u024b\u0250\u0254\u0258\u025d\u0261\u0265"+
		"\u026a\u026e\u0272\u0277\u027b\u0282\u0289\u028d\u0294\u029b\u029f\u02a2"+
		"\u02a6\u02ab\u02af\u02b3\u02b7\u02be\u02d1\u02d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}