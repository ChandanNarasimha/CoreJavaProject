package com.exp.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exp.spring.entity.Student;
import com.exp.spring.service.StudentService;

@RestController
	@RequestMapping("/student")
	public class StudentController {
	@Autowired
	 	private StudentService studentservice;
	@GetMapping("/all")
		public List<Student>getdata(){
			return this.studentservice.getAllStudent();
		
	}
@PostMapping("/add")
	public Student addStudent(@RequestBody Student S) {
	return this.studentservice.addStudent(S);

	}
	@DeleteMapping("/dldata/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentservice.deleteStudent(id);
	}
	@GetMapping("/get/{id}")

	public Student getById(@PathVariable int id) {

	return this.studentservice.getStudentbyID(id);

	}
	@GetMapping("/search/{ename}")
	public List<Student>findByname(@PathVariable String ename)
	{
		return this.studentservice.getStudentbyName(ename);

	}
	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable int id,@RequestBody Student S) {
		return studentservice.updateStudent(id, S);
	}

}