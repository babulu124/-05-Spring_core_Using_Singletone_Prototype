package com.nit.beans;



public class Student {
	private int roll;
	private String name;
	private String cource;
	
	
	
	
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
	public String getCource() {
		return cource;
	}
	public void setCource(String cource) {
		this.cource = cource;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", cource=" + cource + "]";
	}
	
	
	

}
