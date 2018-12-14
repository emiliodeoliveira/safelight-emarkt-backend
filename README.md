

# Safelight eMarkt [![Build Status](https://travis-ci.org/emiliodeoliveira/safelight-emarkt-backend.svg?branch=master)](https://travis-ci.org/emiliodeoliveira/safelight-emarkt-backend)

Safelight eMarkt API with Spring and Maven based on Rowling LMS.

Please, open an issue if you discover sonething wrong in the system.

### First steps:

1) On the command line
```
git clone https://github.com/emiliodeoliveira/safelight-emarkt-backend.git
```
2) Inside Eclipse or STS
```
File -> Import -> Maven -> Existing Maven project
```
3) Inside IntelliJ IDEA

In the main menu, choose `File -> Open` and select the eMarkt [pom.xml](pom.xml). Click on the `Open` button.

CSS files are generated from the Maven build. You can either build them on the command line `./mvnw generate-resources`
or right click on the `safelight-emarkt-backend` project then `Maven -> Generates sources and Update Folders`.

A run configuration named `EmarktApplication` should have been created for you if you're using a recent Ultimate
version. Otherwise, run the application by right clicking on the `EmarktApplication` main class and choosing
`Run 'EmarktApplication'`.

4) Use http://localhost:4200/login to login in the system and get the token.

The live version is hosted on https://safelight-emarkt-backend.herokuapp.com/ 

