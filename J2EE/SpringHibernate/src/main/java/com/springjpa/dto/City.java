package com.springjpa.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Setter;

@Entity
public class City {
    @Id
    private int id;
    private String name;
//    @Column(name = "countrycode")
    private String countrycode;
    private String district;
    private int population;
    
    
	public City() {
		super();
	}
	public City(int id, String name, String countryCode, String district, int population) {
		super();
		this.id = id;
		this.name = name;
		this.countrycode = countryCode;
		this.district = district;
		this.population = population;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countrycode;
	}
	public void setCountryCode(String countryCode) {
		this.countrycode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
    
    
}
