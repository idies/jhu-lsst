import os
import sys
import pandas
# requires 'pip install pyarrow'
import pyarrow


s="id|chunk_id,''),coalesce(coord_ra,''),coalesce(coord_decl,''),coalesce(coord_htmId20,''),coalesce(parent,''),cast(flags_badcentroid as int),coalesce(centroid_sdss_x,''),coalesce(centroid_sdss_y,''),coalesce(centroid_sdss_xVar,''),coalesce(centroid_sdss_xyCov,''),coalesce(centroid_sdss_yVar,''),cast(centroid_sdss_flags as int),cast(flags_pixel_edge as int),cast(flags_pixel_interpolated_any as int),cast(flags_pixel_interpolated_center as int),cast(flags_pixel_saturated_any as int),cast(flags_pixel_saturated_center as int),cast(flags_pixel_cr_any as int),cast(flags_pixel_cr_center as int),coalesce(centroid_naive_x,''),coalesce(centroid_naive_y,''),coalesce(centroid_naive_xVar,''),coalesce(centroid_naive_xyCov,''),coalesce(centroid_naive_yVar,''),cast(centroid_naive_flags as int),coalesce(centroid_gaussian_x,''),coalesce(centroid_gaussian_y,''),coalesce(centroid_gaussian_xVar,''),coalesce(centroid_gaussian_xyCov,''),coalesce(centroid_gaussian_yVar,''),cast(centroid_gaussian_flags as int),coalesce(shape_sdss_Ixx,''),coalesce(shape_sdss_Iyy,''),coalesce(shape_sdss_Ixy,''),coalesce(shape_sdss_IxxVar,''),coalesce(shape_sdss_IxxIyyCov,''),coalesce(shape_sdss_IxxIxyCov,''),coalesce(shape_sdss_IyyVar,''),coalesce(shape_sdss_IyyIxyCov,''),coalesce(shape_sdss_IxyVar,''),cast(shape_sdss_flags as int),coalesce(shape_sdss_centroid_x,''),coalesce(shape_sdss_centroid_y,''),coalesce(shape_sdss_centroid_xVar,''),coalesce(shape_sdss_centroid_xyCov,''),coalesce(shape_sdss_centroid_yVar,''),cast(shape_sdss_centroid_flags as int),cast(shape_sdss_flags_unweightedbad as int),cast(shape_sdss_flags_unweighted as int),cast(shape_sdss_flags_shift as int),cast(shape_sdss_flags_maxiter as int),coalesce(flux_psf,''),coalesce(flux_psf_err,''),cast(flux_psf_flags as int),coalesce(flux_psf_psffactor,''),cast(flux_psf_flags_psffactor as int),cast(flux_psf_flags_badcorr as int),coalesce(flux_naive,''),coalesce(flux_naive_err,''),cast(flux_naive_flags as int),coalesce(flux_gaussian,''),coalesce(flux_gaussian_err,''),cast(flux_gaussian_flags as int),coalesce(flux_gaussian_psffactor,''),cast(flux_gaussian_flags_psffactor as int),cast(flux_gaussian_flags_badcorr as int),coalesce(flux_sinc,''),coalesce(flux_sinc_err,''),cast(flux_sinc_flags as int),coalesce(centroid_record_x,''),coalesce(centroid_record_y,''),coalesce(classification_extendedness,''),coalesce(aperturecorrection,''),coalesce(aperturecorrection_err,''),coalesce(refFlux,''),coalesce(refFlux_err,''),coalesce(objectId,''),coalesce(coord_raVar,''),coalesce(coord_radeclCov,''),coalesce(coord_declVar,''),coalesce(exposure_id,''),coalesce(exposure_filter_id,''),coalesce(exposure_time,''),coalesce(exposure_time_mid,''),coalesce(cluster_id,''),coalesce(cluster_coord_ra,''),coalesce(cluster_coord_decl"
s=s.replace(",coalesce(","|").replace(",cast(","|").replace(" as int)","").replace("\''","").replace(",)","")
column_names=s.split("|")
#print(column_names)

d='/home/idies/workspace/Temporary/gerard/scratch/LSST/csv/'
d='/srv/data02/sql_db/sue/csv/'
p='/srv/data02/sql_db/sue/gerard/parquet/'
df=None

for f in os.listdir(d):
    fn=d+f
    if df is None:
        df = pandas.read_csv(fn,names=column_names)
    else:
        df.append(pandas.read_csv(fn))
    df.to_parquet(fname=p+f.replace(".csv",".parquet"))
    break

