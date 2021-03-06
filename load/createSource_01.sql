drop table source_01

CREATE TABLE [dbo].[Source_01](
	[id] [bigint] NOT NULL,
	[coord_ra] [real] NULL,
	[coord_decl] [real] NULL,
	[coord_htmId20] [bigint] NOT NULL,
	[parent] [bigint] NULL,
	[flags_badcentroid] [bit] NOT NULL,
	[centroid_sdss_x] [real] NULL,
	[centroid_sdss_y] [real] NULL,
	[centroid_sdss_xVar] [real] NULL,
	[centroid_sdss_xyCov] [real] NULL,
	[centroid_sdss_yVar] [real] NULL,
	[centroid_sdss_flags] [bit] NOT NULL,
	[flags_pixel_edge] [bit] NOT NULL,
	[flags_pixel_interpolated_any] [bit] NOT NULL,
	[flags_pixel_interpolated_center] [bit] NOT NULL,
	[flags_pixel_saturated_any] [bit] NOT NULL,
	[flags_pixel_saturated_center] [bit] NOT NULL,
	[flags_pixel_cr_any] [bit] NOT NULL,
	[flags_pixel_cr_center] [bit] NOT NULL,
	[centroid_naive_x] [real] NULL,
	[centroid_naive_y] [real] NULL,
	[centroid_naive_xVar] [real] NULL,
	[centroid_naive_xyCov] [real] NULL,
	[centroid_naive_yVar] [real] NULL,
	[centroid_naive_flags] [bit] NOT NULL,
	[centroid_gaussian_x] [real] NULL,
	[centroid_gaussian_y] [real] NULL,
	[centroid_gaussian_xVar] [real] NULL,
	[centroid_gaussian_xyCov] [real] NULL,
	[centroid_gaussian_yVar] [real] NULL,
	[centroid_gaussian_flags] [bit] NOT NULL,
	[shape_sdss_Ixx] [real] NULL,
	[shape_sdss_Iyy] [real] NULL,
	[shape_sdss_Ixy] [real] NULL,
	[shape_sdss_IxxVar] [real] NULL,
	[shape_sdss_IxxIyyCov] [real] NULL,
	[shape_sdss_IxxIxyCov] [real] NULL,
	[shape_sdss_IyyVar] [real] NULL,
	[shape_sdss_IyyIxyCov] [real] NULL,
	[shape_sdss_IxyVar] [real] NULL,
	[shape_sdss_flags] [bit] NOT NULL,
	[shape_sdss_centroid_x] [real] NULL,
	[shape_sdss_centroid_y] [real] NULL,
	[shape_sdss_centroid_xVar] [real] NULL,
	[shape_sdss_centroid_xyCov] [real] NULL,
	[shape_sdss_centroid_yVar] [real] NULL,
	[shape_sdss_centroid_flags] [bit] NOT NULL,
	[shape_sdss_flags_unweightedbad] [bit] NOT NULL,
	[shape_sdss_flags_unweighted] [bit] NOT NULL,
	[shape_sdss_flags_shift] [bit] NOT NULL,
	[shape_sdss_flags_maxiter] [bit] NOT NULL,
	[flux_psf] [real] NULL,
	[flux_psf_err] [real] NULL,
	[flux_psf_flags] [bit] NOT NULL,
	[flux_psf_psffactor] [real] NULL,
	[flux_psf_flags_psffactor] [bit] NOT NULL,
	[flux_psf_flags_badcorr] [bit] NOT NULL,
	[flux_naive] [real] NULL,
	[flux_naive_err] [real] NULL,
	[flux_naive_flags] [bit] NOT NULL,
	[flux_gaussian] [real] NULL,
	[flux_gaussian_err] [real] NULL,
	[flux_gaussian_flags] [bit] NOT NULL,
	[flux_gaussian_psffactor] [real] NULL,
	[flux_gaussian_flags_psffactor] [bit] NOT NULL,
	[flux_gaussian_flags_badcorr] [bit] NOT NULL,
	[flux_sinc] [real] NULL,
	[flux_sinc_err] [real] NULL,
	[flux_sinc_flags] [bit] NOT NULL,
	[centroid_record_x] [real] NULL,
	[centroid_record_y] [real] NULL,
	[classification_extendedness] [real] NULL,
	[aperturecorrection] [real] NULL,
	[aperturecorrection_err] [real] NULL,
	[refFlux] [real] NULL,
	[refFlux_err] [real] NULL,
	[objectId] [bigint] NOT NULL,
	[coord_raVar] [real] NULL,
	[coord_radeclCov] [real] NULL,
	[coord_declVar] [real] NULL,
	[exposure_id] [bigint] NOT NULL,
	[exposure_filter_id] [int] NOT NULL,
	[exposure_time] [real] NULL,
	[exposure_time_mid] [real] NULL,
	[cluster_id] [bigint] NULL,
	[cluster_coord_ra] [real] NULL,
	[cluster_coord_decl] [real] NULL, 
	chunkID int null, 
	subChunkID int null
) ON [PRIMARY]

GO
alter table Source_01
add constraint pk_source_01_id
primary key clustered(id)
with(sort_in_tempdb=on, data_compression=page)
on SRC_01


insert Source_01 with (tablockx)
select * from lsst_stage.dbo.source_stage3 with (nolock)
--3h 14 m
--364192720 rows

exec sp_spaceused Source_01



