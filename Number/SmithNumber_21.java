package Number;
/*******
 * A Smith number is a composite number whose sum of digits equals to the 
 * sum of digits of its prime factors, excluding 1. 
 * It is also known as a joke number.
 * Example number=85
 * sum of digits = 8+5 = 13
 * Prime factors of 85 is : 5, 17
 * sum of digits of its  Prime factors = 5+1+17 = 13
 * 13=13
 * *********/

public class SmithNumber_21 {

	//function checks if the factor is prime or not  
	static boolean isPrime(int k) {
		boolean b=true;
		int d=2;
		while(d>Math.sqrt(k)) {
			if(k%d==0) {
				b=false;
			}
			d++;
		}
		return b;
	}
	
	static int SumOfPrimeFactors(int num) {
		int i=2, sum=0;
		while(num>0) {
			if(num%i == 0) {
				sum += FindSumOfDigits(i);
				num /= i;
			} else {
				do {
					i++;
				} while(!isPrime(i));
			}
		}
		return sum;
	}
	
	static int FindSumOfDigits(int n) {
		int sum=0;
		while(n>0) {
			sum += n%10;
			n /= 10;
		}
		return sum;	
	}
	
	public static void main(String[] args) {
		
		int n = 27;
		int a = FindSumOfDigits(n);
		int b =  SumOfPrimeFactors(n);
		
		System.out.println("Sum of Digits of the given number is = "+a);  
		System.out.println("Sum of digits of its prime factors is = "+b); 
		
		if(a==b)    
			System.out.print("The given number is a smith number.");  
		else  
			System.out.print("The given number is not a smith number.");  

	}

}
