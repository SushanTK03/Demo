package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTheStringWithEqualLength {
	public static void main(String[] args) {
	
		List<String> list=Arrays.asList("Jay", "Anil", "Swapni", "Vijay" , "Viraj");
		
		Map<Integer, List<String>> map=list.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}

}
