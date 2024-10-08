package Conversion;

public class CharToInt {

	public static void main(String[] args) {
		
		char c='a';
		char c1='1';
		
		int a=c;
		int b=c1;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		char ch='1';
		int p=Character.getNumericValue(ch);
		System.out.println(p);
		
		
		
		char ch1='1';
		int q=Integer.parseInt(String.valueOf(ch1));
		System.out.println(q);

	}

}
