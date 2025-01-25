package com.method.reference;

public class Test {
	public static void main(String[] args) {
		Function_Test test=Test::m1;
		
		
//		test.m10();
		test.m11(10, 20);
	}
	public static void m1(int a,int b) {
		System.out.println("its called:"+a+" b:"+b);
	}

}
