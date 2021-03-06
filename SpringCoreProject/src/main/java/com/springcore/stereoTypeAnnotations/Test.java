package com.springcore.stereoTypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereoTypeAnnotations/stereoConfig.xml");
		
		Student st=context.getBean("student",Student.class);
		System.out.println(st.hashCode());

		Student st1=context.getBean("student",Student.class);
		System.out.println(st1.hashCode());
		
		Teacher tea=context.getBean("teacher",Teacher.class);
		System.out.println(tea);
		System.out.println(tea.hashCode());
		
		Teacher tea1=context.getBean("teacher",Teacher.class);
		System.out.println(tea1);
		System.out.println(tea1.hashCode());
	}

}
