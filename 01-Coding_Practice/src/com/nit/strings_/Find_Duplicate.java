package com.nit.strings_;

import java.util.HashMap;
import java.util.Map;

public class Find_Duplicate {
	
	public static void find_Duplicate_Character(String s) {
		
		for(int i=0;i<s.length();i++)
		{
			for(int k=i+1;k<s.length();k++) {
				
				if(s.charAt(i)==s.charAt(k))
					System.out.println(s.charAt(k));
				
			}
			
		}
		
	}
	public static void findDuplicates(String input) { 
		HashMap<Character, Integer> charCount = new HashMap<>(); 
		for (char c : input.toCharArray()) { 
		charCount.put(c, charCount.getOrDefault(c, 0) + 1); 
		} 
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) { 
		if (entry.getValue() > 1) { 
		System.out.println(entry.getKey() + " appears " + 
		entry.getValue() + " times"); 
		} 
		} 
		} 
	
	
	 public static void findDuplicateCharacters(String str) {
	        int[] charCount = new int[256]; // Assuming ASCII characters

	        // Count the occurrences of each character
	        for (int i = 0; i < str.length(); i++) {
	            charCount[str.charAt(i)]++;
	        }

	        // Print characters with more than one occurrence
	        System.out.println("Duplicate characters in the string \"" + str + "\":");
	        for (int i = 0; i < 256; i++) {
	            if (charCount[i] > 1) {
	                System.out.println((char) i + ": " + charCount[i] + " times");
	            }
	        }
	 }
	public static void main(String[] args) {
		//find_Duplicate_Character("babuluu");
		findDuplicateCharacters("babuluu");

		//findDuplicates("babuluu");
	}

}
