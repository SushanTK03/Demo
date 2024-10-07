package com.questions1_50;

public class FindMissingElementInArray {
	public static void main(String[] args) {
	 
		 int a[]= {1,2,3,4,6};
		 
		 int n=a.length+1;
		 
		 int actualSum=(n*(n+1))/2;
		 
		 int sum=0;
		 
		 for(int i=0; i<a.length; i++) {
			 sum=sum+a[i];
		 }
		 
		 int missing_num=actualSum-sum;
		 
		 System.out.println("MissingElementInArray is:-"+missing_num);
	}

}
