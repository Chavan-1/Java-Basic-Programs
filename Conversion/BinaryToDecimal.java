package Conversion;

public class BinaryToDecimal {

	public static int binaryToDecimal(long binary) {
		int decimal=0, power=0;
		long rem;
		
		while (binary != 0) {
			rem = binary % 10;
			binary /= 10;
			decimal += rem*Math.pow(2, power);
			power++;
		}
		
		return decimal;
	}
	
	public static void main(String[] args) {
	
		long binary= 110110111;
		int deciResult = binaryToDecimal(binary);
		System.out.println(binary +" in binary = "+ deciResult +" in decimal");
	
//		String bi = "110110111";
//		int dec = Integer.parseInt(bi, 2);
//		System.out.println(bi + " in binary = " + dec + " in decimal.");
	}

}
