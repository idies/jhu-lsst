SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
CREATE EXTERNAL TABLE [dbo].[st_drpall]
(
	[plate] [bigint] NULL,
	[ifudsgn] [nvarchar](max) NULL,
	[plateifu] [nvarchar](max) NULL,
	[mangaid] [nvarchar](max) NULL,
	[versdrp2] [nvarchar](max) NULL,
	[versdrp3] [nvarchar](max) NULL,
	[verscore] [nvarchar](max) NULL,
	[versutil] [nvarchar](max) NULL,
	[versprim] [nvarchar](max) NULL,
	[platetyp] [nvarchar](max) NULL,
	[srvymode] [nvarchar](max) NULL,
	[objra] [float] NULL,
	[objdec] [float] NULL,
	[ifuglon] [float] NULL,
	[ifuglat] [float] NULL,
	[ifura] [float] NULL,
	[ifudec] [float] NULL,
	[ebvgal] [float] NULL,
	[nexp] [bigint] NULL,
	[exptime] [float] NULL,
	[drp3qual] [bigint] NULL,
	[bluesn2] [float] NULL,
	[redsn2] [float] NULL,
	[harname] [nvarchar](max) NULL,
	[frlplug] [bigint] NULL,
	[cartid] [nvarchar](max) NULL,
	[designid] [bigint] NULL,
	[cenra] [float] NULL,
	[cendec] [float] NULL,
	[airmsmin] [float] NULL,
	[airmsmed] [float] NULL,
	[airmsmax] [float] NULL,
	[seemin] [float] NULL,
	[seemed] [float] NULL,
	[seemax] [float] NULL,
	[transmin] [float] NULL,
	[transmed] [float] NULL,
	[transmax] [float] NULL,
	[mjdmin] [bigint] NULL,
	[mjdmed] [bigint] NULL,
	[mjdmax] [bigint] NULL,
	[gfwhm] [float] NULL,
	[rfwhm] [float] NULL,
	[ifwhm] [float] NULL,
	[zfwhm] [float] NULL,
	[mngtarg1] [bigint] NULL,
	[mngtarg2] [bigint] NULL,
	[mngtarg3] [bigint] NULL,
	[catidnum] [bigint] NULL,
	[plttarg] [nvarchar](max) NULL,
	[manga_tileid] [bigint] NULL,
	[nsa_iauname] [nvarchar](max) NULL,
	[ifudesignsize] [bigint] NULL,
	[ifutargetsize] [bigint] NULL,
	[ifudesignwrongsize] [bigint] NULL,
	[z] [float] NULL,
	[zmin] [float] NULL,
	[zmax] [float] NULL,
	[szmin] [float] NULL,
	[szmax] [float] NULL,
	[ezmin] [float] NULL,
	[ezmax] [float] NULL,
	[probs] [float] NULL,
	[pweight] [float] NULL,
	[psweight] [float] NULL,
	[psrweight] [float] NULL,
	[sweight] [float] NULL,
	[srweight] [float] NULL,
	[eweight] [float] NULL,
	[esweight] [float] NULL,
	[esrweight] [float] NULL,
	[nsa_field] [bigint] NULL,
	[nsa_run] [bigint] NULL,
	[nsa_camcol] [bigint] NULL,
	[nsa_version] [nvarchar](max) NULL,
	[nsa_nsaid] [bigint] NULL,
	[nsa_nsaid_v1b] [bigint] NULL,
	[nsa_z] [float] NULL,
	[nsa_zdist] [float] NULL,
	[nsa_sersic_absmag_f] [float] NULL,
	[nsa_sersic_absmag_n] [float] NULL,
	[nsa_sersic_absmag_u] [float] NULL,
	[nsa_sersic_absmag_g] [float] NULL,
	[nsa_sersic_absmag_r] [float] NULL,
	[nsa_sersic_absmag_i] [float] NULL,
	[nsa_sersic_absmag_z] [float] NULL,
	[nsa_elpetro_absmag_f] [float] NULL,
	[nsa_elpetro_absmag_n] [float] NULL,
	[nsa_elpetro_absmag_u] [float] NULL,
	[nsa_elpetro_absmag_g] [float] NULL,
	[nsa_elpetro_absmag_r] [float] NULL,
	[nsa_elpetro_absmag_i] [float] NULL,
	[nsa_elpetro_absmag_z] [float] NULL,
	[nsa_elpetro_amivar_f] [float] NULL,
	[nsa_elpetro_amivar_n] [float] NULL,
	[nsa_elpetro_amivar_u] [float] NULL,
	[nsa_elpetro_amivar_g] [float] NULL,
	[nsa_elpetro_amivar_r] [float] NULL,
	[nsa_elpetro_amivar_i] [float] NULL,
	[nsa_elpetro_amivar_z] [float] NULL,
	[nsa_sersic_mass] [float] NULL,
	[nsa_elpetro_mass] [float] NULL,
	[nsa_elpetro_ba] [float] NULL,
	[nsa_elpetro_phi] [float] NULL,
	[nsa_extinction_f] [float] NULL,
	[nsa_extinction_n] [float] NULL,
	[nsa_extinction_u] [float] NULL,
	[nsa_extinction_g] [float] NULL,
	[nsa_extinction_r] [float] NULL,
	[nsa_extinction_i] [float] NULL,
	[nsa_extinction_z] [float] NULL,
	[nsa_elpetro_th50_r] [float] NULL,
	[nsa_petro_th50] [float] NULL,
	[nsa_petro_flux_f] [float] NULL,
	[nsa_petro_flux_n] [float] NULL,
	[nsa_petro_flux_u] [float] NULL,
	[nsa_petro_flux_g] [float] NULL,
	[nsa_petro_flux_r] [float] NULL,
	[nsa_petro_flux_i] [float] NULL,
	[nsa_petro_flux_z] [float] NULL,
	[nsa_petro_flux_ivar_f] [float] NULL,
	[nsa_petro_flux_ivar_n] [float] NULL,
	[nsa_petro_flux_ivar_u] [float] NULL,
	[nsa_petro_flux_ivar_g] [float] NULL,
	[nsa_petro_flux_ivar_r] [float] NULL,
	[nsa_petro_flux_ivar_i] [float] NULL,
	[nsa_petro_flux_ivar_z] [float] NULL,
	[nsa_elpetro_flux_f] [float] NULL,
	[nsa_elpetro_flux_n] [float] NULL,
	[nsa_elpetro_flux_u] [float] NULL,
	[nsa_elpetro_flux_g] [float] NULL,
	[nsa_elpetro_flux_r] [float] NULL,
	[nsa_elpetro_flux_i] [float] NULL,
	[nsa_elpetro_flux_z] [float] NULL,
	[nsa_elpetro_flux_ivar_f] [float] NULL,
	[nsa_elpetro_flux_ivar_n] [float] NULL,
	[nsa_elpetro_flux_ivar_u] [float] NULL,
	[nsa_elpetro_flux_ivar_g] [float] NULL,
	[nsa_elpetro_flux_ivar_r] [float] NULL,
	[nsa_elpetro_flux_ivar_i] [float] NULL,
	[nsa_elpetro_flux_ivar_z] [float] NULL,
	[nsa_sersic_ba] [float] NULL,
	[nsa_sersic_n] [float] NULL,
	[nsa_sersic_phi] [float] NULL,
	[nsa_sersic_th50] [float] NULL,
	[nsa_sersic_flux_f] [float] NULL,
	[nsa_sersic_flux_n] [float] NULL,
	[nsa_sersic_flux_u] [float] NULL,
	[nsa_sersic_flux_g] [float] NULL,
	[nsa_sersic_flux_r] [float] NULL,
	[nsa_sersic_flux_i] [float] NULL,
	[nsa_sersic_flux_z] [float] NULL,
	[nsa_sersic_flux_ivar_f] [float] NULL,
	[nsa_sersic_flux_ivar_n] [float] NULL,
	[nsa_sersic_flux_ivar_u] [float] NULL,
	[nsa_sersic_flux_ivar_g] [float] NULL,
	[nsa_sersic_flux_ivar_r] [float] NULL,
	[nsa_sersic_flux_ivar_i] [float] NULL,
	[nsa_sersic_flux_ivar_z] [float] NULL
)
 with (
        data_source = SqlStoragePool,
        location =  '/manga/brian-test/dr15/v2_4_3/drpall',
        file_format = parquet_file
    )