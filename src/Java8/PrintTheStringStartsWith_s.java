package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintTheStringStartsWith_s {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Amit", "Sushant","Nitin","Pramod","Suraj");
		List<String> list2=list.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
		System.out.println(list2);
		
		List<Integer> list3=Arrays.asList(10,20,30,25,40,50,275);
		List<Integer> list4=list3.stream().
				            map(e->String.valueOf(e)).
				            filter(e->e.startsWith("2")).
				            map(e->Integer.parseInt(e)).collect(Collectors.toList());
		System.out.println(list4);
	}

}
