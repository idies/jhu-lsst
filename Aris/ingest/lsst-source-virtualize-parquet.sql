--drop database LSST_hdfs
--create database LSST_hdfs

USE LSST_hdfs
GO

--drop EXTERNAL FILE FORMAT parquet_file
IF NOT EXISTS(SELECT * FROM sys.external_file_formats WHERE name = 'parquet_file')
    CREATE EXTERNAL FILE FORMAT parquet_file
    WITH (
        FORMAT_TYPE = PARQUET
--		DATA_COMPRESSION = 'org.apache.hadoop.io.compress.SnappyCodec'
    );


--drop external TABLE [dbo].[Source]
--DROP EXTERNAL TABLE [dbo].[Source]

--drop external table Sourcetest
CREATE external TABLE [Sourcetest] (
        [id] BIGINT NOT NULL )
--        [coord_ra] FLOAT NULL  )

    WITH
    (
         DATA_SOURCE = SqlStoragePool,
         LOCATION = '/user/hive/warehouse/Sourcetest',
         FILE_FORMAT = parquet_file
    );
GO

--USE LSST_hdfs
--GO
--select count(*) from Sourcetest
--select count(chunkID) from Sourcetest
--select top 10 * from Sourcetest