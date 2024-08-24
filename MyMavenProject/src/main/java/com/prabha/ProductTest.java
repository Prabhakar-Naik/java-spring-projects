package com.prabha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/config/Productconfig.xml");
		
		Product p1=(Product)ctx.getBean("id1");
		p1.ProductDetails();
		
		
	}
}
