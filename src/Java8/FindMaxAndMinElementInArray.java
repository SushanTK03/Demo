package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMaxAndMinElementInArray {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,235,45,25,60,75);
		
		//Find Max Value
		Integer maxValue=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(maxValue);
		
		//Find min value
		
		Integer minValue=list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(minValue);
	}

}
