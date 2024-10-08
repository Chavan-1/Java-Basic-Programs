package Number;
/**
 * A number is said to be Peterson/Krishnamurthy/Strog
 * if the sum of factorials of each digit is equal 
 * to number itself.
 * **/

public class PetersonNumber_4 {

	public static void main(String[] args) {
		
		int num=145, rem, sum=0;
		int temp = num;
		
		//Sum of factorial of each digit of num
		while(num != 0) {
			
			int fact=1;    //Fact reset
			
			rem = num%10;  // reminder i.e last digit
			
			for(int i=1; i<=rem; i++) {  //Factorial of last digit
				fact = fact*i;
			}

			System.out.println(rem+"! is "+fact);
			
			sum = sum+fact;
			System.out.println(sum);
			
			num /= 10;
		}
		
		if(sum == temp)
			System.out.println("It is a Peterson number");
		else
			System.out.println("It is not a Peterson number");
	}

}
