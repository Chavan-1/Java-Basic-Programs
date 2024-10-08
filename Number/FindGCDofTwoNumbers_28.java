package Number;

/**
 * Greatest Common Divisor: It is the highest number that 
 * completely divides two or more numbers.
 * number 12 & 8, find GCD
 * Factors of 12: 1, 2, 3, 4, 6, 12
 * Factors of 8: 1, 2, 4, 8
 * Common Factors: 1, 2, 4
 * Greatest Common Factor: 4
 * **/

public class FindGCDofTwoNumbers_28 {

	public static void main(String[] args) {
	
		int x=12, y=8, gcd=1;
		for(int i=1; i<=x && i<=y; i++) {		//running loop form 1 to the smallest of both numbers  
			if(x%i==0 && y%i==0)
				gcd=i;
		}
		System.out.println("GCD of "+x+" and "+y+" is: "+gcd); 
		
		
		
		int n1=50, n2=60;
		while(n1!=n2) {
			if(n1>n2)
				n1 = n1-n2;
			else
				n2 = n2-n1;
		}
		System.out.println("GCD of n1 and n2 is: "+n2); 
		
		
		int num1=12, num2=8, temp, gcd1=0;
		while(num2 != 0) {
			temp = num2;
			num2 = num1%num2;
			num1=temp;
		}
		gcd1 = num1;
		System.out.println("GCD od num1 and num2 = "+gcd1);
		
		
		
		//Using Function
		int a=12, b=8;
		System.out.println("Using function GCD of "+a+" and "+b+" is : "+findGCD(a, b));
		
		//using Euclidean Algorithm
		int m=12, n=8;
		System.out.println("Using Euclidean Algorithm GCD of "+m+" and "+n+" is : "+findGCDusingEclidsAlgo(m, n));

		
		//using modulo operator
		int p=112, q=543;
		System.out.println("Using modulo operator GCD of " + p +" and " + q + " is " + findGCDusingModuloOperator(p, q)); 
	}

	

	public static int findGCD(int a, int b) {
		while(b!=0) {
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	
	static int findGCDusingEclidsAlgo(int m, int n) {
		int r=0, a, b;
		
		a=(m>n)? m:n; //a is greater
		b=(m<n)? m:n; //b is greater
		r=b;
		
		while(a%b != 0) {
			r=a%b;
			a=b;
			b=r;
		}
		return r;
	}

	
	static int findGCDusingModuloOperator(int p, int q) {
		if(q == 0)
			return p;
		return findGCDusingModuloOperator(q, p%q);
	}
}


/*****
 * Approaches
 * 1. using for loop
 * 2. using addition and subtraction
 * 3. using multiplication and division
 * 4. using function
 * 5. using Euclidean Algorithm
 * 6. using modulo operator
 * ****/