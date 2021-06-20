package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Demo {
	
	@Bean
	public Course getCourse() {
		return new Course();
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getCourse());
		return student;
	}

}
