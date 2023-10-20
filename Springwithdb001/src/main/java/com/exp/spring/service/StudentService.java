package com.exp.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exp.spring.entity.Student;
import com.exp.spring.repository.StudentRepository;

@Service
	public class StudentService {
	@Autowired
		private StudentRepository studentRepository;
		
		public List<Student> getAllStudent(){
			return studentRepository.findAll();
		}	
@RequestMapping
		public Student addStudent(Student S) {
			return studentRepository.save(S);
			
		}
	public void deleteStudent(int id) {
		studentRepository.deleteById(id);
		}
	public Student getStudentbyID(int id) {

		return studentRepository.findById(id).get();

		}
	public List<Student> getStudentbyName(String sname)
	{
		return this.studentRepository.findByName(sname);	
	}
	
	public Student updateStudent(int id,Student S) {
		S.setId(id);
		return studentRepository.save(S);
	}
	
	

	}

