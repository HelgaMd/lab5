package com.shevelev;

import com.shevelev.print.WeatherPrint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import javax.xml.bind.JAXBException;
import java.io.IOException;

/**
 * Created by Денис on 24.12.2016.
 */

public class WeatherMain {
    public static void main(String[] args) throws JAXBException, IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        WeatherPrint weatherPrint = context.getBean(WeatherPrint.class);
        weatherPrint.printWeather();
    }
}
