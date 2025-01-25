package com.sop.integers_;

public class Prime_Or_Not {
	public static String check_Prime_Or_Not(int num) {
		
		
		for(int a=2;a<num;a++) {
			if(num%a==0) {
				return "its a not a prime number";
			}
			
		}
		return "its a prime number";
		
	}
	
	public static void main(String[] args) {
		
		String resu=Prime_Or_Not.check_Prime_Or_Not(110);
		System.out.println(resu);
		
	}

}
