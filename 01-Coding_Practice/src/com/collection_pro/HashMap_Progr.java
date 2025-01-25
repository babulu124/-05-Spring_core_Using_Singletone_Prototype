package com.collection_pro;

import java.util.HashMap;

public interface HashMap_Progr {
	public static void main(String[] args) {
		
	
	String s="bbbbbbbbbaa";
	char []c=s.toCharArray();
	
	HashMap<Character,Integer> hm=new HashMap<>();
	
	for(int a=0;a<c.length;a++) {
		
		if(hm.containsKey(c[a]) && c[a]!=' ') {
			hm.put(c[a], hm.get(c[a])+1);
		}
		else if(c[a]!=' ')
			hm.put(c[a],1);
	}
	System.out.println(hm);
	for(int i=0;i<s.length();i++) {
		if(hm.containsKey(s.charAt(i))) {
		if(hm.get(s.charAt(i))>1) {
			System.out.println(s.charAt(i)+":"+hm.get(s.charAt(i)));
			hm.put(s.charAt(i), 1);
		}
	}
		
		
		
	}
	}
	
	

}
