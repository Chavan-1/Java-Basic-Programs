package Conversion;

public class IntToDouble {

	public static void main(String[] args) {
		
		int i = 200;
		double d = i;
		System.out.println(d);
		
		Double d1 = new Double(i);
		System.out.println(d1);
		
		Double d2 = Double.valueOf(i);
		System.out.println(d2);
	}

}
