package com.q2.controller;

import com.q2.dto.Employee;
import com.q2.repository.EmployeeList;
import com.q2.repository.Status;
import com.q2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/employee")
public class EmployeeController {
    private final EmployeeService service;

    @PostMapping("/add-employee")
    public ResponseEntity<String> add(@RequestBody Employee e){
//        System.out.println(e);
        if(service.add(e)== Status.SUCCESS)
            return ResponseEntity.ok("Success: Added Successfully");
        else if (service.add(e)==Status.EXISTS)
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Already exists: Employee already exists");
        else
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
    }

    @GetMapping("/get")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
