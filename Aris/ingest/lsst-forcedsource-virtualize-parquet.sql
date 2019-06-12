--drop database LSST
--create database LSST

USE LSST
GO

-- Create the SqlDataPool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlDataPool')
	IF SERVERPROPERTY('ProductLevel') = 'CTP2.5'
		CREATE EXTERNAL DATA SOURCE SqlDataPool
		WITH (LOCATION = 'sqldatapool://service-mssql-controller:8080/datapools/default');
	ELSE IF SERVERPROPERTY('ProductLevel') = 'CTP3.0'
		CREATE EXTERNAL DATA SOURCE SqlDataPool
		WITH (LOCATION = 'sqldatapool://controller-svc:8080/datapools/default');

-- Create the SqlStoragePool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlStoragePool')
	IF SERVERPROPERTY('ProductLevel') = 'CTP2.5'
		CREATE EXTERNAL DATA SOURCE SqlStoragePool
		WITH (LOCATION = 'sqlhdfs://nmnode-0-0.nmnode-0-svc:50070');
	ELSE IF SERVERPROPERTY('ProductLevel') = 'CTP3.0'
		CREATE EXTERNAL DATA SOURCE SqlStoragePool
		WITH (LOCATION = 'sqlhdfs://controller-svc:8080/default');

--drop EXTERNAL FILE FORMAT parquet_file
IF NOT EXISTS(SELECT * FROM sys.external_file_formats WHERE name = 'parquet_file')
    CREATE EXTERNAL FILE FORMAT parquet_file
    WITH (
        FORMAT_TYPE = PARQUET
);

--drop external TABLE [dbo].[ForcedSource]
--DROP EXTERNAL TABLE [dbo].[ForcedSource]

--based on Sue's https://github.com/idies/jhu-lsst/blob/master/mysql/mssql-createTables.sql
CREATE external TABLE [ForcedSource] (
       	[deepSourceId] BIGINT NOT NULL,
	[scienceCcdExposureId] BIGINT NOT NULL,
	[psfFlux] FLOAT NULL,
	[psfFluxSigma] FLOAT NULL,
	[flagBadMeasCentroid] INT NOT NULL,
	[flagPixEdge] INT NOT NULL,
	[flagPixInterpAny] INT NOT NULL,
	[flagPixInterpCen] INT NOT NULL,
	[flagPixSaturAny] INT NOT NULL,
	[flagPixSaturCen] INT NOT NULL,
	[flagBadPsfFlux] INT NOT NULL,
	[chunkId] INT NOT NULL,
    [subChunkId] INT NOT NULL)
    WITH
    (
         DATA_SOURCE = SqlStoragePool,
         LOCATION = '/user/hive/warehouse/forcedsource',
         FILE_FORMAT = parquet_file
    );
GO

--USE LSST
--GO
--select count_big(*) from ForcedSource
--select count(chunkID) from ForcedSource
--select top 10 * from ForcedSource
--select top 10 * from ForcedSource order by coord_ra
--select avg(coord_ra) from ForcedSource
--select count(distinct id) from ForcedSource
--select distinct chunkID from ForcedSource
--select count(*) from forcedsource where psfFlux BETWEEN 0.13 AND 0.14