package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//injecting reference type
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");
		A temp=(A)context.getBean("aref");

		
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		System.out.println(temp);
		
	}

}
