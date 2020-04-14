#! /bin/bash

azdata bdc config replace -c custom-ad/control.json -j "$.security.activeDirectory.ouDistinguishedName=OU\=filedb\,DC\=sdss\,DC\=pha\,DC\=jhu\,DC\=edu"
azdata bdc config replace -c custom-ad/control.json -j "$.security.activeDirectory.dnsIpAddresses=[\"172.23.38.117\",\"172.23.251.123\"]"
azdata bdc config replace -c custom-ad/control.json -j "$.security.activeDirectory.domainControllerFullyQualifiedDns=[\"sdssdc5.sdss.pha.jhu.edu\",\"sdssdc2.sdss.pha.jhu.edu\"]"
azdata bdc config replace -c custom-ad/control.json -j "$.security.activeDirectory.domainDnsName=sdss.pha.jhu.edu"
azdata bdc config replace -c custom-ad/control.json -j "$.security.activeDirectory.clusterAdmins=[\"filedb-sysadmins\"]"
azdata bdc config replace -c custom-ad/control.json -j "$.security.activeDirectory.clusterUsers=[\"filedb-dbas\"]"
#Example for providing multiple clusterUser groups: [\"bdcusergroup1\",\"bdcusergroup2\"]
