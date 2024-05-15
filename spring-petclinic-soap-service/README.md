# PetClinic Soap Service

This project is a simple SOAP service that provides a list of animals and some information about them.
You can send a xml request, including the name of an animal, and the service will return some information about it.

## How to test the service
Currently, the service is only testable with some api testing tools like Postman or SoapUI (or simply curl).
When running locally and standalone, use following endpoint to test the service:
```
 curl --header "content-type: text/xml" -d @./spring-petclinic-soap-service/request.xml http://[HOST]:[PORT]/ws
```

or go through the api-gateway, when running in the docker-compose:
```
 curl --header "content-type: text/xml" -d @./spring-petclinic-soap-service/request.xml http://[HOST]:[PORT]/api/soap/ws
```

and get informations about the animal named "Gepard".

## Possible improvements
- Create a frontend for the service
- Create InspectIT Configuration for monitoring
- Get rid of the hardcoded animal information and use a database instead
- Get rid of the reference to spring.io in the wsdl file

## Reference
This service is based on a tutorial from spring.io: https://spring.io/guides/gs/producing-web-service/.

