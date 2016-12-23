package com.etu.algrigorova;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws JAXBException, IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "Spring-Module.xml");

        WeatherToConsole printer = (WeatherToConsole) context.getBean("weatherToConsole");
        printer.printWeather("Saint-Petersburg");

    }
}
