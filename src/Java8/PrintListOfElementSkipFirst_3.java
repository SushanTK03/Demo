package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintListOfElementSkipFirst_3 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20, 30, 40, 50, 60);
		
		//Skip first 3 element
		List<Integer> list2=list.stream().skip(3).collect(Collectors.toList());
		System.out.println(list2);
		
		//Print first 3 element
		List<Integer> list3=list.stream().limit(3).collect(Collectors.toList());
		System.out.println(list3);
	}

}
