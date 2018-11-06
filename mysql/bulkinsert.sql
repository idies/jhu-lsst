

--good
--select * into testFS1
--from forcedsource_template
--where (0=1)


BULK INSERT ForcedSource FROM 
'/tmp/suecsv/testFS1.csv' WITH (     
FIELDTERMINATOR = ',', ROWTERMINATOR = '0x0a', TABLOCK 
--format = 'CSV',

);

select * from ForcedSource




--bad
--Bulk load data conversion error (type mismatch or invalid character for the specified codepage) for row 1, column 236 (y_flagBadShape).
--select * into testOFO1
--from objectfulloverlap_template
--where (0=1)


BULK INSERT ObjectFullOverlap FROM 
'/tmp/suecsv/testOFO1.csv' WITH (     
FIELDTERMINATOR = ','
--, ROWTERMINATOR = '0x0a'
, TABLOCK 
--format = 'CSV',

);

select * from ObjectFullOverlap



--select * into testSource1
--from source_template
--where (0=1)

--good
BULK INSERT Source FROM 
'/tmp/suecsv/testSource1.csv' WITH (     
FIELDTERMINATOR = ',', ROWTERMINATOR = '0x0a', TABLOCK 
--format = 'CSV',

);

select * from Source


--Bulk load data conversion error (type mismatch or invalid character for the specified codepage) for row 1, column 236 (y_flagBadShape).
--select * into testObject1
--from object_template
--where (0=1)


BULK INSERT Object FROM 
'/tmp/suecsv/testObject1.csv' WITH (     
FIELDTERMINATOR = ','
--, ROWTERMINATOR = '0x0a'
, TABLOCK 
--format = 'CSV',

);

select * from Object

