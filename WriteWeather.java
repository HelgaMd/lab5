package lab5.weather;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class WriteWeather {
	private WeatherParser weatherParser;
    private WeatherService weatherService;

    public WriteWeather (WeatherService weatherService, WeatherParser weatherParser) {
        this.weatherParser = weatherParser;
        this.weatherService = weatherService;
    }

    public void printWeather (String location) throws JAXBException, IOException {
        System.out.println(weatherParser.parse(weatherService.getWeather(location)));
    }
}
