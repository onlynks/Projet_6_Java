# Projet_3

# Documentation

## Summary

* 1 Prerequisites
* 2 Installation
* 3 Web Service database configuration
* 4 Web Service deployment
* 5 Web Application deployment
* 6 Batch configuration

### 1- Prerequisites

a) Get Eclipse installed
https://www.eclipse.org/downloads/packages/release/kepler/r/eclipse-ide-java-ee-developers

b) Get Tomcat (preferably version 7)
https://tomcat.apache.org/download-70.cgi

c) Get GlassFish (preferably version 5)
https://javaee.github.io/glassfish/download

* Configure tomcat on your eclipse:
windows->Preference->Server->Runtime Environments->Add

* Launch your GlassFish server:
Go to your GlassFish repository->bin->Open your command line tool->copy the root->enter: start-domain domain1->Go to http://localhost:4848/ 

### 2- Installation

Positionnate in the folder of your choice by command line

git clone https://github.com/onlynks/Projet_3.git

* Open your Eclipse
* Right click in the project explorer
* Import
* Existing Maven project
* Select your project directory



### 3- Web Service configuration

* Go to library_webservice\library_webservice_consumer\src\main\resources
* Open db-Projet_3.properties
* Put your settings on: url, driverClassName, username, password

Build your project with maven (Eclipse or command line)

### 4- Web Service deployement

Once you has your Glassfish server running, go to http://localhost:4848/ 

* Go to Application->Deploy->Select the library_webservice_service module's WAR
* Once your application is deployed click on it
* Delete all number after your service name (Services)

### 5- Web Application deployement

Open the model folder's POM.xml (library_webapp\library_webapp_model\pom.xml)

Ensure that the wsdl URL is pointing to your web service running server (most probably Glassfish).

  <configuration>
	  <packageName>com.projet3.library_webapp.library_webapp_model.book</packageName>
	  <sourceDestDir>${project.build.sourceDirectory}</sourceDestDir>
	  <wsdlUrls>
	     <wsdlUrl>http://localhost:8081/Services/BookService?wsdl</wsdlUrl>
	  </wsdlUrls>
  </configuration>




