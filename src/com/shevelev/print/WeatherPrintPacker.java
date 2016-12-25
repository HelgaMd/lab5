package com.shevelev.print;

import com.github.fedy2.weather.data.Channel;

/**
 * Created by Денис on 25.12.2016.
 */

public class WeatherPrintPacker {
    public static String printWeather(Channel channel){
        return String.format("Текущая погода в %s является %s", channel.getLocation().getCity(), channel.getItem().getCondition().getTemp());
            }
}
