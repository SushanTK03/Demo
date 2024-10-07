package com.questions1_50;

public class CheckNumberIsPallindromOrNot {
	public static void main(String[] args) {
		
		int num=1015;
		int org_num=num;
		int rev=0;
		
		while(num>0) {
			
			rev=rev*10+num%10;
			num=num/10;
		}
		
		if(org_num==rev) {
			System.out.println("Num is pallindrom");
		}
		else {
			System.out.println("Num is not pallindrom");
		}
	}

}
