package Conversion;

public class IntToChar {

	public static void main(String[] args) {
		
		int a=65;
		char c1=(char) a;
		System.out.println(c1);

		int b=1;
		char c2 = Character.forDigit(b, a);
		System.out.println(c2);
	}

}
