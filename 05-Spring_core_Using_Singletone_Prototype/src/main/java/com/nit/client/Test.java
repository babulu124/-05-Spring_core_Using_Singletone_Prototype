package com.nit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Student;
import com.nit.config.StudentConfig;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		int hashCode1=context.getBean(Student.class).hashCode();
		int hashCode2=context.getBean(Student.class).hashCode();
		System.out.println(hashCode1);
		System.out.println(hashCode2);
		
	}

}
