package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumAllTheElement {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		
	Optional sum=list.stream().reduce((a,b)->(a+b));
	System.out.println(sum.get());
	}

}
