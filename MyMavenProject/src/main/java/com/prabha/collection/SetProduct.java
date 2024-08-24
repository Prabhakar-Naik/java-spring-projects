package com.prabha.collection;

import java.util.Set;

public class SetProduct {

	private int productId;
	private String productName;
	private double productPrice;
	private Set<String> Details;
	
	
	//PDC+PSM+PGM+BusinessMethod
	
	public SetProduct() {
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


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public Set<String> getDetails() {
		return Details;
	}


	public void setDetails(Set<String> details) {
		Details = details;
	}
	
public void printProduct() {
		
		System.out.println("product Id: "+productId);
		System.out.println("product Name: "+productName);
		System.out.println("product Price: "+productPrice);
		System.out.println("Product Details: "+Details);
	}

	
}
