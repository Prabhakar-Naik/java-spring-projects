package com.SpringBoot.Model;

public class Employee {

	private String Empid;
	private String EmpName;
	private double EmpSal;
	private int Experience;
	
	//PDC+PPC+PSM+PGM
	
	public Employee() {
		super();
	}

	public Employee(String empid, String empName, double empSal, int experience) {
		super();
		Empid = empid;
		EmpName = empName;
		EmpSal = empSal;
		Experience = experience;
	}

	public String getEmpid() {
		return Empid;
	}

	public void setEmpid(String empid) {
		Empid = empid;
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

	public int getExperience() {
		return Experience;
	}

	public void setExperience(int experience) {
		Experience = experience;
	}
	
	
	
}
