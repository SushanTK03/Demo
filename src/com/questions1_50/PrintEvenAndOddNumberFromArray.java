package com.questions1_50;

public class PrintEvenAndOddNumberFromArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		for(int i=0; i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.print(  a[i]+" ");
			}
		
	}

}}
