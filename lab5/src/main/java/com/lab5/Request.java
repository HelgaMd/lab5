package com.lab5;

import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author Dron
 */
public class Request {
    Channel request(String city) throws JAXBException, IOException {
        YahooWeatherService service = new YahooWeatherService();

        return service.getForecastForLocation(city, DegreeUnit.CELSIUS).first(3).get(0);
    }
}
