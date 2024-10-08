package Number;

import java.util.ArrayList;

/***
 * Using Relational Operator
 * Using Math.signum() Method
 * Using Integer.signum() Method
 * Using Bit Shift Operator
 * ****/
public class PositiveOrNegativeNumber_31 {

	public static void main(String[] args) {
		
		int n=0;
		//Using Relational Operator
		if(n>0) {
			System.out.println("The Number is positive");
		 }else if(n<0) {
			System.out.println("The Number is negative");
		 }else {
			System.out.println("The Number is zero");
		 }
		
		
		//Using Math.signum() Method
		//0.0: if the argument is 0. //1.0: if the argument>0. //-1.0: if the argument<0
		double num=-98.6, result;     
		result = Math.signum(num);	  
		System.out.println(result);   
		
		
		 //Using Integer.signum() Method
		//	0: if the argument is 0. //	1: if the argument>0.//	-1: if the argument<0
		int a = 99, res;
		res = Integer.signum(a);
		System.out.println(res);
		
		
		 //Using Bit Shift Operator
		//In Java, the integers are stored in the 2's complement. We know that the highest bit of any negative number is 1, and the highest bit of any other number is 0.
		int x=-98;
		String[] ans = {"Positive", "Negative"};
		System.out.println(ans[(x >> 31) & 1]);
		
		
	}

}
