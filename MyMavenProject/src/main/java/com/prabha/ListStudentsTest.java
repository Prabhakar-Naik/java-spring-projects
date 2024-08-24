package com.prabha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListStudentsTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/config/Studentconfig.xml");
		
		ListStudents s1=(ListStudents)ctx.getBean("id1");
		
		s1.PrintStudent();
		
		
	}
}
