package Java8;

import java.util.Arrays;
import java.util.List;

public class AverageOfAllTheNumbers {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		
	Double average=list.stream().mapToInt(a->a).average().getAsDouble();
	System.out.println(average);
	}

}
