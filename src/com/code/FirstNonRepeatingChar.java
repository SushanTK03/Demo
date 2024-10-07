package com.code;

public class FirstNonRepeatingChar {
	public static int firstNonRepeatingChar(String s) {
		// CFOEC
		char c[]=new char[256]; //ASICC
		for(int i=0; i<s.length() ;i++) {
			c[s.charAt(i)]++;
		}
		
		// FCHF1
		
		for(int i=0; i<s.length();i++) {
			if(c[s.charAt(i)]==1) {
				return i;
			}
			
		}
		return -1;
	} 
	public static void main(String[] args) {
		
		String str="abcacd";
		System.out.println(firstNonRepeatingChar(str));
	}

}
