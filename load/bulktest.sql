BULK INSERT object_stage FROM '/sciserver/gerard_virgo_data/LSST/csv/Object_0.csv' WITH 
( FIRSTROW=2,       
FIELDTERMINATOR = ';', 
ROWTERMINATOR = '0x0a', 
TABLOCK );

select * from object_stage

select * from openrowset(
	--bulk N'/sciserver/gerard_virgo_data/LSST/csv/Object_0.csv',
	bulk N'/sciserver/gerard_virgo_data/LSST/csv/test/Obj1.csv',
	firstrow = 2,
	formatfile = N'/sciserver/gerard_virgo_data/LSST/csv/object_stage2.fmt'
	--fieldterminator = ';',
	--FORMAT = 'CSV'
	--ROWTERMINATOR = '0x0a', TABLOCK 
	) as a;





	declare @a varchar(50)

	select @a = 12345

	select @a

	declare @b bigint

	select @b = @a
	
	select @b
	select @a

	create table #t1 (c varchar(50), i bigint)

	insert #t1 values(12345, 12345)

	select * from #t1

	insert #t1 values(1234, 9999)

	select * from #t1

	update #t1
	set i = c

	
	select * from #t1
