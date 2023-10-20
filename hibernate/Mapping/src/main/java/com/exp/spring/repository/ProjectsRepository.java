package com.exp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exp.spring.entity.Projects;

public interface ProjectsRepository extends JpaRepository <Projects,Integer>{

}
