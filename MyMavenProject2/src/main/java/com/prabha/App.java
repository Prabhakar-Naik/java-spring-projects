package com.prabha;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prabha.cart.ShoppingCart;
import com.prabha.cashier.Cashier;

public class App 
{
    public static void main( String[] args )
    {
ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/prabha/config/MyBean.xml");
		
		ShoppingCart shoppingCart=(ShoppingCart)context.getBean("shoppingCart");


		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext();
		context1.scan("com.prabha");
		context1.refresh();
		
		Cashier cashier=(Cashier)context1.getBean("cashier");
		cashier.calculaterTotalPrice(shoppingCart);
		context.close();

    	
    }
}
