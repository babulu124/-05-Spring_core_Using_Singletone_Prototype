package com.nit.strings_;


public class Revers_Strings {
	
	public static String reverse_String(String k) {
		String res="";
		
		
		for(int i=k.length()-1;0<=i;i--) {
			res=res+k.charAt(i);
		}
		return res;
	}
	public static void main(String[] args) {
		String reverse=Revers_Strings.reverse_String("babulu");
		System.out.println(reverse);
		
	}

}
