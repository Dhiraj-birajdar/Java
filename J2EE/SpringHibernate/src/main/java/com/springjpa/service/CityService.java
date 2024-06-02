package com.springjpa.service;

import com.springjpa.dao.CityDAO;
import com.springjpa.dto.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityDAO cd;

    public City getCityById(int id) {
        return cd.getCityById(id);
    }

    public List<City> getCitiesLimit(int limit) {
        return cd.getCitiesLimit(limit);
    }

    public List<City> getCitiesByCountry(String countryCode) {
        return cd.getCities().stream().filter(city -> city.getCountryCode().equals(countryCode)).toList();
    }
}
