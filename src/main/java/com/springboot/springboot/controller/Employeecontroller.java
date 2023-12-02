package com.springboot.springboot.controller;

import com.springboot.springboot.model.Employee;
import com.springboot.springboot.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class Employeecontroller {
    @Autowired
    private Employeeservice employeeservice;

    @PostMapping
    public Employee saveemployee(@RequestBody Employee employee){
        return employeeservice.save(employee);
    }

    @GetMapping
    public List<Employee> getemployee(){
        return employeeservice.getall();
    }

    @GetMapping("/{empid}")
    public Employee getemployeebyid(@PathVariable String empid) throws Exception {
     return employeeservice.getbyid(empid);
    }

}
