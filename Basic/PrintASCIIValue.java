package Basic;

public class PrintASCIIValue {

	public static void main(String[] args) {
		
		System.out.println("Assigning a Variable to the int Variable");
		System.out.println();
		char ch1 = 'A';
		char ch2 = 'B';
		
		int asciivalue1 = ch1;
		int asciivalue2 = ch2;
		
		System.out.println("ASCII value of ch1 : "+asciivalue1);
		System.out.println("ASCII value of ch2 : "+asciivalue2);
		
		
		
		
		int ch3 = 'a';
		int ch4 = 'b';
		System.out.println("ASCII value of ch3 : "+ch3);
		System.out.println("ASCII value of ch4 : "+ch4);
		System.out.println();
		
		
		
		System.out.println("Using Type-Casting");
		System.out.println();

		char ch5 = '-';
		char ch6 = '$';
		
		int asciivalue3 = (int)ch5;
		int asciivalue4 = (int)ch6;
		
		System.out.println("ASCII value of ch5 : "+asciivalue3);
		System.out.println("ASCII value of ch6 : "+asciivalue4);
		System.out.println();
		
		
		
		
		System.out.println("ASCII value (0 to 255) of all the characters");
		for(int i=0; i<=255; i++) {
			System.out.println("ASCII value of "+(char)i + " = "+i);
		}
		
		
		
		System.out.println();
		System.out.println("ASCII value of all the alphabets (A to Z)");
		for(int i=65; i<=90; i++) {
			System.out.println("ASCII value of "+(char)i + " = "+i);
		}
		
		
		
		
		System.out.println();
		System.out.println("ASCII value of all the alphabets (a to z)");
		for(int i=97; i<=122; i++) {
			System.out.println("ASCII value of "+(char)i + " = "+i);
		}
	}

}
