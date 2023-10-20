package com.exp.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.spring.entity.Student;

public interface StudentRepository extends JpaRepository <Student,Integer> {

		List<Student> findByName(String sname);


	}

