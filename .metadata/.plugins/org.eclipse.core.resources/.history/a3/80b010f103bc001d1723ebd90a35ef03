package io.adorapet.test.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.adorapet.test.all.bo.WeatherBO;
import io.adorapet.test.all.model.Weather;

@Controller
public class WeatherController {
	
	@Autowired
	private WeatherBO weatherBO;
	
	@PostMapping("/add_realtor")
	public String addWeather(
		@ModelAttribute Weather weather 
		, Model model) {
		

		
		int count = weatherBO.addRealtorByObject(weather);
		model.addAttribute("weather", weather);
		
		return "/weatherpage";
	}

}
