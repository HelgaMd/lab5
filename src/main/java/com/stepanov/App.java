package com.stepanov;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[] {"config.xml"});
        YahooPrinter printer = (YahooPrinter) ac.getBean("yahooPrinter");
        System.out.println(printer.getWeather());
    }
}
