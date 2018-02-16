--create staging table for Object

USE [lsst_stage]
GO



ALTER TABLE object_stage
add constraint pk_obj_stage_deepsourceID 
primary key clustered (deepsourceId)
with (data_compression=page)
on [ST_01]


--20min to bulk insert into heap without data compression
--lsst_stage	Data	ST_01	stage01	100000.00	66934.25	66.93	C:\ssd\sql_db\stage01.ndf	3	NULL	500.00

--6:38 to add clustered index w page compression

--lsst_stage	Data	ST_01	stage01	131500.00	49597.69	37.72	C:\ssd\sql_db\stage01.ndf	3	NULL	500.00
--file definitely grew

exec spFileFGInfo



select * from LoadLog 
where loadid >= 79

--cancelled loading into CLI table after 30 min when only 17 files had been loaded


--19 min to load object table for p1
--lsst_stage	Data	ST_01	stage01	131500.00	65548.56	49.85	C:\ssd\sql_db\stage01.ndf	3	NULL	500.00


--try nonclustered index

create unique nonclustered index ix_object_deepsourceid
on object_stage(deepsourceid)
with (sort_in_tempdb=on)

--35s!!!!
--lsst_stage	Data	ST_01	stage01	131500.00	65968.44	50.17	C:\ssd\sql_db\stage01.ndf	3	NULL	500.00



select top 10 deepsourceid, ra, decl, chunkID, LSST20.htmid.FromEq(ra, decl)
from object_stage


------------------------------------------------------------------------------------------------
insert LSST20.dbo.Object_01
--clustered index, no tablock, data compression
--42 min
--19671574 rows


exec spFileFGInfo
--Database	File type	File group	Logical file name	Total size (MB)	Used (MB)	Used (%)	File name	File ID	Max. size (MB)	Autogrowth increment (MB)
--LSST_01	Data	OBJ_01	object_01	66000.00	20577.63	31.18	C:\pool\sql_db\object_01.ndf	3	NULL	200.00
--LSST_01	Data	PRIMARY	LSST_01	8.00	3.06	38.28	C:\pool\sql_db\LSST_01.mdf	1	NULL	64.00
--LSST_01	Log	N/A	LSST_01_log	31816.00	366.20	1.15	C:\pool\sql_log\LSST_01_log.ldf	2	2097152.00	64.00

-----------------------------------------------------------------------------------------------------

-- bulk insert csv files into source_stage
-- no indexes, tablock

-- first bit took ~90m, ran out of space on SSD FG, dropped object_stage table
-- loaded next few, filled up SSD volume
-- added another file on /pool and loaded the rest ~2h total?

exec spFileFGInfo
--Database	File type	File group	Logical file name	Total size (MB)	Used (MB)	Used (%)	File name	File ID	Max. size (MB)	Autogrowth increment (MB)
--lsst_stage	Data	PRIMARY	lsst_stage	11000.00	10041.31	91.28	c:\pool\sql_db\lsst_stage.mdf	1	NULL	500.00
--lsst_stage	Data	ST_01	stage_02	21480.00	21402.56	99.64	C:\pool\sql_db\stage_02.ndf	4	NULL	64.00
--lsst_stage	Data	ST_01	stage01	333517.75	333187.88	99.90	C:\ssd\sql_db\stage01.ndf	3	NULL	500.00
--lsst_stage	Log	N/A	lsst_stage_log	3912.00	91.02	2.33	c:\pool\sql_log\lsst_stage_log.ldf	2	2097152.00	64.00

exec sp_spaceused source_stage
--name	rows	reserved	data	index_size	unused
--source_stage	364192720           	363094800 KB	363091760 KB	720 KB	2320 KB

--creating unique NCI
create unique nonclustered index ix_sourcestage_id
on source_stage(id)
with (sort_in_tempdb=on)
--11:09m


select * from lsst_stage.dbo.LoadLog
where tname = 'source'
and rows <> 0



--364192720 rows in source_stage3
--7.5 hr
--also added chunkID

create unique nonclustered index ix_sourcestage3_id
on source_stage3(id)
with (sort_in_tempdb=on)
--09:41 to create NCI

sp_spaceused source_stage3

sp_spaceused source_stage
--source_stage3	364192720           	202175368 KB	194236448 KB	7935216 KB	3704 KB  
--source_stage	364192720           	371030760 KB	363091760 KB	7935168 KB	3832 KB
--Source_01		364192720           	82282800 KB		75603688 KB		6677704 KB	1408 KB
--source_stage3 used correct datatypes, source_stage used varchar(50)s for everything so it took up much more space

--stage3 = 202GB
--stage =  370GB
--source (compression,  reals) 82GB




------------------------
-- create Source_01
alter table Source_01
add constraint pk_source_01_id
primary key clustered(id)
with(sort_in_tempdb=on, data_compression=page)
on SRC_01


insert Source_01 with (tablockx)
select * from lsst_stage.dbo.source_stage3 with (nolock)
--3:41 364192720 rows
-- lots of slow reads/writes in tempdb.  maybe try order by or take out sort_in_tempdb or move tempdb to SSD
---
---
--- NCI on chunkID so we can easily relate it to Object
--- hoping that i can relate chunkID to objID or something so I don't have to update file by file from staging table
---
create nonclustered index ix_source01_chunkID on Source_01(chunkID)
with (sort_in_tempdb=on)
--8:57

exec sp_spaceused Source_01

--Source_01	364192720           	82282800 KB	75603688 KB	6677704 KB	1408 KB--
--82GB

-----------------------

select * into forcedsource_stage
on src_st01
from ForcedSource_template2
where(0=1)


--inserted into ForcedSource_stage
--2hr 12m

create nonclustered index ix_fs_deepSourceID
on forcedsource_stage (deepSourceID)
on src_st01


exec sp_spaceused forcedsource_stage
--forcedsource_stage	1792859120          	115393016 KB	76292152 KB	39096936 KB	3928 KB
--115GB (uncompressed with floats)

select * from forcedsource_stage where deepsourceid = 2269941755543552



select * from rowsfile 
where tname = 'ObjectFullOverlap'

select * from part_all
where tname in ('object', 'ObjectFullOverlap')
order by chunkID


exec spFileFGInfo

