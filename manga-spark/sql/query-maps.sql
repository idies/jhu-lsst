

-- t-sql versions of queries to maps table in manga_bdc db
-- these queries are using the small _test tables inthe datapool
-- to use the big tables, remove the _test
-- i put top 1000 to avoid returning tons of rows unexpectedly in interactive mode
-- remove if you like obviously


use manga_bdc
GO


--totsql
select top 1000 f.plateifu, count(*) as tcount 
from maps_test as f
where 
    f.binid_binned_spectra != -1 and 
    f.binid_stellar_continua != -1 and f.binid_em_line_models != -1 AND
    f.binid_em_line_moments != -1 and f.binid_spectral_indices != -1
group by f.plateifu;

--hasql
select top 1000 f.plateifu, count(*) as vcount 
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

select top 1000 t.plateifu, t.tcount, v.vcount
from t
inner join v
on t.plateifu = v.plateifu
and v.vcount >= 0.2*t.tcount
---------------------------------------------------------------------------


--query 4?-------------------------------------------------------------------
select top 1000 f.plateifu, f.emline_sew_ha_6564, d.nsa_sersic_n, log10(d.nsa_sersic_mass) 
from maps as f 
join drpall as d 
on d.plateifu=f.plateifu 
where 
    (
    f.emline_sew_ha_6564 > 6 
    and f.binid_binned_spectra != -1 
    and f.binid_stellar_continua != -1
    and f.binid_em_line_models != -1 
    and f.binid_em_line_moments != -1 
    and f.binid_spectral_indices != -1 
    and d.nsa_sersic_n < 2.0 
    and d.nsa_sersic_mass <> -9999
    and log10(d.nsa_sersic_mass) between 9.5 and 11.0
    )  

------------------------------------------------------------
-- join cube and maps together
------------------------------------------------------------
--need to use 2 cte's bc of the plateifu concat thing
--dont want that in the where clause

with cube_cte as (
    select 
        c.plateid, 
        c.mangaid, 
        c.ifudsgn, 
        concat(c.plateid,'-',c.ifudsgn) as plateifu,
        c.ra, 
        c.dec
from logcube_test  c
),
maps_cte as (
    select 
        m.x,
        m.y,
        m.emline_gflux_ha_6564
 from maps_test m
)
select 
    cc.plateid, 
    cc.mangaid, 
    cc.ifudsgn,
    cc.plateifu,
    cc.ra,
    cc.dec,
    mm.x,
    mm.y,
    mm.emline_gflux_ha_6564
from cube_cte cc
cross join maps_cte mm
--on c.plateifu = m.plateifu


select 
    c.plateid, 
    c.mangaid, 
    c.ifudsgn, 
    concat(c.plateid,'-',c.ifudsgn) as plateifu,
    c.ra, 
    c.dec, 
    m.x,
    m.y,
    m.emline_gflux_ha_6564 
from logcube_test  c  join 
    maps  m on 
    m.plateifu=plateifu 
where m.emline_gflux_ha_6564 > 25


16,028,280
select count(*) from maps
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

    spark.sql('''select c.plateid, c.mangaid, c.ifudsgn, concat(c.plateid,'-',c.ifudsgn) as 
    plateifu, c.ra, c.dec, m.x,m.y,m.emline_gflux_ha_6564 
    from cubes as c cross join 
    maps as m on
     m.plateifu=plateifu where m.emline_gflux_ha_6564 > 25''').count()

    spark.sql('''select c.plateid, c.mangaid, c.ifudsgn, concat(c.plateid,'-',c.ifudsgn)
     as plateifu, c.ra, c.dec, m.x,m.y,m.emline_gflux_ha_6564 from cubes as c cross join 
     maps as m on m.plateifu=plateifu where m.emline_gflux_ha_6564 > 25 and m.binid_binned_spectra
      != -1 and m.binid_stellar_continua != -1 and m.binid_em_line_models != -1 and m.binid_em_line_moments != -1 and m.binid_spectral_indices != -1''').show()
"""
*/




