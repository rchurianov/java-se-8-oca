# WebSphere setup

## Add inbound SSL certificate to the default store

The signer might need to be added to the local trust store.
You can use the Retrieve from port option in the administrative console to retrieve the certificate and resolve the problem.
If you determine that the request is trusted, complete the following steps:
1. Log into the administrative console.
2. Expand Security and click SSL certificate and key management. Under Configuration settings, click Manage endpoint security configurations.
3. Select the appropriate *outbound* configuration to get to the (cell):ctgCell01 management scope.
In fact we are trying to make requests to our own server. And the SSL handshake fails when our server tries to check his own response public certificate. Therefore we will manage the *inbound* configuration.
4. Under Related Items, click Key stores and certificates and click the CellDefaultTrustStore key store.
5. Under Additional Properties, click Signer certificates and  Retrieve From Port.
6. In the Host field, enter maximotest.itps.ru in the host name field, enter 8064 in the Port field, and maximotest.itps.ru_cert in the Alias field.
7. Click Retrieve Signer Information. 
8. Verify that the certificate information is for a certificate that you can trust.
9. Click Apply and Save.