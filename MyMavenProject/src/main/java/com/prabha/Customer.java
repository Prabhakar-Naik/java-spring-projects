package com.prabha;

public class Customer {

	private int customerID;
	private String customerName;
	private String customerAddr;
	
	
	//PDC+PSM+PGM+Business Method+ to string()
	public Customer() {
		super();
	}


	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerAddr() {
		return customerAddr;
	}


	public void setCustomerAddr(String customerAddr) {
		this.customerAddr = customerAddr;
	}



	public void printCustDetails() {
		System.out.println("Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerAddr="
				+ customerAddr + "]"); 
	}
	
	
	
}
