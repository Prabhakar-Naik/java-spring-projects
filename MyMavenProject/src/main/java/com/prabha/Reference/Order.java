package com.prabha.Reference;

public class Order {

	private int productId;
	private String productName;
	private String company;
	private double productCost;
	private Customer customer;
	
	//PDC+PSM+PGM+BusinessMethod()
	
	public Order() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	public void PrintOrdetDetails() {
		
		System.out.println("Product ID: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Product Manufactured Company: "+company);
		System.out.println("Product Price: "+productCost);
		System.out.println("Customer Details: ");
		System.out.println("Customer Name: "+customer.getCustomerName());
		System.out.println("Customer MobileNumbber: "+customer.getMobileNo());
		
		System.out.println("Customer Gender: "+customer.getGender());
		System.out.println("Customer Address: "+customer.getAddr());
		
	}
	
}
