"""
used to turn mysqldump into csv files
new directories contain database names
csv files are named after corresponding table
things inside csv files are from each mysql table

Code for handling INSERT INTO mostly found from online

Makes use of multiprocessing to use multiple CPU for converting to csv

mysqldump -p database_name table_name > something.sql
sudo python tabledump_to_csv.py something.sql 

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
    return line.partition('` VALUES ')[2]


def values_sanity_check(values):
    """
    Ensures that values from the INSERT statement meet basic checks.
    """
    assert values
    assert values[0] == '('
    # Assertions have not been raised
    return True


def parse_values(values, outfile):
    """
    Given a file handle and the raw values from a MySQL INSERT
    statement, write the equivalent CSV to the file
    """
   
    latest_row = []

    reader = csv.reader([values], delimiter=',',
                        doublequote=False,
                        escapechar='\\',
                        quotechar="'",
                        strict=True
    )

    writer = csv.writer(outfile, quoting=csv.QUOTE_MINIMAL)
    for reader_row in reader:
        #print(reader_row)
        for column in reader_row:
            #print(column)
            # If our current string is empty...
            if len(column) == 0 or column == 'NULL':
                latest_row.append(chr(0))
                continue
            # If our string starts with an open paren
            if column[0] == "(":
                # Assume that this column does not begin
                # a new row.
                new_row = False
                # If we've been filling out a row
                if len(latest_row) > 0:
                    # Check if the previous entry ended in
                    # a close paren. If so, the row we've
                    # been filling out has been COMPLETED
                    # as:
                    #    1) the previous entry ended in a )
                    #    2) the current entry starts with a (
                    if latest_row[-1][-1] == ")":
                        # Remove the close paren.
                        latest_row[-1] = latest_row[-1][:-1]
                        new_row = True
                # If we've found a new row, write it out
                # and begin our new one
                if new_row:
                    writer.writerow(latest_row)
                    latest_row = []
                # If we're beginning a new row, eliminate the
                # opening parentheses.
                if len(latest_row) == 0:
                    column = column[1:]
            # Add our column to the row we're working on.
            latest_row.append(column)
        # At the end of an INSERT statement, we'll
        # have the semicolon.
        # Make sure to remove the semicolon and
        # the close paren.
        if latest_row[-1][-2:] == ");":
            latest_row[-1] = latest_row[-1][:-2]
            writer.writerow(latest_row)

def eval_insert(line,tablename):
    if is_insert(line):
        outfile = open("./" + tablename + ".csv","a")
        #print("inserting " + str(line) + " into " + str(outfile))
        values = get_values(line)
        if values_sanity_check(values):
            parse_values(values, outfile)
        outfile.close() 

def insert_into_outfile(line):
    #print("insert_into" + str(line[0]))
    eval_insert(line[0],line[1])


def main():
    """
    Parse arguments and start the program
    """
    # Iterate over all lines in all files
    # listed in sys.argv[1:]
    # or stdin if no args given.
    try:
        outfile = sys.stdout
        dbname = ""
        inschema = False
        headerline = ""
        alllines = []
        for line in fileinput.input():
            alllines.append(line)
            # Look for the schema and create header line
            if create_table(line):
                table_name = get_table_name(line)
                outfile = open("./" + table_name + ".csv","wb+")
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
        
        fileinput.close()   
        #print("header created")
        pool = multiprocessing.Pool(processes=numprocessors)
        appendedlist = map(lambda l: (l,table_name),alllines)
        r = pool.map(insert_into_outfile,appendedlist)
        pool.close()
        #print("values inserted")
        

    except KeyboardInterrupt:
        sys.exit(0)

if __name__ == "__main__":
    main()
