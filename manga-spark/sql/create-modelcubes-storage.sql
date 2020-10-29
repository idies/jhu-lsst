
use manga_bdc
go

/* if not exists (select * from sys.external_tables WHERE name = 'st_joined')
    create external table [st_joined] (
        _idx int,
        ZCTA5CE10 varchar(10),
        userID varchar(100),
        lat float,
        lon float,
        timeSec datetime2,
        day int,
        year int, 
        month int


    ) with (
        data_source = SqlStoragePool,
        location =  '/user/arik/fysical/joined/monthly',
        file_format = parquet_file
    )
    
|-- plateifu: string (nullable = true)
 |-- mangaid: string (nullable = true)
 |-- ra: double (nullable = true)
 |-- dec: double (nullable = true)
 |-- daptype: string (nullable = true)
 |-- spaxel_idx: long (nullable = true)
 |-- x: long (nullable = true)
 |-- y: long (nullable = true)
 |-- wave: double (nullable = true)
 |-- flux: double (nullable = true)
 |-- ivar: double (nullable = true)
 |-- mask: long (nullable = true)
 |-- model: double (nullable = true)
 |-- emline: double (nullable = true)
 |-- emline_base: double (nullable = true)
 |-- emline_mask: long (nullable = true)
 |-- binid_binned_spectra: long (nullable = true)
 |-- binid_stellar_cont: long (nullable = true)
 |-- binid_emline_moments: long (nullable = true)
 |-- binid_emline_models: long (nullable = true)
 |-- binid_spectral_indices: long (nullable = true)
    
    
     */

if not exists (select * from sys.external_tables where name = 'st_modelcubes')
    create external table st_modelcubes (
        plateifu varchar(50),
        mangaid varchar(50),
        ra float,
        dec float,
        daptype varchar(50),
        spaxel_idx bigint,
        x bigint,
        y bigint,
        wave real,
        flux real,
        ivar real,
        mask bigint,
        model real,
        emline real,
        emline_base real,
        emline_mask bigint,
        binid_binned_spectra bigint,
        binid_stellar_cont bigint,
        binid_emline_moments bigint,
        binid_emline_models bigint,
        binid_spectral_indicies bigint


    ) with (
        data_source = SqlStoragePool,
        location =  '/manga/brian-test/dr15/v2_4_3/modelcubes',
        file_format = parquet_file
    )

    --tmp = spark.read.parquet('hdfs:///manga/brian-test/dr15/v2_4_3/modelcubes')

