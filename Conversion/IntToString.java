package Conversion;

public class IntToString {

	public static void main(String[] args) {
		
		int i=200;
		//Apraoch1
		String s = String.valueOf(i);
		
		System.out.println(i+100);
		System.out.println(s+100);

		//Approach1
		String s1=Integer.toString(i);
		System.out.println(s1+400);
		
		//Aproach3
		String s3 = String.format("%d", i);
		System.out.println(s+100);
	}

}
