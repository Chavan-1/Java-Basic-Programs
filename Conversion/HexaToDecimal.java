package Conversion;
/*******
 * Each digit in a hexadecimal number represents a power of 16.
 * Starting from the rightmost digit (least significant digit), each digit is multiplied by 16 raised to the power of its position (starting from 0).
 * Sum all the values obtained for each position to get the decimal equivalent.
 * Example:
Hexadecimal number: 1A3
3 is in position 0: 3×16raised to 0 = 3
A (which is 10 in decimal) is in position 1: 10×16raised to 1=160
1 is in position 2: 1×16raised to2 = 256
Total = 3+160+256=419
 * *******/
public class HexaToDecimal {

	
	public static int hexaToDecimal(String hex) {
		String digits = "0123456789ABCDEF";
		hex = hex.toUpperCase();
		int val=0;
		
		for(int i=0; i<hex.length(); i++) {
			char ch = hex.charAt(i);
			int d = digits.indexOf(ch);
			val = 16*val + d;
		}
		
		return val;
		
	}
	public static void main(String[] args) {
		
//		String hex="a"; //f, 121
//		int decimal = Integer.parseInt(hex, 16);
//		System.out.println(decimal);
		
		String hex="AD2";
		int decimal = hexaToDecimal(hex);
		System.out.println("Decimal of "+hex+" is: "+decimal);

	}

}
