package com.questions1_50;

public class SearchElementInArray {
	public static void main(String[] args) {
		
		int a[]= {8,4,5,1,2,3,4,5,6,7,8,9};
		
		int element=9;
		
		for(int i=0; i<a.length; i++) {
			if(element==a[i]) {
				System.out.println("Element present in array at index:-"+i);
			}
		}
	}

}
