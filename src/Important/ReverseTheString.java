package Important;

public class ReverseTheString {
	public static void main(String[] args) {
		
		String str="sushant";
		
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+"");
		}
		System.out.println();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
	}

}
