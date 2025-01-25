package com.collection_pro;

import java.util.ArrayList;

public class ArrayList_pro {
	
	
	
	public static void rotating_ArrayList(ArrayList<Integer> al){
		for(int i=0;i<al.size();i++) 
			System.out.println(al.get(i));
		System.out.println();
		for(int a:al)
		System.out.println(a);
	}
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(12);
		al.add(23);
		al.add(45);
		al.add(232);
		rotating_ArrayList(al);
	}

}
