package de.inspectit.springpetclinicsoapservice.endpoint;

import static de.inspectit.springpetclinicsoapservice.utils.TestHelper.generateDummyRequest;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import de.codecentric.namespace.weatherservice.WeatherException;
import de.codecentric.namespace.weatherservice.general.ForecastRequest;
import de.codecentric.namespace.weatherservice.general.ForecastReturn;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WeatherServiceTest {

    @Autowired
    private WeatherServiceEndpoint weatherServiceEndpoint;

    @Test
    public void getCityForecastByZIP() throws WeatherException {
        // Given
        ForecastRequest forecastRequest = generateDummyRequest();

        // When
        ForecastReturn forecastReturn = weatherServiceEndpoint.getCityForecastByZIP(forecastRequest);

        // Then
        assertNotNull(forecastReturn);
        assertTrue(forecastReturn.isSuccess());
        assertEquals("Weimar", forecastReturn.getCity());
        assertEquals("22%", forecastReturn.getForecastResult().getForecast().get(0).getProbabilityOfPrecipiation().getDaytime());
    }
}
