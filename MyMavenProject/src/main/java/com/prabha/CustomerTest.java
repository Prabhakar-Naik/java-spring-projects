package com.prabha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/config/Custconfig.xml");
		
		Customer c1=(Customer)ctx.getBean("id1");
		
		c1.printCustDetails();
		Customer c2=(Customer)ctx.getBean("id2");
		c2.printCustDetails();
	}
}
