package com.prabha;

public class OrderDetails {

	private int orderID;
	private String productName;
	private double orderPrice;
	

	//PDC+PSM+PGM+BusinessMethod()
	
	public OrderDetails() {
		super();
	}


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public double getOrderPrice() {
		return orderPrice;
	}


	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}


	
	public void OrderDetails() {
		System.out.println("OrderDetails [orderID=" + orderID + ", productName=" + productName + ", orderPrice=" + orderPrice + "]");
	}
	
	
	
	
}
