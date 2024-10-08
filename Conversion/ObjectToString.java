package Conversion;

public class ObjectToString {

	public static void main(String[] args) {
		
		String s = "nitin";
		
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		//converting StringBuilder to String 
		String rev = sb.toString();
		
		System.out.println("String is: "+s);
		System.out.println("Reverse String: "+ rev);

		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
