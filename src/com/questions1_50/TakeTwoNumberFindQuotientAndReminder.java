package com.questions1_50;

import java.util.Scanner;

public class TakeTwoNumberFindQuotientAndReminder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		System.out.println("Enter devisor");
		int div=sc.nextInt();
		
		System.out.println("Quotient is-"+(num/div));
		System.out.println("Reminder is-"+(num%div));
	}

}
