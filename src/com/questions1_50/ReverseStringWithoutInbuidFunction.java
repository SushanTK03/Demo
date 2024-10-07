package com.questions1_50;

public class ReverseStringWithoutInbuidFunction {
	public static void main(String[] args) {
		
		String str="Sushant";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev=rev+str.charAt(i);
		}
		
		System.out.println("ReverseStringWithoutInbuidFunction is:-"+rev);
	}

}
