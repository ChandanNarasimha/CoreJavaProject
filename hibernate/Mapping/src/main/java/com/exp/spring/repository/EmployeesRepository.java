package com.exp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.spring.entity.Employees;


public interface EmployeesRepository extends JpaRepository <Employees,Integer>{

}
