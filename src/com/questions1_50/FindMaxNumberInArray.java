package com.questions1_50;

public class FindMaxNumberInArray {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,8,6,5};
	
	int max=a[0];
	int min=a[0];
	
	for(int i=1; i<a.length; i++) {
		if(max<a[i]){
			max=a[i];
		}
		if(min>a[i]) {
			min=a[i];
		}
	}
	System.out.println("MaxNumberInArray is:-"+max);
	System.out.println("MinNumberInArray is:-"+min);
}
}
