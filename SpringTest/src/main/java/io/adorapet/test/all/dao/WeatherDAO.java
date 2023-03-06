package io.adorapet.test.all.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import io.adorapet.test.all.model.Weather;
import io.adorapet.test.jsp.model.Realtor;
import io.adorapet.test.mybatis.model.RealEstate;

@Repository
public interface WeatherDAO {
	
	public int insertWeatherByObject(Weather weather);
	

}
