import export as exp
import aztools as az
import pandas as pd
from azure.storage.blob import (
    BlockBlobService
)
import time
from profilehooks import profile


def timeit(method):
    def timed(*args, **kw):
        ts = time.time()
        result = method(*args, **kw)
        te = time.time()

        if 'log_time' in kw:
            name = kw.get('log_name', method.__name__.upper())
            kw['log_time'][name] = int((te-ts) * 1000)
        else:
            print('%r %2.2f ms' % (method.__name__, (te - ts) * 1000))
        return result
    return timed



hdfs dfs -put /srv/data02/sql_db/sue/csv_exports/vdi1/Source/* /LSST/csv/Source ;  hdfs dfs -put /srv/data02/sql_db/sue/csv_exports/vdj1/Source/* /LSST/csv/Source ;  hdfs dfs -put /srv/data02/sql_db/sue/csv_exports/vdk1/Source/* /LSST/csv/Source ;  hdfs dfs -put /srv/data02/sql_db/sue/csv_exports/vdl1/Source/* /LSST/csv/Source ;  hdfs dfs -put /srv/data02/sql_db/sue/csv_exports/vdm1/Source/*
 /LSST/csv/Source 



def stringtests():
    s = 'Source_10030'
    o = 'Object_10030'
    expid = 6548220209

    lim = 22

    s1 =  exp.generateRawSql(s)
    print(s1)

    s2 = exp.generateRawSql(s, expid)
    print(s2)

    s3 = exp.generateRawSql(s, expid, lim)
    print(s3)

    s4 = exp.generateRawSql(s, limit=lim)
    print(s4)

    ###

    o1 = exp.generateRawSql(o)
    print(o1)

    o2 = exp.generateRawSql(o, limit=lim)
    print(o2)


@timeit
def get_dataframe_from_sql(tablename, sql, cnx, **kwargs):
    return pd.read_sql(sql, cnx)

@timeit
def get_df_count(df, **kwargs):
    return len(df.index)

@timeit
def write_csvfile(cnx, sql, tablename, **kwargs):
    exp.executesql(cnx, sql, tablename)


def perftests():


    s = 'Source_10030'
    o = 'Object_10030'
    expid = 6548220209
    lim = 10000

    cnx = exp.dbconnect()
    tablename = o
    
    sql = exp.generateRawSql(tablename)
    logtime_data = {}
    df = get_dataframe_from_sql(tablename, sql, cnx, log_time=logtime_data, log_name=tablename)
    nrows = get_df_count(df, log_time=logtime_data)


    csvpath = '/srv/data02/sql_db/sue/tests/'
    filename = exp.getFileNamefromTablename(tablename, csvpath)
    chunkid = exp.getChunkIDFromTablename(tablename)
    sql = exp.generateObjectSql(chunkid, tablename, filename)

    logmethodname = 'write_csv_' + tablename

    write_csvfile(cnx, sql, tablename, log_time=logtime_data, log_name=logmethodname)




    """
    print('\tStarting '+tablename)
    #sql = exp.generateRawSql(tablename, limit=lim)
    sql = exp.generateRawSql(tablename)
    tic = time()
    df = pd.read_sql_query(sql, cnx)
    toc = time()
    rows = df.shape[0]
    print ('\ttablename:\t{tablename}\trows\t{rows}\ttime:\t{time}'.format(tablename=tablename, rows=rows, time=(toc-tic)))
    """

def pandastest():


def main():

    # setup
    o = 'Object_10030'
s = 'Source_10030'
expid = 6548220209
cnx = exp.dbconnect()
tablename = o
csvpath = '/srv/data02/sql_db/sue/tests/'


if __name__ == "__main__":
    # to start python env on windows:  & h:/GitHub/jhu-lsst/py/mysql2mssql/env/Scripts/activate.ps1
    main()