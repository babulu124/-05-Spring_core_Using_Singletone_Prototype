package com.sop.integers_;

public class Swap_Two_number_wiht_out_third_variable {
	
	public static String swa_Two_Numbers(int a,int b) {
		
		a=a+b;       //a=-50,b=-20
		b=a-b;      //b=10
		a=a-b;
		
		
		return "a:"+a+"  b:"+b;
	}
	
	
	public static void main(String[] args) {
		int a=-50;
		int b=-20;
		String resu=Swap_Two_number_wiht_out_third_variable.swa_Two_Numbers(a, b);
		System.out.println(resu);
		
		
		
	}

}
