import export as exp
import mysql.connector as sql
import pandas as pd



# for testing
chunkid = 10030
basetable = 'Object'
tablename = exp.generateTableName(basetable, chunkid)


cnx = exp.dbconnect()
sql = exp.generateRawObjectSql(tablename, 10)

df = pd.read_sql(sql, cnx)

    
