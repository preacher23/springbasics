package com.springboot.springboot.repo;

import com.springboot.springboot.entity.Empoyeeentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Employeerepo extends JpaRepository<Empoyeeentity,String> {
}
