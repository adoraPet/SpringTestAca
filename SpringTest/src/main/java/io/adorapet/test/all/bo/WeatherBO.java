package io.adorapet.test.all.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.adorapet.test.all.dao.WeatherDAO;
import io.adorapet.test.all.model.Weather;

@Service
public class WeatherBO {
	
	@Autowired
	private WeatherDAO weatherDAO;
	
	public int addRealtorByObject(Weather weather) {
		return weatherDAO.insertWeatherByObject(weather);
	}

}
