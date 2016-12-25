package com.shevelev.service;

import com.github.fedy2.weather.data.Channel;
import org.springframework.stereotype.Component;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by Денис on 25.12.2016.
 */

@Component
public interface WeatherService {
   Channel getWeather() throws JAXBException, IOException;
}
