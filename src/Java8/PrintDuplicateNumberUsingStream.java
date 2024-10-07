package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNumberUsingStream {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,2,4,4,5,6,7);
		
		//First way
		Set<Integer> set=list.stream().filter(e->Collections.frequency(list, e)>1).collect(Collectors.toSet());
		System.out.println(set);
		
		//Second Way
		
		Set<Integer> set2=new HashSet<Integer>();
		
		Set<Integer> set3=list.stream().filter(e->set2.add(e)==false).collect(Collectors.toSet());
		System.out.println(set3);
    
	}

}
