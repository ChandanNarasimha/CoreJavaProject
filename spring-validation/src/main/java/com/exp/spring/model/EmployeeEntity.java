package com.exp.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity

public class EmployeeEntity {

@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name="emp_id")

private Integer empId;

@Column(name="emp_name")

@NotEmpty

@Size(min=2,message="name must be 2 characters")
private String empName;
@NotEmpty
@Size(min=5,max=5,message="Salary must contain 5 digit")
private Double empSalary;
@Column(name="emp_mobile")
@NotEmpty
@Size(min=10,max=10,message="Phone num must contain 10 digit")
private Long empMobile;
@Column(name="emp_mail")
@NotEmpty
@Size(min=10,max=10,message="Mail must contain 10 digit")
private String empMail;

}
