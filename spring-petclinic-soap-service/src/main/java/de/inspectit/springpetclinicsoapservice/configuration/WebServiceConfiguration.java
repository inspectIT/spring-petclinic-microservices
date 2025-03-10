package de.inspectit.springpetclinicsoapservice.configuration;

import de.codecentric.namespace.weatherservice.Weather;
import de.codecentric.namespace.weatherservice.WeatherService;
import de.inspectit.springpetclinicsoapservice.soapmsglogging.SoapMsgToMdcExtractionLoggingInInterceptor;
import de.inspectit.springpetclinicsoapservice.soapmsglogging.SoapMsgToMdcExtractionLoggingOutInterceptor;
import de.inspectit.springpetclinicsoapservice.endpoint.WeatherServiceEndpoint;
import jakarta.annotation.Resource;
import jakarta.xml.ws.Endpoint;
import jakarta.xml.ws.WebServiceContext;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.interceptor.AbstractLoggingInterceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class WebServiceConfiguration {

    public static final String BASE_URL = "/soap-api";
    public static final String SERVICE_URL = "/WeatherSoapService_1.0";

    @Bean
    public ServletRegistrationBean cxfServlet() {
        return new ServletRegistrationBean(new CXFServlet(), BASE_URL + "/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus() {
        SpringBus springBus = new SpringBus();
        springBus.getInInterceptors().add(logInInterceptor());
        springBus.getInFaultInterceptors().add(logInInterceptor());
        springBus.getOutInterceptors().add(logOutInterceptor());
        springBus.getOutFaultInterceptors().add(logOutInterceptor());
        return springBus;
    }

    @Bean
    public WeatherService weatherService() {
    	return new WeatherServiceEndpoint();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(springBus(), weatherService());
        // CXF JAX-WS implementation relies on the correct ServiceName as QName-Object with
        // the name-Attribute´s text <wsdl:service name="Weather"> and the targetNamespace
        // "http://www.codecentric.de/namespace/weatherservice/"
        // Also the WSDLLocation must be set
        endpoint.setServiceName(weather().getServiceName());
        endpoint.setWsdlLocation(weather().getWSDLDocumentLocation().toString());
        endpoint.publish(SERVICE_URL);
        return endpoint;
    }




    @Bean
    public Weather weather() {
        // Needed for correct ServiceName & WSDLLocation to publish contract first incl. original WSDL
        return new Weather();
    }

    @Bean
    public AbstractLoggingInterceptor logInInterceptor() {
        LoggingInInterceptor logInInterceptor = new SoapMsgToMdcExtractionLoggingInInterceptor();
        logInInterceptor.setPrettyLogging(true);
        return logInInterceptor;
    }

    @Bean
    public AbstractLoggingInterceptor logOutInterceptor() {
        LoggingOutInterceptor logOutInterceptor = new SoapMsgToMdcExtractionLoggingOutInterceptor();
        logOutInterceptor.setPrettyLogging(true);
        return logOutInterceptor;
    }
}
