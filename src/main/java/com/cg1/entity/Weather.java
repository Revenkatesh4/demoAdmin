package com.cg1.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weather")
public class Weather {
	@Id
	private Integer locationId;
	@Column(name="City")
	private String location;
	@Column(name="Temperature")
	private Double temp;
	@Column(name="Humidity")
	private Double humidity;
	@Column(name="Pressure")
	private Double pressure;
	
	public Weather() {
		
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Double getTemp() {
		return temp;
	}

	public void setTemp(Double temp) {
		this.temp = temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getPressure() {
		return pressure;
	}

	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}

	public Weather(Integer locationId, String location, Double temp, Double humidity, Double pressure) {
		super();
		this.locationId = locationId;
		location = location;
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "Weather [locationId=" + locationId + ", Location=" + location + ", temp=" + temp + ", humidity="
				+ humidity + ", pressure=" + pressure + "]";
	}


	
}