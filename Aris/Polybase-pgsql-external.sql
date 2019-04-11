--- Here is how to create a postgres data source and an external table in polybase

--0. install the ODBC driver for postgres on the windows machine

--1. Make sure Polybase is installed and configured
--   You should only have to do this once per instance
exec sp_configure @configname = 'polybase enabled', @configvalue = 1;
RECONFIGURE  WITH OVERRIDE   ;

exec sp_configure

--- 
---RESTART SQL SERVER INSTANCE!!!!!!!  (on sdss3p, this is the SQL2019 named instance)
---
select SERVERPROPERTY('IsPolyBaseInstalled') as IsPolyBaseInstalled;  --if this is '1' you are good to go


--2.  create the master key and credentials
CREATE MASTER KEY ENCRYPTION BY PASSWORD = 'xxxxxxxxxx'; --ask sue or victor for password
go


CREATE DATABASE SCOPED CREDENTIAL MyCred 
WITH IDENTITY = 'postgres',   
    SECRET = 'xxxxxxxxxx';  --ask sue or victor for password  
GO 


--4. create external data source 
CREATE EXTERNAL DATA SOURCE pg64  --you can name the data source whatever you want
WITH 
( 
LOCATION = 'odbc://172.23.250.64:5432',
CONNECTION_OPTIONS = 'Driver={PostgreSQL Unicode(x64)}; ServerNode = 172.23.250.64:5432',
PUSHDOWN = ON,
CREDENTIAL = MyCred
);

--5. Create external table (get table definition from postgres instance)

/*
CREATE TABLE "binid" (
	"pk" INTEGER NOT NULL,
	"id" INTEGER NULL DEFAULT NULL,
	PRIMARY KEY ("pk")
)
;
COMMENT ON COLUMN "binid"."pk" IS E'';
COMMENT ON COLUMN "binid"."id" IS E'';
*/

create external table binid(
	pk int not null,
	id int null
	)
	with(
		location='manga.mangadapdb.binid',
		data_source=pg64
	);


--6. Optional: Create statistics on external table
-- We recommend creating statistics on external table columns, especially the ones used for joins, filters and aggregates, for optimal query performance.


CREATE STATISTICS binid_pk ON binid (pk) WITH FULLSCAN;  


-- create another external table

create external table mssql_redcorr(
	pk int not null,
	value nvarchar(4000),  --wouldn't let me use varchar(max) or varchar(8000).  cant use LOB types in external tables, apparently
	modelcube_pk int
	)
	with (
		location='manga.mangadapdb.mssql_redcorr',
		data_source=pg64
	);

create statistics mssql_redcorr_pk on mssql_redcorr (pk) with fullscan;


--this doesn't seem to work though:
SELECT TOP (1000) [pk]
      ,[value]
      ,[modelcube_pk]
  FROM [Test_postgres].[dbo].[mssql_redcorr]

--Msg 7320, Level 16, State 110, Line 2
--Cannot execute the query "Remote Query" against OLE DB provider "SQLNCLI11" for linked server "(null)". 105082;Generic ODBC error: Fetched item was truncated. 


	