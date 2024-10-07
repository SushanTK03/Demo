package Important;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInArrayUsingHashSet {
	public static void main(String[] args) {
		int a[]= {1,2,3,2,4,5};
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(set.add(a[i])==false) {
				System.out.println(a[i]);
			}
		}
		
	}

}
