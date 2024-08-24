package com.prabha.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/Reference/config/ReferenceOfProduct.xml");
		
		Order o1=(Order)ctx.getBean("order");
		o1.PrintOrdetDetails();
	}
}
