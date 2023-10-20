package com.exp.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.spring.Service.ProjectsService;
import com.exp.spring.entity.Projects;

@RestController
@RequestMapping("/Projects")
public class ProjectsController {
@Autowired
 	private ProjectsService projectsService;
@GetMapping("/all")
	public List<Projects>getdata(){
		return this.projectsService.getAllProjects();
	
}
@PostMapping("/add")
public Projects addProjects(@RequestBody Projects E) {
return this.projectsService.addProjects(E);

}
}