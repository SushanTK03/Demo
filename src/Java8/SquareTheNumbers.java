package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareTheNumbers {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		//Square the number
		List<Integer> list2=list.stream().map(a->a*a).collect(Collectors.toList());
		System.out.println(list2);
		
		//List the number grater than 100
		
	    List<Integer> list3=list.stream().map(a->a*a).filter(a->a>100).collect(Collectors.toList());
	    System.out.println(list3);
	    
	    
	    //Find average of that
	    double average= list3.stream().mapToInt(a->a).average().getAsDouble();
	    System.out.println(average);
	}

}
