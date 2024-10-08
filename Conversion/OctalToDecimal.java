package Conversion;

public class OctalToDecimal {

	public static int octalToDecimal(int octal) {
		
		int decimal=0, power=0;
		
		while(true) {
			if(octal == 0) {
				break;
			}else {
				int rem = octal % 10;
				decimal += rem*Math.pow(8, power);
				octal /= 10;
				power++;
			}
		}
		
		return decimal;
		
	}
	public static void main(String[] args) {
		
//		String octal = "121";
//		int decimal = Integer.parseInt(octal, 8);
//		System.out.println(decimal);

		int octal = 121;
		int decimal = octalToDecimal(octal);
		System.out.println(decimal);
	}

}
