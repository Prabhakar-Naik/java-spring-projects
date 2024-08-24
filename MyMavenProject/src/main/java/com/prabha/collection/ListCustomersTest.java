package com.prabha.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListCustomersTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/collection/config/CustomerList.xml");
		
		ListCustomers s1=(ListCustomers)ctx.getBean("id1");
		
		s1.PrintStudent();
		
		
	}
}
