BULK INSERT source1 FROM '/sciserver/gerard_virgo_data/LSST/csv/test/s2.csv' WITH ( FIRSTROW=2,       FIELDTERMINATOR = ';', ROWTERMINATOR = '0x0a', TABLOCK );



BULK INSERT source_v FROM '/sciserver/gerard_virgo_data/LSST/csv/Source_516.csv' WITH ( FIRSTROW=2,       FIELDTERMINATOR = ';', ROWTERMINATOR = '0x0a', TABLOCK );


select * from PartSource
