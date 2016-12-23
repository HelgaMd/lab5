package com.etu.algrigorova;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class WeatherService {

    public Channel getWeather (String location) throws JAXBException, IOException {
        YahooWeatherService service = new YahooWeatherService();
        return service.getForecastForLocation(location, DegreeUnit.CELSIUS).first(1).get(0);
    }

}
