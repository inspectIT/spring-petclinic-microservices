package de.inspectit.springpetclinicsoapservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SimpleBootCxfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootCxfApplication.class, args);
    }
}
