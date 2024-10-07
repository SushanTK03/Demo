package com.questions1_50;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheSquareOfGivenNumber {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	
	int num=sc.nextInt();
	
	System.out.println("TheSquareOfGivenNumber is-"+num*num);
	
	int a[]= {1,2,3,6,5};
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	
}
}
