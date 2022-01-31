#Generate encrypted token
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input=6 password=secretKey algorithm=PBEWithMD5AndDES