package com.q2.service;

import com.q2.dto.Employee;
import com.q2.repository.EmployeeRepository;
import com.q2.repository.Status;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository repository;

    public Status add(Employee e){
        return repository.add(e);
    }

    public List<Employee> getAll(){
        return repository.getAll();
    }
}
