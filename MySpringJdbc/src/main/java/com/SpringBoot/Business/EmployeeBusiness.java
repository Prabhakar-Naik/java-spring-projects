package com.SpringBoot.Business;

import com.SpringBoot.Model.Employee;

public interface EmployeeBusiness {

	void printEmployeeHike();
	
	void printEmployees();
	
	void insertEmployee(Employee employee);
	
	void updateEmployee();
	
	//Employee EmployeeById(String id);
	
}
