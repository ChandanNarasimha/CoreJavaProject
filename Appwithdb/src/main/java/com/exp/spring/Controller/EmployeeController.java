package com.exp.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exp.spring.Entity.Employee;
import com.exp.spring.Service.EmployeeService;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
 	private EmployeeService employeeService;
@GetMapping("/all")
	public List<Employee>getdata(){
		return this.employeeService.getAllEmployee();
	
}
@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee E) {
		return this.employeeService.addEmployee(E);

}
@DeleteMapping("/dldata/{id}")
	public void deleteEmployee(@PathVariable int id) {
	employeeService.deleteEmployee(id);
}
@GetMapping("/get/{id}")

public Employee getById(@PathVariable int id) {

	return this.employeeService.getEmployeebyID(id);

}
@GetMapping("/search/{ename}")
public List<Employee>findByname(@PathVariable String ename)
{
	return this.employeeService.getEmployeebyName(ename);
}
@GetMapping("/search/by/{ename}")
public List<Employee>findBynameKeyword(@PathVariable String ename)
{
	return this.employeeService.getBynameKeyword();
}
@GetMapping("/search") //http://localhost:8080/product/search?keyword=sh

public List<Employee> searchProducts(@RequestParam("keyword") String keyword) {

    return employeeService.findProductsByKeyword(keyword);

}
}