package com.SpringBoot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringBoot.Business.EmployeeBusiness;
import com.SpringBoot.Business.EmployeeBusinessImp;
import com.SpringBoot.Model.Employee;

public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("com/SpringBoot/config/Customerconfig.xml");
		
		EmployeeBusiness employeeBusiness=(EmployeeBusinessImp)ctx.getBean("employeeBusinessImp");
		
		employeeBusiness.printEmployeeHike();
		
		Employee emp=new Employee();
		
		
		employeeBusiness.printEmployees();
		
		employeeBusiness.insertEmployee(emp);
		
		//employeeBusiness.printEmployeeById("id222");
//		Employee emp=new Employee("id143","sanjay",32456.9,7);
//		
//		employeeBusiness.insertEmployee(emp);
		employeeBusiness.updateEmployee();
		
		
	}

}
