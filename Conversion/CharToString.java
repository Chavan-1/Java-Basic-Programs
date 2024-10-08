package Conversion;

public class CharToString {

	public static void main(String[] args) {
		
		char c = 'S';
		String s = String.valueOf(c);
		System.out.println(s);
		
		String s1 = Character.toString(c);
		System.out.println(s1);

	}

}
