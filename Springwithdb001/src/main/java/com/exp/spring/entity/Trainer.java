package com.exp.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name="Trainer.findByName",query = "select t from Trainer t where t.tname=:tname")

public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String tname;
	private String tdept;
	@OneToOne
	@JoinColumn(name = "id")
	private  Student student;
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String gettname() {
		return tname;
	}
	public void settname(String tname) {
		this.tname = tname;
	}
	/**
	 * @param id
	 * @param tname
	 * @param tdept
	 * @param student
	 */
	public Trainer(int id, String tname, String tdept, Student student) {
		super();
		this.id = id;
		this.tname = tname;
		this.tdept = tdept;
		this.student = student;
	}
	/**
	 * 
	 */
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String gettdept() {
		return tdept;
	}
	public void settdept(String tdept) {
		this.tdept = tdept;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	
	
}