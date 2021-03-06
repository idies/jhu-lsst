USE [lsst_stage]
GO

/****** Object:  Table [dbo].[ObjectFullOverlapTest]    Script Date: 2/5/2018 1:53:07 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].ObjectFullOverlap_template(
	[deepSourceId] bigint not NULL,
	[ra] float not NULL,
	[decl] float not NULL,
	[raVar] [varchar](50) NULL,
	[declVar] [varchar](50) NULL,
	[radeclCov] [varchar](50) NULL,
	[chunkId] int not NULL,
	[subChunkId] int not NULL,
	[u_psfFlux] [varchar](50) NULL,
	[u_psfFluxSigma] [varchar](50) NULL,
	[u_apFlux] [varchar](50) NULL,
	[u_apFluxSigma] [varchar](50) NULL,
	[u_modelFlux] [varchar](50) NULL,
	[u_modelFluxSigma] [varchar](50) NULL,
	[u_instFlux] [varchar](50) NULL,
	[u_instFluxSigma] [varchar](50) NULL,
	[u_apCorrection] [varchar](50) NULL,
	[u_apCorrectionSigma] [varchar](50) NULL,
	[u_shapeIx] [varchar](50) NULL,
	[u_shapeIy] [varchar](50) NULL,
	[u_shapeIxVar] [varchar](50) NULL,
	[u_shapeIyVar] [varchar](50) NULL,
	[u_shapeIxIyCov] [varchar](50) NULL,
	[u_shapeIxx] [varchar](50) NULL,
	[u_shapeIyy] [varchar](50) NULL,
	[u_shapeIxy] [varchar](50) NULL,
	[u_shapeIxxVar] [varchar](50) NULL,
	[u_shapeIyyVar] [varchar](50) NULL,
	[u_shapeIxyVar] [varchar](50) NULL,
	[u_shapeIxxIyyCov] [varchar](50) NULL,
	[u_shapeIxxIxyCov] [varchar](50) NULL,
	[u_shapeIyyIxyCov] [varchar](50) NULL,
	[u_extendedness] [varchar](50) NULL,
	[u_flagNegative] [varchar](50) NULL,
	[u_flagBadMeasCentroid] [varchar](50) NULL,
	[u_flagPixEdge] [varchar](50) NULL,
	[u_flagPixInterpAny] [varchar](50) NULL,
	[u_flagPixInterpCen] [varchar](50) NULL,
	[u_flagPixSaturAny] [varchar](50) NULL,
	[u_flagPixSaturCen] [varchar](50) NULL,
	[u_flagBadPsfFlux] [varchar](50) NULL,
	[u_flagBadApFlux] [varchar](50) NULL,
	[u_flagBadModelFlux] [varchar](50) NULL,
	[u_flagBadInstFlux] [varchar](50) NULL,
	[u_flagBadCentroid] [varchar](50) NULL,
	[u_flagBadShape] [varchar](50) NULL,
	[g_psfFlux] [varchar](50) NULL,
	[g_psfFluxSigma] [varchar](50) NULL,
	[g_apFlux] [varchar](50) NULL,
	[g_apFluxSigma] [varchar](50) NULL,
	[g_modelFlux] [varchar](50) NULL,
	[g_modelFluxSigma] [varchar](50) NULL,
	[g_instFlux] [varchar](50) NULL,
	[g_instFluxSigma] [varchar](50) NULL,
	[g_apCorrection] [varchar](50) NULL,
	[g_apCorrectionSigma] [varchar](50) NULL,
	[g_shapeIx] [varchar](50) NULL,
	[g_shapeIy] [varchar](50) NULL,
	[g_shapeIxVar] [varchar](50) NULL,
	[g_shapeIyVar] [varchar](50) NULL,
	[g_shapeIxIyCov] [varchar](50) NULL,
	[g_shapeIxx] [varchar](50) NULL,
	[g_shapeIyy] [varchar](50) NULL,
	[g_shapeIxy] [varchar](50) NULL,
	[g_shapeIxxVar] [varchar](50) NULL,
	[g_shapeIyyVar] [varchar](50) NULL,
	[g_shapeIxyVar] [varchar](50) NULL,
	[g_shapeIxxIyyCov] [varchar](50) NULL,
	[g_shapeIxxIxyCov] [varchar](50) NULL,
	[g_shapeIyyIxyCov] [varchar](50) NULL,
	[g_extendedness] [varchar](50) NULL,
	[g_flagNegative] [varchar](50) NULL,
	[g_flagBadMeasCentroid] [varchar](50) NULL,
	[g_flagPixEdge] [varchar](50) NULL,
	[g_flagPixInterpAny] [varchar](50) NULL,
	[g_flagPixInterpCen] [varchar](50) NULL,
	[g_flagPixSaturAny] [varchar](50) NULL,
	[g_flagPixSaturCen] [varchar](50) NULL,
	[g_flagBadPsfFlux] [varchar](50) NULL,
	[g_flagBadApFlux] [varchar](50) NULL,
	[g_flagBadModelFlux] [varchar](50) NULL,
	[g_flagBadInstFlux] [varchar](50) NULL,
	[g_flagBadCentroid] [varchar](50) NULL,
	[g_flagBadShape] [varchar](50) NULL,
	[r_psfFlux] [varchar](50) NULL,
	[r_psfFluxSigma] [varchar](50) NULL,
	[r_apFlux] [varchar](50) NULL,
	[r_apFluxSigma] [varchar](50) NULL,
	[r_modelFlux] [varchar](50) NULL,
	[r_modelFluxSigma] [varchar](50) NULL,
	[r_instFlux] [varchar](50) NULL,
	[r_instFluxSigma] [varchar](50) NULL,
	[r_apCorrection] [varchar](50) NULL,
	[r_apCorrectionSigma] [varchar](50) NULL,
	[r_shapeIx] [varchar](50) NULL,
	[r_shapeIy] [varchar](50) NULL,
	[r_shapeIxVar] [varchar](50) NULL,
	[r_shapeIyVar] [varchar](50) NULL,
	[r_shapeIxIyCov] [varchar](50) NULL,
	[r_shapeIxx] [varchar](50) NULL,
	[r_shapeIyy] [varchar](50) NULL,
	[r_shapeIxy] [varchar](50) NULL,
	[r_shapeIxxVar] [varchar](50) NULL,
	[r_shapeIyyVar] [varchar](50) NULL,
	[r_shapeIxyVar] [varchar](50) NULL,
	[r_shapeIxxIyyCov] [varchar](50) NULL,
	[r_shapeIxxIxyCov] [varchar](50) NULL,
	[r_shapeIyyIxyCov] [varchar](50) NULL,
	[r_extendedness] [varchar](50) NULL,
	[r_flagNegative] [varchar](50) NULL,
	[r_flagBadMeasCentroid] [varchar](50) NULL,
	[r_flagPixEdge] [varchar](50) NULL,
	[r_flagPixInterpAny] [varchar](50) NULL,
	[r_flagPixInterpCen] [varchar](50) NULL,
	[r_flagPixSaturAny] [varchar](50) NULL,
	[r_flagPixSaturCen] [varchar](50) NULL,
	[r_flagBadPsfFlux] [varchar](50) NULL,
	[r_flagBadApFlux] [varchar](50) NULL,
	[r_flagBadModelFlux] [varchar](50) NULL,
	[r_flagBadInstFlux] [varchar](50) NULL,
	[r_flagBadCentroid] [varchar](50) NULL,
	[r_flagBadShape] [varchar](50) NULL,
	[i_psfFlux] [varchar](50) NULL,
	[i_psfFluxSigma] [varchar](50) NULL,
	[i_apFlux] [varchar](50) NULL,
	[i_apFluxSigma] [varchar](50) NULL,
	[i_modelFlux] [varchar](50) NULL,
	[i_modelFluxSigma] [varchar](50) NULL,
	[i_instFlux] [varchar](50) NULL,
	[i_instFluxSigma] [varchar](50) NULL,
	[i_apCorrection] [varchar](50) NULL,
	[i_apCorrectionSigma] [varchar](50) NULL,
	[i_shapeIx] [varchar](50) NULL,
	[i_shapeIy] [varchar](50) NULL,
	[i_shapeIxVar] [varchar](50) NULL,
	[i_shapeIyVar] [varchar](50) NULL,
	[i_shapeIxIyCov] [varchar](50) NULL,
	[i_shapeIxx] [varchar](50) NULL,
	[i_shapeIyy] [varchar](50) NULL,
	[i_shapeIxy] [varchar](50) NULL,
	[i_shapeIxxVar] [varchar](50) NULL,
	[i_shapeIyyVar] [varchar](50) NULL,
	[i_shapeIxyVar] [varchar](50) NULL,
	[i_shapeIxxIyyCov] [varchar](50) NULL,
	[i_shapeIxxIxyCov] [varchar](50) NULL,
	[i_shapeIyyIxyCov] [varchar](50) NULL,
	[i_extendedness] [varchar](50) NULL,
	[i_flagNegative] [varchar](50) NULL,
	[i_flagBadMeasCentroid] [varchar](50) NULL,
	[i_flagPixEdge] [varchar](50) NULL,
	[i_flagPixInterpAny] [varchar](50) NULL,
	[i_flagPixInterpCen] [varchar](50) NULL,
	[i_flagPixSaturAny] [varchar](50) NULL,
	[i_flagPixSaturCen] [varchar](50) NULL,
	[i_flagBadPsfFlux] [varchar](50) NULL,
	[i_flagBadApFlux] [varchar](50) NULL,
	[i_flagBadModelFlux] [varchar](50) NULL,
	[i_flagBadInstFlux] [varchar](50) NULL,
	[i_flagBadCentroid] [varchar](50) NULL,
	[i_flagBadShape] [varchar](50) NULL,
	[z_psfFlux] [varchar](50) NULL,
	[z_psfFluxSigma] [varchar](50) NULL,
	[z_apFlux] [varchar](50) NULL,
	[z_apFluxSigma] [varchar](50) NULL,
	[z_modelFlux] [varchar](50) NULL,
	[z_modelFluxSigma] [varchar](50) NULL,
	[z_instFlux] [varchar](50) NULL,
	[z_instFluxSigma] [varchar](50) NULL,
	[z_apCorrection] [varchar](50) NULL,
	[z_apCorrectionSigma] [varchar](50) NULL,
	[z_shapeIx] [varchar](50) NULL,
	[z_shapeIy] [varchar](50) NULL,
	[z_shapeIxVar] [varchar](50) NULL,
	[z_shapeIyVar] [varchar](50) NULL,
	[z_shapeIxIyCov] [varchar](50) NULL,
	[z_shapeIxx] [varchar](50) NULL,
	[z_shapeIyy] [varchar](50) NULL,
	[z_shapeIxy] [varchar](50) NULL,
	[z_shapeIxxVar] [varchar](50) NULL,
	[z_shapeIyyVar] [varchar](50) NULL,
	[z_shapeIxyVar] [varchar](50) NULL,
	[z_shapeIxxIyyCov] [varchar](50) NULL,
	[z_shapeIxxIxyCov] [varchar](50) NULL,
	[z_shapeIyyIxyCov] [varchar](50) NULL,
	[z_extendedness] [varchar](50) NULL,
	[z_flagNegative] [varchar](50) NULL,
	[z_flagBadMeasCentroid] [varchar](50) NULL,
	[z_flagPixEdge] [varchar](50) NULL,
	[z_flagPixInterpAny] [varchar](50) NULL,
	[z_flagPixInterpCen] [varchar](50) NULL,
	[z_flagPixSaturAny] [varchar](50) NULL,
	[z_flagPixSaturCen] [varchar](50) NULL,
	[z_flagBadPsfFlux] [varchar](50) NULL,
	[z_flagBadApFlux] [varchar](50) NULL,
	[z_flagBadModelFlux] [varchar](50) NULL,
	[z_flagBadInstFlux] [varchar](50) NULL,
	[z_flagBadCentroid] [varchar](50) NULL,
	[z_flagBadShape] [varchar](50) NULL,
	[y_psfFlux] [varchar](50) NULL,
	[y_psfFluxSigma] [varchar](50) NULL,
	[y_apFlux] [varchar](50) NULL,
	[y_apFluxSigma] [varchar](50) NULL,
	[y_modelFlux] [varchar](50) NULL,
	[y_modelFluxSigma] [varchar](50) NULL,
	[y_instFlux] [varchar](50) NULL,
	[y_instFluxSigma] [varchar](50) NULL,
	[y_apCorrection] [varchar](50) NULL,
	[y_apCorrectionSigma] [varchar](50) NULL,
	[y_shapeIx] [varchar](50) NULL,
	[y_shapeIy] [varchar](50) NULL,
	[y_shapeIxVar] [varchar](50) NULL,
	[y_shapeIyVar] [varchar](50) NULL,
	[y_shapeIxIyCov] [varchar](50) NULL,
	[y_shapeIxx] [varchar](50) NULL,
	[y_shapeIyy] [varchar](50) NULL,
	[y_shapeIxy] [varchar](50) NULL,
	[y_shapeIxxVar] [varchar](50) NULL,
	[y_shapeIyyVar] [varchar](50) NULL,
	[y_shapeIxyVar] [varchar](50) NULL,
	[y_shapeIxxIyyCov] [varchar](50) NULL,
	[y_shapeIxxIxyCov] [varchar](50) NULL,
	[y_shapeIyyIxyCov] [varchar](50) NULL,
	[y_extendedness] [varchar](50) NULL,
	[y_flagNegative] [varchar](50) NULL,
	[y_flagBadMeasCentroid] [varchar](50) NULL,
	[y_flagPixEdge] [varchar](50) NULL,
	[y_flagPixInterpAny] [varchar](50) NULL,
	[y_flagPixInterpCen] [varchar](50) NULL,
	[y_flagPixSaturAny] [varchar](50) NULL,
	[y_flagPixSaturCen] [varchar](50) NULL,
	[y_flagBadPsfFlux] [varchar](50) NULL,
	[y_flagBadApFlux] [varchar](50) NULL,
	[y_flagBadModelFlux] [varchar](50) NULL,
	[y_flagBadInstFlux] [varchar](50) NULL,
	[y_flagBadCentroid] [varchar](50) NULL,
	[y_flagBadShape] [varchar](50) NULL
) ON [PRIMARY]

GO



/****** Object:  Table [dbo].[SourceTest]    Script Date: 2/5/2018 1:46:59 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[source_template](
	[id] bigint not NULL,
	[coord_ra] [varchar](50) NULL,
	[coord_decl] [varchar](50) NULL,
	[coord_htmId20] bigint not NULL,
	[parent] [varchar](50) NULL,
	[flags_badcentroid] [varchar](50) NULL,
	[centroid_sdss_x] [varchar](50) NULL,
	[centroid_sdss_y] [varchar](50) NULL,
	[centroid_sdss_xVar] [varchar](50) NULL,
	[centroid_sdss_xyCov] [varchar](50) NULL,
	[centroid_sdss_yVar] [varchar](50) NULL,
	[centroid_sdss_flags] [varchar](50) NULL,
	[flags_pixel_edge] [varchar](50) NULL,
	[flags_pixel_interpolated_any] [varchar](50) NULL,
	[flags_pixel_interpolated_center] [varchar](50) NULL,
	[flags_pixel_saturated_any] [varchar](50) NULL,
	[flags_pixel_saturated_center] [varchar](50) NULL,
	[flags_pixel_cr_any] [varchar](50) NULL,
	[flags_pixel_cr_center] [varchar](50) NULL,
	[centroid_naive_x] [varchar](50) NULL,
	[centroid_naive_y] [varchar](50) NULL,
	[centroid_naive_xVar] [varchar](50) NULL,
	[centroid_naive_xyCov] [varchar](50) NULL,
	[centroid_naive_yVar] [varchar](50) NULL,
	[centroid_naive_flags] [varchar](50) NULL,
	[centroid_gaussian_x] [varchar](50) NULL,
	[centroid_gaussian_y] [varchar](50) NULL,
	[centroid_gaussian_xVar] [varchar](50) NULL,
	[centroid_gaussian_xyCov] [varchar](50) NULL,
	[centroid_gaussian_yVar] [varchar](50) NULL,
	[centroid_gaussian_flags] [varchar](50) NULL,
	[shape_sdss_Ixx] [varchar](50) NULL,
	[shape_sdss_Iyy] [varchar](50) NULL,
	[shape_sdss_Ixy] [varchar](50) NULL,
	[shape_sdss_IxxVar] [varchar](50) NULL,
	[shape_sdss_IxxIyyCov] [varchar](50) NULL,
	[shape_sdss_IxxIxyCov] [varchar](50) NULL,
	[shape_sdss_IyyVar] [varchar](50) NULL,
	[shape_sdss_IyyIxyCov] [varchar](50) NULL,
	[shape_sdss_IxyVar] [varchar](50) NULL,
	[shape_sdss_flags] [varchar](50) NULL,
	[shape_sdss_centroid_x] [varchar](50) NULL,
	[shape_sdss_centroid_y] [varchar](50) NULL,
	[shape_sdss_centroid_xVar] [varchar](50) NULL,
	[shape_sdss_centroid_xyCov] [varchar](50) NULL,
	[shape_sdss_centroid_yVar] [varchar](50) NULL,
	[shape_sdss_centroid_flags] [varchar](50) NULL,
	[shape_sdss_flags_unweightedbad] [varchar](50) NULL,
	[shape_sdss_flags_unweighted] [varchar](50) NULL,
	[shape_sdss_flags_shift] [varchar](50) NULL,
	[shape_sdss_flags_maxiter] [varchar](50) NULL,
	[flux_psf] [varchar](50) NULL,
	[flux_psf_err] [varchar](50) NULL,
	[flux_psf_flags] [varchar](50) NULL,
	[flux_psf_psffactor] [varchar](50) NULL,
	[flux_psf_flags_psffactor] [varchar](50) NULL,
	[flux_psf_flags_badcorr] [varchar](50) NULL,
	[flux_naive] [varchar](50) NULL,
	[flux_naive_err] [varchar](50) NULL,
	[flux_naive_flags] [varchar](50) NULL,
	[flux_gaussian] [varchar](50) NULL,
	[flux_gaussian_err] [varchar](50) NULL,
	[flux_gaussian_flags] [varchar](50) NULL,
	[flux_gaussian_psffactor] [varchar](50) NULL,
	[flux_gaussian_flags_psffactor] [varchar](50) NULL,
	[flux_gaussian_flags_badcorr] [varchar](50) NULL,
	[flux_sinc] [varchar](50) NULL,
	[flux_sinc_err] [varchar](50) NULL,
	[flux_sinc_flags] [varchar](50) NULL,
	[centroid_record_x] [varchar](50) NULL,
	[centroid_record_y] [varchar](50) NULL,
	[classification_extendedness] [varchar](50) NULL,
	[aperturecorrection] [varchar](50) NULL,
	[aperturecorrection_err] [varchar](50) NULL,
	[refFlux] [varchar](50) NULL,
	[refFlux_err] [varchar](50) NULL,
	[objectId] [varchar](50) NULL,
	[coord_raVar] [varchar](50) NULL,
	[coord_radeclCov] [varchar](50) NULL,
	[coord_declVar] [varchar](50) NULL,
	[exposure_id] [varchar](50) NULL,
	[exposure_filter_id] [varchar](50) NULL,
	[exposure_time] [varchar](50) NULL,
	[exposure_time_mid] [varchar](50) NULL,
	[cluster_id] [varchar](50) NULL,
	[cluster_coord_ra] [varchar](50) NULL,
	[cluster_coord_decl] [varchar](50) NULL
) ON [PRIMARY]

GO

CREATE TABLE [dbo].[object_template](
	[deepSourceId] BIGINT NOT NULL,
	[ra] FLOAT NOT NULL,
	[decl] FLOAT NOT NULL,
	[raVar] varchar(50) NULL,
	[declVar] varchar(50) NULL,
	[radeclCov] varchar(50) NULL,
	[chunkId] INT NOT NULL,
	[subChunkId] INT NOT NULL,
	[u_psfFlux] [varchar](50) NULL,
	[u_psfFluxSigma] [varchar](50) NULL,
	[u_apFlux] [varchar](50) NULL,
	[u_apFluxSigma] [varchar](50) NULL,
	[u_modelFlux] [varchar](50) NULL,
	[u_modelFluxSigma] [varchar](50) NULL,
	[u_instFlux] [varchar](50) NULL,
	[u_instFluxSigma] [varchar](50) NULL,
	[u_apCorrection] [varchar](50) NULL,
	[u_apCorrectionSigma] [varchar](50) NULL,
	[u_shapeIx] [varchar](50) NULL,
	[u_shapeIy] [varchar](50) NULL,
	[u_shapeIxVar] [varchar](50) NULL,
	[u_shapeIyVar] [varchar](50) NULL,
	[u_shapeIxIyCov] [varchar](50) NULL,
	[u_shapeIxx] [varchar](50) NULL,
	[u_shapeIyy] [varchar](50) NULL,
	[u_shapeIxy] [varchar](50) NULL,
	[u_shapeIxxVar] [varchar](50) NULL,
	[u_shapeIyyVar] [varchar](50) NULL,
	[u_shapeIxyVar] [varchar](50) NULL,
	[u_shapeIxxIyyCov] [varchar](50) NULL,
	[u_shapeIxxIxyCov] [varchar](50) NULL,
	[u_shapeIyyIxyCov] [varchar](50) NULL,
	[u_extendedness] [varchar](50) NULL,
	[u_flagNegative] [varchar](50) NULL,
	[u_flagBadMeasCentroid] [varchar](50) NULL,
	[u_flagPixEdge] [varchar](50) NULL,
	[u_flagPixInterpAny] [varchar](50) NULL,
	[u_flagPixInterpCen] [varchar](50) NULL,
	[u_flagPixSaturAny] [varchar](50) NULL,
	[u_flagPixSaturCen] [varchar](50) NULL,
	[u_flagBadPsfFlux] [varchar](50) NULL,
	[u_flagBadApFlux] [varchar](50) NULL,
	[u_flagBadModelFlux] [varchar](50) NULL,
	[u_flagBadInstFlux] [varchar](50) NULL,
	[u_flagBadCentroid] [varchar](50) NULL,
	[u_flagBadShape] [varchar](50) NULL,
	[g_psfFlux] [varchar](50) NULL,
	[g_psfFluxSigma] [varchar](50) NULL,
	[g_apFlux] [varchar](50) NULL,
	[g_apFluxSigma] [varchar](50) NULL,
	[g_modelFlux] [varchar](50) NULL,
	[g_modelFluxSigma] [varchar](50) NULL,
	[g_instFlux] [varchar](50) NULL,
	[g_instFluxSigma] [varchar](50) NULL,
	[g_apCorrection] [varchar](50) NULL,
	[g_apCorrectionSigma] [varchar](50) NULL,
	[g_shapeIx] [varchar](50) NULL,
	[g_shapeIy] [varchar](50) NULL,
	[g_shapeIxVar] [varchar](50) NULL,
	[g_shapeIyVar] [varchar](50) NULL,
	[g_shapeIxIyCov] [varchar](50) NULL,
	[g_shapeIxx] [varchar](50) NULL,
	[g_shapeIyy] [varchar](50) NULL,
	[g_shapeIxy] [varchar](50) NULL,
	[g_shapeIxxVar] [varchar](50) NULL,
	[g_shapeIyyVar] [varchar](50) NULL,
	[g_shapeIxyVar] [varchar](50) NULL,
	[g_shapeIxxIyyCov] [varchar](50) NULL,
	[g_shapeIxxIxyCov] [varchar](50) NULL,
	[g_shapeIyyIxyCov] [varchar](50) NULL,
	[g_extendedness] [varchar](50) NULL,
	[g_flagNegative] [varchar](50) NULL,
	[g_flagBadMeasCentroid] [varchar](50) NULL,
	[g_flagPixEdge] [varchar](50) NULL,
	[g_flagPixInterpAny] [varchar](50) NULL,
	[g_flagPixInterpCen] [varchar](50) NULL,
	[g_flagPixSaturAny] [varchar](50) NULL,
	[g_flagPixSaturCen] [varchar](50) NULL,
	[g_flagBadPsfFlux] [varchar](50) NULL,
	[g_flagBadApFlux] [varchar](50) NULL,
	[g_flagBadModelFlux] [varchar](50) NULL,
	[g_flagBadInstFlux] [varchar](50) NULL,
	[g_flagBadCentroid] [varchar](50) NULL,
	[g_flagBadShape] [varchar](50) NULL,
	[r_psfFlux] [varchar](50) NULL,
	[r_psfFluxSigma] [varchar](50) NULL,
	[r_apFlux] [varchar](50) NULL,
	[r_apFluxSigma] [varchar](50) NULL,
	[r_modelFlux] [varchar](50) NULL,
	[r_modelFluxSigma] [varchar](50) NULL,
	[r_instFlux] [varchar](50) NULL,
	[r_instFluxSigma] [varchar](50) NULL,
	[r_apCorrection] [varchar](50) NULL,
	[r_apCorrectionSigma] [varchar](50) NULL,
	[r_shapeIx] [varchar](50) NULL,
	[r_shapeIy] [varchar](50) NULL,
	[r_shapeIxVar] [varchar](50) NULL,
	[r_shapeIyVar] [varchar](50) NULL,
	[r_shapeIxIyCov] [varchar](50) NULL,
	[r_shapeIxx] [varchar](50) NULL,
	[r_shapeIyy] [varchar](50) NULL,
	[r_shapeIxy] [varchar](50) NULL,
	[r_shapeIxxVar] [varchar](50) NULL,
	[r_shapeIyyVar] [varchar](50) NULL,
	[r_shapeIxyVar] [varchar](50) NULL,
	[r_shapeIxxIyyCov] [varchar](50) NULL,
	[r_shapeIxxIxyCov] [varchar](50) NULL,
	[r_shapeIyyIxyCov] [varchar](50) NULL,
	[r_extendedness] [varchar](50) NULL,
	[r_flagNegative] [varchar](50) NULL,
	[r_flagBadMeasCentroid] [varchar](50) NULL,
	[r_flagPixEdge] [varchar](50) NULL,
	[r_flagPixInterpAny] [varchar](50) NULL,
	[r_flagPixInterpCen] [varchar](50) NULL,
	[r_flagPixSaturAny] [varchar](50) NULL,
	[r_flagPixSaturCen] [varchar](50) NULL,
	[r_flagBadPsfFlux] [varchar](50) NULL,
	[r_flagBadApFlux] [varchar](50) NULL,
	[r_flagBadModelFlux] [varchar](50) NULL,
	[r_flagBadInstFlux] [varchar](50) NULL,
	[r_flagBadCentroid] [varchar](50) NULL,
	[r_flagBadShape] [varchar](50) NULL,
	[i_psfFlux] [varchar](50) NULL,
	[i_psfFluxSigma] [varchar](50) NULL,
	[i_apFlux] [varchar](50) NULL,
	[i_apFluxSigma] [varchar](50) NULL,
	[i_modelFlux] [varchar](50) NULL,
	[i_modelFluxSigma] [varchar](50) NULL,
	[i_instFlux] [varchar](50) NULL,
	[i_instFluxSigma] [varchar](50) NULL,
	[i_apCorrection] [varchar](50) NULL,
	[i_apCorrectionSigma] [varchar](50) NULL,
	[i_shapeIx] [varchar](50) NULL,
	[i_shapeIy] [varchar](50) NULL,
	[i_shapeIxVar] [varchar](50) NULL,
	[i_shapeIyVar] [varchar](50) NULL,
	[i_shapeIxIyCov] [varchar](50) NULL,
	[i_shapeIxx] [varchar](50) NULL,
	[i_shapeIyy] [varchar](50) NULL,
	[i_shapeIxy] [varchar](50) NULL,
	[i_shapeIxxVar] [varchar](50) NULL,
	[i_shapeIyyVar] [varchar](50) NULL,
	[i_shapeIxyVar] [varchar](50) NULL,
	[i_shapeIxxIyyCov] [varchar](50) NULL,
	[i_shapeIxxIxyCov] [varchar](50) NULL,
	[i_shapeIyyIxyCov] [varchar](50) NULL,
	[i_extendedness] [varchar](50) NULL,
	[i_flagNegative] [varchar](50) NULL,
	[i_flagBadMeasCentroid] [varchar](50) NULL,
	[i_flagPixEdge] [varchar](50) NULL,
	[i_flagPixInterpAny] [varchar](50) NULL,
	[i_flagPixInterpCen] [varchar](50) NULL,
	[i_flagPixSaturAny] [varchar](50) NULL,
	[i_flagPixSaturCen] [varchar](50) NULL,
	[i_flagBadPsfFlux] [varchar](50) NULL,
	[i_flagBadApFlux] [varchar](50) NULL,
	[i_flagBadModelFlux] [varchar](50) NULL,
	[i_flagBadInstFlux] [varchar](50) NULL,
	[i_flagBadCentroid] [varchar](50) NULL,
	[i_flagBadShape] [varchar](50) NULL,
	[z_psfFlux] [varchar](50) NULL,
	[z_psfFluxSigma] [varchar](50) NULL,
	[z_apFlux] [varchar](50) NULL,
	[z_apFluxSigma] [varchar](50) NULL,
	[z_modelFlux] [varchar](50) NULL,
	[z_modelFluxSigma] [varchar](50) NULL,
	[z_instFlux] [varchar](50) NULL,
	[z_instFluxSigma] [varchar](50) NULL,
	[z_apCorrection] [varchar](50) NULL,
	[z_apCorrectionSigma] [varchar](50) NULL,
	[z_shapeIx] [varchar](50) NULL,
	[z_shapeIy] [varchar](50) NULL,
	[z_shapeIxVar] [varchar](50) NULL,
	[z_shapeIyVar] [varchar](50) NULL,
	[z_shapeIxIyCov] [varchar](50) NULL,
	[z_shapeIxx] [varchar](50) NULL,
	[z_shapeIyy] [varchar](50) NULL,
	[z_shapeIxy] [varchar](50) NULL,
	[z_shapeIxxVar] [varchar](50) NULL,
	[z_shapeIyyVar] [varchar](50) NULL,
	[z_shapeIxyVar] [varchar](50) NULL,
	[z_shapeIxxIyyCov] [varchar](50) NULL,
	[z_shapeIxxIxyCov] [varchar](50) NULL,
	[z_shapeIyyIxyCov] [varchar](50) NULL,
	[z_extendedness] [varchar](50) NULL,
	[z_flagNegative] [varchar](50) NULL,
	[z_flagBadMeasCentroid] [varchar](50) NULL,
	[z_flagPixEdge] [varchar](50) NULL,
	[z_flagPixInterpAny] [varchar](50) NULL,
	[z_flagPixInterpCen] [varchar](50) NULL,
	[z_flagPixSaturAny] [varchar](50) NULL,
	[z_flagPixSaturCen] [varchar](50) NULL,
	[z_flagBadPsfFlux] [varchar](50) NULL,
	[z_flagBadApFlux] [varchar](50) NULL,
	[z_flagBadModelFlux] [varchar](50) NULL,
	[z_flagBadInstFlux] [varchar](50) NULL,
	[z_flagBadCentroid] [varchar](50) NULL,
	[z_flagBadShape] [varchar](50) NULL,
	[y_psfFlux] [varchar](50) NULL,
	[y_psfFluxSigma] [varchar](50) NULL,
	[y_apFlux] [varchar](50) NULL,
	[y_apFluxSigma] [varchar](50) NULL,
	[y_modelFlux] [varchar](50) NULL,
	[y_modelFluxSigma] [varchar](50) NULL,
	[y_instFlux] [varchar](50) NULL,
	[y_instFluxSigma] [varchar](50) NULL,
	[y_apCorrection] [varchar](50) NULL,
	[y_apCorrectionSigma] [varchar](50) NULL,
	[y_shapeIx] [varchar](50) NULL,
	[y_shapeIy] [varchar](50) NULL,
	[y_shapeIxVar] [varchar](50) NULL,
	[y_shapeIyVar] [varchar](50) NULL,
	[y_shapeIxIyCov] [varchar](50) NULL,
	[y_shapeIxx] [varchar](50) NULL,
	[y_shapeIyy] [varchar](50) NULL,
	[y_shapeIxy] [varchar](50) NULL,
	[y_shapeIxxVar] [varchar](50) NULL,
	[y_shapeIyyVar] [varchar](50) NULL,
	[y_shapeIxyVar] [varchar](50) NULL,
	[y_shapeIxxIyyCov] [varchar](50) NULL,
	[y_shapeIxxIxyCov] [varchar](50) NULL,
	[y_shapeIyyIxyCov] [varchar](50) NULL,
	[y_extendedness] [varchar](50) NULL,
	[y_flagNegative] [varchar](50) NULL,
	[y_flagBadMeasCentroid] [varchar](50) NULL,
	[y_flagPixEdge] [varchar](50) NULL,
	[y_flagPixInterpAny] [varchar](50) NULL,
	[y_flagPixInterpCen] [varchar](50) NULL,
	[y_flagPixSaturAny] [varchar](50) NULL,
	[y_flagPixSaturCen] [varchar](50) NULL,
	[y_flagBadPsfFlux] [varchar](50) NULL,
	[y_flagBadApFlux] [varchar](50) NULL,
	[y_flagBadModelFlux] [varchar](50) NULL,
	[y_flagBadInstFlux] [varchar](50) NULL,
	[y_flagBadCentroid] [varchar](50) NULL,
	[y_flagBadShape] [varchar](50) NULL
) 



CREATE TABLE [dbo].[ForcedSource_template](
	[deepSourceId] bigint not NULL,
	[scienceCcdExposureId] bigint not NULL,
	[psfFlux] [varchar](50) NULL,
	[psfFluxSigma] [varchar](50) NULL,
	[flagBadMeasCentroid] bit not NULL,
	[flagPixEdge] bit not NULL,
	[flagPixInterpAny]bit not NULL,
	[flagPixInterpCen] bit not NULL,
	[flagPixSaturAny] bit not NULL,
	[flagPixSaturCen] bit not NULL,
	[flagBadPsfFlux] bit not NULL,
	[chunkId] int not NULL,
	[subChunkId]int not NULL
) ON [PRIMARY]

GO






