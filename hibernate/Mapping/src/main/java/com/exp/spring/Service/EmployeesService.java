package com.exp.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exp.spring.entity.Employees;
import com.exp.spring.repository.EmployeesRepository;


@Service
	public class EmployeesService {
	@Autowired
		private EmployeesRepository employeesRepository;
		
		public List<Employees> getAllEmployees(){
			return employeesRepository.findAll();
		}	
@RequestMapping
		public Employees addEmployees(Employees E) {
			return employeesRepository.save(E);
			
		}
}