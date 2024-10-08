package Number;

public class SwapNumberUsingBitwiseOperator_27 {

	public static void swapNumbers(int a, int b){
		//Aproach 1
		//without third variable 
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("Swapping without third variable\na = "+a+"\nb = "+b);  
		
		//Aproach 2
		//using Bitwise XOP(^) Operator
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("Swapping using Bitwise XOP(^) Operator\na = "+a+"\nb = "+b);  
			
		//Aproach 3
		//using formula
		a = a + (b - (b=a)) ;
		System.out.println("Swapping using formula\na = "+a+"\nb = "+b); 
		
		//Aproach 4
		//using multiplication and division operator.
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println("Swapping using multiplication and division operator\na = "+a+"\nb = "+b);  
	}
	
	
	public static void main(String[] args) {
		
		int a=2, b=4;
		System.out.println("Before Swapping\na = "+a+"\nb = "+b);  
		swapNumbers(a, b);
	}
	
}
