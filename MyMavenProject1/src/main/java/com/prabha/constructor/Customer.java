package com.prabha.constructor;

import java.util.List;

public class Customer {

	private int customerID;
	private String customerName;
	private long customerNumber;
	private List<String> Address;
	
	//PDC+PPC+to string()
	public Customer() {
		super();
	}

	public Customer(int customerID, String customerName, long customerNumber, List<String> address) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerNumber = customerNumber;
		Address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerNumber="
				+ customerNumber + ", Address=" + Address + "]";
	}
	
	
	
	public void customerDetails() {
		
		System.out.println("Customer ID: "+customerID);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Contact: "+customerNumber);
		System.out.println("Customer Address: "+Address);
	}
	
	
}
