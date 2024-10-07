package com.questions1_50;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArrayUsingHashSet {
	public static void main(String[] args) {
	       
		int a[]= {1,2,3,4,5,5,6};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			
			if(set.add(a[i])==false) {
				System.out.println(a[i]);
			}
		}
	}

}
