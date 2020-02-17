


--create statistics st_objectrep_deepsourceid on dp.Object_rep(deepsourceid) with fullscan;

create statistics st_objectrep_htmid on dp.Object(htmid) with fullscan;

create statistics st_objectrep_healpixid on dp.Object(healpixid) with fullscan;



create statistics st_mObjectcci_deepsourceid on m_Object_cci(deepsourceid) with fullscan;