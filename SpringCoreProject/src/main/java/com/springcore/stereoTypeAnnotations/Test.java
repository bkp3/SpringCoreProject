package com.springcore.stereoTypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereoTypeAnnotations/stereoConfig.xml");
		Student st=context.getBean("student",Student.class);
		System.out.println(st);;

	}

}
