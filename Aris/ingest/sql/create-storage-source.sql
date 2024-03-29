SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
CREATE EXTERNAL TABLE [storage].[Source]
(
	[id] [bigint] NULL,
	[chunkid] [int] NULL,
	[coord_ra] [float] NULL,
	[coord_decl] [float] NULL,
	[coord_htmId20] [bigint] NULL,
	[parent] [bigint] NULL,
	[flags_badcentroid] [int] NULL,
	[centroid_sdss_x] [float] NULL,
	[centroid_sdss_y] [float] NULL,
	[centroid_sdss_xVar] [float] NULL,
	[centroid_sdss_xyCov] [float] NULL,
	[centroid_sdss_yVar] [float] NULL,
	[centroid_sdss_flags] [int] NULL,
	[flags_pixel_edge] [int] NULL,
	[flags_pixel_interpolated_any] [int] NULL,
	[flags_pixel_interpolated_center] [int] NULL,
	[flags_pixel_saturated_any] [int] NULL,
	[flags_pixel_saturated_center] [int] NULL,
	[flags_pixel_cr_any] [int] NULL,
	[flags_pixel_cr_center] [int] NULL,
	[centroid_naive_x] [float] NULL,
	[centroid_naive_y] [float] NULL,
	[centroid_naive_xVar] [float] NULL,
	[centroid_naive_xyCov] [float] NULL,
	[centroid_naive_yVar] [float] NULL,
	[centroid_naive_flags] [int] NULL,
	[centroid_gaussian_x] [float] NULL,
	[centroid_gaussian_y] [float] NULL,
	[centroid_gaussian_xVar] [float] NULL,
	[centroid_gaussian_xyCov] [float] NULL,
	[centroid_gaussian_yVar] [float] NULL,
	[centroid_gaussian_flags] [int] NULL,
	[shape_sdss_Ixx] [float] NULL,
	[shape_sdss_Iyy] [float] NULL,
	[shape_sdss_Ixy] [float] NULL,
	[shape_sdss_IxxVar] [float] NULL,
	[shape_sdss_IxxIyyCov] [float] NULL,
	[shape_sdss_IxxIxyCov] [float] NULL,
	[shape_sdss_IyyVar] [float] NULL,
	[shape_sdss_IyyIxyCov] [float] NULL,
	[shape_sdss_IxyVar] [float] NULL,
	[shape_sdss_flags] [int] NULL,
	[shape_sdss_centroid_x] [float] NULL,
	[shape_sdss_centroid_y] [float] NULL,
	[shape_sdss_centroid_xVar] [float] NULL,
	[shape_sdss_centroid_xyCov] [float] NULL,
	[shape_sdss_centroid_yVar] [float] NULL,
	[shape_sdss_centroid_flags] [int] NULL,
	[shape_sdss_flags_unweightedbad] [int] NULL,
	[shape_sdss_flags_unweighted] [int] NULL,
	[shape_sdss_flags_shift] [int] NULL,
	[shape_sdss_flags_maxiter] [int] NULL,
	[flux_psf] [float] NULL,
	[flux_psf_err] [float] NULL,
	[flux_psf_flags] [int] NULL,
	[flux_psf_psffactor] [float] NULL,
	[flux_psf_flags_psffactor] [int] NULL,
	[flux_psf_flags_badcorr] [int] NULL,
	[flux_naive] [float] NULL,
	[flux_naive_err] [float] NULL,
	[flux_naive_flags] [int] NULL,
	[flux_gaussian] [float] NULL,
	[flux_gaussian_err] [float] NULL,
	[flux_gaussian_flags] [int] NULL,
	[flux_gaussian_psffactor] [float] NULL,
	[flux_gaussian_flags_psffactor] [int] NULL,
	[flux_gaussian_flags_badcorr] [int] NULL,
	[flux_sinc] [float] NULL,
	[flux_sinc_err] [float] NULL,
	[flux_sinc_flags] [int] NULL,
	[centroid_record_x] [float] NULL,
	[centroid_record_y] [float] NULL,
	[classification_extendedness] [float] NULL,
	[aperturecorrection] [float] NULL,
	[aperturecorrection_err] [float] NULL,
	[refFlux] [float] NULL,
	[refFlux_err] [float] NULL,
	[objectId] [bigint] NULL,
	[coord_raVar] [float] NULL,
	[coord_radeclCov] [float] NULL,
	[coord_declVar] [float] NULL,
	[exposure_id] [bigint] NULL,
	[exposure_filter_id] [int] NULL,
	[exposure_time] [float] NULL,
	[exposure_time_mid] [float] NULL,
	[cluster_id] [bigint] NULL,
	[cluster_coord_ra] [float] NULL,
	[cluster_coord_decl] [float] NULL
	--[htmid] [bigint] NULL,
	--[healpixid] [bigint] NULL
)
WITH
(
    DATA_SOURCE = SqlStoragePool,
    LOCATION = '/user/hive/warehouse/source/source_new',
    FILE_FORMAT = parquet_file
)
