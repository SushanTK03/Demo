package Important;

public class StringPallindromOrNot {
	public static void main(String[] args) {
		
		String s="1015";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("Pallindrom");
		}else {
			System.out.println("Not");
		}
	}

}
