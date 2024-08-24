package com.prabha.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapEmployeeTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/collection/config/Employeeconfig.xml");
		
		MapEmployee map=(MapEmployee)ctx.getBean("id1");
		
		map.PrintEmployeeDetails();
		
	}
}
