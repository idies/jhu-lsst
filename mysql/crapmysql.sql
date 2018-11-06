
use vdc1;


ls



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



select table_name from information_schema.tables
where table_schema = 'vdc1'
and table_name like 'Object\_%'
and table_rows > 0
order by table_name
-- into outfile '/srv/data02/sql_db/sue/csv/tables.txt';


select * from information_schema.tables

select substring_index(table_name, '_', -1) as cid
from information_schema.tables
where table_schema = 'vdc1'
and table_rows > 0


