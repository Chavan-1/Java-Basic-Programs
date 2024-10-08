package Number;

/******
 * A number is called an emirp number if we get another prime number on reversing the number itself. 
 * In other words, an emirp number is a number that is prime forwards or backward. 
 * It is also known as twisted prime numbers.
 * Note: Palindrome primes are excluded.
 * ******/

public class EmirpNumber_13 {
	
	public static boolean isPrime(int n) {
		
		if (n<=1) 
			return false;  // if condition true than not prime
		
		for(int i=2; i<=n/2; i++)
			if(n%i == 0) 
				return false;  // if condition true than not prime
		
		return true;   //If no divisors are found in the loop, the method returns true, indicating that n is a prime number.
	}
	
	public static boolean isEmirp(int n) {
		
		if(isPrime(n)==false)  
			return false;		
		
		int rev=0;
		while(n != 0) {
			int rem = n%10;
			rev = rev*10+rem;
			n /= 10;
		}
		
		return isPrime(rev); // method check if rev is a prime no. or not
		
	}

	public static void main(String[] args) {
			
			int n = 79; //13, 199, 107, 113, 1399, 1583, 1201, 3049, etc
			
			System.out.println("Number to be checked "+n);
			
			if(isEmirp(n) == true)
				System.out.println("Yes, the given number is an emirp number.");
			else  
				System.out.println("No, the given number is not an emirp number."); 
	}
}
