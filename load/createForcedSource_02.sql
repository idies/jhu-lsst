

sp_helpfile

select * into ForcedSource_02 on FS_02
from LSST_01.dbo.ForcedSource_01
where (0=1)


ALTER TABLE [dbo].[ForcedSource_02] ADD  CONSTRAINT [pk_fsource_02_dsid_ccdid] PRIMARY KEY CLUSTERED 
(
	[deepSourceId] ASC,
	[scienceCcdExposureId] ASC
)WITH (data_compression = page, PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = ON, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [FS_02]
GO

insert ForcedSource_02 with (tablock)
select * from lsst_stage.dbo.ForcedSource_stage
with (nolock)


