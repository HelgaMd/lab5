package com.modzal;

import com.github.fedy2.weather.data.Channel;


public class WeatherPrinter {
	
	private WeatherService yahooObj;
	private WeatherParser parserObj;
	
	WeatherPrinter(WeatherService y, WeatherParser p) {
		this.yahooObj = y;
		this.parserObj = p;
	}
	
	public String getWeather() {
		Channel chObj = this.yahooObj.queryWeather();
		
		return parserObj.getParseString(chObj);
	}
}
