BULK INSERT source1 FROM '/sciserver/gerard_virgo_data/LSST/csv/test/s2.csv' WITH ( FIRSTROW=2,       FIELDTERMINATOR = ';', ROWTERMINATOR = '0x0a', TABLOCK );



BULK INSERT source_v FROM '/sciserver/gerard_virgo_data/LSST/csv/Source_516.csv' WITH ( FIRSTROW=2,       FIELDTERMINATOR = ';', ROWTERMINATOR = '0x0a', TABLOCK );


select * from PartSource


select * from source_stage3 where chunkID = -999


create nonclustered index ix_fi_chunkID on source_stage3(chunkID) 
where chunkID = -999


update source_stage3 set chunkID = 516 
where chunkID = -999


BULK INSERT ObjectFullOverlap_stage FROM '/sciserver/gerard_virgo_data/LSST/csv/ObjectFullOverlap_516.csv' WITH ( FIRSTROW=2,       FIELDTERMINATOR = ';', ROWTERMINATOR = '0x0a', TABLOCK );



select * into ForcedSource_template2
from ForcedSource_1025
where (0=1)


select * into forcedsource_stage2
from forcedsource_template
where (0=1)

BULK INSERT forcedsource_stage2 FROM '/sciserver/gerard_virgo_data/LSST/csv/ForcedSource_516.csv' WITH ( FIRSTROW=2,       FIELDTERMINATOR = ';', ROWTERMINATOR = '0x0a', TABLOCK );

exec spFileFGInfo

sp_helptable