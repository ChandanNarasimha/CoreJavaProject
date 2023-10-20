package com.exp.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.spring.model.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}
