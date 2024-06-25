package de.novatec.inspectit.springpetclinicsoapclient;

import de.novatec.inspectit.springpetclinicsoapclient.configuration.CXFBootSimpleClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringPetclinicSoapClientApplication {

    CXFBootSimpleClientConfiguration clientConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(SpringPetclinicSoapClientApplication.class, args);

    }

    public void setClientConfiguration(CXFBootSimpleClientConfiguration clientConfiguration) {

    }

}
