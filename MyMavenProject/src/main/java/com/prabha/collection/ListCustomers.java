package com.prabha.collection;

import java.util.List;

public class ListCustomers {

	private int customerId;
	private String customerName;
	private List<String>address;
	
	//PDC+PSM+PGM+BusinesMethod
	public ListCustomers() {
		super();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	public void PrintStudent() {
		
		System.out.println("Student Id: "+customerId);
		System.out.println("Student Name: "+customerName);
		System.out.println("Student Address: "+address);
	}
	
	
}
