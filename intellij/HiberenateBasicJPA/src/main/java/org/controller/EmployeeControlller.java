package org.controller;

import org.dao.EmployeeDao;
import org.dto.Employee;

public class EmployeeControlller {
    public static void main(String[] args) {
        Employee employee = new Employee("sam",554);
        EmployeeDao employeeDao = new EmployeeDao();
//        employeeDao.saveEmployee(employee);

//        employeeDao.findEmployee(1);

        Employee employee1 = new Employee("bob",46644);
        employeeDao.updateEmployee(2,employee1);

//        employeeDao.removeEmployee(2);
    }
}
