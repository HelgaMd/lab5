package com.shevelev.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by Денис on 25.12.2016.
 */

public class WeatherServiceImpl implements WeatherService {
    public Channel getWeather() throws JAXBException, IOException {
        YahooWeatherService service = new YahooWeatherService();
        return  service.getForecast("2123260", DegreeUnit.CELSIUS);
    }
}
