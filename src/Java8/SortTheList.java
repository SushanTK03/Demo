package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheList {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,235,45,25,60,75);
		
		//Deccending sort
		List<Integer> list2=list.stream().sorted((a,b)->(b-a)).collect(Collectors.toList());
		System.out.println(list2);
		
		//Assending sort
		List<Integer> list3=list.stream().sorted((a,b)->(a-b)).collect(Collectors.toList());
		System.out.println(list3);
	}

}
