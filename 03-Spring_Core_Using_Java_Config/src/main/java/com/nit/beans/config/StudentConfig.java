package com.nit.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nit.beans.Student;

@Configuration
//@ComponentScan("com.nit.beans")
public class StudentConfig {

	
	@Bean
	public Student student() {
		System.out.println("student executed");
		return new Student(12,13,"babulu");
	}
	
	
	
}
