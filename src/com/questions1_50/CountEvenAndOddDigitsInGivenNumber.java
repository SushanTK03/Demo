package com.questions1_50;

public class CountEvenAndOddDigitsInGivenNumber {
	public static void main(String[] args) {
		
		int num=12345;
		int even_count=0;
		int odd_count=0;
		int rem;
		while(num!=0) {
			rem=num%10;
			
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("Even_count:-"+even_count);
		System.out.println("odd_count:-"+odd_count);
	}

}
