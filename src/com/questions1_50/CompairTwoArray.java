package com.questions1_50;

import java.util.Arrays;

public class CompairTwoArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,5};
		
		boolean status= Arrays.equals(a, b);
		
		if(status==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}
	}

}
