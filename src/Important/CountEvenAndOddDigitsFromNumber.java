package Important;

public class CountEvenAndOddDigitsFromNumber {
	public static void main(String[] args) {
		int a=123456;
		int event_count=0;
		int odd_count=0;
		
		while(a>0) {
			if(a%2==0) {
				event_count++;
			}else {
				odd_count++;
			}
			a=a/10;
		}
		System.out.println(event_count);
		System.out.println(odd_count);
	}

}
