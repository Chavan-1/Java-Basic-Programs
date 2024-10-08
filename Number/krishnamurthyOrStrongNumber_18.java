package Number;
/**
 * A number is said to be Peterson/Krishnamurthy/Strog
 * if the sum of factorials of each digit is equal 
 * to number itself.
 * **/
public class krishnamurthyOrStrongNumber_18 {

	public static void main(String[] args) {
		
		int num=145, rem, sum=0;
		int temp = num;
		while(num != 0) {
			int fact = 1;
			rem = num%10;
			if (rem >= 1 || rem != 0) {
				for (int i = 1; i <= rem; i++) {
					fact = fact * i;
				}
				System.out.println("Factorial of "+rem+"! is "+fact);
			} 
			sum = sum + fact;
			num /= 10;
		}
		System.out.println("Sum of each digit of factorial is : "+sum);
		
		if(sum == temp)
			System.out.println(temp + " is a krishnamurthy number");
		else  
            System.out.println(temp + "is not a krishnamurthy number"); 
	}

}
