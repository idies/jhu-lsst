from __future__ import print_function
from export import *
from time import time
import argparse
import os



def main():

    parser = argparse.ArgumentParser(description='Export LSST mysql tables to CSV for sql server ingest')
    parser.add_argument('-b', action='store', dest='basetable', help='name of base table to export (e.g. Source, Object')
    results = parser.parse_args()

    basetable = results.basetable

    # basetable = 'Object'
    csvpath = '/srv/data02/sql_db/sue/csv/'


    chunksfile = os.path.join(csvpath, 'chunks.txt')
    tablesfile = os.path.join(csvpath, 'tables.txt')

    cnx = dbconnect()
    #filename = os.path.join(csvpath,tablename + '.csv')
    
    # get list of tablenames from DB
    result_tables = getTablenamesFromDB(basetable, cnx)
    
    from datetime import datetime
    print(basetable + ' export starting at ' + str(datetime.now()))
    tic = time()
    exported = 0
    skipped = 0
    
    for cnt, row in enumerate(result_tables):
        #print("chunk {}: {}".format(cnt, line))
        tablename = str(row[0]).strip()
        chunkid = getChunkIDFromTablename(tablename)
        filename = getFileNamefromTablename(tablename, csvpath)
        
        #print(tablename)
        print(filename)
        #print(chunkid)
        
        exists = os.path.isfile(filename)
        
        # for now, skip file if it already exists.
        # TODO: add as option
        if exists:
            print(filename + ' already exists')
            skipped = skipped + 1
        else:
            sql = generateObjectSql(chunkid, tablename, filename)
            #print(sql)
            executesql(cnx, sql, tablename)
            exported = exported + 1
            
    toc = time()
    xtime = toc - tic
    print(basetable +' export finished at ' + str(datetime.now()))
    print(str(cnt) + ' tables checked')
    print(str(exported) + ' csv files written to ' + csvpath)
    print('total time = ' + str(xtime) )





if __name__ == "__main__":
    main()