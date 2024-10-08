package Basic;

/*
Prime number is a number that is greater than 1 and divided by 1 or itself only. 
In other words, prime numbers can't be divided by other numbers than itself or 1. 

For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.

Note: 0 and 1 are not prime numbers. 
The 2 is the only even prime number because all the other even numbers can be divided by 2.
*/

public class PrimeNumber {

	public static void main(String[] args) {
	    
	   int num = 3;
	   boolean flag = false;
	   
	   // 0 and 1 are not prime numbers
	   if ( num == 0 || num == 1 ){
	       
	       flag = true;
	       
	   } else {
	       
	       for ( int i = 2; i <= num/2; i++ ){ 		//if divisible by 2 means not a prime no.    // condition for nonprime number
	           if ( num % i == 0 ){      
	               flag = true;
	               break;
	           }
	       }
	   }
	   
	   if (!flag){
	       System.out.println(num+" is a Prime number!");
	   } else {
	       System.out.println(num+" not a Prime number!");
	   }
	}
}
