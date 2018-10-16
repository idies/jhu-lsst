--======================
-- mssql create table scripts for lsst tables
-- converted from mysql to mssql
-- added chunkid to Source table (doesn't exist in lsst's schema)
-- suz werner 10/2018



drop table if exists ForcedSource;

CREATE TABLE ForcedSource (
	[deepSourceId] BIGINT NOT NULL,
	[scienceCcdExposureId] BIGINT NOT NULL,
	[psfFlux] FLOAT NULL DEFAULT NULL,
	[psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[flagBadMeasCentroid] BIT NOT NULL,
	[flagPixEdge] BIT NOT NULL,
	[flagPixInterpAny] BIT NOT NULL,
	[flagPixInterpCen] BIT NOT NULL,
	[flagPixSaturAny] BIT NOT NULL,
	[flagPixSaturCen] BIT NOT NULL,
	[flagBadPsfFlux] BIT NOT NULL,
	[chunkId] INT NOT NULL,
	[subChunkId] INT NOT NULL,
	--PRIMARY KEY ([deepSourceId], [scienceCcdExposureId])
)
;

drop table if exists Object;
CREATE TABLE Object (
	[deepSourceId] BIGINT NOT NULL,
	[ra] FLOAT NOT NULL,
	[decl] FLOAT NOT NULL,
	[raVar] FLOAT NULL DEFAULT NULL,
	[declVar] FLOAT NULL DEFAULT NULL,
	[radeclCov] FLOAT NULL DEFAULT NULL,
	[chunkId] INT NOT NULL,
	[subChunkId] INT NOT NULL,
	[u_psfFlux] FLOAT NULL DEFAULT NULL,
	[u_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_apFlux] FLOAT NULL DEFAULT NULL,
	[u_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_modelFlux] FLOAT NULL DEFAULT NULL,
	[u_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_instFlux] FLOAT NULL DEFAULT NULL,
	[u_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_apCorrection] FLOAT NULL DEFAULT NULL,
	[u_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[u_shapeIx] FLOAT NULL DEFAULT NULL,
	[u_shapeIy] FLOAT NULL DEFAULT NULL,
	[u_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[u_shapeIxx] FLOAT NULL DEFAULT NULL,
	[u_shapeIyy] FLOAT NULL DEFAULT NULL,
	[u_shapeIxy] FLOAT NULL DEFAULT NULL,
	[u_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[u_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[u_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[u_extendedness] FLOAT NULL DEFAULT NULL,
	[u_flagNegative] BIT NULL DEFAULT NULL,
	[u_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[u_flagPixEdge] BIT NULL DEFAULT NULL,
	[u_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[u_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[u_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[u_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[u_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[u_flagBadApFlux] BIT NULL DEFAULT NULL,
	[u_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[u_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[u_flagBadCentroid] BIT NULL DEFAULT NULL,
	[u_flagBadShape] BIT NULL DEFAULT NULL,
	[g_psfFlux] FLOAT NULL DEFAULT NULL,
	[g_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_apFlux] FLOAT NULL DEFAULT NULL,
	[g_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_modelFlux] FLOAT NULL DEFAULT NULL,
	[g_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_instFlux] FLOAT NULL DEFAULT NULL,
	[g_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_apCorrection] FLOAT NULL DEFAULT NULL,
	[g_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[g_shapeIx] FLOAT NULL DEFAULT NULL,
	[g_shapeIy] FLOAT NULL DEFAULT NULL,
	[g_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[g_shapeIxx] FLOAT NULL DEFAULT NULL,
	[g_shapeIyy] FLOAT NULL DEFAULT NULL,
	[g_shapeIxy] FLOAT NULL DEFAULT NULL,
	[g_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[g_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[g_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[g_extendedness] FLOAT NULL DEFAULT NULL,
	[g_flagNegative] BIT NULL DEFAULT NULL,
	[g_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[g_flagPixEdge] BIT NULL DEFAULT NULL,
	[g_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[g_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[g_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[g_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[g_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[g_flagBadApFlux] BIT NULL DEFAULT NULL,
	[g_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[g_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[g_flagBadCentroid] BIT NULL DEFAULT NULL,
	[g_flagBadShape] BIT NULL DEFAULT NULL,
	[r_psfFlux] FLOAT NULL DEFAULT NULL,
	[r_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_apFlux] FLOAT NULL DEFAULT NULL,
	[r_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_modelFlux] FLOAT NULL DEFAULT NULL,
	[r_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_instFlux] FLOAT NULL DEFAULT NULL,
	[r_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_apCorrection] FLOAT NULL DEFAULT NULL,
	[r_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[r_shapeIx] FLOAT NULL DEFAULT NULL,
	[r_shapeIy] FLOAT NULL DEFAULT NULL,
	[r_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[r_shapeIxx] FLOAT NULL DEFAULT NULL,
	[r_shapeIyy] FLOAT NULL DEFAULT NULL,
	[r_shapeIxy] FLOAT NULL DEFAULT NULL,
	[r_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[r_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[r_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[r_extendedness] FLOAT NULL DEFAULT NULL,
	[r_flagNegative] BIT NULL DEFAULT NULL,
	[r_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[r_flagPixEdge] BIT NULL DEFAULT NULL,
	[r_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[r_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[r_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[r_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[r_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[r_flagBadApFlux] BIT NULL DEFAULT NULL,
	[r_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[r_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[r_flagBadCentroid] BIT NULL DEFAULT NULL,
	[r_flagBadShape] BIT NULL DEFAULT NULL,
	[i_psfFlux] FLOAT NULL DEFAULT NULL,
	[i_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_apFlux] FLOAT NULL DEFAULT NULL,
	[i_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_modelFlux] FLOAT NULL DEFAULT NULL,
	[i_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_instFlux] FLOAT NULL DEFAULT NULL,
	[i_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_apCorrection] FLOAT NULL DEFAULT NULL,
	[i_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[i_shapeIx] FLOAT NULL DEFAULT NULL,
	[i_shapeIy] FLOAT NULL DEFAULT NULL,
	[i_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[i_shapeIxx] FLOAT NULL DEFAULT NULL,
	[i_shapeIyy] FLOAT NULL DEFAULT NULL,
	[i_shapeIxy] FLOAT NULL DEFAULT NULL,
	[i_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[i_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[i_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[i_extendedness] FLOAT NULL DEFAULT NULL,
	[i_flagNegative] BIT NULL DEFAULT NULL,
	[i_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[i_flagPixEdge] BIT NULL DEFAULT NULL,
	[i_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[i_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[i_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[i_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[i_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[i_flagBadApFlux] BIT NULL DEFAULT NULL,
	[i_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[i_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[i_flagBadCentroid] BIT NULL DEFAULT NULL,
	[i_flagBadShape] BIT NULL DEFAULT NULL,
	[z_psfFlux] FLOAT NULL DEFAULT NULL,
	[z_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_apFlux] FLOAT NULL DEFAULT NULL,
	[z_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_modelFlux] FLOAT NULL DEFAULT NULL,
	[z_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_instFlux] FLOAT NULL DEFAULT NULL,
	[z_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_apCorrection] FLOAT NULL DEFAULT NULL,
	[z_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[z_shapeIx] FLOAT NULL DEFAULT NULL,
	[z_shapeIy] FLOAT NULL DEFAULT NULL,
	[z_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[z_shapeIxx] FLOAT NULL DEFAULT NULL,
	[z_shapeIyy] FLOAT NULL DEFAULT NULL,
	[z_shapeIxy] FLOAT NULL DEFAULT NULL,
	[z_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[z_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[z_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[z_extendedness] FLOAT NULL DEFAULT NULL,
	[z_flagNegative] BIT NULL DEFAULT NULL,
	[z_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[z_flagPixEdge] BIT NULL DEFAULT NULL,
	[z_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[z_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[z_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[z_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[z_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[z_flagBadApFlux] BIT NULL DEFAULT NULL,
	[z_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[z_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[z_flagBadCentroid] BIT NULL DEFAULT NULL,
	[z_flagBadShape] BIT NULL DEFAULT NULL,
	[y_psfFlux] FLOAT NULL DEFAULT NULL,
	[y_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_apFlux] FLOAT NULL DEFAULT NULL,
	[y_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_modelFlux] FLOAT NULL DEFAULT NULL,
	[y_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_instFlux] FLOAT NULL DEFAULT NULL,
	[y_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_apCorrection] FLOAT NULL DEFAULT NULL,
	[y_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[y_shapeIx] FLOAT NULL DEFAULT NULL,
	[y_shapeIy] FLOAT NULL DEFAULT NULL,
	[y_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[y_shapeIxx] FLOAT NULL DEFAULT NULL,
	[y_shapeIyy] FLOAT NULL DEFAULT NULL,
	[y_shapeIxy] FLOAT NULL DEFAULT NULL,
	[y_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[y_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[y_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[y_extendedness] FLOAT NULL DEFAULT NULL,
	[y_flagNegative] BIT NULL DEFAULT NULL,
	[y_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[y_flagPixEdge] BIT NULL DEFAULT NULL,
	[y_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[y_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[y_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[y_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[y_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[y_flagBadApFlux] BIT NULL DEFAULT NULL,
	[y_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[y_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[y_flagBadCentroid] BIT NULL DEFAULT NULL,
	[y_flagBadShape] BIT NULL DEFAULT NULL,
	PRIMARY KEY ([deepSourceId])
)
;

--CREATE INDEX [subChunkId] ON Object ([subChunkId]);



--==================================================
drop table if exists ObjectFullOverlap;

CREATE TABLE ObjectFullOverlap (
	[deepSourceId] BIGINT NOT NULL,
	[ra] FLOAT NOT NULL,
	[decl] FLOAT NOT NULL,
	[raVar] FLOAT NULL DEFAULT NULL,
	[declVar] FLOAT NULL DEFAULT NULL,
	[radeclCov] FLOAT NULL DEFAULT NULL,
	[chunkId] INT NOT NULL,
	[subChunkId] INT NOT NULL,
	[u_psfFlux] FLOAT NULL DEFAULT NULL,
	[u_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_apFlux] FLOAT NULL DEFAULT NULL,
	[u_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_modelFlux] FLOAT NULL DEFAULT NULL,
	[u_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_instFlux] FLOAT NULL DEFAULT NULL,
	[u_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[u_apCorrection] FLOAT NULL DEFAULT NULL,
	[u_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[u_shapeIx] FLOAT NULL DEFAULT NULL,
	[u_shapeIy] FLOAT NULL DEFAULT NULL,
	[u_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[u_shapeIxx] FLOAT NULL DEFAULT NULL,
	[u_shapeIyy] FLOAT NULL DEFAULT NULL,
	[u_shapeIxy] FLOAT NULL DEFAULT NULL,
	[u_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[u_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[u_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[u_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[u_extendedness] FLOAT NULL DEFAULT NULL,
	[u_flagNegative] BIT NULL DEFAULT NULL,
	[u_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[u_flagPixEdge] BIT NULL DEFAULT NULL,
	[u_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[u_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[u_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[u_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[u_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[u_flagBadApFlux] BIT NULL DEFAULT NULL,
	[u_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[u_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[u_flagBadCentroid] BIT NULL DEFAULT NULL,
	[u_flagBadShape] BIT NULL DEFAULT NULL,
	[g_psfFlux] FLOAT NULL DEFAULT NULL,
	[g_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_apFlux] FLOAT NULL DEFAULT NULL,
	[g_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_modelFlux] FLOAT NULL DEFAULT NULL,
	[g_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_instFlux] FLOAT NULL DEFAULT NULL,
	[g_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[g_apCorrection] FLOAT NULL DEFAULT NULL,
	[g_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[g_shapeIx] FLOAT NULL DEFAULT NULL,
	[g_shapeIy] FLOAT NULL DEFAULT NULL,
	[g_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[g_shapeIxx] FLOAT NULL DEFAULT NULL,
	[g_shapeIyy] FLOAT NULL DEFAULT NULL,
	[g_shapeIxy] FLOAT NULL DEFAULT NULL,
	[g_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[g_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[g_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[g_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[g_extendedness] FLOAT NULL DEFAULT NULL,
	[g_flagNegative] BIT NULL DEFAULT NULL,
	[g_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[g_flagPixEdge] BIT NULL DEFAULT NULL,
	[g_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[g_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[g_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[g_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[g_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[g_flagBadApFlux] BIT NULL DEFAULT NULL,
	[g_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[g_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[g_flagBadCentroid] BIT NULL DEFAULT NULL,
	[g_flagBadShape] BIT NULL DEFAULT NULL,
	[r_psfFlux] FLOAT NULL DEFAULT NULL,
	[r_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_apFlux] FLOAT NULL DEFAULT NULL,
	[r_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_modelFlux] FLOAT NULL DEFAULT NULL,
	[r_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_instFlux] FLOAT NULL DEFAULT NULL,
	[r_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[r_apCorrection] FLOAT NULL DEFAULT NULL,
	[r_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[r_shapeIx] FLOAT NULL DEFAULT NULL,
	[r_shapeIy] FLOAT NULL DEFAULT NULL,
	[r_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[r_shapeIxx] FLOAT NULL DEFAULT NULL,
	[r_shapeIyy] FLOAT NULL DEFAULT NULL,
	[r_shapeIxy] FLOAT NULL DEFAULT NULL,
	[r_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[r_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[r_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[r_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[r_extendedness] FLOAT NULL DEFAULT NULL,
	[r_flagNegative] BIT NULL DEFAULT NULL,
	[r_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[r_flagPixEdge] BIT NULL DEFAULT NULL,
	[r_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[r_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[r_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[r_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[r_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[r_flagBadApFlux] BIT NULL DEFAULT NULL,
	[r_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[r_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[r_flagBadCentroid] BIT NULL DEFAULT NULL,
	[r_flagBadShape] BIT NULL DEFAULT NULL,
	[i_psfFlux] FLOAT NULL DEFAULT NULL,
	[i_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_apFlux] FLOAT NULL DEFAULT NULL,
	[i_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_modelFlux] FLOAT NULL DEFAULT NULL,
	[i_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_instFlux] FLOAT NULL DEFAULT NULL,
	[i_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[i_apCorrection] FLOAT NULL DEFAULT NULL,
	[i_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[i_shapeIx] FLOAT NULL DEFAULT NULL,
	[i_shapeIy] FLOAT NULL DEFAULT NULL,
	[i_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[i_shapeIxx] FLOAT NULL DEFAULT NULL,
	[i_shapeIyy] FLOAT NULL DEFAULT NULL,
	[i_shapeIxy] FLOAT NULL DEFAULT NULL,
	[i_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[i_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[i_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[i_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[i_extendedness] FLOAT NULL DEFAULT NULL,
	[i_flagNegative] BIT NULL DEFAULT NULL,
	[i_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[i_flagPixEdge] BIT NULL DEFAULT NULL,
	[i_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[i_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[i_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[i_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[i_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[i_flagBadApFlux] BIT NULL DEFAULT NULL,
	[i_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[i_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[i_flagBadCentroid] BIT NULL DEFAULT NULL,
	[i_flagBadShape] BIT NULL DEFAULT NULL,
	[z_psfFlux] FLOAT NULL DEFAULT NULL,
	[z_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_apFlux] FLOAT NULL DEFAULT NULL,
	[z_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_modelFlux] FLOAT NULL DEFAULT NULL,
	[z_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_instFlux] FLOAT NULL DEFAULT NULL,
	[z_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[z_apCorrection] FLOAT NULL DEFAULT NULL,
	[z_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[z_shapeIx] FLOAT NULL DEFAULT NULL,
	[z_shapeIy] FLOAT NULL DEFAULT NULL,
	[z_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[z_shapeIxx] FLOAT NULL DEFAULT NULL,
	[z_shapeIyy] FLOAT NULL DEFAULT NULL,
	[z_shapeIxy] FLOAT NULL DEFAULT NULL,
	[z_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[z_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[z_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[z_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[z_extendedness] FLOAT NULL DEFAULT NULL,
	[z_flagNegative] BIT NULL DEFAULT NULL,
	[z_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[z_flagPixEdge] BIT NULL DEFAULT NULL,
	[z_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[z_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[z_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[z_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[z_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[z_flagBadApFlux] BIT NULL DEFAULT NULL,
	[z_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[z_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[z_flagBadCentroid] BIT NULL DEFAULT NULL,
	[z_flagBadShape] BIT NULL DEFAULT NULL,
	[y_psfFlux] FLOAT NULL DEFAULT NULL,
	[y_psfFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_apFlux] FLOAT NULL DEFAULT NULL,
	[y_apFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_modelFlux] FLOAT NULL DEFAULT NULL,
	[y_modelFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_instFlux] FLOAT NULL DEFAULT NULL,
	[y_instFluxSigma] FLOAT NULL DEFAULT NULL,
	[y_apCorrection] FLOAT NULL DEFAULT NULL,
	[y_apCorrectionSigma] FLOAT NULL DEFAULT NULL,
	[y_shapeIx] FLOAT NULL DEFAULT NULL,
	[y_shapeIy] FLOAT NULL DEFAULT NULL,
	[y_shapeIxVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIyVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIxIyCov] FLOAT NULL DEFAULT NULL,
	[y_shapeIxx] FLOAT NULL DEFAULT NULL,
	[y_shapeIyy] FLOAT NULL DEFAULT NULL,
	[y_shapeIxy] FLOAT NULL DEFAULT NULL,
	[y_shapeIxxVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIyyVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIxyVar] FLOAT NULL DEFAULT NULL,
	[y_shapeIxxIyyCov] FLOAT NULL DEFAULT NULL,
	[y_shapeIxxIxyCov] FLOAT NULL DEFAULT NULL,
	[y_shapeIyyIxyCov] FLOAT NULL DEFAULT NULL,
	[y_extendedness] FLOAT NULL DEFAULT NULL,
	[y_flagNegative] BIT NULL DEFAULT NULL,
	[y_flagBadMeasCentroid] BIT NULL DEFAULT NULL,
	[y_flagPixEdge] BIT NULL DEFAULT NULL,
	[y_flagPixInterpAny] BIT NULL DEFAULT NULL,
	[y_flagPixInterpCen] BIT NULL DEFAULT NULL,
	[y_flagPixSaturAny] BIT NULL DEFAULT NULL,
	[y_flagPixSaturCen] BIT NULL DEFAULT NULL,
	[y_flagBadPsfFlux] BIT NULL DEFAULT NULL,
	[y_flagBadApFlux] BIT NULL DEFAULT NULL,
	[y_flagBadModelFlux] BIT NULL DEFAULT NULL,
	[y_flagBadInstFlux] BIT NULL DEFAULT NULL,
	[y_flagBadCentroid] BIT NULL DEFAULT NULL,
	[y_flagBadShape] BIT NULL DEFAULT NULL
)
;

--CREATE INDEX [subChunkId] ON ObjectFullOverlap ([subChunkId]);
--CREATE INDEX [deepSourceId] ON ObjectFullOverlap ([deepSourceId]);

;


--===========================================================
drop table if exists [Source];

CREATE TABLE [Source] (
	[id] BIGINT NOT NULL,
	[chunkid] int not null, --added this as per gerard's suggestion
	[coord_ra] FLOAT NULL DEFAULT NULL,
	[coord_decl] FLOAT NULL DEFAULT NULL,
	[coord_htmId20] BIGINT NULL DEFAULT NULL,
	[parent] BIGINT NULL DEFAULT NULL,
	[flags_badcentroid] BIT NOT NULL,
	[centroid_sdss_x] FLOAT NULL DEFAULT NULL,
	[centroid_sdss_y] FLOAT NULL DEFAULT NULL,
	[centroid_sdss_xVar] FLOAT NULL DEFAULT NULL,
	[centroid_sdss_xyCov] FLOAT NULL DEFAULT NULL,
	[centroid_sdss_yVar] FLOAT NULL DEFAULT NULL,
	[centroid_sdss_flags] BIT NOT NULL,
	[flags_pixel_edge] BIT NOT NULL,
	[flags_pixel_interpolated_any] BIT NOT NULL,
	[flags_pixel_interpolated_center] BIT NOT NULL,
	[flags_pixel_saturated_any] BIT NOT NULL,
	[flags_pixel_saturated_center] BIT NOT NULL,
	[flags_pixel_cr_any] BIT NOT NULL,
	[flags_pixel_cr_center] BIT NOT NULL,
	[centroid_naive_x] FLOAT NULL DEFAULT NULL,
	[centroid_naive_y] FLOAT NULL DEFAULT NULL,
	[centroid_naive_xVar] FLOAT NULL DEFAULT NULL,
	[centroid_naive_xyCov] FLOAT NULL DEFAULT NULL,
	[centroid_naive_yVar] FLOAT NULL DEFAULT NULL,
	[centroid_naive_flags] BIT NOT NULL,
	[centroid_gaussian_x] FLOAT NULL DEFAULT NULL,
	[centroid_gaussian_y] FLOAT NULL DEFAULT NULL,
	[centroid_gaussian_xVar] FLOAT NULL DEFAULT NULL,
	[centroid_gaussian_xyCov] FLOAT NULL DEFAULT NULL,
	[centroid_gaussian_yVar] FLOAT NULL DEFAULT NULL,
	[centroid_gaussian_flags] BIT NOT NULL,
	[shape_sdss_Ixx] FLOAT NULL DEFAULT NULL,
	[shape_sdss_Iyy] FLOAT NULL DEFAULT NULL,
	[shape_sdss_Ixy] FLOAT NULL DEFAULT NULL,
	[shape_sdss_IxxVar] FLOAT NULL DEFAULT NULL,
	[shape_sdss_IxxIyyCov] FLOAT NULL DEFAULT NULL,
	[shape_sdss_IxxIxyCov] FLOAT NULL DEFAULT NULL,
	[shape_sdss_IyyVar] FLOAT NULL DEFAULT NULL,
	[shape_sdss_IyyIxyCov] FLOAT NULL DEFAULT NULL,
	[shape_sdss_IxyVar] FLOAT NULL DEFAULT NULL,
	[shape_sdss_flags] BIT NOT NULL,
	[shape_sdss_centroid_x] FLOAT NULL DEFAULT NULL,
	[shape_sdss_centroid_y] FLOAT NULL DEFAULT NULL,
	[shape_sdss_centroid_xVar] FLOAT NULL DEFAULT NULL,
	[shape_sdss_centroid_xyCov] FLOAT NULL DEFAULT NULL,
	[shape_sdss_centroid_yVar] FLOAT NULL DEFAULT NULL,
	[shape_sdss_centroid_flags] BIT NOT NULL,
	[shape_sdss_flags_unweightedbad] BIT NOT NULL,
	[shape_sdss_flags_unweighted] BIT NOT NULL,
	[shape_sdss_flags_shift] BIT NOT NULL,
	[shape_sdss_flags_maxiter] BIT NOT NULL,
	[flux_psf] FLOAT NULL DEFAULT NULL,
	[flux_psf_err] FLOAT NULL DEFAULT NULL,
	[flux_psf_flags] BIT NOT NULL,
	[flux_psf_psffactor] FLOAT NULL DEFAULT NULL,
	[flux_psf_flags_psffactor] BIT NOT NULL,
	[flux_psf_flags_badcorr] BIT NOT NULL,
	[flux_naive] FLOAT NULL DEFAULT NULL,
	[flux_naive_err] FLOAT NULL DEFAULT NULL,
	[flux_naive_flags] BIT NOT NULL,
	[flux_gaussian] FLOAT NULL DEFAULT NULL,
	[flux_gaussian_err] FLOAT NULL DEFAULT NULL,
	[flux_gaussian_flags] BIT NOT NULL,
	[flux_gaussian_psffactor] FLOAT NULL DEFAULT NULL,
	[flux_gaussian_flags_psffactor] BIT NOT NULL,
	[flux_gaussian_flags_badcorr] BIT NOT NULL,
	[flux_sinc] FLOAT NULL DEFAULT NULL,
	[flux_sinc_err] FLOAT NULL DEFAULT NULL,
	[flux_sinc_flags] BIT NOT NULL,
	[centroid_record_x] FLOAT NULL DEFAULT NULL,
	[centroid_record_y] FLOAT NULL DEFAULT NULL,
	[classification_extendedness] FLOAT NULL DEFAULT NULL,
	[aperturecorrection] FLOAT NULL DEFAULT NULL,
	[aperturecorrection_err] FLOAT NULL DEFAULT NULL,
	[refFlux] FLOAT NULL DEFAULT NULL,
	[refFlux_err] FLOAT NULL DEFAULT NULL,
	[objectId] BIGINT NOT NULL,
	[coord_raVar] FLOAT NULL DEFAULT NULL,
	[coord_radeclCov] FLOAT NULL DEFAULT NULL,
	[coord_declVar] FLOAT NULL DEFAULT NULL,
	[exposure_id] BIGINT NOT NULL,
	[exposure_filter_id] INT NOT NULL,
	[exposure_time] FLOAT NULL DEFAULT NULL,
	[exposure_time_mid] FLOAT NULL DEFAULT NULL,
	[cluster_id] BIGINT NULL DEFAULT NULL,
	[cluster_coord_ra] FLOAT NULL DEFAULT NULL,
	[cluster_coord_decl] FLOAT NULL DEFAULT NULL,
	--PRIMARY KEY ([id])
)

--CREATE INDEX [IDX_parent] ON Source ([parent]);
--CREATE INDEX [IDX_exposure_id] ON Source ([exposure_id]);
--CREATE INDEX [objectId] ON Source ([objectId]);



