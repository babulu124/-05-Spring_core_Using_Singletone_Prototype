package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Student {
	//@Autowired(required = false)
	private Teacher teacher;

//	public Student( Teacher techer) {
//		System.out.println("from student");
//	}

	public Teacher getTeacher() {
		return teacher;
	}

	@Autowired
	public void setTeacher(Teacher teacher) {
		System.out.println("from set student");
		this.teacher = teacher;
	}
	
	
	

}
