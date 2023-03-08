package io.adorapet.test.all.dao;


import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.adorapet.test.all.model.Weather;


@Repository
public interface WeatherDAO {
	
	public int insertWeather(Weather weather);
	

}
