package com.questions1_50;

public class NumberOfSubArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		int k=4;
		
		int sum=0;
		int result=0;
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				sum=sum+a[i];
				if(sum==k) {
				result++;	
				}
			}
			System.out.println(result);
		}
		
	}

}
