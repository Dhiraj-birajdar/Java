//package com.digistore.controller;
//
//import com.digistore.model.User;
//import com.digistore.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/register")
//    public ResponseEntity<User> registerUser(@RequestBody User user) {
//        return ResponseEntity.ok(userService.registerUser(user));
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<User> loginUser(@RequestBody User user) {
//        User foundUser = userService.findByUsername(user.getUsername());
//        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
//            return ResponseEntity.ok(foundUser);
//        }
//        return ResponseEntity.status(401).build();
//    }
//
//    @GetMapping("/profile")
//    public ResponseEntity<User> getProfile(@RequestParam String username) {
//        return ResponseEntity.ok(userService.findByUsername(username));
//    }
//
//    @PutMapping("/profile")
//    public ResponseEntity<User> updateProfile(@RequestBody User user) {
//        return ResponseEntity.ok(userService.updateUser(user));
//    }
//}
