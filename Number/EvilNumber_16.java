package Number;

/*
 * Evil number is a number when 
 * even number of 1's in its binary equivalent.
 * The numbers which are not evil are called odious numbers.
 * **/
public class EvilNumber_16 {

	public static long decToBinary(int decimal) {
		long binary = 0;
		
		if(decimal == 0) {
			return 0;
		}
		
		while (decimal != 0) {
			int rem = decimal % 2;
			binary = rem + binary;
			decimal /= 2;
		}
		return binary;
	}
	
	public static boolean checkOnes(int n) {
		
		long binary = decToBinary(n);
		
		int count = 0;
		
		while (binary != 0) {
			if (binary % 10 == 1)
				count++;
			binary /= 10;
		}
		if(count%2 == 0)
			return true;
			
		return false;
	}
	
	
	public static void main(String[] args) {
		
		int decimal = 24; //84, 23, 24
		
		if(checkOnes(decimal))
			System.out.println(decimal + " is an evil number");
		else 
			System.out.println(decimal + " is not an evil number");

	}

}
