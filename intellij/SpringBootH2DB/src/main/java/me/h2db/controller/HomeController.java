package me.h2db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to World Cup T20 2024!</h2>" +
                "<h2>Api Documentation</h2>" +
                "<ul>" +
                "<li>GET /staff/all - Get all staff</li>" +
                "<li>GET /staff/role/{role} - Get staff by role</li>" +
                "<li>GET /staff/{id} - Get staff by ID</li>" +
                "<li>GET /staff/experience/{exp} - Get staff by experience</li>" +
                "<li>POST /staff - Add a new staff</li>" +
                "<li>PUT /staff/{id} - Update staff by ID</li>" +
                "<li>DELETE /staff/{id} - Delete staff by ID</li>" +
                "</ul>";
    }
}
