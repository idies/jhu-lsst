BULK INSERT Object_10049

FROM '/srv/data3/test/fanblah999.csv'

WITH

(

   FIRSTROW = 1,

   FIELDTERMINATOR = ',',  --CSV field delimiter

   ROWTERMINATOR = '\n',   --Use to shift the control to next row

   TABLOCK

)

--SELECT * FROM fantest
