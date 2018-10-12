from __future__ import print_function
import os
import mysql.connector
from time import time


def dbconnect():

    config = {
        'user' : 'lsst',
        'password':'lsst2018',  #read only, local only user
        'host':'127.0.0.1',
        'database':'vdc1',
        'raise_on_warnings':True
    }

    cnx = mysql.connector.connect(**config)

    return cnx

def executesql(cnx, sql, tablename):
    cursor = cnx.cursor()
    tic = time()
    nrows = cursor.execute(sql)
    toc = time()
    xtime = toc - tic
    print(tablename + 'done in:' + str(xtime))



def generateSourceSql(chunkid, tablename, filename):

    source_sql = """select coalesce(id,''),{chunkid},coalesce(coord_ra,''),coalesce(coord_decl,''),coalesce(coord_htmId20,''),coalesce(parent,''),
    cast(flags_badcentroid as int),coalesce(centroid_sdss_x,''),coalesce(centroid_sdss_y,''),coalesce(centroid_sdss_xVar,''),
    coalesce(centroid_sdss_xyCov,''),coalesce(centroid_sdss_yVar,''),cast(centroid_sdss_flags as int),cast(flags_pixel_edge as int),
    cast(flags_pixel_interpolated_any as int),cast(flags_pixel_interpolated_center as int),cast(flags_pixel_saturated_any as int),
    cast(flags_pixel_saturated_center as int),cast(flags_pixel_cr_any as int),cast(flags_pixel_cr_center as int),coalesce(centroid_naive_x,''),
    coalesce(centroid_naive_y,''),coalesce(centroid_naive_xVar,''),coalesce(centroid_naive_xyCov,''),coalesce(centroid_naive_yVar,''),
    cast(centroid_naive_flags as int),coalesce(centroid_gaussian_x,''),coalesce(centroid_gaussian_y,''),coalesce(centroid_gaussian_xVar,''),
    coalesce(centroid_gaussian_xyCov,''),coalesce(centroid_gaussian_yVar,''),cast(centroid_gaussian_flags as int),coalesce(shape_sdss_Ixx,''),
    coalesce(shape_sdss_Iyy,''),coalesce(shape_sdss_Ixy,''),coalesce(shape_sdss_IxxVar,''),coalesce(shape_sdss_IxxIyyCov,''),
    coalesce(shape_sdss_IxxIxyCov,''),coalesce(shape_sdss_IyyVar,''),coalesce(shape_sdss_IyyIxyCov,''),coalesce(shape_sdss_IxyVar,''),cast(shape_sdss_flags as int),coalesce(shape_sdss_centroid_x,''),coalesce(shape_sdss_centroid_y,''),coalesce(shape_sdss_centroid_xVar,''),coalesce(shape_sdss_centroid_xyCov,''),coalesce(shape_sdss_centroid_yVar,''),cast(shape_sdss_centroid_flags as int),cast(shape_sdss_flags_unweightedbad as int),cast(shape_sdss_flags_unweighted as int),cast(shape_sdss_flags_shift as int),cast(shape_sdss_flags_maxiter as int),coalesce(flux_psf,''),coalesce(flux_psf_err,''),cast(flux_psf_flags as int),coalesce(flux_psf_psffactor,''),cast(flux_psf_flags_psffactor as int),cast(flux_psf_flags_badcorr as int),coalesce(flux_naive,''),coalesce(flux_naive_err,''),cast(flux_naive_flags as int),coalesce(flux_gaussian,''),coalesce(flux_gaussian_err,''),cast(flux_gaussian_flags as int),coalesce(flux_gaussian_psffactor,''),cast(flux_gaussian_flags_psffactor as int),cast(flux_gaussian_flags_badcorr as int),coalesce(flux_sinc,''),coalesce(flux_sinc_err,''),cast(flux_sinc_flags as int),coalesce(centroid_record_x,''),coalesce(centroid_record_y,''),coalesce(classification_extendedness,''),coalesce(aperturecorrection,''),coalesce(aperturecorrection_err,''),coalesce(refFlux,''),coalesce(refFlux_err,''),coalesce(objectId,''),coalesce(coord_raVar,''),coalesce(coord_radeclCov,''),coalesce(coord_declVar,''),coalesce(exposure_id,''),coalesce(exposure_filter_id,''),coalesce(exposure_time,''),coalesce(exposure_time_mid,''),coalesce(cluster_id,''),coalesce(cluster_coord_ra,''),coalesce(cluster_coord_decl,'')
    into 
    outfile '{filename}' fields terminated by ',' ESCAPED BY '"' LINES TERMINATED BY '\r\n' from vdc1.{tablename} limit 10;""".format(chunkid=chunkid,filename=filename, tablename=tablename)

    return source_sql

def generateObjectSql(chunkid, tablename, filename):
    object_sql = """select coalesce(deepSourceId,''),coalesce(ra,''),coalesce(decl,''),coalesce(raVar,''),coalesce(declVar,''),coalesce(radeclCov,''),coalesce(chunkId,''),coalesce(subChunkId,''),coalesce(u_psfFlux,''),coalesce(u_psfFluxSigma,''),coalesce(u_apFlux,''),coalesce(u_apFluxSigma,''),coalesce(u_modelFlux,''),coalesce(u_modelFluxSigma,''),coalesce(u_instFlux,''),coalesce(u_instFluxSigma,''),coalesce(u_apCorrection,''),coalesce(u_apCorrectionSigma,''),coalesce(u_shapeIx,''),coalesce(u_shapeIy,''),coalesce(u_shapeIxVar,''),coalesce(u_shapeIyVar,''),coalesce(u_shapeIxIyCov,''),coalesce(u_shapeIxx,''),coalesce(u_shapeIyy,''),coalesce(u_shapeIxy,''),coalesce(u_shapeIxxVar,''),coalesce(u_shapeIyyVar,''),coalesce(u_shapeIxyVar,''),coalesce(u_shapeIxxIyyCov,''),coalesce(u_shapeIxxIxyCov,''),coalesce(u_shapeIyyIxyCov,''),coalesce(u_extendedness,''),cast(u_flagNegative as int),cast(u_flagBadMeasCentroid as int),cast(u_flagPixEdge as int),cast(u_flagPixInterpAny as int),cast(u_flagPixInterpCen as int),cast(u_flagPixSaturAny as int),cast(u_flagPixSaturCen as int),cast(u_flagBadPsfFlux as int),cast(u_flagBadApFlux as int),cast(u_flagBadModelFlux as int),cast(u_flagBadInstFlux as int),cast(u_flagBadCentroid as int),cast(u_flagBadShape as int),coalesce(g_psfFlux,''),coalesce(g_psfFluxSigma,''),coalesce(g_apFlux,''),coalesce(g_apFluxSigma,''),coalesce(g_modelFlux,''),coalesce(g_modelFluxSigma,''),coalesce(g_instFlux,''),coalesce(g_instFluxSigma,''),coalesce(g_apCorrection,''),coalesce(g_apCorrectionSigma,''),coalesce(g_shapeIx,''),coalesce(g_shapeIy,''),coalesce(g_shapeIxVar,''),coalesce(g_shapeIyVar,''),coalesce(g_shapeIxIyCov,''),coalesce(g_shapeIxx,''),coalesce(g_shapeIyy,''),coalesce(g_shapeIxy,''),coalesce(g_shapeIxxVar,''),coalesce(g_shapeIyyVar,''),coalesce(g_shapeIxyVar,''),coalesce(g_shapeIxxIyyCov,''),coalesce(g_shapeIxxIxyCov,''),coalesce(g_shapeIyyIxyCov,''),coalesce(g_extendedness,''),cast(g_flagNegative as int),cast(g_flagBadMeasCentroid as int),cast(g_flagPixEdge as int),cast(g_flagPixInterpAny as int),cast(g_flagPixInterpCen as int),cast(g_flagPixSaturAny as int),cast(g_flagPixSaturCen as int),cast(g_flagBadPsfFlux as int),cast(g_flagBadApFlux as int),cast(g_flagBadModelFlux as int),cast(g_flagBadInstFlux as int),cast(g_flagBadCentroid as int),cast(g_flagBadShape as int),coalesce(r_psfFlux,''),coalesce(r_psfFluxSigma,''),coalesce(r_apFlux,''),coalesce(r_apFluxSigma,''),coalesce(r_modelFlux,''),coalesce(r_modelFluxSigma,''),coalesce(r_instFlux,''),coalesce(r_instFluxSigma,''),coalesce(r_apCorrection,''),coalesce(r_apCorrectionSigma,''),coalesce(r_shapeIx,''),coalesce(r_shapeIy,''),coalesce(r_shapeIxVar,''),coalesce(r_shapeIyVar,''),coalesce(r_shapeIxIyCov,''),coalesce(r_shapeIxx,''),coalesce(r_shapeIyy,''),coalesce(r_shapeIxy,''),coalesce(r_shapeIxxVar,''),coalesce(r_shapeIyyVar,''),coalesce(r_shapeIxyVar,''),coalesce(r_shapeIxxIyyCov,''),coalesce(r_shapeIxxIxyCov,''),coalesce(r_shapeIyyIxyCov,''),coalesce(r_extendedness,''),cast(r_flagNegative as int),cast(r_flagBadMeasCentroid as int),cast(r_flagPixEdge as int),cast(r_flagPixInterpAny as int),cast(r_flagPixInterpCen as int),cast(r_flagPixSaturAny as int),cast(r_flagPixSaturCen as int),cast(r_flagBadPsfFlux as int),cast(r_flagBadApFlux as int),cast(r_flagBadModelFlux as int),cast(r_flagBadInstFlux as int),cast(r_flagBadCentroid as int),cast(r_flagBadShape as int),coalesce(i_psfFlux,''),coalesce(i_psfFluxSigma,''),coalesce(i_apFlux,''),coalesce(i_apFluxSigma,''),coalesce(i_modelFlux,''),coalesce(i_modelFluxSigma,''),coalesce(i_instFlux,''),coalesce(i_instFluxSigma,''),coalesce(i_apCorrection,''),coalesce(i_apCorrectionSigma,''),coalesce(i_shapeIx,''),coalesce(i_shapeIy,''),coalesce(i_shapeIxVar,''),coalesce(i_shapeIyVar,''),coalesce(i_shapeIxIyCov,''),coalesce(i_shapeIxx,''),coalesce(i_shapeIyy,''),coalesce(i_shapeIxy,''),coalesce(i_shapeIxxVar,''),coalesce(i_shapeIyyVar,''),coalesce(i_shapeIxyVar,''),coalesce(i_shapeIxxIyyCov,''),coalesce(i_shapeIxxIxyCov,''),coalesce(i_shapeIyyIxyCov,''),coalesce(i_extendedness,''),cast(i_flagNegative as int),cast(i_flagBadMeasCentroid as int),cast(i_flagPixEdge as int),cast(i_flagPixInterpAny as int),cast(i_flagPixInterpCen as int),cast(i_flagPixSaturAny as int),cast(i_flagPixSaturCen as int),cast(i_flagBadPsfFlux as int),cast(i_flagBadApFlux as int),cast(i_flagBadModelFlux as int),cast(i_flagBadInstFlux as int),cast(i_flagBadCentroid as int),cast(i_flagBadShape as int),coalesce(z_psfFlux,''),coalesce(z_psfFluxSigma,''),coalesce(z_apFlux,''),coalesce(z_apFluxSigma,''),coalesce(z_modelFlux,''),coalesce(z_modelFluxSigma,''),coalesce(z_instFlux,''),coalesce(z_instFluxSigma,''),coalesce(z_apCorrection,''),coalesce(z_apCorrectionSigma,''),coalesce(z_shapeIx,''),coalesce(z_shapeIy,''),coalesce(z_shapeIxVar,''),coalesce(z_shapeIyVar,''),coalesce(z_shapeIxIyCov,''),coalesce(z_shapeIxx,''),coalesce(z_shapeIyy,''),coalesce(z_shapeIxy,''),coalesce(z_shapeIxxVar,''),coalesce(z_shapeIyyVar,''),coalesce(z_shapeIxyVar,''),coalesce(z_shapeIxxIyyCov,''),coalesce(z_shapeIxxIxyCov,''),coalesce(z_shapeIyyIxyCov,''),coalesce(z_extendedness,''),cast(z_flagNegative as int),cast(z_flagBadMeasCentroid as int),cast(z_flagPixEdge as int),cast(z_flagPixInterpAny as int),cast(z_flagPixInterpCen as int),cast(z_flagPixSaturAny as int),cast(z_flagPixSaturCen as int),cast(z_flagBadPsfFlux as int),cast(z_flagBadApFlux as int),cast(z_flagBadModelFlux as int),cast(z_flagBadInstFlux as int),cast(z_flagBadCentroid as int),cast(z_flagBadShape as int),coalesce(y_psfFlux,''),coalesce(y_psfFluxSigma,''),coalesce(y_apFlux,''),coalesce(y_apFluxSigma,''),coalesce(y_modelFlux,''),coalesce(y_modelFluxSigma,''),coalesce(y_instFlux,''),coalesce(y_instFluxSigma,''),coalesce(y_apCorrection,''),coalesce(y_apCorrectionSigma,''),coalesce(y_shapeIx,''),coalesce(y_shapeIy,''),coalesce(y_shapeIxVar,''),coalesce(y_shapeIyVar,''),coalesce(y_shapeIxIyCov,''),coalesce(y_shapeIxx,''),coalesce(y_shapeIyy,''),coalesce(y_shapeIxy,''),coalesce(y_shapeIxxVar,''),coalesce(y_shapeIyyVar,''),coalesce(y_shapeIxyVar,''),coalesce(y_shapeIxxIyyCov,''),coalesce(y_shapeIxxIxyCov,''),coalesce(y_shapeIyyIxyCov,''),coalesce(y_extendedness,''),cast(y_flagNegative as int),cast(y_flagBadMeasCentroid as int),cast(y_flagPixEdge as int),cast(y_flagPixInterpAny as int),cast(y_flagPixInterpCen as int),cast(y_flagPixSaturAny as int),cast(y_flagPixSaturCen as int),cast(y_flagBadPsfFlux as int),cast(y_flagBadApFlux as int),cast(y_flagBadModelFlux as int),cast(y_flagBadInstFlux as int),cast(y_flagBadCentroid as int),cast(y_flagBadShape as int) 
    into outfile '{filename}' fields terminated by ',' ESCAPED BY '"' LINES TERMINATED BY '\r\n' from vdc1.{tablename};""".format(filename=filename, tablename=tablename)

    return object_sql

def generateFileInfo(chunkid, baseTable, csvpath):
    tablename = baseTable + '_' + str(chunkid)
    filename = os.path.join(csvpath,tablename + '.csv')
    return (tablename, filename)


def main():


    csvpath = '/srv/data02/sql_db/sue/csv/'


    chunksfile = os.path.join(csvpath, 'chunks.txt')
    tablesfile = os.path.join(csvpath, 'tables.txt')

    cnx = dbconnect()
    #filename = os.path.join(csvpath,tablename + '.csv')

    with open(chunksfile) as f:
        for cnt, line in enumerate(f):
            #print("chunk {}: {}".format(cnt, line))
            chunkid = line.strip()

            (tablename, filename) = generateFileInfo(chunkid, 'Object', csvpath)
            #print(tablename)
            #print(filename)

            sql = generateObjectSql(chunkid, tablename, filename)
            #print(sql)
            executesql(cnx, sql, tablename)


    



    

    
    

if __name__ == "__main__":
    main()

    