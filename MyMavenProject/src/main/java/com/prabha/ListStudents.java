package com.prabha;

import java.util.List;

public class ListStudents {

	private int studentId;
	private String studentName;
	private List<String>address;
	
	//PDC+PSM+PGM+BusinesMethod
	public ListStudents() {
		super();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	public void PrintStudent() {
		
		System.out.println("Student Id: "+studentId);
		System.out.println("Student Name: "+studentName);
		System.out.println("Student Address: "+address);
	}
	
	
}
