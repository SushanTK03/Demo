package com.questions1_50;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int num=153;
		int org_num=num;
		int armStrong=0;
		
		while(num!=0) {
			armStrong=armStrong+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(armStrong==org_num) {
			System.out.println("Amstrong number");
		}else {
			System.out.println("No amstrong number");
		}
	}

}
