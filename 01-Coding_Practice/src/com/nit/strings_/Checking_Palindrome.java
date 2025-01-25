package com.nit.strings_;

public class Checking_Palindrome {
	
	public static String check_Palindrome(int k) {
		
		
		String base=Integer.toString(k);
		String rev="";
		for(int i=base.length()-1;i>=0;i--) {
			rev=rev+base.charAt(i);
		}
		int z=Integer.parseInt(rev);
		if(z==k)
		return "its a palindrome";
		
		return "not a palindrome";
	}
	public static void main(String[] args) {
		String res=check_Palindrome(1211121);
		System.out.println(res);
		
		
	}

}
