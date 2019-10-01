import export as exp
import os
from time import time
from multiprocessing import pool
from multiprocessing.dummy import Pool as ThreadPool
import datetime

class Export:
    def __init__(self, database, debug=False):
        self.user = 'lsst'
        self.password = 'lsst2018'
        self.host = '127.0.0.1'
        self.database = database
        self.csvpath = '/srv/data02/sql_db/sue/csv_exports'
        self.object_tables = exp.getTablenamesFromDB('Object', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        #self.source_tables = exp.getTablenamesFromDB('Source', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        #self.forcedsource_tables = exp.getTablenamesFromDB('ForcedSource', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        #self.ofo_tables = exp.getTablenamesFromDB('ObjectFullOverlap', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        self.chunk_ids = []
        self.skipped = []
        self.export_log = []
        self.startime = datetime.datetime.now()
        for row in self.object_tables:
            table = row[0]
            chunkid = exp.getChunkIDFromTablename(table)
            self.chunk_ids.append(chunkid)
        
        if debug == True:
            self.chunk_ids = self.chunk_ids[:10]

        dbdir = os.path.join(self.csvpath, database)
        direxists = os.path.isdir(dbdir)
        if direxists == False:
            try:
                os.mkdir(dbdir)
                os.chmod(dbdir, 0o777)
                print('created dir' + dbdir)
            except(OSError):
                print("failed to create directory {exportdir}".format(exportdir=dbdir))
        
        else:
            print('directory {exportdir} already exists'.format(exportdir=dbdir))


    def export_table(self, basetable, chunkid):
        exportdir = os.path.join(self.csvpath, self.database, basetable)
        cnx =  exp.dbconnect(user=self.user, password=self.password, 
             host=self.host, database=self.database)
        stime = datetime.datetime.now()
        
        # check if dir exists
        direxists = os.path.isdir(exportdir)
        if direxists == False:
            

            try:
                os.mkdir(exportdir)
                os.chmod(exportdir, 0o777)
                print('created dir' + exportdir)
            except(OSError):
                print("failed to create directory {exportdir}".format(exportdir=exportdir))
        
        #else:
            #print('directory {exportdir} already exists'.format(exportdir=exportdir))
        
        tablename, expfile = exp.generateFileInfo(chunkid, basetable, exportdir)



        # expfile = os.path.join(exportdir, tablename + '.csv')
        
        
        # check if object file exists
        if (os.path.isfile(expfile)) == False:
            if (basetable == 'Object'):
                sql = exp.generateObjectSql(chunkid=chunkid, tablename=tablename, dbname=self.database, filename=expfile)
            elif (basetable == 'Source'):
                sql = exp.generateSourceSql(chunkid=chunkid, tablename=tablename, dbname=self.database, filename=expfile)
            elif (basetable == 'ForcedSource'):
                sql = exp.generateForcedSourceSql(chunkid=chunkid, tablename=tablename, dbname=self.database, filename=expfile)
            elif (basetable == 'ObjectFullOverlap'):
                sql = exp.generateForcedSourceSql(chunkid=chunkid, tablename=tablename, dbname=self.database, filename=expfile)
            else:
                print('Base table {basetable} not recognized!'.format(basetable=basetable))
            
            #write object csv file to directory
            otime = exp.executesql(cnx, sql)
            print('\t{table} exported in\t{time}'.format(table=tablename, time=otime))

        else: 
            print('file {file} already exists'.format(file=expfile))
            self.skipped.append(expfile)

        ftime = datetime.datetime.now()
        etime = ftime - stime
        # print('\t{table} completed at {ftime}\ttook{seconds} seconds'.format(table=tablename, ftime=ftime, seconds=etime.total_seconds()))


    
    def export_object(self, chunkid):
        exportdir = os.path.join(self.csvpath, self.database, 'Object')
        cnx =  exp.dbconnect(user=self.user, password=self.password, 
             host=self.host, database=self.database)
        stime = datetime.datetime.now()
        
        # check if dir exists
        direxists = os.path.isdir(exportdir)
        if direxists == False:
            

            try:
                os.mkdir(exportdir)
                os.chmod(exportdir, 0o777)
                print('created dir' + exportdir)
            except(OSError):
                print("failed to create directory {exportdir}".format(exportdir=exportdir))
        
        #else:
            #print('directory {exportdir} already exists'.format(exportdir=exportdir))
        
        tablename, objfile = exp.generateFileInfo(chunkid, 'Object', exportdir)



        # objfile = os.path.join(exportdir, tablename + '.csv')
        
        
        # check if object file exists
        if (os.path.isfile(objfile)) == False:
            sql = exp.generateObjectSql(chunkid=chunkid, tablename=tablename, dbname=self.database, filename=objfile)
            
            #write object csv file to directory
            otime = exp.executesql(cnx, sql)
            print('\t{table} exported in\t{time}'.format(table=tablename, time=otime))

        else: 
            print('file {file} already exists'.format(file=objfile))
            self.skipped.append(objfile)

        ftime = datetime.datetime.now()
        etime = ftime - stime
        # print('\t{table} completed at {ftime}\ttook{seconds} seconds'.format(table=tablename, ftime=ftime, seconds=etime.total_seconds()))


    def export_source(self, chunkid):
        exportdir = os.path.join(self.csvpath, self.database, 'Source')
        cnx =  exp.dbconnect(database=self.database)
        stime = datetime.datetime.now()
        
        # check if dir exists
        direxists = os.path.isdir(exportdir)
        if direxists == False:
            

            try:
                os.mkdir(exportdir)
                os.chmod(exportdir, 0o777)
                print('created dir' + exportdir)
            except(OSError):
                print("failed to create directory {exportdir}".format(exportdir=exportdir))
        
        #else:
            #print('directory {exportdir} already exists'.format(exportdir=exportdir))
        
        tablename, objfile = exp.generateFileInfo(chunkid, 'Source', exportdir)



        # objfile = os.path.join(exportdir, tablename + '.csv')
        
        
        # check if object file exists
        if (os.path.isfile(objfile)) == False:
            sql = exp.generateSourceSql(chunkid=chunkid, tablename=tablename, dbname=self.database, filename=objfile)
            print('Starting export of {table}'.format(table=tablename))
            #write object csv file to directory
            otime = exp.executesql(cnx, sql)
            print('\t{table} exported in\t{time}'.format(table=tablename, time=otime))

        else: 
            print('file {file} already exists'.format(file=objfile))
            self.skipped.append(objfile)

        ftime = datetime.datetime.now()
        etime = ftime - stime
        #print('\t{table} completed at {ftime}\ttook{seconds} seconds'.format(table=tablename, ftime=ftime, seconds=etime.total_seconds()))
     

'''| vdc1               |
| vde1               |
| vdh1               |
| vdi1   o            |
| vdj1    o           |
| vdk1               |
| vdl1               |
| vdm1  



    

    def export_chunk(self, chunkid):
        print ('starting {chunkid}'.format(chunkid = chunkid))
        cnx =  exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database)
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
            sql = exp.generateObjectSql(chunkid=chunkid, tablename=objtable, 
            dbname=self.database, filename=objfile)

            #write object csv file to directory
            otime = exp.executesql(sql)
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
'''
    

def main():
    # filedb10dbs = ['vdc1', 'vde1', 'vdh1', 'vdi1', 'vdj1', 'vdk1', 'vdl1', 'vdm1']  #filedb 10
    filedb01dbs = ['vdb1', 'vdc1', 'vdd1', 'vde1', 'vdg1', 'vdg1']
    # filedb11dbs = ['vdn1', 'vdo1', 'vdp1', 'vdq1', 'vdr1', 'vds1']
    # filedb12dbs = ['vdt1', 'vdu1', 'vdv1', 'vdw1', 'vdx1', 'vdy1']
    #dbs = 'vdi1'vdk1', 'vdl1', 'vdm1']  #filedb 10
    dbs = filedb01dbs


    for database in dbs:
        currentDT = datetime.datetime.now()
        
        print('starting export of {database} at {time}'.format(database=database, 
          time=currentDT.strftime("%Y-%m-%d %H:%M:%S")))
        my_export = Export(database=database, debug=False)
        print('Starting multithreaded' + str(my_export.startime))
        pool = ThreadPool(4)
        results = pool.map(my_export.export_object,my_export.chunk_ids)
        #results = pool.map(my_export.export_source,my_export.chunk_ids)
        pool.close()
        pool.join() 
        currentDT = datetime.datetime.now()
        print('FINISHED export of {database} at {time}'.format(database=database, 
            time=currentDT.strftime("%Y-%m-%d %H:%M:%S"))) 
        print('exported {n} files'.format(n=len(results)))
    print('...finished all dbs')



if __name__ == "__main__":
    # to start python env on windows:  & h:/GitHub/jhu-lsst/py/mysql2mssql/env/Scripts/activate.ps1
    main()

    



