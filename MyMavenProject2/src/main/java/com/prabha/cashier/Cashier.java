package com.prabha.cashier;

import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.prabha.cart.ShoppingCart;
import com.prabha.model.Product;

@Component("cashier")
public class Cashier {

	private double totalPrice=0.0;
	
	@Value("shoppintInfo")
	private String fileName;
	
	@Value("\"C:\\MymavenPro2\"")
	private String filePath;
	
	private PrintWriter printWriter;
	
	@PostConstruct
	public void openStream() {
		
		try {
			printWriter=new PrintWriter(filePath+fileName+".txt");
		}catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}
	
	public void calculaterTotalPrice(ShoppingCart cart) {
		
		List<Product> products= cart.getProducts();
		
		for(Product product:products) {
			totalPrice=totalPrice+product.getPrice();
			writeProductToFile(product);
		}
		printWriter.println("==============");
		printWriter.println("TotalPrice: "+totalPrice);
		printWriter.flush();
	}
	
	public void writeProductToFile(Product product) {
		printWriter.println(new Date()+"\t"+product.getName()+"/t"+product.getPrice());
	}
	
	public void setFileName(String name) {
		System.out.println("setter()");
		this.fileName=name;
	}
	
	public void setFilePath(String filePath) {
		System.out.println("setter()");
		this.filePath=filePath;
	}
	
	@PreDestroy
	public void closeStream() {
		if(printWriter !=null)
			printWriter.close();
	}
	
}
