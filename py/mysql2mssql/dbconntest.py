import os, sys
import mysql.connector
import time
import argparse



def dbconnect(user='lsst', password='lsst2018', host='127.0.0.1', database='vdi1', raise_on_warnings=True):

    config = {
        'user' : user,
        'password': password,  #read only, local only user
        'host': host,     #for filedb 10
        'database': database,
        'raise_on_warnings': raise_on_warnings
    }

    cnx = mysql.connector.connect(**config)

    return cnx

c = dbconnect()
cursor = c.cursor()

query = ("select ra from Object_10048 limit 10;")

cursor.execute(query)

for x in cursor:
    print(x)





