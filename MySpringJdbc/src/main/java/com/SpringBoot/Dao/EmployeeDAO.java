package com.SpringBoot.Dao;

import java.util.List;

import com.SpringBoot.Model.Employee;

public interface EmployeeDAO {

	void insertEmployee(Employee employee);
	
	void updateEmployee(Employee employee);
	
	List<Employee> findAllEmployee();
	
	//Employee getEmployeeById(String id);
	
	
	
}
