package org.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/login")
    public String login(@RequestParam("username") String userName, @RequestParam("password") String password) {
        System.out.println("Logging in @GetMapping /login @RequestParam");
        System.err.println("Username: " + userName);
        System.err.println("Password: " + password);
        return "login";

    }
    @GetMapping("/register")
    public String register(@ModelAttribute User user) {
        System.out.println("Registering user @GetMapping /register @ModelAttribute");
        System.err.println("User: " + user);
        return "login";
    }

    @PostMapping("/register")
    public String registerPost(@RequestBody User user) {
        System.out.println("Registering user @PostMapping /register @RequestBody");
        System.err.println("User: " + user);
        return "login";
    }
}
