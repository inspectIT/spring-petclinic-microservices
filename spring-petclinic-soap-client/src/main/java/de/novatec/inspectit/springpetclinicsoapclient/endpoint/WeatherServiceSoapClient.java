package de.novatec.inspectit.springpetclinicsoapclient.endpoint;



import de.codecentric.namespace.weatherservice.WeatherException;
import de.codecentric.namespace.weatherservice.WeatherService;
import de.codecentric.namespace.weatherservice.general.ForecastReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import de.novatec.inspectit.springpetclinicsoapclient.dto.WeatherRequest;
import de.novatec.inspectit.springpetclinicsoapclient.dto.WeatherResponse;
import de.novatec.inspectit.springpetclinicsoapclient.transformation.GetCityForecastByZipInMapper;
import de.novatec.inspectit.springpetclinicsoapclient.transformation.GetCityForecastByZipOutMapper;

@RestController
@RequestMapping("/weather")
public class WeatherServiceSoapClient {
    private static final Logger LOG = LoggerFactory.getLogger(WeatherServiceSoapClient.class);

    @Autowired
    private WeatherService weatherServiceClient;

    @RequestMapping(path = "/{zipcode}/{seniority}/{cash}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public WeatherResponse getCityForecastByZIP (@PathVariable("zipcode") String zipcode, @PathVariable("seniority") int seniority, @PathVariable("cash") int cash) throws WeatherException {

        LOG.info("GET called on /weather/" + zipcode + "/" + seniority + "/" + cash);

        WeatherRequest weatherRequest = new WeatherRequest();
        weatherRequest.setZipcode(zipcode);
        weatherRequest.setUserSeniority(seniority);
        weatherRequest.setCash(cash);

        LOG.info("Calling SOAP service with URL: '" + clientUrl + "'");

        ForecastReturn forecastReturn = weatherServiceClient.getCityForecastByZIP(GetCityForecastByZipOutMapper.mapWeatherRequestToForecastRequest(weatherRequest));

        LOG.info("Successfully called SOAP service!");

        return GetCityForecastByZipInMapper.mapForecastResponseToWeatherResponse(forecastReturn);
    }


    @Value("${webservice.client.url}")
    private String clientUrl;

}
