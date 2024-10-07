package com.questions1_50;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingHashSet {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,5,6};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0; i<a.length;i++) {
			set.add(a[i]);
		}
		System.out.println("Array withuot duplicate element:-"+set);
	}

}
