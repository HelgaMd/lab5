package com.shevelev.print;

import com.shevelev.service.WeatherService;
import org.springframework.stereotype.Component;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by Денис on 25.12.2016.
 */

@Component
public class WeatherPrint {
    private WeatherService weatherService;

    public WeatherPrint(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public void printWeather() throws JAXBException, IOException {
               System.out.println(WeatherPrintPacker.printWeather(weatherService.getWeather()));
           }
}
