package com.nit.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.Address;
import com.nit.beans.Student;
import com.nit.config.StudentConfig;

public class Test {

	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(StudentConfig.class);
		
		Student student=context.getBean(Student.class);
		Address add=context.getBean(Address.class);
		
		/*add.setCross("3rd cross");
		add.setHouse_No(231);
		*/
//		student.setAdd(add);
		student.setId(12);
		student.setName("babulu");
		student.setRoll(23);
		
		
		
		System.out.println(student);
		
		
		
		
		
	}
}
