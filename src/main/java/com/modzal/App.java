package com.modzal;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        WeatherPrinter printer = (WeatherPrinter) ac.getBean("weatherPrinter");
        System.out.println(printer.getWeather());
    }
}

