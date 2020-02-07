# add these to your .bashrc or .bash_profile in your home directory


alias kf="kubectl -n filedb"
#######
# kubectl is the command to do anything involving kubernetes
# filedb is the namespace
# kf get all    ## show everything in filedb namespace
# kf get po     ## show all pods in filedb namespace
# kf describe po <pod name> ## get detailed info about a pod
                            ## for example:    kf describe po storage-0-0
                                               kf describe po master-0
##### getting onto a container
# usage: kfc <name of pod to connect to> <name of containter>
# to get onto the hadoop container of the storage-0-0 pod:  kfc storage-0-0 hadoop

function kfc { kubectl exec -n filedb -ti "$1" -c "$2" -- env TERM=term LINES=$LINES COLUMNS=$COLUMNS /bin/bash; }
export -f kfc
