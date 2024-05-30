package com.springjpa.controller;

import com.springjpa.dto.City;
import com.springjpa.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    CityService cs;

    @RequestMapping("city")
    public String getCityById(@RequestParam(defaultValue = "1") int id) {
        return cs.getCityById(id).toString();
    }

    @RequestMapping("cities")
    public List<City> getCitiesLimit(@RequestParam(defaultValue = "10") int limit) {
        return cs.getCitiesLimit(limit);
    }

    @GetMapping("country") //citiesbycountry
    public List<City> getCitiesByCountry(@RequestParam(defaultValue = "USA") String code){
        return cs.getCitiesByCountry(code.toUpperCase());
    }
}
