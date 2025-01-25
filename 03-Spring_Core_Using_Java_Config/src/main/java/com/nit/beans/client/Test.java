package com.nit.beans.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Student;
import com.nit.beans.config.StudentConfig;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student=context.getBean(Student.class);
		System.out.println(student);
		
	}
	
	
	

}
