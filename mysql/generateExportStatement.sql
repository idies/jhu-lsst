use vdc1;

set @dbname = 'vdc1';


-- select substring_index(substring_index(@dbname, '_', -2), '_', 1);

drop temporary table if exists t1;
create temporary table if not exists t1 (
	ordinal int not null auto_increment,
	dbname varchar(255),
	tablename varchar(255),
	primary key (ordinal)
);

insert t1 (dbname, tablename)
select table_schema, table_name
from information_schema.tables
where table_schema LIKE '%_mysql';

-- select * from t1;

set group_concat_max_len = 15000;


-- set @filename = '/srv/data01/test/bigfanblah999.csv';
set @tablename = 'Object_10126';
set @filename = concat('/srv/data02/sql_db/sue/', @tablename, '.csv');
set @chunkID = substring_index(@tablename, '_', -1);



set @sql =
select 
concat(
'select ', substring_index(table_name, '_', -1), ',', (
		select group_concat(case 
		when data_type like '%binary%' then concat('coalesce(hex(', column_name, '),\'\')')
		when data_type like 'bit' then concat('cast(', column_name ,' as int)')
		else concat('coalesce(',column_name,',\'\')')
		end
	order by ordinal_position)
	from information_schema.columns
where table_schema = @dbname and table_name like 'Source_%'
order by group_concat(ordinal_position)
) ,
' into outfile ' , quote(@filename), ' fields terminated by \',\' ESCAPED BY \'\"\' LINES TERMINATED BY \'\\r\\n\' from ', @dbname, '.', @tablename,';')
as "output"
; 



select @sql into outfile '/srv/data02/sql_db/sue/cmd.sql'


set @dbname = 'vdc1';
set @tablename = 'ForcedSource_10126';
set @filename = concat('/srv/data02/sql_db/sue/', @tablename, '.csv');
set @chunkID = substring_index(@tablename, '_', -1);
-- set @sql =
select 
concat(
'select ', (
		select group_concat(case 
		when data_type like '%binary%' then concat('coalesce(hex(', column_name, '),\'\')')
		when data_type like 'bit' then concat('cast(', column_name ,' as int)')
		else concat('coalesce(',column_name,',\'\')')
		end
	order by ordinal_position)
	from information_schema.columns
where table_schema = @dbname and table_name like @tablename
order by group_concat(ordinal_position)
) ,
' into outfile ' , quote(@filename), ' fields terminated by \',\' ESCAPED BY \'\"\' LINES TERMINATED BY \'\\r\\n\' from ', @dbname, '.', @tablename,';') 
as "output"
; 

