package Basic;

/******
 * Factorial of n is the product of all positive descending integers. Factorial of n is denoted by n!. For example:
 * 4! = 4*3*2*1 = 24   
 * 5! = 5*4*3*2*1 = 120  
 * *****/

public class Factorial {

	public static void main(String[] args) {
		
		int num = 5;
		int fact = 1;
		
		if (num >= 1 || num != 0) {
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of "+num+"! is "+fact);
		} 

	}

}
