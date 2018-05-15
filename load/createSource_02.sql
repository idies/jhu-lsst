USE [LSST_01]
GO

/****** Object:  Table [dbo].[Source_01]    Script Date: 3/1/2018 1:47:38 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Source_new](
	[id] [bigint] NOT NULL,
	[coord_ra] [real] NULL,
	[coord_decl] [real] NULL,
	[coord_htmId20] [bigint] NOT NULL,
	htmID bigint not null,
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
	[chunkID] [int] NULL,
	[subChunkID] [int] NULL
	)
	go

alter table source_new
add CONSTRAINT [pk_source_01_id_new] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (sort_in_tempdb = on, data_compression = page, PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) 
 ON [S_new]

GO




insert source_new with (tablock)
select 


USE [LSST_01]
GO

INSERT INTO [dbo].[Source_01]
           ([id]
           ,[coord_ra]
           ,[coord_decl]
           ,[coord_htmId20]
           ,[parent]
           ,[flags_badcentroid]
           ,[centroid_sdss_x]
           ,[centroid_sdss_y]
           ,[centroid_sdss_xVar]
           ,[centroid_sdss_xyCov]
           ,[centroid_sdss_yVar]
           ,[centroid_sdss_flags]
           ,[flags_pixel_edge]
           ,[flags_pixel_interpolated_any]
           ,[flags_pixel_interpolated_center]
           ,[flags_pixel_saturated_any]
           ,[flags_pixel_saturated_center]
           ,[flags_pixel_cr_any]
           ,[flags_pixel_cr_center]
           ,[centroid_naive_x]
           ,[centroid_naive_y]
           ,[centroid_naive_xVar]
           ,[centroid_naive_xyCov]
           ,[centroid_naive_yVar]
           ,[centroid_naive_flags]
           ,[centroid_gaussian_x]
           ,[centroid_gaussian_y]
           ,[centroid_gaussian_xVar]
           ,[centroid_gaussian_xyCov]
           ,[centroid_gaussian_yVar]
           ,[centroid_gaussian_flags]
           ,[shape_sdss_Ixx]
           ,[shape_sdss_Iyy]
           ,[shape_sdss_Ixy]
           ,[shape_sdss_IxxVar]
           ,[shape_sdss_IxxIyyCov]
           ,[shape_sdss_IxxIxyCov]
           ,[shape_sdss_IyyVar]
           ,[shape_sdss_IyyIxyCov]
           ,[shape_sdss_IxyVar]
           ,[shape_sdss_flags]
           ,[shape_sdss_centroid_x]
           ,[shape_sdss_centroid_y]
           ,[shape_sdss_centroid_xVar]
           ,[shape_sdss_centroid_xyCov]
           ,[shape_sdss_centroid_yVar]
           ,[shape_sdss_centroid_flags]
           ,[shape_sdss_flags_unweightedbad]
           ,[shape_sdss_flags_unweighted]
           ,[shape_sdss_flags_shift]
           ,[shape_sdss_flags_maxiter]
           ,[flux_psf]
           ,[flux_psf_err]
           ,[flux_psf_flags]
           ,[flux_psf_psffactor]
           ,[flux_psf_flags_psffactor]
           ,[flux_psf_flags_badcorr]
           ,[flux_naive]
           ,[flux_naive_err]
           ,[flux_naive_flags]
           ,[flux_gaussian]
           ,[flux_gaussian_err]
           ,[flux_gaussian_flags]
           ,[flux_gaussian_psffactor]
           ,[flux_gaussian_flags_psffactor]
           ,[flux_gaussian_flags_badcorr]
           ,[flux_sinc]
           ,[flux_sinc_err]
           ,[flux_sinc_flags]
           ,[centroid_record_x]
           ,[centroid_record_y]
           ,[classification_extendedness]
           ,[aperturecorrection]
           ,[aperturecorrection_err]
           ,[refFlux]
           ,[refFlux_err]
           ,[objectId]
           ,[coord_raVar]
           ,[coord_radeclCov]
           ,[coord_declVar]
           ,[exposure_id]
           ,[exposure_filter_id]
           ,[exposure_time]
           ,[exposure_time_mid]
           ,[cluster_id]
           ,[cluster_coord_ra]
           ,[cluster_coord_decl]
           ,[chunkID]
           ,[subChunkID])
     VALUES
           (<id, bigint,>
           ,<coord_ra, real,>
           ,<coord_decl, real,>
           ,<coord_htmId20, bigint,>
           ,<parent, bigint,>
           ,<flags_badcentroid, bit,>
           ,<centroid_sdss_x, real,>
           ,<centroid_sdss_y, real,>
           ,<centroid_sdss_xVar, real,>
           ,<centroid_sdss_xyCov, real,>
           ,<centroid_sdss_yVar, real,>
           ,<centroid_sdss_flags, bit,>
           ,<flags_pixel_edge, bit,>
           ,<flags_pixel_interpolated_any, bit,>
           ,<flags_pixel_interpolated_center, bit,>
           ,<flags_pixel_saturated_any, bit,>
           ,<flags_pixel_saturated_center, bit,>
           ,<flags_pixel_cr_any, bit,>
           ,<flags_pixel_cr_center, bit,>
           ,<centroid_naive_x, real,>
           ,<centroid_naive_y, real,>
           ,<centroid_naive_xVar, real,>
           ,<centroid_naive_xyCov, real,>
           ,<centroid_naive_yVar, real,>
           ,<centroid_naive_flags, bit,>
           ,<centroid_gaussian_x, real,>
           ,<centroid_gaussian_y, real,>
           ,<centroid_gaussian_xVar, real,>
           ,<centroid_gaussian_xyCov, real,>
           ,<centroid_gaussian_yVar, real,>
           ,<centroid_gaussian_flags, bit,>
           ,<shape_sdss_Ixx, real,>
           ,<shape_sdss_Iyy, real,>
           ,<shape_sdss_Ixy, real,>
           ,<shape_sdss_IxxVar, real,>
           ,<shape_sdss_IxxIyyCov, real,>
           ,<shape_sdss_IxxIxyCov, real,>
           ,<shape_sdss_IyyVar, real,>
           ,<shape_sdss_IyyIxyCov, real,>
           ,<shape_sdss_IxyVar, real,>
           ,<shape_sdss_flags, bit,>
           ,<shape_sdss_centroid_x, real,>
           ,<shape_sdss_centroid_y, real,>
           ,<shape_sdss_centroid_xVar, real,>
           ,<shape_sdss_centroid_xyCov, real,>
           ,<shape_sdss_centroid_yVar, real,>
           ,<shape_sdss_centroid_flags, bit,>
           ,<shape_sdss_flags_unweightedbad, bit,>
           ,<shape_sdss_flags_unweighted, bit,>
           ,<shape_sdss_flags_shift, bit,>
           ,<shape_sdss_flags_maxiter, bit,>
           ,<flux_psf, real,>
           ,<flux_psf_err, real,>
           ,<flux_psf_flags, bit,>
           ,<flux_psf_psffactor, real,>
           ,<flux_psf_flags_psffactor, bit,>
           ,<flux_psf_flags_badcorr, bit,>
           ,<flux_naive, real,>
           ,<flux_naive_err, real,>
           ,<flux_naive_flags, bit,>
           ,<flux_gaussian, real,>
           ,<flux_gaussian_err, real,>
           ,<flux_gaussian_flags, bit,>
           ,<flux_gaussian_psffactor, real,>
           ,<flux_gaussian_flags_psffactor, bit,>
           ,<flux_gaussian_flags_badcorr, bit,>
           ,<flux_sinc, real,>
           ,<flux_sinc_err, real,>
           ,<flux_sinc_flags, bit,>
           ,<centroid_record_x, real,>
           ,<centroid_record_y, real,>
           ,<classification_extendedness, real,>
           ,<aperturecorrection, real,>
           ,<aperturecorrection_err, real,>
           ,<refFlux, real,>
           ,<refFlux_err, real,>
           ,<objectId, bigint,>
           ,<coord_raVar, real,>
           ,<coord_radeclCov, real,>
           ,<coord_declVar, real,>
           ,<exposure_id, bigint,>
           ,<exposure_filter_id, int,>
           ,<exposure_time, real,>
           ,<exposure_time_mid, real,>
           ,<cluster_id, bigint,>
           ,<cluster_coord_ra, real,>
           ,<cluster_coord_decl, real,>
           ,<chunkID, int,>
           ,<subChunkID, int,>)
GO

