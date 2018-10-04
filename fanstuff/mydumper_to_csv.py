"""
modified to turn mydumper output into csv files
new directories contain database names
csv files are named after corresponding table
things inside csv files are from each mysql table

mydumper -p password -B databasename -T tablename -o directoryname -t numberofthreads
sudo python mydumper_to_csv.py databasename.tablename(from mydumper output) 

"""

#!/usr/bin/env python
import fileinput
import csv
import sys
import re
import os
import multiprocessing


numprocessors = 32


# This prevents prematurely closed pipes from raising
# an exception in Python
from signal import signal, SIGPIPE, SIG_DFL
signal(SIGPIPE, SIG_DFL)

# allow large content in the dump
csv.field_size_limit(sys.maxsize)

def is_insert(line):
    """
    Returns true if the line begins a SQL insert statement.
    """
    return line.startswith('INSERT INTO') or False

def create_table(line):
    """
    Returns true if line begins with a create table
    """
    return line.startswith('CREATE TABLE') or False

def create_db(line):
    """
    Returns true if line begins with a create database
    """
    return line.startswith('CREATE DATABASE') or False

def get_db_name(line):
    m = re.search("`(.+?)`",line)
    if m:
        return m.group(1)

def get_table_name(line):
    """
    Returns table name from line
    """
    m = re.search("`(.+?)`",line)
    if m:
        return m.group(1)


def get_values(line):
    """
    Returns the portion of an INSERT statement containing values
    """
    if is_insert(line):
        return None
    
    return line


#Commented out to avoid confusion
#def values_sanity_check(values):
#    
#    Ensures that values from the INSERT statement meet basic checks.
#    
#    assert values
#    assert values[0] == '('
    # Assertions have not been raised
#    return True


def parse_values(values,outfile):
    # for mydumper, just remove the parenthesis and done
    if values is None:
        return

    if values.startswith("("):
        values = values[:-3]
        # remove last 3 "),\n" from the line
        values = values[1:]       
        # remove first "(" from the line
                # add back the line break for the file
	split = values.split(",")
        for i,s in enumerate(split):
            if s == '' or s=="'\\0'" or s=="'^A'" or s=="NULL" or s=="\0" or s=='"\\0"' or s=='"^A"' or s == '"\x01"' or  s == "'\x01'":
                split[i] = '0'

        outfile.write(','.join(split) + "\n")


def eval_insert(line,tablename):
    outfile = open("./" + tablename + ".csv","a")
    values = get_values(line)
    parse_values(values, outfile)
    outfile.close() 

def insert_into_outfile(line):
    eval_insert(line[0],line[1])


def main():
    """
    Parse arguments and start the program
    """
    # Iterate over all lines in all files
    # listed in sys.argv[1:]
    # or stdin if no args given.
    try:
        instrings = sys.argv[1:]
        tablename = ""
        for i in instrings:
            m = re.search("(.*)[\.*](.*)",i)
            if m:
                dbname = m.group(1)
                tablename = m.group(2)
        
        schemafile = open("./"+ dbname + "." + tablename +"-schema.sql")
        datafile = open("./" + dbname + "." + tablename + ".sql")        

        outfile = sys.stdout
        dbname = ""
        inschema = False
        headerline = ""
        for line in schemafile.readlines():
            # Look for the schema and create header line
            if create_table(line):
                outfile = open("./" + tablename + ".csv","w+")
                inschema = True
                continue
            if inschema and not line.startswith(")") and not "KEY" in line:
                m = re.search("`(.+?)`",line)
                if m:
                    headerline += m.group(1) + ","
            if inschema and line.startswith(")"):
                headerline = headerline.rstrip(",")
                headerline += "\n"
                outfile.write(headerline)
                outfile.close()
                headerline = ""
                inschema = False
		break
        schemafile.close()  

        alllines = []
#        print("creating list")
        for line in datafile.readlines():
#            print(line)
#            print("===")
            alllines.append(line)
#        print("list created")
        datafile.close()
         #print("header created")
        pool = multiprocessing.Pool(processes=numprocessors)
#        print("appending to list")
        appendedlist = map(lambda l: (l,tablename),alllines)
#        print("list appended")

        r = pool.map(insert_into_outfile,appendedlist)
        pool.close()
        #print("values inserted")
        

    except KeyboardInterrupt:
        sys.exit(0)

if __name__ == "__main__":
    main()
