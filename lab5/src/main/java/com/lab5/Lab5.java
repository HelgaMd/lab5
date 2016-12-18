package com.lab5;

import java.io.IOException;
import javax.xml.bind.JAXBException;
import com.github.fedy2.weather.data.Channel;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author Dron
 */
@Configuration
@ComponentScan
public class Lab5 {
    static private Channel channel;

    @Bean
    Service mockMessageService() {
        return () -> "Temperature in " + channel.getLocation().getCity() + " = " + channel.getItem().getCondition().getTemp();
    }

    /**
     * @param args
     * @throws JAXBException
     * @throws IOException
     */
    public static void main(String[] args) throws JAXBException, IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext(Lab5.class);
        Printer messageprinter = context.getBean(Printer.class);

        Request wr = new Request();
        channel = wr.request("Piter");

        messageprinter.printMessage();
    }
}
