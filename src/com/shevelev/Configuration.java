package com.shevelev;

import com.shevelev.service.WeatherService;
import com.shevelev.service.WeatherServiceImpl;
import org.springframework.context.annotation.*;

/**
 * Created by Денис on 24.12.2016.
 */

/**
 * Конфигурационный класс Spring IoC контейнера
 */

@ComponentScan(basePackages = "com.shevelev.service,com.shevelev.print" )
public class Configuration {
    @Bean
    @Description("Получить прогноз погоды в Санкт-Петербурге(текущее описания бина weatherService)")
    public WeatherService weatherService(){
        return new WeatherServiceImpl();
    }
}
