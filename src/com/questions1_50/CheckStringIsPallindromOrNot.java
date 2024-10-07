package com.questions1_50;

public class CheckStringIsPallindromOrNot {
	public static void main(String[] args) {
		
		String str="101";
		
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
			
		}
		if(str.equals(rev)) {
			System.out.println("String is pallindrom");
		}else {
			System.out.println("String is not pallindrom");
		}
	}

}
