package com.questions1_50;

import java.util.Scanner;

public class PrintMultiplicationTable {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number");
		
		int num=sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+"*"+i+"="+(i*num));
		}
	}

}
