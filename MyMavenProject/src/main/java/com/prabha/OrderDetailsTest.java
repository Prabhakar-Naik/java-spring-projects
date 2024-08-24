package com.prabha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderDetailsTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/config/Orderconfig.xml");
		
		OrderDetails o1=(OrderDetails)ctx.getBean("id1");
		o1.OrderDetails();
		OrderDetails o2=(OrderDetails)ctx.getBean("id2");
		o2.OrderDetails();
	}
}
