use manga_bdc

drop external table st_maps
GO

CREATE EXTERNAL TABLE [dbo].[st_maps]
(
	[plateifu] varchar(100) NULL,
	[mangaid] varchar(100) NULL,
	[ra] [float] NULL,
	[dec] [float] NULL,
	[daptype] varchar(100) NULL,
	[spaxel_idx] [bigint] NULL,
	[x] [bigint] NULL,
	[y] [bigint] NULL,
	[spx_skycoo_on_sky_x] [float] NULL,
	[spx_skycoo_on_sky_y] [float] NULL,
	[spx_ellcoo_elliptical_radius] [float] NULL,
	[spx_ellcoo_r_re] [float] NULL,
	[spx_ellcoo_elliptical_azimuth] [float] NULL,
	[spx_mflux] [float] NULL,
	[spx_mflux_ivar] [float] NULL,
	[spx_snr] [float] NULL,
	[binid_binned_spectra] [bigint] NULL,
	[binid_stellar_continua] [bigint] NULL,
	[binid_em_line_moments] [bigint] NULL,
	[binid_em_line_models] [bigint] NULL,
	[binid_spectral_indices] [bigint] NULL,
	[bin_lwskycoo_lum_weighted_on_sky_x] [float] NULL,
	[bin_lwskycoo_lum_weighted_on_sky_y] [float] NULL,
	[bin_lwellcoo_lum_weighted_elliptical_radius] [float] NULL,
	[bin_lwellcoo_r_re] [float] NULL,
	[bin_lwellcoo_lum_weighted_elliptical_azimuth] [float] NULL,
	[bin_area] [float] NULL,
	[bin_farea] [float] NULL,
	[bin_mflux] [float] NULL,
	[bin_mflux_ivar] [float] NULL,
	[bin_mflux_mask] [bigint] NULL,
	[bin_snr] [float] NULL,
	[stellar_vel] [float] NULL,
	[stellar_vel_ivar] [float] NULL,
	[stellar_vel_mask] [bigint] NULL,
	[stellar_sigma] [float] NULL,
	[stellar_sigma_ivar] [float] NULL,
	[stellar_sigma_mask] [bigint] NULL,
	[stellar_sigmacorr] [float] NULL,
	[stellar_cont_fresid_68th_percentile] [float] NULL,
	[stellar_cont_fresid_99th_percentile] [float] NULL,
	[stellar_cont_rchi2] [float] NULL,
	[emline_sflux_oiid_3728] [float] NULL,
	[emline_sflux_oii_3729] [float] NULL,
	[emline_sflux_hthe_3798] [float] NULL,
	[emline_sflux_heta_3836] [float] NULL,
	[emline_sflux_neiii_3869] [float] NULL,
	[emline_sflux_hzet_3890] [float] NULL,
	[emline_sflux_neiii_3968] [float] NULL,
	[emline_sflux_heps_3971] [float] NULL,
	[emline_sflux_hdel_4102] [float] NULL,
	[emline_sflux_hgam_4341] [float] NULL,
	[emline_sflux_heii_4687] [float] NULL,
	[emline_sflux_hb_4862] [float] NULL,
	[emline_sflux_oiii_4960] [float] NULL,
	[emline_sflux_oiii_5008] [float] NULL,
	[emline_sflux_hei_5877] [float] NULL,
	[emline_sflux_oi_6302] [float] NULL,
	[emline_sflux_oi_6365] [float] NULL,
	[emline_sflux_nii_6549] [float] NULL,
	[emline_sflux_ha_6564] [float] NULL,
	[emline_sflux_nii_6585] [float] NULL,
	[emline_sflux_sii_6718] [float] NULL,
	[emline_sflux_sii_6732] [float] NULL,
	[emline_sflux_ivar_oiid_3728] [float] NULL,
	[emline_sflux_ivar_oii_3729] [float] NULL,
	[emline_sflux_ivar_hthe_3798] [float] NULL,
	[emline_sflux_ivar_heta_3836] [float] NULL,
	[emline_sflux_ivar_neiii_3869] [float] NULL,
	[emline_sflux_ivar_hzet_3890] [float] NULL,
	[emline_sflux_ivar_neiii_3968] [float] NULL,
	[emline_sflux_ivar_heps_3971] [float] NULL,
	[emline_sflux_ivar_hdel_4102] [float] NULL,
	[emline_sflux_ivar_hgam_4341] [float] NULL,
	[emline_sflux_ivar_heii_4687] [float] NULL,
	[emline_sflux_ivar_hb_4862] [float] NULL,
	[emline_sflux_ivar_oiii_4960] [float] NULL,
	[emline_sflux_ivar_oiii_5008] [float] NULL,
	[emline_sflux_ivar_hei_5877] [float] NULL,
	[emline_sflux_ivar_oi_6302] [float] NULL,
	[emline_sflux_ivar_oi_6365] [float] NULL,
	[emline_sflux_ivar_nii_6549] [float] NULL,
	[emline_sflux_ivar_ha_6564] [float] NULL,
	[emline_sflux_ivar_nii_6585] [float] NULL,
	[emline_sflux_ivar_sii_6718] [float] NULL,
	[emline_sflux_ivar_sii_6732] [float] NULL,
	[emline_sflux_mask_oiid_3728] [bigint] NULL,
	[emline_sflux_mask_oii_3729] [bigint] NULL,
	[emline_sflux_mask_hthe_3798] [bigint] NULL,
	[emline_sflux_mask_heta_3836] [bigint] NULL,
	[emline_sflux_mask_neiii_3869] [bigint] NULL,
	[emline_sflux_mask_hzet_3890] [bigint] NULL,
	[emline_sflux_mask_neiii_3968] [bigint] NULL,
	[emline_sflux_mask_heps_3971] [bigint] NULL,
	[emline_sflux_mask_hdel_4102] [bigint] NULL,
	[emline_sflux_mask_hgam_4341] [bigint] NULL,
	[emline_sflux_mask_heii_4687] [bigint] NULL,
	[emline_sflux_mask_hb_4862] [bigint] NULL,
	[emline_sflux_mask_oiii_4960] [bigint] NULL,
	[emline_sflux_mask_oiii_5008] [bigint] NULL,
	[emline_sflux_mask_hei_5877] [bigint] NULL,
	[emline_sflux_mask_oi_6302] [bigint] NULL,
	[emline_sflux_mask_oi_6365] [bigint] NULL,
	[emline_sflux_mask_nii_6549] [bigint] NULL,
	[emline_sflux_mask_ha_6564] [bigint] NULL,
	[emline_sflux_mask_nii_6585] [bigint] NULL,
	[emline_sflux_mask_sii_6718] [bigint] NULL,
	[emline_sflux_mask_sii_6732] [bigint] NULL,
	[emline_sew_oiid_3728] [float] NULL,
	[emline_sew_oii_3729] [float] NULL,
	[emline_sew_hthe_3798] [float] NULL,
	[emline_sew_heta_3836] [float] NULL,
	[emline_sew_neiii_3869] [float] NULL,
	[emline_sew_hzet_3890] [float] NULL,
	[emline_sew_neiii_3968] [float] NULL,
	[emline_sew_heps_3971] [float] NULL,
	[emline_sew_hdel_4102] [float] NULL,
	[emline_sew_hgam_4341] [float] NULL,
	[emline_sew_heii_4687] [float] NULL,
	[emline_sew_hb_4862] [float] NULL,
	[emline_sew_oiii_4960] [float] NULL,
	[emline_sew_oiii_5008] [float] NULL,
	[emline_sew_hei_5877] [float] NULL,
	[emline_sew_oi_6302] [float] NULL,
	[emline_sew_oi_6365] [float] NULL,
	[emline_sew_nii_6549] [float] NULL,
	[emline_sew_ha_6564] [float] NULL,
	[emline_sew_nii_6585] [float] NULL,
	[emline_sew_sii_6718] [float] NULL,
	[emline_sew_sii_6732] [float] NULL,
	[emline_sew_ivar_oiid_3728] [float] NULL,
	[emline_sew_ivar_oii_3729] [float] NULL,
	[emline_sew_ivar_hthe_3798] [float] NULL,
	[emline_sew_ivar_heta_3836] [float] NULL,
	[emline_sew_ivar_neiii_3869] [float] NULL,
	[emline_sew_ivar_hzet_3890] [float] NULL,
	[emline_sew_ivar_neiii_3968] [float] NULL,
	[emline_sew_ivar_heps_3971] [float] NULL,
	[emline_sew_ivar_hdel_4102] [float] NULL,
	[emline_sew_ivar_hgam_4341] [float] NULL,
	[emline_sew_ivar_heii_4687] [float] NULL,
	[emline_sew_ivar_hb_4862] [float] NULL,
	[emline_sew_ivar_oiii_4960] [float] NULL,
	[emline_sew_ivar_oiii_5008] [float] NULL,
	[emline_sew_ivar_hei_5877] [float] NULL,
	[emline_sew_ivar_oi_6302] [float] NULL,
	[emline_sew_ivar_oi_6365] [float] NULL,
	[emline_sew_ivar_nii_6549] [float] NULL,
	[emline_sew_ivar_ha_6564] [float] NULL,
	[emline_sew_ivar_nii_6585] [float] NULL,
	[emline_sew_ivar_sii_6718] [float] NULL,
	[emline_sew_ivar_sii_6732] [float] NULL,
	[emline_sew_mask_oiid_3728] [bigint] NULL,
	[emline_sew_mask_oii_3729] [bigint] NULL,
	[emline_sew_mask_hthe_3798] [bigint] NULL,
	[emline_sew_mask_heta_3836] [bigint] NULL,
	[emline_sew_mask_neiii_3869] [bigint] NULL,
	[emline_sew_mask_hzet_3890] [bigint] NULL,
	[emline_sew_mask_neiii_3968] [bigint] NULL,
	[emline_sew_mask_heps_3971] [bigint] NULL,
	[emline_sew_mask_hdel_4102] [bigint] NULL,
	[emline_sew_mask_hgam_4341] [bigint] NULL,
	[emline_sew_mask_heii_4687] [bigint] NULL,
	[emline_sew_mask_hb_4862] [bigint] NULL,
	[emline_sew_mask_oiii_4960] [bigint] NULL,
	[emline_sew_mask_oiii_5008] [bigint] NULL,
	[emline_sew_mask_hei_5877] [bigint] NULL,
	[emline_sew_mask_oi_6302] [bigint] NULL,
	[emline_sew_mask_oi_6365] [bigint] NULL,
	[emline_sew_mask_nii_6549] [bigint] NULL,
	[emline_sew_mask_ha_6564] [bigint] NULL,
	[emline_sew_mask_nii_6585] [bigint] NULL,
	[emline_sew_mask_sii_6718] [bigint] NULL,
	[emline_sew_mask_sii_6732] [bigint] NULL,
	[emline_gflux_oii_3727] [float] NULL,
	[emline_gflux_oii_3729] [float] NULL,
	[emline_gflux_hthe_3798] [float] NULL,
	[emline_gflux_heta_3836] [float] NULL,
	[emline_gflux_neiii_3869] [float] NULL,
	[emline_gflux_hzet_3890] [float] NULL,
	[emline_gflux_neiii_3968] [float] NULL,
	[emline_gflux_heps_3971] [float] NULL,
	[emline_gflux_hdel_4102] [float] NULL,
	[emline_gflux_hgam_4341] [float] NULL,
	[emline_gflux_heii_4687] [float] NULL,
	[emline_gflux_hb_4862] [float] NULL,
	[emline_gflux_oiii_4960] [float] NULL,
	[emline_gflux_oiii_5008] [float] NULL,
	[emline_gflux_hei_5877] [float] NULL,
	[emline_gflux_oi_6302] [float] NULL,
	[emline_gflux_oi_6365] [float] NULL,
	[emline_gflux_nii_6549] [float] NULL,
	[emline_gflux_ha_6564] [float] NULL,
	[emline_gflux_nii_6585] [float] NULL,
	[emline_gflux_sii_6718] [float] NULL,
	[emline_gflux_sii_6732] [float] NULL,
	[emline_gflux_ivar_oii_3727] [float] NULL,
	[emline_gflux_ivar_oii_3729] [float] NULL,
	[emline_gflux_ivar_hthe_3798] [float] NULL,
	[emline_gflux_ivar_heta_3836] [float] NULL,
	[emline_gflux_ivar_neiii_3869] [float] NULL,
	[emline_gflux_ivar_hzet_3890] [float] NULL,
	[emline_gflux_ivar_neiii_3968] [float] NULL,
	[emline_gflux_ivar_heps_3971] [float] NULL,
	[emline_gflux_ivar_hdel_4102] [float] NULL,
	[emline_gflux_ivar_hgam_4341] [float] NULL,
	[emline_gflux_ivar_heii_4687] [float] NULL,
	[emline_gflux_ivar_hb_4862] [float] NULL,
	[emline_gflux_ivar_oiii_4960] [float] NULL,
	[emline_gflux_ivar_oiii_5008] [float] NULL,
	[emline_gflux_ivar_hei_5877] [float] NULL,
	[emline_gflux_ivar_oi_6302] [float] NULL,
	[emline_gflux_ivar_oi_6365] [float] NULL,
	[emline_gflux_ivar_nii_6549] [float] NULL,
	[emline_gflux_ivar_ha_6564] [float] NULL,
	[emline_gflux_ivar_nii_6585] [float] NULL,
	[emline_gflux_ivar_sii_6718] [float] NULL,
	[emline_gflux_ivar_sii_6732] [float] NULL,
	[emline_gflux_mask_oii_3727] [bigint] NULL,
	[emline_gflux_mask_oii_3729] [bigint] NULL,
	[emline_gflux_mask_hthe_3798] [bigint] NULL,
	[emline_gflux_mask_heta_3836] [bigint] NULL,
	[emline_gflux_mask_neiii_3869] [bigint] NULL,
	[emline_gflux_mask_hzet_3890] [bigint] NULL,
	[emline_gflux_mask_neiii_3968] [bigint] NULL,
	[emline_gflux_mask_heps_3971] [bigint] NULL,
	[emline_gflux_mask_hdel_4102] [bigint] NULL,
	[emline_gflux_mask_hgam_4341] [bigint] NULL,
	[emline_gflux_mask_heii_4687] [bigint] NULL,
	[emline_gflux_mask_hb_4862] [bigint] NULL,
	[emline_gflux_mask_oiii_4960] [bigint] NULL,
	[emline_gflux_mask_oiii_5008] [bigint] NULL,
	[emline_gflux_mask_hei_5877] [bigint] NULL,
	[emline_gflux_mask_oi_6302] [bigint] NULL,
	[emline_gflux_mask_oi_6365] [bigint] NULL,
	[emline_gflux_mask_nii_6549] [bigint] NULL,
	[emline_gflux_mask_ha_6564] [bigint] NULL,
	[emline_gflux_mask_nii_6585] [bigint] NULL,
	[emline_gflux_mask_sii_6718] [bigint] NULL,
	[emline_gflux_mask_sii_6732] [bigint] NULL,
	[emline_gew_oii_3727] [float] NULL,
	[emline_gew_oii_3729] [float] NULL,
	[emline_gew_hthe_3798] [float] NULL,
	[emline_gew_heta_3836] [float] NULL,
	[emline_gew_neiii_3869] [float] NULL,
	[emline_gew_hzet_3890] [float] NULL,
	[emline_gew_neiii_3968] [float] NULL,
	[emline_gew_heps_3971] [float] NULL,
	[emline_gew_hdel_4102] [float] NULL,
	[emline_gew_hgam_4341] [float] NULL,
	[emline_gew_heii_4687] [float] NULL,
	[emline_gew_hb_4862] [float] NULL,
	[emline_gew_oiii_4960] [float] NULL,
	[emline_gew_oiii_5008] [float] NULL,
	[emline_gew_hei_5877] [float] NULL,
	[emline_gew_oi_6302] [float] NULL,
	[emline_gew_oi_6365] [float] NULL,
	[emline_gew_nii_6549] [float] NULL,
	[emline_gew_ha_6564] [float] NULL,
	[emline_gew_nii_6585] [float] NULL,
	[emline_gew_sii_6718] [float] NULL,
	[emline_gew_sii_6732] [float] NULL,
	[emline_gew_ivar_oii_3727] [float] NULL,
	[emline_gew_ivar_oii_3729] [float] NULL,
	[emline_gew_ivar_hthe_3798] [float] NULL,
	[emline_gew_ivar_heta_3836] [float] NULL,
	[emline_gew_ivar_neiii_3869] [float] NULL,
	[emline_gew_ivar_hzet_3890] [float] NULL,
	[emline_gew_ivar_neiii_3968] [float] NULL,
	[emline_gew_ivar_heps_3971] [float] NULL,
	[emline_gew_ivar_hdel_4102] [float] NULL,
	[emline_gew_ivar_hgam_4341] [float] NULL,
	[emline_gew_ivar_heii_4687] [float] NULL,
	[emline_gew_ivar_hb_4862] [float] NULL,
	[emline_gew_ivar_oiii_4960] [float] NULL,
	[emline_gew_ivar_oiii_5008] [float] NULL,
	[emline_gew_ivar_hei_5877] [float] NULL,
	[emline_gew_ivar_oi_6302] [float] NULL,
	[emline_gew_ivar_oi_6365] [float] NULL,
	[emline_gew_ivar_nii_6549] [float] NULL,
	[emline_gew_ivar_ha_6564] [float] NULL,
	[emline_gew_ivar_nii_6585] [float] NULL,
	[emline_gew_ivar_sii_6718] [float] NULL,
	[emline_gew_ivar_sii_6732] [float] NULL,
	[emline_gew_mask_oii_3727] [bigint] NULL,
	[emline_gew_mask_oii_3729] [bigint] NULL,
	[emline_gew_mask_hthe_3798] [bigint] NULL,
	[emline_gew_mask_heta_3836] [bigint] NULL,
	[emline_gew_mask_neiii_3869] [bigint] NULL,
	[emline_gew_mask_hzet_3890] [bigint] NULL,
	[emline_gew_mask_neiii_3968] [bigint] NULL,
	[emline_gew_mask_heps_3971] [bigint] NULL,
	[emline_gew_mask_hdel_4102] [bigint] NULL,
	[emline_gew_mask_hgam_4341] [bigint] NULL,
	[emline_gew_mask_heii_4687] [bigint] NULL,
	[emline_gew_mask_hb_4862] [bigint] NULL,
	[emline_gew_mask_oiii_4960] [bigint] NULL,
	[emline_gew_mask_oiii_5008] [bigint] NULL,
	[emline_gew_mask_hei_5877] [bigint] NULL,
	[emline_gew_mask_oi_6302] [bigint] NULL,
	[emline_gew_mask_oi_6365] [bigint] NULL,
	[emline_gew_mask_nii_6549] [bigint] NULL,
	[emline_gew_mask_ha_6564] [bigint] NULL,
	[emline_gew_mask_nii_6585] [bigint] NULL,
	[emline_gew_mask_sii_6718] [bigint] NULL,
	[emline_gew_mask_sii_6732] [bigint] NULL,
	[emline_gvel_oii_3727] [float] NULL,
	[emline_gvel_oii_3729] [float] NULL,
	[emline_gvel_hthe_3798] [float] NULL,
	[emline_gvel_heta_3836] [float] NULL,
	[emline_gvel_neiii_3869] [float] NULL,
	[emline_gvel_hzet_3890] [float] NULL,
	[emline_gvel_neiii_3968] [float] NULL,
	[emline_gvel_heps_3971] [float] NULL,
	[emline_gvel_hdel_4102] [float] NULL,
	[emline_gvel_hgam_4341] [float] NULL,
	[emline_gvel_heii_4687] [float] NULL,
	[emline_gvel_hb_4862] [float] NULL,
	[emline_gvel_oiii_4960] [float] NULL,
	[emline_gvel_oiii_5008] [float] NULL,
	[emline_gvel_hei_5877] [float] NULL,
	[emline_gvel_oi_6302] [float] NULL,
	[emline_gvel_oi_6365] [float] NULL,
	[emline_gvel_nii_6549] [float] NULL,
	[emline_gvel_ha_6564] [float] NULL,
	[emline_gvel_nii_6585] [float] NULL,
	[emline_gvel_sii_6718] [float] NULL,
	[emline_gvel_sii_6732] [float] NULL,
	[emline_gvel_ivar_oii_3727] [float] NULL,
	[emline_gvel_ivar_oii_3729] [float] NULL,
	[emline_gvel_ivar_hthe_3798] [float] NULL,
	[emline_gvel_ivar_heta_3836] [float] NULL,
	[emline_gvel_ivar_neiii_3869] [float] NULL,
	[emline_gvel_ivar_hzet_3890] [float] NULL,
	[emline_gvel_ivar_neiii_3968] [float] NULL,
	[emline_gvel_ivar_heps_3971] [float] NULL,
	[emline_gvel_ivar_hdel_4102] [float] NULL,
	[emline_gvel_ivar_hgam_4341] [float] NULL,
	[emline_gvel_ivar_heii_4687] [float] NULL,
	[emline_gvel_ivar_hb_4862] [float] NULL,
	[emline_gvel_ivar_oiii_4960] [float] NULL,
	[emline_gvel_ivar_oiii_5008] [float] NULL,
	[emline_gvel_ivar_hei_5877] [float] NULL,
	[emline_gvel_ivar_oi_6302] [float] NULL,
	[emline_gvel_ivar_oi_6365] [float] NULL,
	[emline_gvel_ivar_nii_6549] [float] NULL,
	[emline_gvel_ivar_ha_6564] [float] NULL,
	[emline_gvel_ivar_nii_6585] [float] NULL,
	[emline_gvel_ivar_sii_6718] [float] NULL,
	[emline_gvel_ivar_sii_6732] [float] NULL,
	[emline_gvel_mask_oii_3727] [bigint] NULL,
	[emline_gvel_mask_oii_3729] [bigint] NULL,
	[emline_gvel_mask_hthe_3798] [bigint] NULL,
	[emline_gvel_mask_heta_3836] [bigint] NULL,
	[emline_gvel_mask_neiii_3869] [bigint] NULL,
	[emline_gvel_mask_hzet_3890] [bigint] NULL,
	[emline_gvel_mask_neiii_3968] [bigint] NULL,
	[emline_gvel_mask_heps_3971] [bigint] NULL,
	[emline_gvel_mask_hdel_4102] [bigint] NULL,
	[emline_gvel_mask_hgam_4341] [bigint] NULL,
	[emline_gvel_mask_heii_4687] [bigint] NULL,
	[emline_gvel_mask_hb_4862] [bigint] NULL,
	[emline_gvel_mask_oiii_4960] [bigint] NULL,
	[emline_gvel_mask_oiii_5008] [bigint] NULL,
	[emline_gvel_mask_hei_5877] [bigint] NULL,
	[emline_gvel_mask_oi_6302] [bigint] NULL,
	[emline_gvel_mask_oi_6365] [bigint] NULL,
	[emline_gvel_mask_nii_6549] [bigint] NULL,
	[emline_gvel_mask_ha_6564] [bigint] NULL,
	[emline_gvel_mask_nii_6585] [bigint] NULL,
	[emline_gvel_mask_sii_6718] [bigint] NULL,
	[emline_gvel_mask_sii_6732] [bigint] NULL,
	[emline_gsigma_oii_3727] [float] NULL,
	[emline_gsigma_oii_3729] [float] NULL,
	[emline_gsigma_hthe_3798] [float] NULL,
	[emline_gsigma_heta_3836] [float] NULL,
	[emline_gsigma_neiii_3869] [float] NULL,
	[emline_gsigma_hzet_3890] [float] NULL,
	[emline_gsigma_neiii_3968] [float] NULL,
	[emline_gsigma_heps_3971] [float] NULL,
	[emline_gsigma_hdel_4102] [float] NULL,
	[emline_gsigma_hgam_4341] [float] NULL,
	[emline_gsigma_heii_4687] [float] NULL,
	[emline_gsigma_hb_4862] [float] NULL,
	[emline_gsigma_oiii_4960] [float] NULL,
	[emline_gsigma_oiii_5008] [float] NULL,
	[emline_gsigma_hei_5877] [float] NULL,
	[emline_gsigma_oi_6302] [float] NULL,
	[emline_gsigma_oi_6365] [float] NULL,
	[emline_gsigma_nii_6549] [float] NULL,
	[emline_gsigma_ha_6564] [float] NULL,
	[emline_gsigma_nii_6585] [float] NULL,
	[emline_gsigma_sii_6718] [float] NULL,
	[emline_gsigma_sii_6732] [float] NULL,
	[emline_gsigma_ivar_oii_3727] [float] NULL,
	[emline_gsigma_ivar_oii_3729] [float] NULL,
	[emline_gsigma_ivar_hthe_3798] [float] NULL,
	[emline_gsigma_ivar_heta_3836] [float] NULL,
	[emline_gsigma_ivar_neiii_3869] [float] NULL,
	[emline_gsigma_ivar_hzet_3890] [float] NULL,
	[emline_gsigma_ivar_neiii_3968] [float] NULL,
	[emline_gsigma_ivar_heps_3971] [float] NULL,
	[emline_gsigma_ivar_hdel_4102] [float] NULL,
	[emline_gsigma_ivar_hgam_4341] [float] NULL,
	[emline_gsigma_ivar_heii_4687] [float] NULL,
	[emline_gsigma_ivar_hb_4862] [float] NULL,
	[emline_gsigma_ivar_oiii_4960] [float] NULL,
	[emline_gsigma_ivar_oiii_5008] [float] NULL,
	[emline_gsigma_ivar_hei_5877] [float] NULL,
	[emline_gsigma_ivar_oi_6302] [float] NULL,
	[emline_gsigma_ivar_oi_6365] [float] NULL,
	[emline_gsigma_ivar_nii_6549] [float] NULL,
	[emline_gsigma_ivar_ha_6564] [float] NULL,
	[emline_gsigma_ivar_nii_6585] [float] NULL,
	[emline_gsigma_ivar_sii_6718] [float] NULL,
	[emline_gsigma_ivar_sii_6732] [float] NULL,
	[emline_gsigma_mask_oii_3727] [bigint] NULL,
	[emline_gsigma_mask_oii_3729] [bigint] NULL,
	[emline_gsigma_mask_hthe_3798] [bigint] NULL,
	[emline_gsigma_mask_heta_3836] [bigint] NULL,
	[emline_gsigma_mask_neiii_3869] [bigint] NULL,
	[emline_gsigma_mask_hzet_3890] [bigint] NULL,
	[emline_gsigma_mask_neiii_3968] [bigint] NULL,
	[emline_gsigma_mask_heps_3971] [bigint] NULL,
	[emline_gsigma_mask_hdel_4102] [bigint] NULL,
	[emline_gsigma_mask_hgam_4341] [bigint] NULL,
	[emline_gsigma_mask_heii_4687] [bigint] NULL,
	[emline_gsigma_mask_hb_4862] [bigint] NULL,
	[emline_gsigma_mask_oiii_4960] [bigint] NULL,
	[emline_gsigma_mask_oiii_5008] [bigint] NULL,
	[emline_gsigma_mask_hei_5877] [bigint] NULL,
	[emline_gsigma_mask_oi_6302] [bigint] NULL,
	[emline_gsigma_mask_oi_6365] [bigint] NULL,
	[emline_gsigma_mask_nii_6549] [bigint] NULL,
	[emline_gsigma_mask_ha_6564] [bigint] NULL,
	[emline_gsigma_mask_nii_6585] [bigint] NULL,
	[emline_gsigma_mask_sii_6718] [bigint] NULL,
	[emline_gsigma_mask_sii_6732] [bigint] NULL,
	[emline_instsigma_oii_3727] [float] NULL,
	[emline_instsigma_oii_3729] [float] NULL,
	[emline_instsigma_hthe_3798] [float] NULL,
	[emline_instsigma_heta_3836] [float] NULL,
	[emline_instsigma_neiii_3869] [float] NULL,
	[emline_instsigma_hzet_3890] [float] NULL,
	[emline_instsigma_neiii_3968] [float] NULL,
	[emline_instsigma_heps_3971] [float] NULL,
	[emline_instsigma_hdel_4102] [float] NULL,
	[emline_instsigma_hgam_4341] [float] NULL,
	[emline_instsigma_heii_4687] [float] NULL,
	[emline_instsigma_hb_4862] [float] NULL,
	[emline_instsigma_oiii_4960] [float] NULL,
	[emline_instsigma_oiii_5008] [float] NULL,
	[emline_instsigma_hei_5877] [float] NULL,
	[emline_instsigma_oi_6302] [float] NULL,
	[emline_instsigma_oi_6365] [float] NULL,
	[emline_instsigma_nii_6549] [float] NULL,
	[emline_instsigma_ha_6564] [float] NULL,
	[emline_instsigma_nii_6585] [float] NULL,
	[emline_instsigma_sii_6718] [float] NULL,
	[emline_instsigma_sii_6732] [float] NULL,
	[emline_tplsigma_oii_3727] [float] NULL,
	[emline_tplsigma_oii_3729] [float] NULL,
	[emline_tplsigma_hthe_3798] [float] NULL,
	[emline_tplsigma_heta_3836] [float] NULL,
	[emline_tplsigma_neiii_3869] [float] NULL,
	[emline_tplsigma_hzet_3890] [float] NULL,
	[emline_tplsigma_neiii_3968] [float] NULL,
	[emline_tplsigma_heps_3971] [float] NULL,
	[emline_tplsigma_hdel_4102] [float] NULL,
	[emline_tplsigma_hgam_4341] [float] NULL,
	[emline_tplsigma_heii_4687] [float] NULL,
	[emline_tplsigma_hb_4862] [float] NULL,
	[emline_tplsigma_oiii_4960] [float] NULL,
	[emline_tplsigma_oiii_5008] [float] NULL,
	[emline_tplsigma_hei_5877] [float] NULL,
	[emline_tplsigma_oi_6302] [float] NULL,
	[emline_tplsigma_oi_6365] [float] NULL,
	[emline_tplsigma_nii_6549] [float] NULL,
	[emline_tplsigma_ha_6564] [float] NULL,
	[emline_tplsigma_nii_6585] [float] NULL,
	[emline_tplsigma_sii_6718] [float] NULL,
	[emline_tplsigma_sii_6732] [float] NULL,
	[specindex_cn1] [float] NULL,
	[specindex_cn2] [float] NULL,
	[specindex_ca4227] [float] NULL,
	[specindex_g4300] [float] NULL,
	[specindex_fe4383] [float] NULL,
	[specindex_ca4455] [float] NULL,
	[specindex_fe4531] [float] NULL,
	[specindex_c24668] [float] NULL,
	[specindex_hb] [float] NULL,
	[specindex_fe5015] [float] NULL,
	[specindex_mg1] [float] NULL,
	[specindex_mg2] [float] NULL,
	[specindex_mgb] [float] NULL,
	[specindex_fe5270] [float] NULL,
	[specindex_fe5335] [float] NULL,
	[specindex_fe5406] [float] NULL,
	[specindex_fe5709] [float] NULL,
	[specindex_fe5782] [float] NULL,
	[specindex_nad] [float] NULL,
	[specindex_tio1] [float] NULL,
	[specindex_tio2] [float] NULL,
	[specindex_hdeltaa] [float] NULL,
	[specindex_hgammaa] [float] NULL,
	[specindex_hdeltaf] [float] NULL,
	[specindex_hgammaf] [float] NULL,
	[specindex_cahk] [float] NULL,
	[specindex_caii1] [float] NULL,
	[specindex_caii2] [float] NULL,
	[specindex_caii3] [float] NULL,
	[specindex_pa17] [float] NULL,
	[specindex_pa14] [float] NULL,
	[specindex_pa12] [float] NULL,
	[specindex_mgicvd] [float] NULL,
	[specindex_naicvd] [float] NULL,
	[specindex_mgiir] [float] NULL,
	[specindex_fehcvd] [float] NULL,
	[specindex_nai] [float] NULL,
	[specindex_btio] [float] NULL,
	[specindex_atio] [float] NULL,
	[specindex_cah1] [float] NULL,
	[specindex_cah2] [float] NULL,
	[specindex_naisdss] [float] NULL,
	[specindex_tio2sdss] [float] NULL,
	[specindex_d4000] [float] NULL,
	[specindex_dn4000] [float] NULL,
	[specindex_tiocvd] [float] NULL,
	[specindex_ivar_cn1] [float] NULL,
	[specindex_ivar_cn2] [float] NULL,
	[specindex_ivar_ca4227] [float] NULL,
	[specindex_ivar_g4300] [float] NULL,
	[specindex_ivar_fe4383] [float] NULL,
	[specindex_ivar_ca4455] [float] NULL,
	[specindex_ivar_fe4531] [float] NULL,
	[specindex_ivar_c24668] [float] NULL,
	[specindex_ivar_hb] [float] NULL,
	[specindex_ivar_fe5015] [float] NULL,
	[specindex_ivar_mg1] [float] NULL,
	[specindex_ivar_mg2] [float] NULL,
	[specindex_ivar_mgb] [float] NULL,
	[specindex_ivar_fe5270] [float] NULL,
	[specindex_ivar_fe5335] [float] NULL,
	[specindex_ivar_fe5406] [float] NULL,
	[specindex_ivar_fe5709] [float] NULL,
	[specindex_ivar_fe5782] [float] NULL,
	[specindex_ivar_nad] [float] NULL,
	[specindex_ivar_tio1] [float] NULL,
	[specindex_ivar_tio2] [float] NULL,
	[specindex_ivar_hdeltaa] [float] NULL,
	[specindex_ivar_hgammaa] [float] NULL,
	[specindex_ivar_hdeltaf] [float] NULL,
	[specindex_ivar_hgammaf] [float] NULL,
	[specindex_ivar_cahk] [float] NULL,
	[specindex_ivar_caii1] [float] NULL,
	[specindex_ivar_caii2] [float] NULL,
	[specindex_ivar_caii3] [float] NULL,
	[specindex_ivar_pa17] [float] NULL,
	[specindex_ivar_pa14] [float] NULL,
	[specindex_ivar_pa12] [float] NULL,
	[specindex_ivar_mgicvd] [float] NULL,
	[specindex_ivar_naicvd] [float] NULL,
	[specindex_ivar_mgiir] [float] NULL,
	[specindex_ivar_fehcvd] [float] NULL,
	[specindex_ivar_nai] [float] NULL,
	[specindex_ivar_btio] [float] NULL,
	[specindex_ivar_atio] [float] NULL,
	[specindex_ivar_cah1] [float] NULL,
	[specindex_ivar_cah2] [float] NULL,
	[specindex_ivar_naisdss] [float] NULL,
	[specindex_ivar_tio2sdss] [float] NULL,
	[specindex_ivar_d4000] [float] NULL,
	[specindex_ivar_dn4000] [float] NULL,
	[specindex_ivar_tiocvd] [float] NULL,
	[specindex_mask_cn1] [bigint] NULL,
	[specindex_mask_cn2] [bigint] NULL,
	[specindex_mask_ca4227] [bigint] NULL,
	[specindex_mask_g4300] [bigint] NULL,
	[specindex_mask_fe4383] [bigint] NULL,
	[specindex_mask_ca4455] [bigint] NULL,
	[specindex_mask_fe4531] [bigint] NULL,
	[specindex_mask_c24668] [bigint] NULL,
	[specindex_mask_hb] [bigint] NULL,
	[specindex_mask_fe5015] [bigint] NULL,
	[specindex_mask_mg1] [bigint] NULL,
	[specindex_mask_mg2] [bigint] NULL,
	[specindex_mask_mgb] [bigint] NULL,
	[specindex_mask_fe5270] [bigint] NULL,
	[specindex_mask_fe5335] [bigint] NULL,
	[specindex_mask_fe5406] [bigint] NULL,
	[specindex_mask_fe5709] [bigint] NULL,
	[specindex_mask_fe5782] [bigint] NULL,
	[specindex_mask_nad] [bigint] NULL,
	[specindex_mask_tio1] [bigint] NULL,
	[specindex_mask_tio2] [bigint] NULL,
	[specindex_mask_hdeltaa] [bigint] NULL,
	[specindex_mask_hgammaa] [bigint] NULL,
	[specindex_mask_hdeltaf] [bigint] NULL,
	[specindex_mask_hgammaf] [bigint] NULL,
	[specindex_mask_cahk] [bigint] NULL,
	[specindex_mask_caii1] [bigint] NULL,
	[specindex_mask_caii2] [bigint] NULL,
	[specindex_mask_caii3] [bigint] NULL,
	[specindex_mask_pa17] [bigint] NULL,
	[specindex_mask_pa14] [bigint] NULL,
	[specindex_mask_pa12] [bigint] NULL,
	[specindex_mask_mgicvd] [bigint] NULL,
	[specindex_mask_naicvd] [bigint] NULL,
	[specindex_mask_mgiir] [bigint] NULL,
	[specindex_mask_fehcvd] [bigint] NULL,
	[specindex_mask_nai] [bigint] NULL,
	[specindex_mask_btio] [bigint] NULL,
	[specindex_mask_atio] [bigint] NULL,
	[specindex_mask_cah1] [bigint] NULL,
	[specindex_mask_cah2] [bigint] NULL,
	[specindex_mask_naisdss] [bigint] NULL,
	[specindex_mask_tio2sdss] [bigint] NULL,
	[specindex_mask_d4000] [bigint] NULL,
	[specindex_mask_dn4000] [bigint] NULL,
	[specindex_mask_tiocvd] [bigint] NULL,
	[specindex_corr_cn1] [float] NULL,
	[specindex_corr_cn2] [float] NULL,
	[specindex_corr_ca4227] [float] NULL,
	[specindex_corr_g4300] [float] NULL,
	[specindex_corr_fe4383] [float] NULL,
	[specindex_corr_ca4455] [float] NULL,
	[specindex_corr_fe4531] [float] NULL,
	[specindex_corr_c24668] [float] NULL,
	[specindex_corr_hb] [float] NULL,
	[specindex_corr_fe5015] [float] NULL,
	[specindex_corr_mg1] [float] NULL,
	[specindex_corr_mg2] [float] NULL,
	[specindex_corr_mgb] [float] NULL,
	[specindex_corr_fe5270] [float] NULL,
	[specindex_corr_fe5335] [float] NULL,
	[specindex_corr_fe5406] [float] NULL,
	[specindex_corr_fe5709] [float] NULL,
	[specindex_corr_fe5782] [float] NULL,
	[specindex_corr_nad] [float] NULL,
	[specindex_corr_tio1] [float] NULL,
	[specindex_corr_tio2] [float] NULL,
	[specindex_corr_hdeltaa] [float] NULL,
	[specindex_corr_hgammaa] [float] NULL,
	[specindex_corr_hdeltaf] [float] NULL,
	[specindex_corr_hgammaf] [float] NULL,
	[specindex_corr_cahk] [float] NULL,
	[specindex_corr_caii1] [float] NULL,
	[specindex_corr_caii2] [float] NULL,
	[specindex_corr_caii3] [float] NULL,
	[specindex_corr_pa17] [float] NULL,
	[specindex_corr_pa14] [float] NULL,
	[specindex_corr_pa12] [float] NULL,
	[specindex_corr_mgicvd] [float] NULL,
	[specindex_corr_naicvd] [float] NULL,
	[specindex_corr_mgiir] [float] NULL,
	[specindex_corr_fehcvd] [float] NULL,
	[specindex_corr_nai] [float] NULL,
	[specindex_corr_btio] [float] NULL,
	[specindex_corr_atio] [float] NULL,
	[specindex_corr_cah1] [float] NULL,
	[specindex_corr_cah2] [float] NULL,
	[specindex_corr_naisdss] [float] NULL,
	[specindex_corr_tio2sdss] [float] NULL,
	[specindex_corr_d4000] [float] NULL,
	[specindex_corr_dn4000] [float] NULL,
	[specindex_corr_tiocvd] [float] NULL

   ) with (
        data_source = SqlStoragePool,
        location =  '/manga/brian-test/dr15/v2_4_3/maps',
        file_format = parquet_file
    )
