USE LSST
GO

-- MySQL dump 10.16  Distrib 10.2.8-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: LSST20
-- ------------------------------------------------------
-- Server version	10.2.8-MariaDB-10.2.8+maria~jessie

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table ForcedSourceFullOverlap_1025
--

--DROP TABLE IF EXISTS ForcedSourceFullOverlap_1025;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
----------------------------------------
IF OBJECT_ID(N'ForcedSourceFullOverlap_1025', N'U') IS NOT NULL
    DROP TABLE ForcedSourceFullOverlap_1025;
GO
--
CREATE TABLE ForcedSourceFullOverlap_1025 (
  deepSourceId bigint NOT NULL,
  scienceCcdExposureId bigint NOT NULL,
  psfFlux real DEFAULT NULL,
  psfFluxSigma real DEFAULT NULL,
  flagBadMeasCentroid bit NOT NULL,
  flagPixEdge bit NOT NULL,
  flagPixInterpAny bit NOT NULL,
  flagPixInterpCen bit NOT NULL,
  flagPixSaturAny bit NOT NULL,
  flagPixSaturCen bit NOT NULL,
  flagBadPsfFlux bit NOT NULL,
  chunkId int NOT NULL,
  subChunkId int NOT NULL   --,
  --KEY PRIMARY_NON_UNIQUE (deepSourceId,scienceCcdExposureId)
) 
GO
--
CREATE CLUSTERED INDEX idx_fcdsrcflolap_1025_dscid_scicexpid on ForcedSourceFullOverlap_1025(deepSourceId,scienceCcdExposureId)
GO


/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table ForcedSource_1025
--

--DROP TABLE IF EXISTS ForcedSource_1025;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

IF OBJECT_ID(N'ForcedSource_1025', N'U') IS NOT NULL
    DROP TABLE ForcedSource_1025;
GO
--
CREATE TABLE ForcedSource_1025 (
  deepSourceId bigint NOT NULL,
  scienceCcdExposureId bigint NOT NULL,
  psfFlux real DEFAULT NULL,
  psfFluxSigma real DEFAULT NULL,
  flagBadMeasCentroid bit NOT NULL,
  flagPixEdge bit NOT NULL,
  flagPixInterpAny bit NOT NULL,
  flagPixInterpCen bit NOT NULL,
  flagPixSaturAny bit NOT NULL,
  flagPixSaturCen bit NOT NULL,
  flagBadPsfFlux bit NOT NULL,
  chunkId int NOT NULL,
  subChunkId int NOT NULL,
  PRIMARY KEY (deepSourceId,scienceCcdExposureId)
) 
GO


/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table ObjectFullOverlap_1025
--

--DROP TABLE IF EXISTS ObjectFullOverlap_1025;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

IF OBJECT_ID(N'ObjectFullOverlap_1025', N'U') IS NOT NULL
    DROP TABLE ObjectFullOverlap_1025;
GO
--
CREATE TABLE ObjectFullOverlap_1025 (
  deepSourceId bigint NOT NULL,
  ra float NOT NULL,
  decl float NOT NULL,
  raVar float DEFAULT NULL,
  declVar float DEFAULT NULL,
  radeclCov float DEFAULT NULL,
  chunkId int NOT NULL,
  subChunkId int NOT NULL,
  u_psfFlux float DEFAULT NULL,
  u_psfFluxSigma float DEFAULT NULL,
  u_apFlux float DEFAULT NULL,
  u_apFluxSigma float DEFAULT NULL,
  u_modelFlux float DEFAULT NULL,
  u_modelFluxSigma float DEFAULT NULL,
  u_instFlux float DEFAULT NULL,
  u_instFluxSigma float DEFAULT NULL,
  u_apCorrection float DEFAULT NULL,
  u_apCorrectionSigma float DEFAULT NULL,
  u_shapeIx float DEFAULT NULL,
  u_shapeIy float DEFAULT NULL,
  u_shapeIxVar float DEFAULT NULL,
  u_shapeIyVar float DEFAULT NULL,
  u_shapeIxIyCov float DEFAULT NULL,
  u_shapeIxx float DEFAULT NULL,
  u_shapeIyy float DEFAULT NULL,
  u_shapeIxy float DEFAULT NULL,
  u_shapeIxxVar float DEFAULT NULL,
  u_shapeIyyVar float DEFAULT NULL,
  u_shapeIxyVar float DEFAULT NULL,
  u_shapeIxxIyyCov float DEFAULT NULL,
  u_shapeIxxIxyCov float DEFAULT NULL,
  u_shapeIyyIxyCov float DEFAULT NULL,
  u_extendedness float DEFAULT NULL,
  u_flagNegative bit DEFAULT NULL,
  u_flagBadMeasCentroid bit DEFAULT NULL,
  u_flagPixEdge bit DEFAULT NULL,
  u_flagPixInterpAny bit DEFAULT NULL,
  u_flagPixInterpCen bit DEFAULT NULL,
  u_flagPixSaturAny bit DEFAULT NULL,
  u_flagPixSaturCen bit DEFAULT NULL,
  u_flagBadPsfFlux bit DEFAULT NULL,
  u_flagBadApFlux bit DEFAULT NULL,
  u_flagBadModelFlux bit DEFAULT NULL,
  u_flagBadInstFlux bit DEFAULT NULL,
  u_flagBadCentroid bit DEFAULT NULL,
  u_flagBadShape bit DEFAULT NULL,
  g_psfFlux float DEFAULT NULL,
  g_psfFluxSigma float DEFAULT NULL,
  g_apFlux float DEFAULT NULL,
  g_apFluxSigma float DEFAULT NULL,
  g_modelFlux float DEFAULT NULL,
  g_modelFluxSigma float DEFAULT NULL,
  g_instFlux float DEFAULT NULL,
  g_instFluxSigma float DEFAULT NULL,
  g_apCorrection float DEFAULT NULL,
  g_apCorrectionSigma float DEFAULT NULL,
  g_shapeIx float DEFAULT NULL,
  g_shapeIy float DEFAULT NULL,
  g_shapeIxVar float DEFAULT NULL,
  g_shapeIyVar float DEFAULT NULL,
  g_shapeIxIyCov float DEFAULT NULL,
  g_shapeIxx float DEFAULT NULL,
  g_shapeIyy float DEFAULT NULL,
  g_shapeIxy float DEFAULT NULL,
  g_shapeIxxVar float DEFAULT NULL,
  g_shapeIyyVar float DEFAULT NULL,
  g_shapeIxyVar float DEFAULT NULL,
  g_shapeIxxIyyCov float DEFAULT NULL,
  g_shapeIxxIxyCov float DEFAULT NULL,
  g_shapeIyyIxyCov float DEFAULT NULL,
  g_extendedness float DEFAULT NULL,
  g_flagNegative bit DEFAULT NULL,
  g_flagBadMeasCentroid bit DEFAULT NULL,
  g_flagPixEdge bit DEFAULT NULL,
  g_flagPixInterpAny bit DEFAULT NULL,
  g_flagPixInterpCen bit DEFAULT NULL,
  g_flagPixSaturAny bit DEFAULT NULL,
  g_flagPixSaturCen bit DEFAULT NULL,
  g_flagBadPsfFlux bit DEFAULT NULL,
  g_flagBadApFlux bit DEFAULT NULL,
  g_flagBadModelFlux bit DEFAULT NULL,
  g_flagBadInstFlux bit DEFAULT NULL,
  g_flagBadCentroid bit DEFAULT NULL,
  g_flagBadShape bit DEFAULT NULL,
  r_psfFlux float DEFAULT NULL,
  r_psfFluxSigma float DEFAULT NULL,
  r_apFlux float DEFAULT NULL,
  r_apFluxSigma float DEFAULT NULL,
  r_modelFlux float DEFAULT NULL,
  r_modelFluxSigma float DEFAULT NULL,
  r_instFlux float DEFAULT NULL,
  r_instFluxSigma float DEFAULT NULL,
  r_apCorrection float DEFAULT NULL,
  r_apCorrectionSigma float DEFAULT NULL,
  r_shapeIx float DEFAULT NULL,
  r_shapeIy float DEFAULT NULL,
  r_shapeIxVar float DEFAULT NULL,
  r_shapeIyVar float DEFAULT NULL,
  r_shapeIxIyCov float DEFAULT NULL,
  r_shapeIxx float DEFAULT NULL,
  r_shapeIyy float DEFAULT NULL,
  r_shapeIxy float DEFAULT NULL,
  r_shapeIxxVar float DEFAULT NULL,
  r_shapeIyyVar float DEFAULT NULL,
  r_shapeIxyVar float DEFAULT NULL,
  r_shapeIxxIyyCov float DEFAULT NULL,
  r_shapeIxxIxyCov float DEFAULT NULL,
  r_shapeIyyIxyCov float DEFAULT NULL,
  r_extendedness float DEFAULT NULL,
  r_flagNegative bit DEFAULT NULL,
  r_flagBadMeasCentroid bit DEFAULT NULL,
  r_flagPixEdge bit DEFAULT NULL,
  r_flagPixInterpAny bit DEFAULT NULL,
  r_flagPixInterpCen bit DEFAULT NULL,
  r_flagPixSaturAny bit DEFAULT NULL,
  r_flagPixSaturCen bit DEFAULT NULL,
  r_flagBadPsfFlux bit DEFAULT NULL,
  r_flagBadApFlux bit DEFAULT NULL,
  r_flagBadModelFlux bit DEFAULT NULL,
  r_flagBadInstFlux bit DEFAULT NULL,
  r_flagBadCentroid bit DEFAULT NULL,
  r_flagBadShape bit DEFAULT NULL,
  i_psfFlux float DEFAULT NULL,
  i_psfFluxSigma float DEFAULT NULL,
  i_apFlux float DEFAULT NULL,
  i_apFluxSigma float DEFAULT NULL,
  i_modelFlux float DEFAULT NULL,
  i_modelFluxSigma float DEFAULT NULL,
  i_instFlux float DEFAULT NULL,
  i_instFluxSigma float DEFAULT NULL,
  i_apCorrection float DEFAULT NULL,
  i_apCorrectionSigma float DEFAULT NULL,
  i_shapeIx float DEFAULT NULL,
  i_shapeIy float DEFAULT NULL,
  i_shapeIxVar float DEFAULT NULL,
  i_shapeIyVar float DEFAULT NULL,
  i_shapeIxIyCov float DEFAULT NULL,
  i_shapeIxx float DEFAULT NULL,
  i_shapeIyy float DEFAULT NULL,
  i_shapeIxy float DEFAULT NULL,
  i_shapeIxxVar float DEFAULT NULL,
  i_shapeIyyVar float DEFAULT NULL,
  i_shapeIxyVar float DEFAULT NULL,
  i_shapeIxxIyyCov float DEFAULT NULL,
  i_shapeIxxIxyCov float DEFAULT NULL,
  i_shapeIyyIxyCov float DEFAULT NULL,
  i_extendedness float DEFAULT NULL,
  i_flagNegative bit DEFAULT NULL,
  i_flagBadMeasCentroid bit DEFAULT NULL,
  i_flagPixEdge bit DEFAULT NULL,
  i_flagPixInterpAny bit DEFAULT NULL,
  i_flagPixInterpCen bit DEFAULT NULL,
  i_flagPixSaturAny bit DEFAULT NULL,
  i_flagPixSaturCen bit DEFAULT NULL,
  i_flagBadPsfFlux bit DEFAULT NULL,
  i_flagBadApFlux bit DEFAULT NULL,
  i_flagBadModelFlux bit DEFAULT NULL,
  i_flagBadInstFlux bit DEFAULT NULL,
  i_flagBadCentroid bit DEFAULT NULL,
  i_flagBadShape bit DEFAULT NULL,
  z_psfFlux float DEFAULT NULL,
  z_psfFluxSigma float DEFAULT NULL,
  z_apFlux float DEFAULT NULL,
  z_apFluxSigma float DEFAULT NULL,
  z_modelFlux float DEFAULT NULL,
  z_modelFluxSigma float DEFAULT NULL,
  z_instFlux float DEFAULT NULL,
  z_instFluxSigma float DEFAULT NULL,
  z_apCorrection float DEFAULT NULL,
  z_apCorrectionSigma float DEFAULT NULL,
  z_shapeIx float DEFAULT NULL,
  z_shapeIy float DEFAULT NULL,
  z_shapeIxVar float DEFAULT NULL,
  z_shapeIyVar float DEFAULT NULL,
  z_shapeIxIyCov float DEFAULT NULL,
  z_shapeIxx float DEFAULT NULL,
  z_shapeIyy float DEFAULT NULL,
  z_shapeIxy float DEFAULT NULL,
  z_shapeIxxVar float DEFAULT NULL,
  z_shapeIyyVar float DEFAULT NULL,
  z_shapeIxyVar float DEFAULT NULL,
  z_shapeIxxIyyCov float DEFAULT NULL,
  z_shapeIxxIxyCov float DEFAULT NULL,
  z_shapeIyyIxyCov float DEFAULT NULL,
  z_extendedness float DEFAULT NULL,
  z_flagNegative bit DEFAULT NULL,
  z_flagBadMeasCentroid bit DEFAULT NULL,
  z_flagPixEdge bit DEFAULT NULL,
  z_flagPixInterpAny bit DEFAULT NULL,
  z_flagPixInterpCen bit DEFAULT NULL,
  z_flagPixSaturAny bit DEFAULT NULL,
  z_flagPixSaturCen bit DEFAULT NULL,
  z_flagBadPsfFlux bit DEFAULT NULL,
  z_flagBadApFlux bit DEFAULT NULL,
  z_flagBadModelFlux bit DEFAULT NULL,
  z_flagBadInstFlux bit DEFAULT NULL,
  z_flagBadCentroid bit DEFAULT NULL,
  z_flagBadShape bit DEFAULT NULL,
  y_psfFlux float DEFAULT NULL,
  y_psfFluxSigma float DEFAULT NULL,
  y_apFlux float DEFAULT NULL,
  y_apFluxSigma float DEFAULT NULL,
  y_modelFlux float DEFAULT NULL,
  y_modelFluxSigma float DEFAULT NULL,
  y_instFlux float DEFAULT NULL,
  y_instFluxSigma float DEFAULT NULL,
  y_apCorrection float DEFAULT NULL,
  y_apCorrectionSigma float DEFAULT NULL,
  y_shapeIx float DEFAULT NULL,
  y_shapeIy float DEFAULT NULL,
  y_shapeIxVar float DEFAULT NULL,
  y_shapeIyVar float DEFAULT NULL,
  y_shapeIxIyCov float DEFAULT NULL,
  y_shapeIxx float DEFAULT NULL,
  y_shapeIyy float DEFAULT NULL,
  y_shapeIxy float DEFAULT NULL,
  y_shapeIxxVar float DEFAULT NULL,
  y_shapeIyyVar float DEFAULT NULL,
  y_shapeIxyVar float DEFAULT NULL,
  y_shapeIxxIyyCov float DEFAULT NULL,
  y_shapeIxxIxyCov float DEFAULT NULL,
  y_shapeIyyIxyCov float DEFAULT NULL,
  y_extendedness float DEFAULT NULL,
  y_flagNegative bit DEFAULT NULL,
  y_flagBadMeasCentroid bit DEFAULT NULL,
  y_flagPixEdge bit DEFAULT NULL,
  y_flagPixInterpAny bit DEFAULT NULL,
  y_flagPixInterpCen bit DEFAULT NULL,
  y_flagPixSaturAny bit DEFAULT NULL,
  y_flagPixSaturCen bit DEFAULT NULL,
  y_flagBadPsfFlux bit DEFAULT NULL,
  y_flagBadApFlux bit DEFAULT NULL,
  y_flagBadModelFlux bit DEFAULT NULL,
  y_flagBadInstFlux bit DEFAULT NULL,
  y_flagBadCentroid bit DEFAULT NULL,
  y_flagBadShape bit DEFAULT NULL --,
--  KEY subChunkId (subChunkId),
--  KEY PRIMARY_NON_UNIQUE (deepSourceId)
) 
/*!40101 SET character_set_client = @saved_cs_client */;
GO

CREATE CLUSTERED INDEX idx_objflolap_1025_dpsrcid on ObjectFullOverlap_1025(deepSourceId)
GO
CREATE INDEX idx_objflolap_1025_subchkid on ObjectFullOverlap_1025(subChunkId)
GO

--
-- Table structure for table Object_1025
--

-- DROP TABLE IF EXISTS Object_1025;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

IF OBJECT_ID(N'Object_1025', N'U') IS NOT NULL
    DROP TABLE Object_1025;
GO
--
CREATE TABLE Object_1025 (
  deepSourceId bigint NOT NULL,
  ra float NOT NULL,
  decl float NOT NULL,
  raVar float DEFAULT NULL,
  declVar float DEFAULT NULL,
  radeclCov float DEFAULT NULL,
  chunkId int NOT NULL,
  subChunkId int NOT NULL,
  u_psfFlux float DEFAULT NULL,
  u_psfFluxSigma float DEFAULT NULL,
  u_apFlux float DEFAULT NULL,
  u_apFluxSigma float DEFAULT NULL,
  u_modelFlux float DEFAULT NULL,
  u_modelFluxSigma float DEFAULT NULL,
  u_instFlux float DEFAULT NULL,
  u_instFluxSigma float DEFAULT NULL,
  u_apCorrection float DEFAULT NULL,
  u_apCorrectionSigma float DEFAULT NULL,
  u_shapeIx float DEFAULT NULL,
  u_shapeIy float DEFAULT NULL,
  u_shapeIxVar float DEFAULT NULL,
  u_shapeIyVar float DEFAULT NULL,
  u_shapeIxIyCov float DEFAULT NULL,
  u_shapeIxx float DEFAULT NULL,
  u_shapeIyy float DEFAULT NULL,
  u_shapeIxy float DEFAULT NULL,
  u_shapeIxxVar float DEFAULT NULL,
  u_shapeIyyVar float DEFAULT NULL,
  u_shapeIxyVar float DEFAULT NULL,
  u_shapeIxxIyyCov float DEFAULT NULL,
  u_shapeIxxIxyCov float DEFAULT NULL,
  u_shapeIyyIxyCov float DEFAULT NULL,
  u_extendedness float DEFAULT NULL,
  u_flagNegative bit DEFAULT NULL,
  u_flagBadMeasCentroid bit DEFAULT NULL,
  u_flagPixEdge bit DEFAULT NULL,
  u_flagPixInterpAny bit DEFAULT NULL,
  u_flagPixInterpCen bit DEFAULT NULL,
  u_flagPixSaturAny bit DEFAULT NULL,
  u_flagPixSaturCen bit DEFAULT NULL,
  u_flagBadPsfFlux bit DEFAULT NULL,
  u_flagBadApFlux bit DEFAULT NULL,
  u_flagBadModelFlux bit DEFAULT NULL,
  u_flagBadInstFlux bit DEFAULT NULL,
  u_flagBadCentroid bit DEFAULT NULL,
  u_flagBadShape bit DEFAULT NULL,
  g_psfFlux float DEFAULT NULL,
  g_psfFluxSigma float DEFAULT NULL,
  g_apFlux float DEFAULT NULL,
  g_apFluxSigma float DEFAULT NULL,
  g_modelFlux float DEFAULT NULL,
  g_modelFluxSigma float DEFAULT NULL,
  g_instFlux float DEFAULT NULL,
  g_instFluxSigma float DEFAULT NULL,
  g_apCorrection float DEFAULT NULL,
  g_apCorrectionSigma float DEFAULT NULL,
  g_shapeIx float DEFAULT NULL,
  g_shapeIy float DEFAULT NULL,
  g_shapeIxVar float DEFAULT NULL,
  g_shapeIyVar float DEFAULT NULL,
  g_shapeIxIyCov float DEFAULT NULL,
  g_shapeIxx float DEFAULT NULL,
  g_shapeIyy float DEFAULT NULL,
  g_shapeIxy float DEFAULT NULL,
  g_shapeIxxVar float DEFAULT NULL,
  g_shapeIyyVar float DEFAULT NULL,
  g_shapeIxyVar float DEFAULT NULL,
  g_shapeIxxIyyCov float DEFAULT NULL,
  g_shapeIxxIxyCov float DEFAULT NULL,
  g_shapeIyyIxyCov float DEFAULT NULL,
  g_extendedness float DEFAULT NULL,
  g_flagNegative bit DEFAULT NULL,
  g_flagBadMeasCentroid bit DEFAULT NULL,
  g_flagPixEdge bit DEFAULT NULL,
  g_flagPixInterpAny bit DEFAULT NULL,
  g_flagPixInterpCen bit DEFAULT NULL,
  g_flagPixSaturAny bit DEFAULT NULL,
  g_flagPixSaturCen bit DEFAULT NULL,
  g_flagBadPsfFlux bit DEFAULT NULL,
  g_flagBadApFlux bit DEFAULT NULL,
  g_flagBadModelFlux bit DEFAULT NULL,
  g_flagBadInstFlux bit DEFAULT NULL,
  g_flagBadCentroid bit DEFAULT NULL,
  g_flagBadShape bit DEFAULT NULL,
  r_psfFlux float DEFAULT NULL,
  r_psfFluxSigma float DEFAULT NULL,
  r_apFlux float DEFAULT NULL,
  r_apFluxSigma float DEFAULT NULL,
  r_modelFlux float DEFAULT NULL,
  r_modelFluxSigma float DEFAULT NULL,
  r_instFlux float DEFAULT NULL,
  r_instFluxSigma float DEFAULT NULL,
  r_apCorrection float DEFAULT NULL,
  r_apCorrectionSigma float DEFAULT NULL,
  r_shapeIx float DEFAULT NULL,
  r_shapeIy float DEFAULT NULL,
  r_shapeIxVar float DEFAULT NULL,
  r_shapeIyVar float DEFAULT NULL,
  r_shapeIxIyCov float DEFAULT NULL,
  r_shapeIxx float DEFAULT NULL,
  r_shapeIyy float DEFAULT NULL,
  r_shapeIxy float DEFAULT NULL,
  r_shapeIxxVar float DEFAULT NULL,
  r_shapeIyyVar float DEFAULT NULL,
  r_shapeIxyVar float DEFAULT NULL,
  r_shapeIxxIyyCov float DEFAULT NULL,
  r_shapeIxxIxyCov float DEFAULT NULL,
  r_shapeIyyIxyCov float DEFAULT NULL,
  r_extendedness float DEFAULT NULL,
  r_flagNegative bit DEFAULT NULL,
  r_flagBadMeasCentroid bit DEFAULT NULL,
  r_flagPixEdge bit DEFAULT NULL,
  r_flagPixInterpAny bit DEFAULT NULL,
  r_flagPixInterpCen bit DEFAULT NULL,
  r_flagPixSaturAny bit DEFAULT NULL,
  r_flagPixSaturCen bit DEFAULT NULL,
  r_flagBadPsfFlux bit DEFAULT NULL,
  r_flagBadApFlux bit DEFAULT NULL,
  r_flagBadModelFlux bit DEFAULT NULL,
  r_flagBadInstFlux bit DEFAULT NULL,
  r_flagBadCentroid bit DEFAULT NULL,
  r_flagBadShape bit DEFAULT NULL,
  i_psfFlux float DEFAULT NULL,
  i_psfFluxSigma float DEFAULT NULL,
  i_apFlux float DEFAULT NULL,
  i_apFluxSigma float DEFAULT NULL,
  i_modelFlux float DEFAULT NULL,
  i_modelFluxSigma float DEFAULT NULL,
  i_instFlux float DEFAULT NULL,
  i_instFluxSigma float DEFAULT NULL,
  i_apCorrection float DEFAULT NULL,
  i_apCorrectionSigma float DEFAULT NULL,
  i_shapeIx float DEFAULT NULL,
  i_shapeIy float DEFAULT NULL,
  i_shapeIxVar float DEFAULT NULL,
  i_shapeIyVar float DEFAULT NULL,
  i_shapeIxIyCov float DEFAULT NULL,
  i_shapeIxx float DEFAULT NULL,
  i_shapeIyy float DEFAULT NULL,
  i_shapeIxy float DEFAULT NULL,
  i_shapeIxxVar float DEFAULT NULL,
  i_shapeIyyVar float DEFAULT NULL,
  i_shapeIxyVar float DEFAULT NULL,
  i_shapeIxxIyyCov float DEFAULT NULL,
  i_shapeIxxIxyCov float DEFAULT NULL,
  i_shapeIyyIxyCov float DEFAULT NULL,
  i_extendedness float DEFAULT NULL,
  i_flagNegative bit DEFAULT NULL,
  i_flagBadMeasCentroid bit DEFAULT NULL,
  i_flagPixEdge bit DEFAULT NULL,
  i_flagPixInterpAny bit DEFAULT NULL,
  i_flagPixInterpCen bit DEFAULT NULL,
  i_flagPixSaturAny bit DEFAULT NULL,
  i_flagPixSaturCen bit DEFAULT NULL,
  i_flagBadPsfFlux bit DEFAULT NULL,
  i_flagBadApFlux bit DEFAULT NULL,
  i_flagBadModelFlux bit DEFAULT NULL,
  i_flagBadInstFlux bit DEFAULT NULL,
  i_flagBadCentroid bit DEFAULT NULL,
  i_flagBadShape bit DEFAULT NULL,
  z_psfFlux float DEFAULT NULL,
  z_psfFluxSigma float DEFAULT NULL,
  z_apFlux float DEFAULT NULL,
  z_apFluxSigma float DEFAULT NULL,
  z_modelFlux float DEFAULT NULL,
  z_modelFluxSigma float DEFAULT NULL,
  z_instFlux float DEFAULT NULL,
  z_instFluxSigma float DEFAULT NULL,
  z_apCorrection float DEFAULT NULL,
  z_apCorrectionSigma float DEFAULT NULL,
  z_shapeIx float DEFAULT NULL,
  z_shapeIy float DEFAULT NULL,
  z_shapeIxVar float DEFAULT NULL,
  z_shapeIyVar float DEFAULT NULL,
  z_shapeIxIyCov float DEFAULT NULL,
  z_shapeIxx float DEFAULT NULL,
  z_shapeIyy float DEFAULT NULL,
  z_shapeIxy float DEFAULT NULL,
  z_shapeIxxVar float DEFAULT NULL,
  z_shapeIyyVar float DEFAULT NULL,
  z_shapeIxyVar float DEFAULT NULL,
  z_shapeIxxIyyCov float DEFAULT NULL,
  z_shapeIxxIxyCov float DEFAULT NULL,
  z_shapeIyyIxyCov float DEFAULT NULL,
  z_extendedness float DEFAULT NULL,
  z_flagNegative bit DEFAULT NULL,
  z_flagBadMeasCentroid bit DEFAULT NULL,
  z_flagPixEdge bit DEFAULT NULL,
  z_flagPixInterpAny bit DEFAULT NULL,
  z_flagPixInterpCen bit DEFAULT NULL,
  z_flagPixSaturAny bit DEFAULT NULL,
  z_flagPixSaturCen bit DEFAULT NULL,
  z_flagBadPsfFlux bit DEFAULT NULL,
  z_flagBadApFlux bit DEFAULT NULL,
  z_flagBadModelFlux bit DEFAULT NULL,
  z_flagBadInstFlux bit DEFAULT NULL,
  z_flagBadCentroid bit DEFAULT NULL,
  z_flagBadShape bit DEFAULT NULL,
  y_psfFlux float DEFAULT NULL,
  y_psfFluxSigma float DEFAULT NULL,
  y_apFlux float DEFAULT NULL,
  y_apFluxSigma float DEFAULT NULL,
  y_modelFlux float DEFAULT NULL,
  y_modelFluxSigma float DEFAULT NULL,
  y_instFlux float DEFAULT NULL,
  y_instFluxSigma float DEFAULT NULL,
  y_apCorrection float DEFAULT NULL,
  y_apCorrectionSigma float DEFAULT NULL,
  y_shapeIx float DEFAULT NULL,
  y_shapeIy float DEFAULT NULL,
  y_shapeIxVar float DEFAULT NULL,
  y_shapeIyVar float DEFAULT NULL,
  y_shapeIxIyCov float DEFAULT NULL,
  y_shapeIxx float DEFAULT NULL,
  y_shapeIyy float DEFAULT NULL,
  y_shapeIxy float DEFAULT NULL,
  y_shapeIxxVar float DEFAULT NULL,
  y_shapeIyyVar float DEFAULT NULL,
  y_shapeIxyVar float DEFAULT NULL,
  y_shapeIxxIyyCov float DEFAULT NULL,
  y_shapeIxxIxyCov float DEFAULT NULL,
  y_shapeIyyIxyCov float DEFAULT NULL,
  y_extendedness float DEFAULT NULL,
  y_flagNegative bit DEFAULT NULL,
  y_flagBadMeasCentroid bit DEFAULT NULL,
  y_flagPixEdge bit DEFAULT NULL,
  y_flagPixInterpAny bit DEFAULT NULL,
  y_flagPixInterpCen bit DEFAULT NULL,
  y_flagPixSaturAny bit DEFAULT NULL,
  y_flagPixSaturCen bit DEFAULT NULL,
  y_flagBadPsfFlux bit DEFAULT NULL,
  y_flagBadApFlux bit DEFAULT NULL,
  y_flagBadModelFlux bit DEFAULT NULL,
  y_flagBadInstFlux bit DEFAULT NULL,
  y_flagBadCentroid bit DEFAULT NULL,
  y_flagBadShape bit DEFAULT NULL,
  PRIMARY KEY (deepSourceId) --,
--  KEY subChunkId (subChunkId)
) 
GO
/*!40101 SET character_set_client = @saved_cs_client */;
CREATE INDEX idx_obj_1025_subchunkid on Object_1025(subChunkId)
GO
--

-- Table structure for table SourceFullOverlap_1025
--

--DROP TABLE IF EXISTS SourceFullOverlap_1025;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
IF OBJECT_ID(N'SourceFullOverlap_1025', N'U') IS NOT NULL
    DROP TABLE SourceFullOverlap_1025;
GO
--
CREATE TABLE SourceFullOverlap_1025 (
  id bigint NOT NULL,
  coord_ra float DEFAULT NULL,
  coord_decl float DEFAULT NULL,
  coord_htmId20 bigint DEFAULT NULL,
  parent bigint DEFAULT NULL,
  flags_badcentroid bit NOT NULL,
  centroid_sdss_x float DEFAULT NULL,
  centroid_sdss_y float DEFAULT NULL,
  centroid_sdss_xVar float DEFAULT NULL,
  centroid_sdss_xyCov float DEFAULT NULL,
  centroid_sdss_yVar float DEFAULT NULL,
  centroid_sdss_flags bit NOT NULL,
  flags_pixel_edge bit NOT NULL,
  flags_pixel_interpolated_any bit NOT NULL,
  flags_pixel_interpolated_center bit NOT NULL,
  flags_pixel_saturated_any bit NOT NULL,
  flags_pixel_saturated_center bit NOT NULL,
  flags_pixel_cr_any bit NOT NULL,
  flags_pixel_cr_center bit NOT NULL,
  centroid_naive_x float DEFAULT NULL,
  centroid_naive_y float DEFAULT NULL,
  centroid_naive_xVar float DEFAULT NULL,
  centroid_naive_xyCov float DEFAULT NULL,
  centroid_naive_yVar float DEFAULT NULL,
  centroid_naive_flags bit NOT NULL,
  centroid_gaussian_x float DEFAULT NULL,
  centroid_gaussian_y float DEFAULT NULL,
  centroid_gaussian_xVar float DEFAULT NULL,
  centroid_gaussian_xyCov float DEFAULT NULL,
  centroid_gaussian_yVar float DEFAULT NULL,
  centroid_gaussian_flags bit NOT NULL,
  shape_sdss_Ixx float DEFAULT NULL,
  shape_sdss_Iyy float DEFAULT NULL,
  shape_sdss_Ixy float DEFAULT NULL,
  shape_sdss_IxxVar float DEFAULT NULL,
  shape_sdss_IxxIyyCov float DEFAULT NULL,
  shape_sdss_IxxIxyCov float DEFAULT NULL,
  shape_sdss_IyyVar float DEFAULT NULL,
  shape_sdss_IyyIxyCov float DEFAULT NULL,
  shape_sdss_IxyVar float DEFAULT NULL,
  shape_sdss_flags bit NOT NULL,
  shape_sdss_centroid_x float DEFAULT NULL,
  shape_sdss_centroid_y float DEFAULT NULL,
  shape_sdss_centroid_xVar float DEFAULT NULL,
  shape_sdss_centroid_xyCov float DEFAULT NULL,
  shape_sdss_centroid_yVar float DEFAULT NULL,
  shape_sdss_centroid_flags bit NOT NULL,
  shape_sdss_flags_unweightedbad bit NOT NULL,
  shape_sdss_flags_unweighted bit NOT NULL,
  shape_sdss_flags_shift bit NOT NULL,
  shape_sdss_flags_maxiter bit NOT NULL,
  flux_psf float DEFAULT NULL,
  flux_psf_err float DEFAULT NULL,
  flux_psf_flags bit NOT NULL,
  flux_psf_psffactor real DEFAULT NULL,
  flux_psf_flags_psffactor bit NOT NULL,
  flux_psf_flags_badcorr bit NOT NULL,
  flux_naive float DEFAULT NULL,
  flux_naive_err float DEFAULT NULL,
  flux_naive_flags bit NOT NULL,
  flux_gaussian float DEFAULT NULL,
  flux_gaussian_err float DEFAULT NULL,
  flux_gaussian_flags bit NOT NULL,
  flux_gaussian_psffactor real DEFAULT NULL,
  flux_gaussian_flags_psffactor bit NOT NULL,
  flux_gaussian_flags_badcorr bit NOT NULL,
  flux_sinc float DEFAULT NULL,
  flux_sinc_err float DEFAULT NULL,
  flux_sinc_flags bit NOT NULL,
  centroid_record_x float DEFAULT NULL,
  centroid_record_y float DEFAULT NULL,
  classification_extendedness float DEFAULT NULL,
  aperturecorrection float DEFAULT NULL,
  aperturecorrection_err float DEFAULT NULL,
  refFlux float DEFAULT NULL,
  refFlux_err float DEFAULT NULL,
  objectId bigint NOT NULL,
  coord_raVar float DEFAULT NULL,
  coord_radeclCov float DEFAULT NULL,
  coord_declVar float DEFAULT NULL,
  exposure_id bigint NOT NULL,
  exposure_filter_id int NOT NULL,
  exposure_time real DEFAULT NULL,
  exposure_time_mid float DEFAULT NULL,
  cluster_id bigint DEFAULT NULL,
  cluster_coord_ra float DEFAULT NULL,
  cluster_coord_decl float DEFAULT NULL,
  chunkId int NOT NULL,
  subChunkId int NOT NULL --,
--  KEY IDX_parent (parent),
--  KEY IDX_exposure_id (exposure_id),
--  KEY objectId (objectId),
--  KEY PRIMARY_NON_UNIQUE (id)
)
/*!40101 SET character_set_client = @saved_cs_client */;
GO
--
CREATE CLUSTERED INDEX idx_srcflolap_1025_id on SourceFullOverlap_1025(id)
GO
CREATE INDEX idx_srcflolap_1025_parent on SourceFullOverlap_1025(parent)
GO
CREATE INDEX idx_srcflolap_1025_expid on SourceFullOverlap_1025(exposure_id)
GO
CREATE INDEX idx_srcflolap_1025_objid on SourceFullOverlap_1025(objectid)
GO
--
-- Table structure for table Source_1025
--

IF OBJECT_ID(N'Source_1025', N'U') IS NOT NULL
    DROP TABLE Source_1025;
GO
--
--DROP TABLE IF EXISTS Source_1025;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;

CREATE TABLE Source_1025 (
  id bigint NOT NULL,
  coord_ra float DEFAULT NULL,
  coord_decl float DEFAULT NULL,
  coord_htmId20 bigint DEFAULT NULL,
  parent bigint DEFAULT NULL,
  flags_badcentroid bit NOT NULL,
  centroid_sdss_x float DEFAULT NULL,
  centroid_sdss_y float DEFAULT NULL,
  centroid_sdss_xVar float DEFAULT NULL,
  centroid_sdss_xyCov float DEFAULT NULL,
  centroid_sdss_yVar float DEFAULT NULL,
  centroid_sdss_flags bit NOT NULL,
  flags_pixel_edge bit NOT NULL,
  flags_pixel_interpolated_any bit NOT NULL,
  flags_pixel_interpolated_center bit NOT NULL,
  flags_pixel_saturated_any bit NOT NULL,
  flags_pixel_saturated_center bit NOT NULL,
  flags_pixel_cr_any bit NOT NULL,
  flags_pixel_cr_center bit NOT NULL,
  centroid_naive_x float DEFAULT NULL,
  centroid_naive_y float DEFAULT NULL,
  centroid_naive_xVar float DEFAULT NULL,
  centroid_naive_xyCov float DEFAULT NULL,
  centroid_naive_yVar float DEFAULT NULL,
  centroid_naive_flags bit NOT NULL,
  centroid_gaussian_x float DEFAULT NULL,
  centroid_gaussian_y float DEFAULT NULL,
  centroid_gaussian_xVar float DEFAULT NULL,
  centroid_gaussian_xyCov float DEFAULT NULL,
  centroid_gaussian_yVar float DEFAULT NULL,
  centroid_gaussian_flags bit NOT NULL,
  shape_sdss_Ixx float DEFAULT NULL,
  shape_sdss_Iyy float DEFAULT NULL,
  shape_sdss_Ixy float DEFAULT NULL,
  shape_sdss_IxxVar float DEFAULT NULL,
  shape_sdss_IxxIyyCov float DEFAULT NULL,
  shape_sdss_IxxIxyCov float DEFAULT NULL,
  shape_sdss_IyyVar float DEFAULT NULL,
  shape_sdss_IyyIxyCov float DEFAULT NULL,
  shape_sdss_IxyVar float DEFAULT NULL,
  shape_sdss_flags bit NOT NULL,
  shape_sdss_centroid_x float DEFAULT NULL,
  shape_sdss_centroid_y float DEFAULT NULL,
  shape_sdss_centroid_xVar float DEFAULT NULL,
  shape_sdss_centroid_xyCov float DEFAULT NULL,
  shape_sdss_centroid_yVar float DEFAULT NULL,
  shape_sdss_centroid_flags bit NOT NULL,
  shape_sdss_flags_unweightedbad bit NOT NULL,
  shape_sdss_flags_unweighted bit NOT NULL,
  shape_sdss_flags_shift bit NOT NULL,
  shape_sdss_flags_maxiter bit NOT NULL,
  flux_psf float DEFAULT NULL,
  flux_psf_err float DEFAULT NULL,
  flux_psf_flags bit NOT NULL,
  flux_psf_psffactor real DEFAULT NULL,
  flux_psf_flags_psffactor bit NOT NULL,
  flux_psf_flags_badcorr bit NOT NULL,
  flux_naive float DEFAULT NULL,
  flux_naive_err float DEFAULT NULL,
  flux_naive_flags bit NOT NULL,
  flux_gaussian float DEFAULT NULL,
  flux_gaussian_err float DEFAULT NULL,
  flux_gaussian_flags bit NOT NULL,
  flux_gaussian_psffactor real DEFAULT NULL,
  flux_gaussian_flags_psffactor bit NOT NULL,
  flux_gaussian_flags_badcorr bit NOT NULL,
  flux_sinc float DEFAULT NULL,
  flux_sinc_err float DEFAULT NULL,
  flux_sinc_flags bit NOT NULL,
  centroid_record_x float DEFAULT NULL,
  centroid_record_y float DEFAULT NULL,
  classification_extendedness float DEFAULT NULL,
  aperturecorrection float DEFAULT NULL,
  aperturecorrection_err float DEFAULT NULL,
  refFlux float DEFAULT NULL,
  refFlux_err float DEFAULT NULL,
  objectId bigint NOT NULL,
  coord_raVar float DEFAULT NULL,
  coord_radeclCov float DEFAULT NULL,
  coord_declVar float DEFAULT NULL,
  exposure_id bigint NOT NULL,
  exposure_filter_id int NOT NULL,
  exposure_time real DEFAULT NULL,
  exposure_time_mid float DEFAULT NULL,
  cluster_id bigint DEFAULT NULL,
  cluster_coord_ra float DEFAULT NULL,
  cluster_coord_decl float DEFAULT NULL,
  chunkId int NOT NULL,
  subChunkId int NOT NULL,
  PRIMARY KEY (id)  --,
--  KEY IDX_parent (parent),
--  KEY IDX_exposure_id (exposure_id),
--  KEY objectId (objectId)
)
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
GO

CREATE INDEX idx_src_1025_parent on Source_1025(parent)
GO
CREATE INDEX idx_src_1025_expid on Source_1025(exposure_id)
GO
CREATE INDEX idx_src_1025_objectid on Source_1025(objectid)
GO



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-09-14 20:14:36
