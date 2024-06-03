package org.bcci.worldcupt20.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to World Cup T20</h1>" +
                "<h3>API for World Cup T20 Staff</h3>"+
                "<h3><p>Use the following endpoints to get information about the staff:</p>" +
                "<ul>" +
                "<li><a href='/all'>/all</a> - Get all staff</li>" +
                "<li><a href='/captain'>/captain</a> - Get the captain</li>" +
                "<li><a href='/coach'>/coach</a> - Get the head coach</li>" +
                "<li><a href='/batsmans'>/batsmans</a> - Get all batsmans</li>" +
                "<li><a href='/bowlers'>/bowlers</a> - Get all bowlers</li>" +
                "<li><a href='/coaches'>/coaches</a> - Get all coaches</li>" +
                "<li><a href='/staff'>/staff</a> - Get all staff names</li>" +
                "<li><a href='/highestpaid'>/highestpaid</a> - Get the highest paid staff</li>" +
                "</ul></h3>";
    }
}
