package Important;

public class FindMaximumNumberFromArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,8,4,5};
		
		int max= a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
