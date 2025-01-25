package com.sop.integers_;

public class swap_Numbers {
	
	public static String swap_Number(int a,int b) {
		int c=a;
		a=b;
		b=c;
		
		
		
		return "a:"+a+" b:"+b;
	}
	public static void main(String[] args) {
		String res=swap_Number(10, 20);
		System.out.println(res);
	}
	

}
