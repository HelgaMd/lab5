package com.stepanov;

import com.github.fedy2.weather.data.Channel;


public class YahooPrinter {
	
	private YahooWeather yahooObj;
	
	YahooPrinter(YahooWeather y) {
		this.yahooObj = y;
	}
	
	public String getWeather() {
		Channel chObj = this.yahooObj.queryWeather();
		Parser wethParser = new Parser();
		
		return wethParser.getParseString(chObj);
	}
}
