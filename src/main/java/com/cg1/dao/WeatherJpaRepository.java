package com.cg1.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg1.entity.Weather;

@Repository("WeatherDao")
public interface WeatherJpaRepository extends JpaRepository<Weather, Integer>{

}

