create procedure spCreateViewSource
as
exec ('
create view source_v
as
SELECT [id]
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
     -- ,[chunkId]
     -- ,[subChunkId]
  FROM [dbo].[source_stage3]
  ')

GO


