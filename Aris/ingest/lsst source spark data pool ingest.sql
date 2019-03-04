--drop database LSST_datapool
--create database LSST_datapool

USE LSST_datapool
GO

--drop external TABLE [dbo].[Source]
--DROP EXTERNAL TABLE [dbo].[Source]

--based on Sue's https://github.com/idies/jhu-lsst/blob/master/mysql/mssql-createTables.sql
CREATE external TABLE [Source] (
	[id] BIGINT NOT NULL,
	[chunkid] BIGINT not null, --jvv changed int->bigint
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
	[exposure_filter_id] BIGINT NOT NULL, --jvv changed int->bigint
	[exposure_time] FLOAT NULL ,
	[exposure_time_mid] FLOAT NULL ,
	[cluster_id] BIGINT NULL ,
	[cluster_coord_ra] FLOAT NULL ,
	[cluster_coord_decl] FLOAT NULL)
    WITH
    (
        DATA_SOURCE = SqlDataPool,
        DISTRIBUTION = ROUND_ROBIN
    );
GO

CREATE external TABLE [Sourceint] (
	[id] BIGINT NOT NULL,
	[chunkid] INT not null, --jvv changed int->bigint
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
	[exposure_filter_id] INT NOT NULL, --jvv changed int->bigint
	[exposure_time] FLOAT NULL ,
	[exposure_time_mid] FLOAT NULL ,
	[cluster_id] BIGINT NULL ,
	[cluster_coord_ra] FLOAT NULL ,
	[cluster_coord_decl] FLOAT NULL)
    WITH
    (
        DATA_SOURCE = SqlDataPool,
        DISTRIBUTION = ROUND_ROBIN
    );
GO
--truncate table sourceint
--DROP EXTERNAL TABLE [dbo].[Source]
-- CREATE external TABLE [Sourceint] (
-- 	[id] BIGINT NOT NULL,
-- -- 	[chunkid] bigint not null, --added this as per gerard's suggestion
-- 	[coord_ra] FLOAT NULL)
-- 	    WITH
--     (
--         DATA_SOURCE = SqlDataPool,
--         DISTRIBUTION = ROUND_ROBIN
--     );
-- GO

--select count(*) from Sourceint
--select count(chunkID) from Sourceint
--select top 10 * from sourceint
--select top 10 * from sourceint order by coord_ra desc
--select avg(coord_ra) from sourceint
--select count(distinct id) from sourceint
--select distinct flags_badcentroid from source

--create STATISTICS foo on sourceint (id, chunkid) with fullscan