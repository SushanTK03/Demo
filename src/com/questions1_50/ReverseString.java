package com.questions1_50;

public class ReverseString {
	public static void main(String[] args) {
		
		String str="Hello";
// Using For loop		
//		String rev="";
//		
//		for(int i=str.length()-1; i>=0;i--) {
//			
//			rev=rev+str.charAt(i);
//		}
//		System.out.println(rev);

//      Using StringBuffer		
//		StringBuffer sb= new StringBuffer(str);
//		
//		System.out.println(sb.reverse());

//      Using StringBuilder		 
        StringBuilder sb1= new StringBuilder(str);
        System.out.println(sb1.reverse());
	}

}
