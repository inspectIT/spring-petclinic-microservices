package org.springframework.samples.petclinic.soap;

import io.spring.guides.gs_producing_web_service.GetAnimalRequest;
import io.spring.guides.gs_producing_web_service.GetAnimalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AnimalEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private AnimalRepository animalRepository;

    @Autowired
    public AnimalEndpoint(AnimalRepository countryRepository) {
        this.animalRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAnimalRequest")
    @ResponsePayload
    public GetAnimalResponse getAnimal(@RequestPayload GetAnimalRequest request) {
        GetAnimalResponse response = new GetAnimalResponse();
        response.setAnimal(animalRepository.findAnimal(request.getName()));

        return response;
    }
}
