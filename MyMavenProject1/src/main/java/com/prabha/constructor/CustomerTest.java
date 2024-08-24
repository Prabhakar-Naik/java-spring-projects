package com.prabha.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/constructor/config/Customerconfig.xml");
		
		Customer c=(Customer)ctx.getBean("id1");
		c.customerDetails();
	}
}
