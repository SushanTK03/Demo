package com.questions1_50;

import java.util.Scanner;

public class CheckGivenCharacterIsVowelOrNot {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter char");
		
		char c=sc.next().charAt(0);
		sc.close();
		
		boolean isvowel=false;
		
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isvowel=true;
	}
		if(isvowel==true) {
			System.out.println("vowel");
		}else {
			System.out.println("not vowel");
		}
	}
}
