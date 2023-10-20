package com.exp.spring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exp.spring.Entity.Employee;

public interface EmployeeRepository extends JpaRepository <Employee,Integer> {
	List<Employee> findByName(String ename);
	List<Employee> findBynameKeyword(String ename);
	@Query("SELECT e FROM Employee e WHERE e.ename LIKE %?1%")

    List<Employee> findByKeyword(String keyword);
	
}
