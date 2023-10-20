package com.exp.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity

@NamedQuery(name="Student.findByName",query = "select s from Student s where s.sname=:sname")

//@Query(value = "SELECT * FROM Product p WHERE p.pname = ?1",nativeQuery = true  )
//public Optional<Post> findProductByPname(String pname);

public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sid;
	private String sname;
	
	
	
	/**
	 * 
	 */
	public Student() {
		super();
		
	}
	/**
	 * @param id
	 * @param ename
	 * @param esalary
	 */
	public Student(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
		
	}
	public int getId() {
		return sid;
	}
	public void setId(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}