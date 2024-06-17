# Soap Service for Spring Petclinic
This service is a SOAP-based service for the Spring Petclinic application. 
It is used to demonstrate and try how we can instrument SOAP-based Services with inspectIT.

## Technology
The service is based on Spring Boot and uses Apache CXF to provide a SOAP endpoint.
It exposes a WSDL, which is implemented by spring-petclinic-soap-client.

## Testing
The service can be tested by itself or by using the spring-petclinic-soap-client.
### To test it by itself you have to:
1. Start the docker-compose environment
2. Make a request to the service at http://localhost:8877/soap-api/WeatherSoapService_1.0 using a client like SoapUI, curl or Postman.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:gen="http://www.codecentric.de/namespace/weatherservice/general">
    <soapenv:Header/>
    <soapenv:Body>
        <gen:GetCityForecastByZIP>
            <gen:ForecastRequest>
                <gen:ZIP>99425</gen:ZIP>
                <gen:flagcolor>bluewhite</gen:flagcolor>
                <gen:productName>ForecastBasic</gen:productName>
                <gen:ForecastCustomer>
                    <gen:Age>30</gen:Age>
                    <gen:Contribution>5000</gen:Contribution>
                    <gen:MethodOfPayment>Paypal</gen:MethodOfPayment>
                </gen:ForecastCustomer>
            </gen:ForecastRequest>
        </gen:GetCityForecastByZIP>
    </soapenv:Body>
</soapenv:Envelope>
```
This request will return a weather forecast for the ZIP code 99425.
The answer should look like this:
```xml
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
    <soap:Body>
        <GetCityForecastByZIPResponse xmlns="http://www.codecentric.de/namespace/weatherservice/general" xmlns:ns2="http://www.codecentric.de/namespace/weatherservice/datatypes" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:ns4="http://www.codecentric.de/namespace/weatherservice/exception">
            <GetCityForecastByZIPResult>
                <Success>true</Success>
                <State>Deutschland</State>
                <City>Weimar</City>
                <WeatherStationCity>Weimar</WeatherStationCity>
                <ForecastResult>
                    <ns2:Forecast>
                        <ns2:Date>2024-06-17T08:46:26.469+02:00</ns2:Date>
                        <ns2:WeatherID>0</ns2:WeatherID>
                        <ns2:Desciption>Vorhersage für Weimar</ns2:Desciption>
                        <ns2:Temperatures>
                            <ns2:MorningLow>0°</ns2:MorningLow>
                            <ns2:DaytimeHigh>90°</ns2:DaytimeHigh>
                        </ns2:Temperatures>
                        <ns2:ProbabilityOfPrecipiation>
                            <ns2:Nighttime>5000%</ns2:Nighttime>
                            <ns2:Daytime>22%</ns2:Daytime>
                        </ns2:ProbabilityOfPrecipiation>
                    </ns2:Forecast>
                </ForecastResult>
            </GetCityForecastByZIPResult>
        </GetCityForecastByZIPResponse>
    </soap:Body>
</soap:Envelope>
```

### Alternatively you can also test the service using the spring-petclinic-soap-client:
1. Start the docker-compose environment
2. Make a request to the service using the spring-petclinic-soap-client at http://localhost:56100/weather/99423/45/50555.
3. The Client will now call the service and return the city name (Weimar) for the ZIP code 99423.
4. The answer should look like this:
```json
{
    "city": "Weimar"
}
```
