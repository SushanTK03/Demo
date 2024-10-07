package com.questions1_50;

import java.util.Scanner;

public class PrintAverageOfSixNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		
		System.out.println("Enter third number");
		int n3=sc.nextInt();
		
		System.out.println("Enter fourth number");
		int n4=sc.nextInt();
		
		System.out.println("Enter fifth number");
		int n5=sc.nextInt();
		
		System.out.println("Enter sixth number");
		int n6=sc.nextInt();
		
		int avg=n1+n2+n3+n4+n5+n6;
		
		System.out.println("AverageOfSixNumber is-"+avg);

	}

}
