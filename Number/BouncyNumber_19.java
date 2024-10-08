package Number;
/*****
 * A positive integer that is neither in increasing nor decreasing number is called a bouncy number. 
 * It means they bounce between increasing and decreasing. In other words, we can say that if the digits 
 * of the number are unsorted. example, 123742, 101, 43682, etc. 
 * We observe that in the given number's digits are neither increasing nor decreasing if we traverse from left to right, 
 * hence they are called bouncy numbers.
 * *****/

public class BouncyNumber_19 {

	public static boolean isIncreasing(int n) {
		
		String str = String.valueOf(n);
		char digit;
		boolean flag = true;

		for(int i=0; i<str.length()-1; i++) {
			digit = str.charAt(i);
			if(digit > str.charAt(i+1)) {  //if any digit is greater than check next digit, it will not check further 
				flag = false;
				break;
			}
		}
		
		return flag;		
	}
	
	public static boolean isDecreasing(int n) {
		
		String str = String.valueOf(n);
		char digit;
		boolean flag = true;
		
		for(int i=0; i<str.length()-1; i++) {
			digit = str.charAt(i);
			if(digit < str.charAt(i+1)) {  //if any digit is less than it will not check further 
				flag = false;
				break;
			}
		}
		
		return flag;	
	}
	
	public static void main(String[] args) {
		int num=101; // 123742, 43682
		
		if(isIncreasing(num) || isDecreasing(num) || num < 101)
			System.out.println(num+ " not a bouncy number");
		else 
			System.out.println(num+ " is a bouncy number");
		
	}

}
