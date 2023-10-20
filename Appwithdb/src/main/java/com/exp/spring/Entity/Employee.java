package com.exp.spring.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
@NamedQuery(name="Employee.findByName",query = "select e from Employee e where e.ename=:ename"),
@NamedQuery(name="Employee.findBynameKeyword",query = "select e from Employee e where e.ename=:ename")
})
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ename;
	private int esalary;
	/**
	 * 
	 */
	public Employee() {
		super();
		
	}
	/**
	 * @param id
	 * @param ename
	 * @param esalary
	 */
	public Employee(int id, String ename, int esalary) {
		super();
		this.id = id;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	

}
