package com.cg1.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg1.entity.Weather;
import com.cg1.Exceptions.ExceptionHandler;
import com.cg1.dao.WeatherJpaRepository;



@Service("/weatherService")
public class WeatherServiceImpl implements WeatherService {
	
	@Autowired
	WeatherJpaRepository Repo;



	@Override
	public List<Weather> addWeather(Weather weather) {
	   
		Repo.saveAndFlush(weather);
		return Repo.findAll();
		
		
	}
	@Override
    public List<Weather> viewWeather() {
		List<Weather> l=Repo.findAll();
		if(l.isEmpty())
			throw new ExceptionHandler("No weather found");
		else
	      return Repo.findAll();
	}

	@Override
	public List<Weather> removeWeather(int id) {
		// TODO Auto-generated method stub
		System.out.println("Weather Remove Successfully");
		Optional<Weather> w = Repo.findById(id);
		if(!w.isPresent())
			throw new ExceptionHandler("No Id Found to delete");
		else {
			Repo.deleteById(id);
			return Repo.findAll();
		}
       
	}
	
	public List<Weather> listWeatherByName(String name) {
		// TODO Auto-generated method stub
		System.out.println("In method list city by name");
		List<Weather> list = Repo.findAll();
		List<Weather> list1 = new ArrayList<>();
		for(Weather t : list)
		{
			if(t.getLocation().equals(name))
			{
				list1.add(t);
			}
		}
		if(list1.isEmpty()) {
			throw new ExceptionHandler("No city found");
		}
		else {
			return list1;
		}
	}
	public Weather updateWeather(Weather w) {
		// TODO Auto-generated method stub
			Repo.save(w);
			return w;
			
	
	}

	

	
}