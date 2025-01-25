package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	//@Autowired
	private Student student;

//	public Teacher(Student student) {
//		System.out.println("From teacher");
//	}

	public Student getStudent() {
		return student;
	}

	@Autowired
	public void setStudent(Student student) {
		System.out.println("from teacher");
		this.student = student;
	}
	

}
