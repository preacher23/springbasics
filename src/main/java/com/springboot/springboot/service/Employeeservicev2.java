package com.springboot.springboot.service;

import com.springboot.springboot.entity.Empoyeeentity;
import com.springboot.springboot.model.Employee;
import com.springboot.springboot.repo.Employeerepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class Employeeservicev2 {
    @Autowired
    Employeerepo employeerepo;
    public Employee saveemp(Employee employee) {
        employee.setEmpid(UUID.randomUUID().toString());
        Empoyeeentity empoyeeentity=new Empoyeeentity();
        BeanUtils.copyProperties(employee,empoyeeentity);
          employeerepo.save(empoyeeentity);
     return employee;
    }

    public List<Employee> getallemp() {
        List<Empoyeeentity>empoyeeentities=employeerepo.findAll();
        List<Employee> employees=empoyeeentities.stream().map(empoyeeentities1->{Employee emp=new Employee();
            BeanUtils.copyProperties(empoyeeentities1,emp);
            return emp;}).collect(Collectors.toList());
        return employees;
    }
}
