package Conversion;

public class DecimalToBinary {

	public static String decimalToBinary(int decimal) {
		
		String binary="";
		
		if(decimal == 0) {
			return "0";
		}
		
		while (decimal > 0){
			int rem = decimal % 2;
			binary = rem + binary;
			decimal /= 2;
		}
		
		return binary;
	}
	
	public static void main(String[] args) {
		
		int decimal=10;
		String binary = decimalToBinary(decimal);
		System.out.println("Binary of "+decimal+" is: "+binary);
		
		
//		int decimal = 10;
//		String binary = Integer.toBinaryString(decimal);
//		System.out.println(binary);

	}

}
