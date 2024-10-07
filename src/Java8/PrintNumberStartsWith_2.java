package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintNumberStartsWith_2 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,235,45,25,60,75);
		
		List<Integer> numberStartsWith_2=
				list.stream().
				map(e->String.valueOf(e)). //Convert int to string
				filter(e->e.startsWith("2")).
				map(e->Integer.parseInt(e)). // Convert string to int
				collect(Collectors.toList());
		System.out.println(numberStartsWith_2);
		

		
	}

}
