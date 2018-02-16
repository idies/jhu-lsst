USE [lsst_stage]
GO

insert blah (deepsourceid, ra, decl, ravar, declvar, radeclcov, htmid, chunkID)

select  top 1000 deepsourceid, ra, decl, case 
	ravar when 'null' then null else ravar end as ravar,
declvar, radeclcov, LSST20.htmid.fromEq(ra, decl) as htmID,[chunkId], cast(u_flagNegative as bit)
from object_stage
where ravar = 'NULL'


select * from blah

select top 10 * from object_stage
where ravar = 'NULL'

select * into objtest from LSST_01.dbo.Object_01
where 0=1

----------------
-- generate case statement if col is varchar
----------------
select count(*) 
from INFORMATION_SCHEMA.columns 
where table_name = 'Object_1025'
--and data_type = 'varchar'
--and is_nullable = 'YES'


select * from INFORMATION_SCHEMA.columns
where table_name = 'Object_1025'
and data_type = 'bit'
and is_nullable = 'no'


declare @col sysname
declare @s nvarchar(max)
declare @s2 nvarchar(max)
--declare @newline as char(2) = char(13) + char(10)
declare @sql nvarchar(max)

set @s = 'insert object_template select '

set nocount on

---for Object
select
 case 
	when data_type = 'float' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)),column_name, ' when ''null'' then null else ', column_name ,' end as ', column_name, ', ')
	when data_type = 'bit' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)), column_name, ' when ''0'' then 0 when ''1'' then 1 else null end as ', column_name, ', ')
	--then concat('rtrim(ltrim(',column_name,')),')
	else concat(cast(column_name as nvarchar(max)), ', ')
	end 
from INFORMATION_SCHEMA.columns 
where table_name = 'Object_1025'
------------------------------------------------------------------


-------------------------------------------------------------------
set nocount on
--for Source
select
 case 
	when data_type = 'bit' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)), column_name, ' when ''0'' then 0 when ''1'' then 1 else null end as ', column_name, ', ')
	when data_type != 'bit' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)),column_name, ' when ''null'' then null else ', column_name ,' end as ', column_name, ', ')
	when is_nullable = 'YES' 
	then concat(cast('case ' as nvarchar(max)),column_name, 'when ''null'' then null else ', column_name ,' end as ', column_name, ', ')
	--then concat('rtrim(ltrim(',column_name,')),')
	else concat(cast(column_name as nvarchar(max)), ', ')
	end 
from INFORMATION_SCHEMA.columns 
where table_name = 'Source_1025'
and column_name not in ('chunkID', 'subChunkID')



select s1.data_type, s1.is_nullable, s1.column_name, ss.DATA_TYPE, ss.IS_NULLABLE, ss.COLUMN_NAME
from INFORMATION_SCHEMA.COLUMNS s1
join INFORMATION_SCHEMA.COLUMNS ss
on s1.ORDINAL_POSITION = ss.ORDINAL_POSITION
and s1.COLUMN_NAME = ss.column_name
where  
s1.TABLE_NAME='source1'
and ss.table_name='source_stage'
and ss.DATA_TYPE = 'varchar'
and s1.data_type = 'float'


SELECT c.*
FROM LSST_01.sys.columns c
WHERE c.object_id = OBJECT_ID('Source_01');

select object_id('Source_01')

select * into source1
from lsst_01.dbo.source_01
where 0=1




-------------------------------------------------------------------------------------
--for ForcedSource

select * from INFORMATION_SCHEMA.columns 
where table_name = 'ForcedSource_1025'




select count(*) from INFORMATION_SCHEMA.columns 
where table_name = 'forcedsource_template'

set nocount on
select
 case 
	when data_type = 'bit' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)), column_name, ' when ''0'' then 0 when ''1'' then 1 else null end as ', column_name, ', ')
	when data_type = 'bit' and is_nullable = 'NO'
	then concat(cast('case ' as nvarchar(max)), column_name, ' when ''0'' then 0 when ''1'' then 1 else', column_name, ' end as ', column_name, ', ')
	when data_type != 'bit' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)),column_name, ' when ''null'' then null else ', column_name ,' end as ', column_name, ', ')
	--then concat('rtrim(ltrim(',column_name,')),')
	else concat(cast(column_name as nvarchar(max)), ', ')
	end 
from INFORMATION_SCHEMA.columns 
where table_name = 'ForcedSource_1025'
----------------------------------------------------------------------------------------------------
-- for ObjectFullOverlap
select count(*) from INFORMATION_SCHEMA.columns 
where table_name =  'ObjectFullOverlap_1025'

select count(*) from INFORMATION_SCHEMA.columns 
where table_name = 'ObjectFullOverlap_template'


set nocount on
select
 case 
	when data_type = 'bit' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)), column_name, ' when ''0'' then 0 when ''1'' then 1 else null end as ', column_name, ', ')
	when data_type = 'bit' and is_nullable = 'NO'
	then concat(cast('case ' as nvarchar(max)), column_name, ' when ''0'' then 0 when ''1'' then 1 else', column_name, ' end as ', column_name, ', ')
	when data_type != 'bit' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)),column_name, ' when ''null'' then null else ', column_name ,' end as ', column_name, ', ')
	--then concat('rtrim(ltrim(',column_name,')),')
	else concat(cast(column_name as nvarchar(max)), ', ')
	end 
from INFORMATION_SCHEMA.columns 
where table_name = 'ObjectFullOverlap_1025'



	





select @sql = concat(@s, @s2, ' from object_template')
select @sql


declare @s1 nvarchar(max)
declare @newline as char(2) = char(13) + char(10)
declare @newlinecomma as nvarchar(max) = concat(',',@newline)

-

select string_agg( 
	case 
	when data_type = 'float' and is_nullable = 'YES'
	then concat(cast('case ' as nvarchar(max)) ,column_name, ' when ''null'' then null else ', column_name ,' end as ', column_name)
	when data_type = 'bit' and is_nullable = 'YES' 
	then concat(cast('cast (' as nvarchar(max)), column_name, ') as bit as ', column_name)
	else cast(column_name as nvarchar(max))	
	end , ',')
from INFORMATION_SCHEMA.columns 
where table_name = 'Object_1025'

select concat(cast('select ' as nvarchar(max)), @s1, ' from object_stage') 





--do this if col is varchar and nullable
select concat(' case ',@col, ' when ''null'' then null else ', @col ,' end as ', @col, ', ')
--do this if not
select concat(@col, ', ')







declare @schemaName sysname
declare @tableName sysname

set @schemaName = 'dbo'
set @tableName = 'object_template'

select t0.name as 'columnName',
           t1.name as 'typeName',
           t0.max_length as 'maxLen',
           t0.[precision],
           t0.[scale],
           quotename(t0.name) + ' ' + t1.name +
            case
              when t0.user_type_id = 62 then '(' + convert(varchar(4), t0.[precision]) + ')'               -- float
              when t0.user_type_id = 43 then '(' + convert(varchar(4), t0.[scale]) + ')'                   -- datetimeoffset
              when t0.user_type_id in (173, 175, 239) then '(' + convert(varchar(8), t0.max_length) + ')'  -- char etc.
              when t0.user_type_id in (165, 167, 231) then '(' + case t0.max_length when -1 then 'max' else convert(varchar(8), t0.max_length) end + ')'  -- varchar etc.
              else ''
            end + ' ' +
            case t0.is_nullable when 0 then 'not null' else 'null' end as 'sqlDeclaration'
      from sys.columns t0
      join sys.types t1 on t1.user_type_id = t0.user_type_id
     where t0.[object_id] = object_id( quotename(@schemaName)+'.'+quotename(@tableName) )
   order by t0.column_id



