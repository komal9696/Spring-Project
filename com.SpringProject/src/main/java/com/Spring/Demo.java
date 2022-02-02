package com.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo 
{
	public static void main( String[] args )
    {
		
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Springboot.xml");
        Compucom c = (Compucom) ac.getBean("c1",Compucom.class);
      
        System.out.println(c);
       
    }
}

