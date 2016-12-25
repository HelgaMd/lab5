package com.modzal;

import com.github.fedy2.weather.data.Channel;

public class WeatherParser {

	public String getParseString(Channel chObj) {
		return String.format("Description:%s\nDegrees:%s", chObj.getDescription(), 
														   chObj.getItem().getCondition().getTemp());
	}
}
