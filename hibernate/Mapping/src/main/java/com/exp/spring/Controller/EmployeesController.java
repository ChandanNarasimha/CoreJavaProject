package com.exp.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.spring.Service.EmployeesService;
import com.exp.spring.entity.Employees;


@RestController
@RequestMapping("/Employees")
public class EmployeesController {
@Autowired
 	private EmployeesService employeesservice;
@GetMapping("/all")
	public List<Employees>getdata(){
		return this.employeesservice.getAllEmployees();
	
}
@PostMapping("/add")
public Employees addEmployees(@RequestBody Employees E) {
return this.employeesservice.addEmployees(E);

}
}