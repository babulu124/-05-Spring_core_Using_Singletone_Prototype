package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int roll;
	private int id;
	private String name;
	@Autowired
	private Address add;
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public Student(int roll, int id, String name, Address add) {
		super();
		this.roll = roll;
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public Student() {}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", id=" + id + ", name=" + name + ", add=" + add + "]";
	}
	

}
