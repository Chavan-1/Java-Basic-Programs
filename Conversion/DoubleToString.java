package Conversion;

public class DoubleToString {

	public static void main(String[] args) {
		
		double d = 23.4d;
		String s = String.valueOf(d);
		System.out.println(s);
		
		String s1 = Double.toString(d);
		System.out.println(s1);

	}

}
