package Number;
/******
 * Strontio numbers are those four digits numbers when multiplied by 2 give the same digit at the hundreds and tens place. 
 * Remember that the input number must be a four-digit number.
 * Example 1386*2=2772, we observe that at tens and hundreds place digits are the same. 
 * Hence, 1386 is a strontio number. 1221*2=2442, digits at tens and hundreds place are the same. 
 * Hence, 1221 is a strontio number.
 * ******/
public class StrontioNumber_22 {

	public static void main(String[] args) {
		
		int n = 1221; //1386, 7587, 1111, 1875
		int temp = n;
		
		//first, we have multiplied a number by 2  
		//the resultant is divided by 1000 that gives the remainder and removes the first digit  
		//at last, the resultant is divided by 10 that removes the last digit   
		//therefore, we get a two-digit number that are mean digits of the given number  
		
		n = (n*2 % 1000)/10;
		
		
		//divide the two-digit number (that we get from the above) by 10 and find the remainder  
		//compares the remainder and quotient   
		
		if (n%10 == n/10)
			System.out.println(temp+ " is a strontio number."); 
		else
			System.out.println(temp+ " is not a strontio number."); 
	}
}
