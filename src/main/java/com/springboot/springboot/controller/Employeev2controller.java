package com.springboot.springboot.controller;


import com.springboot.springboot.entity.Empoyeeentity;
import com.springboot.springboot.model.Employee;
import com.springboot.springboot.service.Employeeservicev2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/emp")
public class Employeev2controller {
    @Autowired
    Employeeservicev2 employeeservicev2;
    @PostMapping("/post")
    public Employee saveemp(@RequestBody Employee employee){
        return employeeservicev2.saveemp(employee);
    }

    @GetMapping("/getall")
    public List<Employee> getemployee(){
        return employeeservicev2.getallemp();
    }
}
