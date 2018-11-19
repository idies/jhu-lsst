import export as exp
import os
from time import time
from multiprocessing import pool
from multiprocessing.dummy import Pool as ThreadPool
import datetime

class Export:
    def __init__(self):
        self.csvpath = '/srv/data02/sql_db/sue/chunks/'
        self.object_tables = exp.getTablenamesFromDB('Object', exp.dbconnect())
        self.chunk_ids = []
        self.skipped = []
        self.export_log = []
        self.startime = datetime.datetime.now()
        for row in self.object_tables:
            table = row[0]
            chunkid = exp.getChunkIDFromTablename(table)
            self.chunk_ids.append(chunkid)

    
    def export_chunk(self, chunkid):
        print ('starting {chunkid}'.format(chunkid = chunkid))
        cnx = exp.dbconnect()
        stime = datetime.datetime.now()
        chunkdir = os.path.join(self.csvpath, chunkid)
        # check if dir exists
        direxists = os.path.isdir(chunkdir)
        if direxists == False:

            try:
                os.mkdir(chunkdir)
                os.chmod(chunkdir, 0o777)
                print('created dir' + chunkdir)
            except(OSError):
                print("failed to create directory {chunkdir}".format(chunkdir=chunkdir))
        
        else:
            print('directory {chunkdir} already exists'.format(chunkdir=chunkdir))
        
        objtable, objfile = exp.generateFileInfo(chunkid, 'Object', chunkdir)

        # check if object file exists
        if (os.path.isfile(objfile)) == False:
            sql = exp.generateObjectSql(chunkid, objtable, objfile)

            #write object csv file to directory
            otime = exp.executesql(cnx, sql)
            print('\t{table} exported in\t{time}'.format(table=objtable, time=otime))

        else: 
            print('file {file} already exists'.format(file=objfile))
            self.skipped.append(objfile)

        #export source csv files by exposure_id
        log_time = exp.export_by_exposure_id(exp.generateTableName('Source',chunkid), chunkdir, cnx)

        self.export_log.append(log_time)
        ftime = datetime.datetime.now()
        etime = ftime - stime
        print('\t{chunkid} completed at {ftime}\ttook{seconds} seconds'.format(chunkid=chunkid, ftime=ftime, seconds=etime.total_seconds()))

    

def main():
    #log = do_export()
    my_export = Export()
    print('Starting multithreaded' + str(my_export.startime))
    pool = ThreadPool(4)
    results = pool.map(my_export.export_chunk,my_export.chunk_ids)
    pool.close()
    pool.join() 


if __name__ == "__main__":
    # to start python env on windows:  & h:/GitHub/jhu-lsst/py/mysql2mssql/env/Scripts/activate.ps1
    main()

    



