
/*
totsql = """ select f.plateifu, count(f.*) as tcount from maps as f \
where f.binid_binned_spectra != -1 and f.binid_stellar_continua != -1 and f.binid_em_line_models != -1 \
and f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1 group by f.plateifu
"""
hasql = """ select f.plateifu, count(f.*) as vcount from maps as f \
where f.emline_gflux_ha_6564 > 5 and f.binid_binned_spectra != -1 and f.binid_stellar_continua != -1 \
and f.binid_em_line_models != -1 and f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1 \
group by f.plateifu
"""
sql = """ select t.plateifu, t.tcount, v.vcount from (select f.plateifu, count(f.*) as tcount from maps as f \
where f.binid_binned_spectra != -1 and f.binid_stellar_continua != -1 and f.binid_em_line_models != -1 \
and f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1 group by f.plateifu) as t,
 (select f.plateifu, count(f.*) as vcount from maps as f \
where f.emline_gflux_ha_6564 > 5 and f.binid_binned_spectra != -1 and f.binid_stellar_continua != -1 \
and f.binid_em_line_models != -1 and f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1 \
group by f.plateifu) as v where t.plateifu=v.plateifu and \
v.vcount >= 0.2*t.tcount
"""
*/

--totsql
select f.plateifu, count(*) as tcount 
from maps_test as f
where 
    f.binid_binned_spectra != -1 and 
    f.binid_stellar_continua != -1 and f.binid_em_line_models != -1 AND
    f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1
group by f.plateifu;

--hasql
select f.plateifu, count(*) as vcount 
from maps_test as f
where 
     f.emline_gflux_ha_6564 > 5 and
    f.binid_binned_spectra != -1 and 
    f.binid_stellar_continua != -1 and f.binid_em_line_models != -1 AND
    f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1
group by f.plateifu;

--SQL----------------------------with 2 cte's
with t as (
    select f.plateifu, count(*) as tcount 
    from maps_test as f
    where 
    f.binid_binned_spectra != -1 and 
    f.binid_stellar_continua != -1 and f.binid_em_line_models != -1 AND
    f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1
    group by f.plateifu
),
v as (select f.plateifu, count(*) as vcount 
from maps_test as f
where 
     f.emline_gflux_ha_6564 > 5 and
    f.binid_binned_spectra != -1 and 
    f.binid_stellar_continua != -1 and f.binid_em_line_models != -1 AND
    f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1
group by f.plateifu)

select t.plateifu, t.tcount, v.vcount
from t
inner join v
on t.plateifu = v.plateifu
and v.vcount >= 0.2*t.tcount
---------------------------------------------------------------------------




