package com.hollywood.hollywood_data_spring_boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${spring.application.name}")
    String name;

    @RequestMapping("")
    public String home() {
        return "<h1>" + name + "</h1>";
    }

    @RequestMapping("/err")
    public String error(){
        return "<h1 style='color:red'>Something went 👎 ❌ or invalid URL</h1>";
    }
}
