package com.etu.algrigorova;

import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Spring bean
 */
public class WeatherToConsole {

    private WeatherParser weatherParser;
    private WeatherService weatherService;

    public WeatherToConsole (WeatherService weatherService, WeatherParser weatherParser) {
        this.weatherParser = weatherParser;
        this.weatherService = weatherService;
    }

    public void printWeather (String location) throws JAXBException, IOException {
        System.out.println(weatherParser.parse(weatherService.getWeather(location)));
    }
}
