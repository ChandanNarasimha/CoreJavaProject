package com.exp.spring.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Projects {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;

	    @ManyToMany(mappedBy = "projects")
	    private Set<Employees> employees = new HashSet<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Set<Employees> getEmployees() {
			return employees;
		}

		public void setEmployees(Set<Employees> employees) {
			this.employees = employees;
		}

		public Projects(Long id, String name, Set<Employees> employees) {
			super();
			this.id = id;
			this.name = name;
			this.employees = employees;
		}

		public Projects() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
  }