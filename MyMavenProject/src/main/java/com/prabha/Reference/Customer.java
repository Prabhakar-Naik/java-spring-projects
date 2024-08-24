package com.prabha.Reference;

import java.util.List;

public class Customer {

	private String CustomerName;
	private long MobileNo;
	private String Gender;
	private List<String>Addr;
	
	//PDC+PSM+PGM+BusinessMethod()

	public  Customer() {
		super();
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public List<String> getAddr() {
		return Addr;
	}

	public void setAddr(List<String> addr) {
		Addr = addr;
	}
	
	public void PrintCustomerDetails() {
		
		System.out.println("Customer Name: "+CustomerName);
		System.out.println("Customer Contact: "+MobileNo);
		System.out.println("Customer Gender: "+Gender);
		System.out.println("Customer Address: "+Addr);
	}

	
	
	
}
