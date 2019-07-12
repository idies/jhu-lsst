import export as exp
import os
from time import time
from multiprocessing import pool
from multiprocessing.dummy import Pool as ThreadPool
import datetime
import socket
import argparse


class Export:
    def __init__(self, database, basetable=None, debug=False):
        self.user = 'lsst'
        self.password = 'lsst2018'
        self.host = '127.0.0.1'
        self.database = database
        self.basetable = basetable
        self.csvpath = '/srv/data02/sql_db/sue/csv_exports'
        self.object_tables = exp.getTablenamesFromDB('Object', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        #self.source_tables = exp.getTablenamesFromDB('Source', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        #self.forcedsource_tables = exp.getTablenamesFromDB('ForcedSource', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        #self.ofo_tables = exp.getTablenamesFromDB('ObjectFullOverlap', exp.dbconnect(user=self.user, password=self.password, host=self.host, database=self.database))
        self.chunk_ids = []
        self.skipped = []
        self.completed = []
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


    def export_table(self, chunkid):
        if self.basetable == None:
            print('Error: basetable cannot be null in export_table')
            return

        basetable = self.basetable
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
                return
            
      

            #write object csv file to directory
            otime = exp.executesql(cnx, sql)
            self.completed.append(expfile)
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
     



    

def main():

    parser = argparse.ArgumentParser()
    parser.add_argument("basetable", help="base name of table to export (Object, Source, ObjectFullOverlap, ForcedSource")
    parser.add_argument("--dbname", help="name of db to export (blank means export all the dbs on the local instance)")

    args = parser.parse_args()



    hostname = socket.gethostname()

    dbs = []
    # this is hacky, todo, get list of dbs from the actual db server
    filedb10dbs = ['vdh1', 'vdi1', 'vdj1', 'vdk1', 'vdl1', 'vdm1']  #filedb 10
    filedb01dbs = ['vdb1', 'vdc1', 'vdd1', 'vde1', 'vdf1', 'vdg1']
    filedb11dbs = ['vdn1', 'vdo1', 'vdp1', 'vdq1', 'vdr1', 'vds1']
    filedb12dbs = ['vdt1', 'vdu1', 'vdv1', 'vdw1', 'vdx1', 'vdy1']
    
    if(args.dbname):
        dbs.append(args.dbname)
    else:
        if hostname == 'filedb01':
            dbs = filedb01dbs
        elif hostname == 'filedb10':
            dbs = filedb10dbs
        elif hostname == 'filedb11':
            dbs = filedb11dbs
        elif hostname == 'filedb12':
            dbs = filedb12dbs
    
    basetable = args.basetable

    # dbs = ['vdj1']
    for database in dbs:
        currentDT = datetime.datetime.now()
        
        print('starting export of {basetable} from {database} at {time}'.format(database=database, basetable=basetable, 
          time=currentDT.strftime("%Y-%m-%d %H:%M:%S")))
        
        
        my_export = Export(database=database, basetable=basetable, debug=False)
        print('Starting multithreaded' + str(my_export.startime))
        pool = ThreadPool(4)
        #results = pool.map(my_export.export_object,my_export.chunk_ids)
        #results = pool.map(my_export.export_source,my_export.chunk_ids)

        
        # this one should generically dump each kind of table, set it using basetable
        # when creating the my_export object
        results = pool.map(my_export.export_table, my_export.chunk_ids)
        
        pool.close()
        pool.join() 
        currentDT = datetime.datetime.now()
        print('FINISHED export of {database} at {time}'.format(database=database, 
            time=currentDT.strftime("%Y-%m-%d %H:%M:%S"))) 
        print('exported {n} files'.format(n=len(results)))
        print('{completed} files completed'.format(completed = len(my_export.completed)))
        print('{skipped} files skipped'.format(skipped = len(my_export.skipped)))
    print('...finished all dbs')



if __name__ == "__main__":
    # to start python env on windows:  & h:/GitHub/jhu-lsst/py/mysql2mssql/env/Scripts/activate.ps1
    main()

    



