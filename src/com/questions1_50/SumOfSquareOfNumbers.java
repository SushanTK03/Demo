package com.questions1_50;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfSquareOfNumbers {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		
		Optional<Integer> sum=list.stream().map(a->a*a).reduce((a,b)->(a+b));
		System.out.println(sum.get());
	}

}
