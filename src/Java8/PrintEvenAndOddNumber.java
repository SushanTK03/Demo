package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenAndOddNumber {
    public static void main(String[] args) {
    	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
    	
    	//Print even number
    	
    	List<Integer> even_number=list.stream().filter(a->a%2==0).collect(Collectors.toList());
    	System.out.println(even_number);
    	
    	//Print odd number
    	
    	List<Integer> odd_number=list.stream().filter(a->a%2!=0).collect(Collectors.toList());
    	System.out.println(odd_number);
	}
}
