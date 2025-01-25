package com.nit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Student;

public class Client {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/nit/properties/properties.xml");
		Student student=context.getBean("student" , Student.class);
		student.setCource("hibernate");
		System.out.println(student);
		
		
	}

}
