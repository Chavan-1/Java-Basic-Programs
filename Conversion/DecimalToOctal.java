package Conversion;

public class DecimalToOctal {
	
	public static String decimalToOctal(int decimal) {
		
		int rem;
		String octal="";
		char[] octalChars = {'0','1','2','3','4','5','6','7'};
		
		while(decimal > 0) {
			rem = decimal % 8;
			octal = octalChars[rem]+octal;
			decimal /= 8;
		}
		
		return octal;
	}
	
	public static void main(String[] args) {
		
//		int decimal = 8;
//		String octal = Integer.toOctalString(decimal);
//		System.out.println(octal);

		int decimal = 8;
		String octal = decimalToOctal(decimal);
		System.out.println(octal);
	}

}
