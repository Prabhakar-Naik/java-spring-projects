package com.prabha.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdditionTest 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/prabha/constructor/config/Additionconfig.xml");
        
        Addition a=(Addition)ctx.getBean("id1");
        a.toString();
        a.add();
        
        
    }
}
