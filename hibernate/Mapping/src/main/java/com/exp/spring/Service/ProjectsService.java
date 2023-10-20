package com.exp.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exp.spring.entity.Projects;
import com.exp.spring.repository.ProjectsRepository;

@Service
public class ProjectsService {
@Autowired
	private ProjectsRepository projectsRepository;
	
	

	public List<Projects> getAllProjects() {
		return projectsRepository.findAll();
	}	
@RequestMapping
	public Projects addProjects(Projects P) {
		return projectsRepository.save(P);
		
	}
}