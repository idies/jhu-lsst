USE [lsst_stage]
GO
ALTER TABLE [dbo].[source_stage2] DROP COLUMN [chunkId]
ALTER TABLE [dbo].[source_stage2] DROP COLUMN [subchunkId]
GO



select * into source_template2
from source_stage2
where (0=1)

select * into source_template3
from Source_1025
where (0=1)




drop table source_stage3

select * into source_stage3
on src_st01
from source_template3
where (0=1)

alter table source_stage3 add constraint def_chunkid default -999 for chunkid
alter table source_stage3 add constraint def_subChunkID default -999 for subChunkid

create nonclustered index ix_fi_chunkID on source_stage3(chunkID) 
where chunkID = -999

drop view source_v

exec spCreateViewSource


exec spFileFGInfo


exec sp_BlitzWho

exec sp_BlitzFirst @expertmode = 1
, @checkProcedureCache=1


exec sp_BlitzCache


use tempdb
exec sp_helpfile