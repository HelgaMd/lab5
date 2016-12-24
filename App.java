package lab5.weather;

/**
 * Hello world!
 *
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws JAXBException, IOException 
    {
        //System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/Source/Spring-Module.xml");

        WriteWeather printer = (WriteWeather) context.getBean("WriteWeather");
       
			printer.printWeather("Saint-Petersburg");
    }
}
