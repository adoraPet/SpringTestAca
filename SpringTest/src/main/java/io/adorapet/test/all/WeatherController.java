package io.adorapet.test.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.adorapet.test.all.bo.WeatherBO;
import io.adorapet.test.all.model.Weather;

@Controller
@RequestMapping("/weather")
public class WeatherController {
	
	@Autowired
	private WeatherBO weatherBO;
	
	@PostMapping("/home")
	public String addWeather(
		@ModelAttribute Weather weather 
		, Model model) {
		

		
		int count = weatherBO.addRealtorByObject(weather);
		model.addAttribute("weather", weather);
		
		return "/weatherpage";
	}
	
	@GetMapping("/1")
	public String realtorInput() {
		return "/realtorinput";
	}

}
