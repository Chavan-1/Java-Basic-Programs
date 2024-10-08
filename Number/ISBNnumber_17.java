package Number;
/****
 * ISBN stands for the International Standard Book Number
 * The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11. 
 * The digits are taken from right to left. 
 * So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.
 * ****/
public class ISBNnumber_17 {

	public static boolean checkISBNNum(long num) {
		
		int sum=0, rem, i, digit, prod;
		String str = ""+num;
		
		if(str.length() != 10) {
			return false;
		}
		
		for (i=0; i<str.length(); i++) {
			rem = Integer.parseInt(str.substring(i, i+1));
			digit = i+1;
			prod = digit*rem;
			sum = sum + prod;
		}
		
		System.out.println("sum "+sum);
		
		if((sum % 11) == 0)
			return true;
		
		return false;
	}
	
	
	public static void main(String[] args) {

		long num = 1259060977L; //8147852369L, 
		
		if (checkISBNNum(num))
			System.out.println(num+" is a valid ISBN number");
		else
			System.out.println(num+" is not a valid ISBN number");
		

	}

}
