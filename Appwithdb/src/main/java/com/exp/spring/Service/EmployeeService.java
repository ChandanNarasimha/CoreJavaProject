package com.exp.spring.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exp.spring.Entity.Employee;
import com.exp.spring.Repository.EmployeeRepository;
@Service
public class EmployeeService {
@Autowired
	private EmployeeRepository employeeRepository;
private String ename;
	
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}	
@RequestMapping
	public Employee addEmployee(Employee E) {
		return employeeRepository.save(E);
		
	}
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
}
	
	public Employee getEmployeebyID(int id) {
		return employeeRepository.findById(id).get();
	}
	
	public List<Employee> getEmployeebyName(String ename)
	{
		return this.employeeRepository.findByName(ename);	
	}
	public List<Employee> getBynameKeyword()
	{
		return this.employeeRepository.findBynameKeyword(ename);

	}
	public List<Employee> findProductsByKeyword(String keyword) {

        return employeeRepository.findByKeyword(keyword);

    }
}
