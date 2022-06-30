package Test;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss  = "Shubhangi";
		char[] a = ss.toCharArray();
		String sw = "";
		
		
		for(int i = a.length - 1; i >= 0; i--) {
			sw = sw + a[i];
		}
		
		System.out.println();

	}

}
