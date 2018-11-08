import export as exp

def main():

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







if __name__ == "__main__":
    main()