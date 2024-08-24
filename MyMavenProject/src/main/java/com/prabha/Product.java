package com.prabha;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;
	private String companyProduct;
	
	
	//PDC+PSM+PGM+BusinessMethod
	public Product() {
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


	public String getCompanyProduct() {
		return companyProduct;
	}


	public void setCompanyProduct(String companyProduct) {
		this.companyProduct = companyProduct;
	}



	public void ProductDetails() {
		System.out.println("Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", companyProduct=" + companyProduct + "]"); 
	}
	
	
}
