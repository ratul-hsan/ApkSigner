## Description
ApkSigner is a clone of [PseudoApkSigner](https://github.com/Aefyr/PseudoApkSigner). But it can cached default private key and rsa template file to sign apps if you don't provide one 
## How it works
It works same as [PseudoApkSigner](https://github.com/Aefyr/PseudoApkSigner). But this modified library can sign apps with stored bytes of private key file and template file if you don't provide any key or template file.
## Adding to Project
Copy apksigner folder to your project directory or download jar file from releases and put it in libs folder.
## Usage
You can use it with private key file and template file in the same way you would use in PseudoApkSigner.
```java
new ApkSigner(new File("PrivateKeyFile"), new File("TemplateFile")).sign("UnsignedInputApkPath", "SignedOutputApkPath");  
```
But if you want to use it without any private key file and template file then use this code to create a new ApkSigner instance
```java
ApkSigner apkSigner = new ApkSigner("CERT");  
```
Once you created an instance, call the sign function to sign any apk file
```java
apkSigner.sign("UnsignedInputApkPath", "SignedOutputApkPath");  
```
