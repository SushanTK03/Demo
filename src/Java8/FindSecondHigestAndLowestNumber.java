package Java8;

import java.util.Arrays;
import java.util.List;

public class FindSecondHigestAndLowestNumber {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,20, 30, 40, 50, 60);
		
		//Find second higest number
		
		list.stream().sorted((a,b)->(b-a)).limit(2).skip(1).forEach(System.out::println);
		
		//Find second higest number
		
		list.stream().sorted((a,b)->(a-b)).limit(2).skip(1).forEach(System.out::println);
	}

}
