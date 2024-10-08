package Conversion;

public class DecimalToHexa {

	public static String decimalToHexa(int decimal) {
		
		int rem;
		String hex="";
		char hexChars[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(decimal>0) {
			rem = decimal%16;
			hex = hexChars[rem] + hex;
			decimal /= 16;
		}
		
		return hex;
		
	}
	
	
	public static void main(String[] args) {
		
//		int decimal = 10;
//		String hex = Integer.toHexString(decimal);
//		System.out.println(hex);
		
		int decimal = 10;
		String hex = decimalToHexa(decimal);
		System.out.println(hex);
		
	}

}
