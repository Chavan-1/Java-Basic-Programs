package Conversion;

public class LongToString {

	public static void main(String[] args) {
		
		long i=9993939399L;
		
		//Approach1
		String s = String.valueOf(i);
		System.out.println(s);

		//Approach2
		String s2 = Long.toString(i);
		System.out.println(s2);
	}

}
