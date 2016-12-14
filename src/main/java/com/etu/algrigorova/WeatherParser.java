package com.etu.algrigorova;

import com.github.fedy2.weather.data.Channel;

public class WeatherParser {

    public String parse (Channel channel) {
        return "The weather in "+channel.getLocation().getCity()
                + " is " + channel.getItem().getCondition().getTemp() +" "+ channel.getUnits().getTemperature();
    }

}
