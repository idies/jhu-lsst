SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
CREATE EXTERNAL TABLE [dbo].[st_modelcubes]
(
	[plateifu] [varchar](100) NULL,
	[mangaid] [varchar](100) NULL,
	[ra] [float] NULL,
	[dec] [float] NULL,
	[daptype] [varchar](100) NULL,
	[spaxel_idx] [bigint] NULL,
	[x] [bigint] NULL,
	[y] [bigint] NULL,
	[wave] [float] NULL,
	[flux] [float] NULL,
	[ivar] [float] NULL,
	[mask] [bigint] NULL,
	[model] [float] NULL,
	[emline] [float] NULL,
	[emline_base] [float] NULL,
	[emline_mask] [bigint] NULL,
	[binid_binned_spectra] [bigint] NULL,
	[binid_stellar_cont] [bigint] NULL,
	[binid_emline_moments] [bigint] NULL,
	[binid_emline_models] [bigint] NULL,
	[binid_spectral_indices] [bigint] NULL
)
WITH (DATA_SOURCE = [SqlStoragePool],LOCATION = N'/manga/brian-test/dr15/v2_4_3/modelcubes',FILE_FORMAT = [parquet_file])
GO
