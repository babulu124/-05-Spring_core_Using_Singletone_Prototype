package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	
	
	@Value(value = "12")
	private int House_No;
	@Value(value = "5th cross")
	private String cross="4th cross";
	public int getHouse_No() {
		return House_No;
	}
	public void setHouse_No(int house_No) {
		House_No = house_No;
	}
	public String getCross() {
		return cross;
	}
	public void setCross(String cross) {
		this.cross = cross;
	}
	public Address(int house_No, String cross) {
		super();
		House_No = house_No;
		this.cross = cross;
	}
	@Override
	public String toString() {
		return "Address [House_No=" + House_No + ", cross=" + cross + "]";
	}
	public Address() {
		super();
	}
	

}
