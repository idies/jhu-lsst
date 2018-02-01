
from __future__ import print_function
import os
from subprocess import check_output



def wc(fpath):
    return int(check_output(['wc', '-l', fpath]).split()[0])

def main():
    #dir = '/home/swerner/GitHub/jhu-lsst/parts/csv'
    #dir = '/home/swerner/LSST/csv'
    dir ='/sciserver/gerard_virgo_data/LSST/csv'

    outfile = open('rowsfile2.csv', 'w')


    for root, dirs, files in os.walk(dir):
        for file in sorted(files):
            name, ext = os.path.splitext(file)
            if ext == '.csv':
                if name.find('_') > 1:
                    tablename, chunk = name.split('_')
                    fpath = os.path.join(dir, file)
                    count = 0
                    #for line in open(fpath).xreadlines( ): count+= 1
                    count = wc(fpath)
                    bytes = os.stat(fpath).st_size
                    if count > 1:
                        #outfile.writeline('{},{},{},{},{},{}'.format(fpath, file, tablename, chunk, count, bytes))
                        print ('{},{},{},{},{},{}'.format(fpath, file, tablename, chunk, count, bytes),file=outfile)
                        print ('{},{},{},{},{},{}'.format(fpath, file, tablename, chunk, count, bytes))

    outfile.close()







if __name__ == "__main__":
    main()