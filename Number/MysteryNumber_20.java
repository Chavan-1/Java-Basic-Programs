package Number;
/*****
 * 
 * A number N is said to be a mystery number if the number can be expressed by the sum of two numbers. 
 * Note that these two numbers must be reverse of each other. It lies between 22 to 198, i.e. 22<=N<=198.
 * It is called mystery numbers because these are the multiples of 11, 
 * and the sum of place values of unit (1) and tens (10) place is 11 in decimal numeration.
 * 
 * Suppose, y is a unit digit and X is a tens digit. Then, the original number will be 10X+Y. After interchanging the place of the unit and tens digit, we get 10Y+X. Therefore, the mystery number will be:
 * Mystery number= 10X+Y+10Y+X
 * Solving the above equation, we get: 11X+11Y
 * Take 11 as common. Hence, 11(X+Y).
 * 11 (9+3) = 132 = 93+39
 * 11 (6+8) = 154 = 68 + 86
 * 11 (7+9) = 176 = 79 + 97
 * 
 * *****/

public class MysteryNumber_20 {

	static int reverse(int x) {
		
		String str = Integer.toString(x);
		String string="";
		
		for(int i=str.length()-1; i>=0; i--) {
			string += str.charAt(i);  //store reverse string
		}
		int rev = Integer.parseInt(str);
		
		return rev;	
	}
	
	static boolean isMysteryNo(int num) {
		for(int i=1; i<=num/2;i++) {
			int j = reverse(i);							//calling the function that reverse a number and assign it to j  
			if(i+j == num) {							//compares the sum of two numbers is equal to given number or not  
				System.out.println(i+" "+j);
				System.out.println(num+ " is a mystery number.");
				return true;
			}
		}
		System.out.println("The given number is not a mystery number.");
		return false;
	}
	public static void main(String[] args) {
		int num = 154	; //154, 123, 132, 176, 110, 121
		isMysteryNo(num);
	}

}
