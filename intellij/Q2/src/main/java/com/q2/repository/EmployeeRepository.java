package com.q2.repository;

import com.q2.dto.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository {

    List<Employee> li = new ArrayList<>();

    public Status add(Employee e){
//        System.err.println(li);
        if(li.contains(e))
            return Status.EXISTS;
        else if(li.add(e))
            return Status.SUCCESS;
        else
            return Status.ERROR;

    }

    public List<Employee> getAll(){
        return li;
    }

}
