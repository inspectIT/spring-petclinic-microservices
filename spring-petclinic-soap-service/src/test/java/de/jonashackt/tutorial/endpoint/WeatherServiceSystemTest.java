package de.jonashackt.tutorial.endpoint;

import static de.jonashackt.tutorial.utils.TestHelper.generateDummyRequest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import de.codecentric.namespace.weatherservice.WeatherException;
import de.codecentric.namespace.weatherservice.WeatherService;
import de.codecentric.namespace.weatherservice.general.ForecastRequest;
import de.codecentric.namespace.weatherservice.general.ForecastReturn;

 @SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherServiceSystemTest {

    @Autowired
    private WeatherService weatherServiceSystemTestClient;
    
    @Test
    public void getCityForecastByZIP() throws WeatherException {
        // Given
        ForecastRequest forecastRequest = generateDummyRequest();
        
        // When
        ForecastReturn forecastReturn = weatherServiceSystemTestClient.getCityForecastByZIP(forecastRequest);
        
        // Then
        assertNotNull(forecastReturn);
        assertEquals(true, forecastReturn.isSuccess());
        assertEquals("Weimar", forecastReturn.getCity());
        assertEquals("22%", forecastReturn.getForecastResult().getForecast().get(0).getProbabilityOfPrecipiation().getDaytime());
    }
}
