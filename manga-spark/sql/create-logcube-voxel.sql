drop external table st_logcube_voxel

SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO
CREATE EXTERNAL TABLE [dbo].[st_logcube_voxel]
(
	[RA] [float] NULL,
	[DEC] [float] NULL,
	[_SRC_X] [bigint] NULL,
	[_SRC_Y] [bigint] NULL,
	[FLUX] [float] NULL,
	[IVAR] [float] NULL,
	[MASK] [bigint] NULL,
	[DISP] [float] NULL,
	[PREDISP] [float] NULL,
	[WAVE] [float] NULL,
	[SPECRES] [float] NULL,
	[SPECRESD] [float] NULL,
	[PRESPECRES] [float] NULL,
	[PRESPECRESD] [float] NULL,
	[G] [float] NULL,
	[R] [float] NULL,
	[I] [float] NULL,
	[Z] [float] NULL,
	[PLATEID] [bigint] NULL,
	[IFUDSGN] [bigint] NULL,
	[DESIGNID] [bigint] NULL,
	[MANGAID] varchar(100) NULL,
	[MJDRED] [bigint] NULL,
	[DATE-OBS] varchar(100) NULL
)
   with (
        data_source = SqlStoragePool,
        location =  '/manga/arik-test/dr15/v2_4_3/logcube_voxel',
        file_format = parquet_file
    )
