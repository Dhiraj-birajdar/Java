//package com.digistore.service;
//import com.digistore.model.User;
//import com.digistore.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    public User registerUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }
//
//    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//
//    public User updateUser(User user) {
//        return userRepository.save(user);
//    }
//}
