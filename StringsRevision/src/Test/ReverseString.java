package Test;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String old = "Shubhangi";
		char[] a = old.toCharArray();
		String newString = "";
		
		for(int i = a.length - 1;i >= 0; i--) {
			
		
			newString = newString + a[i];
			
		}
		
		System.out.println(newString);

	}

}
