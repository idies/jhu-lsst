--drop database LSST
--create database LSST

USE LSST
GO

-- Create the SqlDataPool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlDataPool')
   CREATE EXTERNAL DATA SOURCE SqlDataPool
   WITH (LOCATION = 'sqldatapool://service-mssql-controller:8080/datapools/default');

-- Create the SqlStoragePool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlStoragePool')
BEGIN
   IF SERVERPROPERTY('ProductLevel') = 'CTP2.3'
     CREATE EXTERNAL DATA SOURCE SqlStoragePool
     WITH (LOCATION = 'sqlhdfs://service-mssql-controller:8080');
   ELSE IF SERVERPROPERTY('ProductLevel') = 'CTP2.4'
     CREATE EXTERNAL DATA SOURCE SqlStoragePool
     WITH (LOCATION = 'sqlhdfs://service-master-pool:50070');
END

--drop EXTERNAL FILE FORMAT parquet_file
IF NOT EXISTS(SELECT * FROM sys.external_file_formats WHERE name = 'parquet_file')
    CREATE EXTERNAL FILE FORMAT parquet_file
    WITH (
        FORMAT_TYPE = PARQUET
);

--drop external TABLE [dbo].[Source]
--DROP EXTERNAL TABLE [dbo].[Source]

--based on Sue's https://github.com/idies/jhu-lsst/blob/master/mysql/mssql-createTables.sql
CREATE external TABLE [Source] (
        [id] BIGINT NOT NULL,
        [chunkid] int not null, --added this as per gerard's suggestion
        [coord_ra] FLOAT NULL ,
        [coord_decl] FLOAT NULL ,
        [coord_htmId20] BIGINT NULL ,
        [parent] BIGINT NULL ,
        [flags_badcentroid] BIT NOT NULL,
        [centroid_sdss_x] FLOAT NULL ,
        [centroid_sdss_y] FLOAT NULL ,
        [centroid_sdss_xVar] FLOAT NULL ,
        [centroid_sdss_xyCov] FLOAT NULL ,
        [centroid_sdss_yVar] FLOAT NULL ,
        [centroid_sdss_flags] BIT NOT NULL,
        [flags_pixel_edge] BIT NOT NULL,
        [flags_pixel_interpolated_any] BIT NOT NULL,
        [flags_pixel_interpolated_center] BIT NOT NULL,
        [flags_pixel_saturated_any] BIT NOT NULL,
        [flags_pixel_saturated_center] BIT NOT NULL,
        [flags_pixel_cr_any] BIT NOT NULL,
        [flags_pixel_cr_center] BIT NOT NULL,
        [centroid_naive_x] FLOAT NULL ,
        [centroid_naive_y] FLOAT NULL ,
        [centroid_naive_xVar] FLOAT NULL ,
        [centroid_naive_xyCov] FLOAT NULL ,
        [centroid_naive_yVar] FLOAT NULL ,
        [centroid_naive_flags] BIT NOT NULL,
        [centroid_gaussian_x] FLOAT NULL ,
        [centroid_gaussian_y] FLOAT NULL ,
        [centroid_gaussian_xVar] FLOAT NULL ,
        [centroid_gaussian_xyCov] FLOAT NULL ,
        [centroid_gaussian_yVar] FLOAT NULL ,
        [centroid_gaussian_flags] BIT NOT NULL,
        [shape_sdss_Ixx] FLOAT NULL ,
        [shape_sdss_Iyy] FLOAT NULL ,
        [shape_sdss_Ixy] FLOAT NULL ,
        [shape_sdss_IxxVar] FLOAT NULL ,
        [shape_sdss_IxxIyyCov] FLOAT NULL ,
        [shape_sdss_IxxIxyCov] FLOAT NULL ,
        [shape_sdss_IyyVar] FLOAT NULL ,
        [shape_sdss_IyyIxyCov] FLOAT NULL ,
        [shape_sdss_IxyVar] FLOAT NULL ,
        [shape_sdss_flags] BIT NOT NULL,
        [shape_sdss_centroid_x] FLOAT NULL ,
        [shape_sdss_centroid_y] FLOAT NULL ,
        [shape_sdss_centroid_xVar] FLOAT NULL ,
        [shape_sdss_centroid_xyCov] FLOAT NULL ,
        [shape_sdss_centroid_yVar] FLOAT NULL ,
        [shape_sdss_centroid_flags] BIT NOT NULL,
        [shape_sdss_flags_unweightedbad] BIT NOT NULL,
        [shape_sdss_flags_unweighted] BIT NOT NULL,
        [shape_sdss_flags_shift] BIT NOT NULL,
        [shape_sdss_flags_maxiter] BIT NOT NULL,
        [flux_psf] FLOAT NULL ,
        [flux_psf_err] FLOAT NULL ,
        [flux_psf_flags] BIT NOT NULL,
        [flux_psf_psffactor] FLOAT NULL ,
        [flux_psf_flags_psffactor] BIT NOT NULL,
        [flux_psf_flags_badcorr] BIT NOT NULL,
        [flux_naive] FLOAT NULL ,
        [flux_naive_err] FLOAT NULL ,
        [flux_naive_flags] BIT NOT NULL,
        [flux_gaussian] FLOAT NULL ,
        [flux_gaussian_err] FLOAT NULL ,
        [flux_gaussian_flags] BIT NOT NULL,
        [flux_gaussian_psffactor] FLOAT NULL ,
        [flux_gaussian_flags_psffactor] BIT NOT NULL,
        [flux_gaussian_flags_badcorr] BIT NOT NULL,
        [flux_sinc] FLOAT NULL ,
        [flux_sinc_err] FLOAT NULL ,
        [flux_sinc_flags] BIT NOT NULL,
        [centroid_record_x] FLOAT NULL ,
        [centroid_record_y] FLOAT NULL ,
        [classification_extendedness] FLOAT NULL ,
        [aperturecorrection] FLOAT NULL ,
        [aperturecorrection_err] FLOAT NULL ,
        [refFlux] FLOAT NULL ,
        [refFlux_err] FLOAT NULL ,
        [objectId] BIGINT NOT NULL,
        [coord_raVar] FLOAT NULL ,
        [coord_radeclCov] FLOAT NULL ,
        [coord_declVar] FLOAT NULL ,
        [exposure_id] BIGINT NOT NULL,
        [exposure_filter_id] INT NOT NULL,
        [exposure_time] FLOAT NULL ,
        [exposure_time_mid] FLOAT NULL ,
        [cluster_id] BIGINT NULL ,
        [cluster_coord_ra] FLOAT NULL ,
        [cluster_coord_decl] FLOAT NULL)
    WITH
    (
         DATA_SOURCE = SqlStoragePool,
         LOCATION = '/user/hive/warehouse/source',
         FILE_FORMAT = parquet_file
    );
GO

--USE LSST
--GO
--select count(*) from Source
--select count(chunkID) from Source
--select top 10 * from Source
--select avg(coord_ra) from Source
--select count(distinct id) from Source
--select distinct chunkID from [Object]
