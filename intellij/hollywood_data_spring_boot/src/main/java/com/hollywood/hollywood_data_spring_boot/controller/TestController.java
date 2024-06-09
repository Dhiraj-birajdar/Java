package com.hollywood.hollywood_data_spring_boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hollywood.hollywood_data_spring_boot.dto.Actor;

@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    String name;

    @GetMapping("")
    public String home() {
    	Staff staff = restTemplate.getForEntity("http://localhost:8080/staff/1", Staff.class).getBody();
        return "<h1>" + name + "</h1>"
        		+ "<h2>"+"Data from wct20"+staff+"</h2>";
    }

    @GetMapping("/err")
    public String error(){
        return "<h1 style='color:red'>Something went 👎 ❌ or invalid URL</h1>";
    }
}
