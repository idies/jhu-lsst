--create database LSST

USE LSST
GO

-- Create the SqlDataPool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlDataPool')
		IF SERVERPROPERTY('ProductLevel') = 'CTP3.0'
			CREATE EXTERNAL DATA SOURCE SqlDataPool
			WITH (LOCATION = 'sqldatapool://controller-svc:8080/datapools/default');
		ELSE IF SERVERPROPERTY('ProductLevel') = 'CTP3.1'
			CREATE EXTERNAL DATA SOURCE SqlDataPool
			WITH (LOCATION = 'sqldatapool://controller-svc/default');

-- Create the SqlStoragePool data source:
IF NOT EXISTS(SELECT * FROM sys.external_data_sources WHERE name = 'SqlStoragePool')
    IF SERVERPROPERTY('ProductLevel') = 'CTP3.0'
        CREATE EXTERNAL DATA SOURCE SqlStoragePool
        WITH (LOCATION = 'sqlhdfs://controller-svc:8080/default');
    ELSE IF SERVERPROPERTY('ProductLevel') = 'CTP3.1'
        CREATE EXTERNAL DATA SOURCE SqlStoragePool
        WITH (LOCATION = 'sqlhdfs://controller-svc/default');

--drop external table object
--based on Sue's https://github.com/idies/jhu-lsst/blob/master/mysql/mssql-createTables.sql
CREATE EXTERNAL TABLE Object (
	[deepSourceId] BIGINT NOT NULL,
	[ra] FLOAT NOT NULL,
	[decl] FLOAT NOT NULL,
	[raVar] FLOAT NULL ,
	[declVar] FLOAT NULL ,
	[radeclCov] FLOAT NULL ,
	[chunkId] INT NOT NULL,
	[subChunkId] INT NOT NULL,
	[u_psfFlux] FLOAT NULL ,
	[u_psfFluxSigma] FLOAT NULL ,
	[u_apFlux] FLOAT NULL ,
	[u_apFluxSigma] FLOAT NULL ,
	[u_modelFlux] FLOAT NULL ,
	[u_modelFluxSigma] FLOAT NULL ,
	[u_instFlux] FLOAT NULL ,
	[u_instFluxSigma] FLOAT NULL ,
	[u_apCorrection] FLOAT NULL ,
	[u_apCorrectionSigma] FLOAT NULL ,
	[u_shapeIx] FLOAT NULL ,
	[u_shapeIy] FLOAT NULL ,
	[u_shapeIxVar] FLOAT NULL ,
	[u_shapeIyVar] FLOAT NULL ,
	[u_shapeIxIyCov] FLOAT NULL ,
	[u_shapeIxx] FLOAT NULL ,
	[u_shapeIyy] FLOAT NULL ,
	[u_shapeIxy] FLOAT NULL ,
	[u_shapeIxxVar] FLOAT NULL ,
	[u_shapeIyyVar] FLOAT NULL ,
	[u_shapeIxyVar] FLOAT NULL ,
	[u_shapeIxxIyyCov] FLOAT NULL ,
	[u_shapeIxxIxyCov] FLOAT NULL ,
	[u_shapeIyyIxyCov] FLOAT NULL ,
	[u_extendedness] FLOAT NULL ,
	[u_flagNegative] BIT NULL ,
	[u_flagBadMeasCentroid] BIT NULL ,
	[u_flagPixEdge] BIT NULL ,
	[u_flagPixInterpAny] BIT NULL ,
	[u_flagPixInterpCen] BIT NULL ,
	[u_flagPixSaturAny] BIT NULL ,
	[u_flagPixSaturCen] BIT NULL ,
	[u_flagBadPsfFlux] BIT NULL ,
	[u_flagBadApFlux] BIT NULL ,
	[u_flagBadModelFlux] BIT NULL ,
	[u_flagBadInstFlux] BIT NULL ,
	[u_flagBadCentroid] BIT NULL ,
	[u_flagBadShape] BIT NULL ,
	[g_psfFlux] FLOAT NULL ,
	[g_psfFluxSigma] FLOAT NULL ,
	[g_apFlux] FLOAT NULL ,
	[g_apFluxSigma] FLOAT NULL ,
	[g_modelFlux] FLOAT NULL ,
	[g_modelFluxSigma] FLOAT NULL ,
	[g_instFlux] FLOAT NULL ,
	[g_instFluxSigma] FLOAT NULL ,
	[g_apCorrection] FLOAT NULL ,
	[g_apCorrectionSigma] FLOAT NULL ,
	[g_shapeIx] FLOAT NULL ,
	[g_shapeIy] FLOAT NULL ,
	[g_shapeIxVar] FLOAT NULL ,
	[g_shapeIyVar] FLOAT NULL ,
	[g_shapeIxIyCov] FLOAT NULL ,
	[g_shapeIxx] FLOAT NULL ,
	[g_shapeIyy] FLOAT NULL ,
	[g_shapeIxy] FLOAT NULL ,
	[g_shapeIxxVar] FLOAT NULL ,
	[g_shapeIyyVar] FLOAT NULL ,
	[g_shapeIxyVar] FLOAT NULL ,
	[g_shapeIxxIyyCov] FLOAT NULL ,
	[g_shapeIxxIxyCov] FLOAT NULL ,
	[g_shapeIyyIxyCov] FLOAT NULL ,
	[g_extendedness] FLOAT NULL ,
	[g_flagNegative] BIT NULL ,
	[g_flagBadMeasCentroid] BIT NULL ,
	[g_flagPixEdge] BIT NULL ,
	[g_flagPixInterpAny] BIT NULL ,
	[g_flagPixInterpCen] BIT NULL ,
	[g_flagPixSaturAny] BIT NULL ,
	[g_flagPixSaturCen] BIT NULL ,
	[g_flagBadPsfFlux] BIT NULL ,
	[g_flagBadApFlux] BIT NULL ,
	[g_flagBadModelFlux] BIT NULL ,
	[g_flagBadInstFlux] BIT NULL ,
	[g_flagBadCentroid] BIT NULL ,
	[g_flagBadShape] BIT NULL ,
	[r_psfFlux] FLOAT NULL ,
	[r_psfFluxSigma] FLOAT NULL ,
	[r_apFlux] FLOAT NULL ,
	[r_apFluxSigma] FLOAT NULL ,
	[r_modelFlux] FLOAT NULL ,
	[r_modelFluxSigma] FLOAT NULL ,
	[r_instFlux] FLOAT NULL ,
	[r_instFluxSigma] FLOAT NULL ,
	[r_apCorrection] FLOAT NULL ,
	[r_apCorrectionSigma] FLOAT NULL ,
	[r_shapeIx] FLOAT NULL ,
	[r_shapeIy] FLOAT NULL ,
	[r_shapeIxVar] FLOAT NULL ,
	[r_shapeIyVar] FLOAT NULL ,
	[r_shapeIxIyCov] FLOAT NULL ,
	[r_shapeIxx] FLOAT NULL ,
	[r_shapeIyy] FLOAT NULL ,
	[r_shapeIxy] FLOAT NULL ,
	[r_shapeIxxVar] FLOAT NULL ,
	[r_shapeIyyVar] FLOAT NULL ,
	[r_shapeIxyVar] FLOAT NULL ,
	[r_shapeIxxIyyCov] FLOAT NULL ,
	[r_shapeIxxIxyCov] FLOAT NULL ,
	[r_shapeIyyIxyCov] FLOAT NULL ,
	[r_extendedness] FLOAT NULL ,
	[r_flagNegative] BIT NULL ,
	[r_flagBadMeasCentroid] BIT NULL ,
	[r_flagPixEdge] BIT NULL ,
	[r_flagPixInterpAny] BIT NULL ,
	[r_flagPixInterpCen] BIT NULL ,
	[r_flagPixSaturAny] BIT NULL ,
	[r_flagPixSaturCen] BIT NULL ,
	[r_flagBadPsfFlux] BIT NULL ,
	[r_flagBadApFlux] BIT NULL ,
	[r_flagBadModelFlux] BIT NULL ,
	[r_flagBadInstFlux] BIT NULL ,
	[r_flagBadCentroid] BIT NULL ,
	[r_flagBadShape] BIT NULL ,
	[i_psfFlux] FLOAT NULL ,
	[i_psfFluxSigma] FLOAT NULL ,
	[i_apFlux] FLOAT NULL ,
	[i_apFluxSigma] FLOAT NULL ,
	[i_modelFlux] FLOAT NULL ,
	[i_modelFluxSigma] FLOAT NULL ,
	[i_instFlux] FLOAT NULL ,
	[i_instFluxSigma] FLOAT NULL ,
	[i_apCorrection] FLOAT NULL ,
	[i_apCorrectionSigma] FLOAT NULL ,
	[i_shapeIx] FLOAT NULL ,
	[i_shapeIy] FLOAT NULL ,
	[i_shapeIxVar] FLOAT NULL ,
	[i_shapeIyVar] FLOAT NULL ,
	[i_shapeIxIyCov] FLOAT NULL ,
	[i_shapeIxx] FLOAT NULL ,
	[i_shapeIyy] FLOAT NULL ,
	[i_shapeIxy] FLOAT NULL ,
	[i_shapeIxxVar] FLOAT NULL ,
	[i_shapeIyyVar] FLOAT NULL ,
	[i_shapeIxyVar] FLOAT NULL ,
	[i_shapeIxxIyyCov] FLOAT NULL ,
	[i_shapeIxxIxyCov] FLOAT NULL ,
	[i_shapeIyyIxyCov] FLOAT NULL ,
	[i_extendedness] FLOAT NULL ,
	[i_flagNegative] BIT NULL ,
	[i_flagBadMeasCentroid] BIT NULL ,
	[i_flagPixEdge] BIT NULL ,
	[i_flagPixInterpAny] BIT NULL ,
	[i_flagPixInterpCen] BIT NULL ,
	[i_flagPixSaturAny] BIT NULL ,
	[i_flagPixSaturCen] BIT NULL ,
	[i_flagBadPsfFlux] BIT NULL ,
	[i_flagBadApFlux] BIT NULL ,
	[i_flagBadModelFlux] BIT NULL ,
	[i_flagBadInstFlux] BIT NULL ,
	[i_flagBadCentroid] BIT NULL ,
	[i_flagBadShape] BIT NULL ,
	[z_psfFlux] FLOAT NULL ,
	[z_psfFluxSigma] FLOAT NULL ,
	[z_apFlux] FLOAT NULL ,
	[z_apFluxSigma] FLOAT NULL ,
	[z_modelFlux] FLOAT NULL ,
	[z_modelFluxSigma] FLOAT NULL ,
	[z_instFlux] FLOAT NULL ,
	[z_instFluxSigma] FLOAT NULL ,
	[z_apCorrection] FLOAT NULL ,
	[z_apCorrectionSigma] FLOAT NULL ,
	[z_shapeIx] FLOAT NULL ,
	[z_shapeIy] FLOAT NULL ,
	[z_shapeIxVar] FLOAT NULL ,
	[z_shapeIyVar] FLOAT NULL ,
	[z_shapeIxIyCov] FLOAT NULL ,
	[z_shapeIxx] FLOAT NULL ,
	[z_shapeIyy] FLOAT NULL ,
	[z_shapeIxy] FLOAT NULL ,
	[z_shapeIxxVar] FLOAT NULL ,
	[z_shapeIyyVar] FLOAT NULL ,
	[z_shapeIxyVar] FLOAT NULL ,
	[z_shapeIxxIyyCov] FLOAT NULL ,
	[z_shapeIxxIxyCov] FLOAT NULL ,
	[z_shapeIyyIxyCov] FLOAT NULL ,
	[z_extendedness] FLOAT NULL ,
	[z_flagNegative] BIT NULL ,
	[z_flagBadMeasCentroid] BIT NULL ,
	[z_flagPixEdge] BIT NULL ,
	[z_flagPixInterpAny] BIT NULL ,
	[z_flagPixInterpCen] BIT NULL ,
	[z_flagPixSaturAny] BIT NULL ,
	[z_flagPixSaturCen] BIT NULL ,
	[z_flagBadPsfFlux] BIT NULL ,
	[z_flagBadApFlux] BIT NULL ,
	[z_flagBadModelFlux] BIT NULL ,
	[z_flagBadInstFlux] BIT NULL ,
	[z_flagBadCentroid] BIT NULL ,
	[z_flagBadShape] BIT NULL ,
	[y_psfFlux] FLOAT NULL ,
	[y_psfFluxSigma] FLOAT NULL ,
	[y_apFlux] FLOAT NULL ,
	[y_apFluxSigma] FLOAT NULL ,
	[y_modelFlux] FLOAT NULL ,
	[y_modelFluxSigma] FLOAT NULL ,
	[y_instFlux] FLOAT NULL ,
	[y_instFluxSigma] FLOAT NULL ,
	[y_apCorrection] FLOAT NULL ,
	[y_apCorrectionSigma] FLOAT NULL ,
	[y_shapeIx] FLOAT NULL ,
	[y_shapeIy] FLOAT NULL ,
	[y_shapeIxVar] FLOAT NULL ,
	[y_shapeIyVar] FLOAT NULL ,
	[y_shapeIxIyCov] FLOAT NULL ,
	[y_shapeIxx] FLOAT NULL ,
	[y_shapeIyy] FLOAT NULL ,
	[y_shapeIxy] FLOAT NULL ,
	[y_shapeIxxVar] FLOAT NULL ,
	[y_shapeIyyVar] FLOAT NULL ,
	[y_shapeIxyVar] FLOAT NULL ,
	[y_shapeIxxIyyCov] FLOAT NULL ,
	[y_shapeIxxIxyCov] FLOAT NULL ,
	[y_shapeIyyIxyCov] FLOAT NULL ,
	[y_extendedness] FLOAT NULL ,
	[y_flagNegative] BIT NULL ,
	[y_flagBadMeasCentroid] BIT NULL ,
	[y_flagPixEdge] BIT NULL ,
	[y_flagPixInterpAny] BIT NULL ,
	[y_flagPixInterpCen] BIT NULL ,
	[y_flagPixSaturAny] BIT NULL ,
	[y_flagPixSaturCen] BIT NULL ,
	[y_flagBadPsfFlux] BIT NULL ,
	[y_flagBadApFlux] BIT NULL ,
	[y_flagBadModelFlux] BIT NULL ,
	[y_flagBadInstFlux] BIT NULL ,
	[y_flagBadCentroid] BIT NULL ,
	[y_flagBadShape] BIT NULL 
	--PRIMARY KEY ([deepSourceId])
)
    WITH
    (
        DATA_SOURCE = SqlDataPool,
        DISTRIBUTION = ROUND_ROBIN
    );
GO
--CREATE INDEX [subChunkId] ON Object ([subChunkId]);

--select count(*) from [Object]
--78754603 lines of csv

--select top 800 * from Object
--select top 10 * from [Object] order by ra desc
--select count(chunkID) from [Object]
--select avg(ra) from [Object]
--select count(distinct deepSourceId) from [Object]
--select distinct chunkID from [Object]
--select * from object where deepSourceId = 2567518564647597

--truncate table Object

--create STATISTICS foo on OBJECT (deepSourceId, chunkId) with fullscan