package com.prabha.collection;

import java.util.Map;

public class MapEmployee {

	private int EmpId;
	private String EmpName;
	private double EmpSal;
	private String EmpCompany;
	private Map<String,String> Addr;
	
	//PDC+PSM+PGM+BusinessMethod()
	public MapEmployee() {
		super();
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public double getEmpSal() {
		return EmpSal;
	}

	public void setEmpSal(double empSal) {
		EmpSal = empSal;
	}

	public String getEmpCompany() {
		return EmpCompany;
	}

	public void setEmpCompany(String empCompany) {
		EmpCompany = empCompany;
	}

	public Map<String, String> getAddr() {
		return Addr;
	}

	public void setAddr(Map<String, String> addr) {
		Addr = addr;
	}
	
	
	public void PrintEmployeeDetails() {
		
		System.out.println("Employee ID: "+EmpId);
		
		System.out.println("Employee Name: "+EmpName);
		System.out.println("Employee Salary: "+EmpSal);
		System.out.println("Employee Company: "+EmpCompany);
		System.out.println("Employee Address: "+Addr);
	}
	
	
}
