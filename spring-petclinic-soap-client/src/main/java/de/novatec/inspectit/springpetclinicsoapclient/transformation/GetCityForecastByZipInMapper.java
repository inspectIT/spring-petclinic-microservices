package de.novatec.inspectit.springpetclinicsoapclient.transformation;

import de.codecentric.namespace.weatherservice.general.ForecastReturn;
import de.novatec.inspectit.springpetclinicsoapclient.dto.WeatherResponse;

public class GetCityForecastByZipInMapper {

    private GetCityForecastByZipInMapper() {}

    public static WeatherResponse mapForecastResponseToWeatherResponse(ForecastReturn forecastReturn) {
        WeatherResponse weatherResponse = new WeatherResponse();
        weatherResponse.setCity(forecastReturn.getCity());
        return weatherResponse;
    }
}
