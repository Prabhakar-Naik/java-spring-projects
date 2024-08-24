package com.prabha.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetProductTest {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/collection/config/ProductSet.xml");
		
		SetProduct sp=(SetProduct)ctx.getBean("id1");
		sp.printProduct();
		
	}
}
