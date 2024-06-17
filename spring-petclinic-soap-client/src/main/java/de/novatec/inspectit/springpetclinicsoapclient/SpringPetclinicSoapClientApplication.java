package de.novatec.inspectit.springpetclinicsoapclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringPetclinicSoapClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPetclinicSoapClientApplication.class, args);
    }

}
