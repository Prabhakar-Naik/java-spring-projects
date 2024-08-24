package com.SpringBoot.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.SpringBoot.Dao.EmployeeDAO;
import com.SpringBoot.Model.Employee;

public class EmployeeBusinessImp implements EmployeeBusiness {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}




	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}


	public void printEmployeeHike() {
		
		
		
		// ask DAO for employee data
		List<Employee> employees=employeeDAO.findAllEmployee();
		
		
		// check each employee and print hike
		if(employees!=null) {
			
			for(Employee employee:employees)
			{
				if(employee.getExperience()>=15) {
					System.out.println("Employee got 30% of Hike");
					System.out.println("Employee ID: "+employee.getEmpid()+" Employee Name: "+employee.getEmpName());
					System.out.println("Employee Salary: "+employee.getEmpSal()+" Employee Experience: "+employee.getExperience());
				}
				else if(employee.getExperience()>=10) {
					System.out.println("Employee got 20% of Hike");
					System.out.println("Employee ID: "+employee.getEmpid()+" Employee Name: "+employee.getEmpName());
					System.out.println("Employee Salary: "+employee.getEmpSal()+" Employee Experience: "+employee.getExperience());
				}
				else if(employee.getExperience()>=5) {
					System.out.println("Employee got 15% of Hike");
					System.out.println("Employee ID: "+employee.getEmpid()+" Employee Name: "+employee.getEmpName());
					System.out.println("Employee Salary: "+employee.getEmpSal()+" Employee Experience: "+employee.getExperience());
				}
				else
				{
					System.out.println("Employee got 10% of Hike");
					System.out.println("Employee ID: "+employee.getEmpid()+" Employee Name: "+employee.getEmpName());
					System.out.println("Employee Salary: "+employee.getEmpSal()+" Employee Experience: "+employee.getExperience());
				}
			}
		}
		
		
		System.out.println("Employee Hike Implementation...");

	}




	public void printEmployees() {
		
		List<Employee> employees=employeeDAO.findAllEmployee();
		
		if(employees!=null)
		{
			for(Employee employee:employees)
			{
				
				System.out.println("Employee ID: "+employee.getEmpid());
				System.out.println("Employee Name: "+employee.getEmpName());
				System.out.println("Employee Salary: "+employee.getEmpSal());
				System.out.println("Employee Experience: "+employee.getExperience());
				System.out.println("===============================================");
			}
		}
		
	}




	public void insertEmployee(Employee employee) {
		
		System.out.println("Insert Employee Record:  ");
		
		employeeDAO.insertEmployee(employee);
	}




	public void updateEmployee() {
		System.out.println("Choose your choice for updation above details: ");
		
		
		
	}



	
	

}
