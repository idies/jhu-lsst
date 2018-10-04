use vdc1;

set @dbname = 'vdc1';
set @tablename = 'ObjectFullOverlap_10030';
-- set @tablename = 'Object_6948';
set @dbcount = 1;

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


-- H:\GitHub\qserv_testdata\datasets\case01\mssql-fixed-data
-- set @casenum = substring_index(substring_index(@dbname, '_', -2), '_', 1);
-- set @filename = concat('~/GitHub/qserv_testdata/datasets/', @casenum, '/mssql-fixed-data/', @tablename, '.dat');

-- set @filename = '/srv/data01/test/bigfanblah999.csv';
set @tablename = 'Source_10030';
set @filename = '/home/swerner/_out/testSource1.csv';



select concat(
'select ', (
		select group_concat(case 
		when data_type like '%binary%' then concat('coalesce(hex(', column_name, '),\'\')')
		when data_type like 'bit' then concat('cast(', column_name ,' as int)')
		else concat('coalesce(',column_name,',\'\')')
		end
	order by ordinal_position)
	from information_schema.columns
where table_schema = @dbname and table_name = @tablename
order by group_concat(ordinal_position)
) ,
' into outfile ' , quote(@filename), ' fields terminated by \',\' ESCAPED BY \'\"\' LINES TERMINATED BY \'\\r\\n\' from ', @dbname, '.', @tablename,' limit 10') as "output"; 

