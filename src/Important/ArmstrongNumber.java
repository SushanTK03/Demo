package Important;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		int a=2;
		int org_num=a;
		int sum=0;
		while(a>0) {
			sum=sum+(a%10)*(a%10)*(a%10);
			a=a/10;
		}
		if(org_num==sum) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not");
		}
	}

}
