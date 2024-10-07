package Important;

public class FindMissingNumberInArray {
	public static void main(String[] args) {
		
		int n[]= {1,2,3,5};
		int a=n.length+1;
		int actual_sum=a*(a+1)/2;
		int sum=0;
		for(int i=0; i<n.length ;i++) {
			sum=sum+n[i];
		}
		
		int missing_num=actual_sum-sum;
		System.out.println(missing_num);
	}

}
