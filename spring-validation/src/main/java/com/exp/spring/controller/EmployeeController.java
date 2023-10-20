package com.exp.spring.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exp.spring.model.EmployeeEntity;
import com.exp.spring.repo.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
@Autowired
private EmployeeRepository  empRepository;
@GetMapping("/all")
public List<EmployeeEntity> getAllProduct()
{
	return this.empRepository.findAll();
}

@PostMapping("/empadd")
public EmployeeEntity employeeadd(@RequestBody EmployeeEntity e) {
return this.empRepository.save(e);
}
}


