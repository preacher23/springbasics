package com.springboot.springboot.service;

import com.springboot.springboot.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class Employeeservice {
    List<Employee>employees=new ArrayList<>();
    public Employee save(Employee employee) {
     if (employee.getEmpid()==null||employee.getEmailid().isEmpty()){
         employee.setEmpid(UUID.randomUUID().toString());
     }
     employees.add(employee);
     return employee;
    }

    public List<Employee> getall() {
        return employees;
    }

    public Employee getbyid(String empid) throws Exception {
        return employees.stream().filter(employee -> employee.getEmailid().equals(empid)).findFirst().orElseThrow(()->new Exception("yess"+HttpStatus.INTERNAL_SERVER_ERROR+empid));
    }
}
