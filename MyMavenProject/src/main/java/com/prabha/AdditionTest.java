package com.prabha;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/config/Addconfig.xml");
		
		AdditionBean a1=(AdditionBean)ctx.getBean("id1");
		a1.printadd();
		a1.printsub();
		AdditionBean a2=(AdditionBean)ctx.getBean("id2");
		a2.printadd();
		a2.printsub();
		AdditionBean a3=(AdditionBean)ctx.getBean("id3");
		a3.printadd();
		a3.printsub();
		
		// ObjectMapper Obj = new ObjectMapper();
	}
}
