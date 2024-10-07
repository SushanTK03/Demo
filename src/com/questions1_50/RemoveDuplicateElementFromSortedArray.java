package com.questions1_50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementFromSortedArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,5,6};
		
		Arrays.sort(a);
		System.out.println("Sorted Array:-"+Arrays.toString(a));
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		System.out.println("Array without duplicates after sorting:-"+set);
	}

}
