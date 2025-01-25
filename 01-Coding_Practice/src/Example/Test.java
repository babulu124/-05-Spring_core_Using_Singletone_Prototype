package Example;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int []a=new int[135];
		String s="ss";
		for(int i=0;i<s.length();i++) {
		
		a[s.charAt(i)]++;
		}
		System.out.println(Arrays.toString(a));
	}

}
