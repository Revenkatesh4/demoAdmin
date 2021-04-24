package com.cg1.controller;



import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg1.entity.Weather;
import com.cg1.services.WeatherService;
import com.cg1.services.WeatherServiceImpl;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	@Autowired
	WeatherServiceImpl weatherServices;
	
	
	@GetMapping("/report")
	public List<Weather> viewWeather() 
	{
		System.out.println("get all Weather controller");
		return weatherServices.viewWeather();
	}
	 
	@GetMapping("/findByCity/{name}")
	public List<Weather> getCityByName(@PathVariable(value="name") String name)
	{
		return weatherServices.listWeatherByName(name);
		
	}
	
	@PutMapping(value="/editweather")
	public Weather editWeather(@RequestBody Weather w) {
		return weatherServices.updateWeather(w);
	}

	
	@DeleteMapping("delete/{id}")
	public List<Weather> removeWeather(@PathVariable(value="id")Integer id)
	{
		return weatherServices.removeWeather(id);
	}
	
	@PostMapping(value="/insert")
	public List<Weather> updateWeather(@RequestBody Weather t)
	{
		return weatherServices.addWeather(t);
	}
}
