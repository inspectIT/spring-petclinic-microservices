package de.jonashackt.tutorial.configuration;

import de.codecentric.namespace.weatherservice.WeatherService;
import de.jonashackt.tutorial.endpoint.WeatherServiceEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.jonashackt.tutorial.controller.WeatherServiceController;


@Configuration
public class ApplicationConfiguration {

	@Bean
	public WeatherServiceController weatherServiceController() {
		return new WeatherServiceController();
	}

}
