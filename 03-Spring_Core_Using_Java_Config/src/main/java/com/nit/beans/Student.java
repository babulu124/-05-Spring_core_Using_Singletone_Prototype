package com.nit.beans;

public class Student {

	private int id;
	private int roll;
	private String name;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Student(int id, int roll, String name) {
		super();
		this.id = id;
		this.roll = roll;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", roll=" + roll + ", name=" + name + "]";
	}
	
	
}
