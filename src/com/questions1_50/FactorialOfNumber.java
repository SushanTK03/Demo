package com.questions1_50;

public class FactorialOfNumber {
	public static void main(String[] args) {
		
		int num=3;
		int fact=1;
		
		for(int i=1; i<=num; i++) {
			
			fact=fact*i;
		}
		System.out.println("FactorialOfNumber is-"+fact);
	}

}
