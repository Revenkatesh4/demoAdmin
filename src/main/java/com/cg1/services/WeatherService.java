package com.cg1.services;


import java.util.List;

import com.cg1.entity.Weather;




public interface WeatherService{
	
	public List<Weather> addWeather(Weather weather);
	public List<Weather> viewWeather();
	public Weather updateWeather(Weather w);
	public List<Weather> removeWeather(int id);
}
