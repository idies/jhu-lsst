

create database LSST;

use LSST
go

-- Create default data sources for SQL Big Data Cluster
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlDataPool')
    CREATE EXTERNAL DATA SOURCE SqlDataPool
    WITH (LOCATION = 'sqldatapool://controller-svc/default');

IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlStoragePool')
    CREATE EXTERNAL DATA SOURCE SqlStoragePool
    WITH (LOCATION = 'sqlhdfs://controller-svc/default');

CREATE EXTERNAL FILE FORMAT csv_file
WITH (
    FORMAT_TYPE = DELIMITEDTEXT,
    FORMAT_OPTIONS(
        FIELD_TERMINATOR = ',',
        STRING_DELIMITER = '"',
        FIRST_ROW = 2,
        USE_TYPE_DEFAULT = TRUE)
);


use LSST;
create login spark_user with password = '!!foospark9999'
create user spark_user from login spark_user

grant alter any external data source to spark_user;

grant create  table to spark_user;
grant alter any schema to spark_user;

alter role [db_datareader] add member spark_user;
alter role [db_datawriter] add member spark_user;
alter role [db_ddladmin]  add member spark_user;


-- webuser for casjobs
CREATE LOGIN [webuser] WITH PASSWORD=N'read4w3now!', DEFAULT_DATABASE=[master], DEFAULT_LANGUAGE=[us_english], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO


CREATE USER [webuser] FOR LOGIN [webuser]
GO
ALTER AUTHORIZATION ON SCHEMA::[db_datareader] TO [webuser]
GO
ALTER ROLE [db_datareader] ADD MEMBER [webuser]
GO

GRANT EXECUTE TO [webuser]
GRANT SELECT TO [webuser]
GRANT SHOWPLAN TO [webuser] 
GRANT VIEW DEFINITION TO [webuser]




use LSST
GO

EXECUTE( ' Use LSST; CREATE LOGIN spark_user  WITH PASSWORD = ''!!foospark9999'' ;') AT  DATA_SOURCE SqlDataPool;

EXECUTE('Use LSST; CREATE USER spark_user; ALTER ROLE [db_datareader] ADD MEMBER spark_user;  ALTER ROLE [db_datawriter] ADD MEMBER spark_user; alter role [db_ddladmin] add member spark_user;') AT DATA_SOURCE SqlDataPool;

EXECUTE('Use LSST; grant create  table to spark_user;grant alter any schema to spark_user;') AT DATA_SOURCE SqlDataPool;


execute ('sp_configure "show advanced options", 1; RECONFIGURE;') at data_source SqlDataPool
execute ('sp_configure "max server memory", 65536; RECONFIGURE;') at data_source SqlDataPool

exec sp_configure "show advanced options", 1; RECONFIGURE;
exec  sp_configure "max server memory", 65536; RECONFIGURE;

GO
create schema storage;
go
create schema dp;


USE LSST
GO

if not exists(select * from sys.external_file_formats where name = 'parquet_file')
	CREATE EXTERNAL FILE FORMAT parquet_file
	WITH (  
    FORMAT_TYPE = PARQUET,  
    DATA_COMPRESSION = 'org.apache.hadoop.io.compress.SnappyCodec'  
	);  


