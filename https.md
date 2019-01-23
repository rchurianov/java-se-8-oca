# Making https requests from java application

## Files overview

keystore.jks

contains application server's certificate with its private key/

cacerts.jks

truststore file
contains public keys from other websites

## Overall plan

1. Set up certificates
Supposing that you have already obtained yuor SSL certificate

2. Make http requests

## Set up certificates

Prerequisites:

files available:
key.kdb
key.sth

1. unstash key.sth
2. start ikeyman
3. export key.kdb as key.jks
4. import key.jks to keystore.jks

5. Setup WebSphere's default inbound SSL truststore


## Make http requests

1. What version of Apache cLient do I have installed?

httpclient-4.2.5.jar

2. How to import httpclient components without mixing them with something else like Appachec HTTP Components?


