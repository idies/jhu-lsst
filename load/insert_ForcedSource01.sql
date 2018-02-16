

/****** Object:  Table [dbo].[ForcedSource_1025]    Script Date: 2/14/2018 11:58:33 AM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO
--drop table ForcedSource_01

CREATE TABLE [dbo].[ForcedSource_01](
	[deepSourceId] [bigint] NOT NULL,
	[scienceCcdExposureId] [bigint] NOT NULL,
	[psfFlux] [real] NULL,
	[psfFluxSigma] [real] NULL,
	[flagBadMeasCentroid] [bit] NOT NULL,
	[flagPixEdge] [bit] NOT NULL,
	[flagPixInterpAny] [bit] NOT NULL,
	[flagPixInterpCen] [bit] NOT NULL,
	[flagPixSaturAny] [bit] NOT NULL,
	[flagPixSaturCen] [bit] NOT NULL,
	[flagBadPsfFlux] [bit] NOT NULL,
	[chunkId] [int] NOT NULL,
	[subChunkId] [int] NOT NULL
) ON [PRIMARY]

GO

alter table ForcedSource_01
add constraint pk_fsource_01_dsid_ccdid
primary key clustered(deepsourceid,[scienceCcdExposureId])
with(sort_in_tempdb=on, data_compression=page)
on FS_01

--insert ForcedSource_01 with (tablockx)
--select * from lsst_stage.dbo.forcedsource_stage with (nolock)
--order by deepsourceid

insert ForcedSource_01 with (tablockx)
select * from lsst_stage.dbo.forcedsource_stage with (nolock)

--Msg 2627, Level 14, State 2, Line 38
--Violation of PRIMARY KEY constraint 'pk_fsource_01_dsid'. Cannot insert duplicate key in object 'dbo.ForcedSource_01'. The duplicate key value is (2269941755543552).

--oof, added ScienceCCDExposureID to PK

--insert into CLI takes a long time and is hard on tempdb, which is on the same disk volume, which is crappy







