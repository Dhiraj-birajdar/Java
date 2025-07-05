package com.dhiraj.democrud.controller;

import com.dhiraj.democrud.entity.User;
import com.dhiraj.democrud.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoController {

    private final DemoService service;

    @PostMapping("save")
    public ResponseEntity<User> insert(@RequestBody User user){
        return ResponseEntity.ok(service.insert(user));
    }

    @PutMapping("update")
    public ResponseEntity<User> update(@RequestBody User user){
        return ResponseEntity.ok(service.update(user));
    }

    @GetMapping("get")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
