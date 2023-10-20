package com.exp.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.spring.entity.Trainer;

public interface TrainerRepository extends JpaRepository <Trainer,Integer> 
	{

	
	List<Trainer> findByName(String ename);

		
		
		
	}

