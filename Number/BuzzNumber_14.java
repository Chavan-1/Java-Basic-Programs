package Number;

// Buzz number is another special number in Java that 
//ends with digit 7 or divisible by 7.

public class BuzzNumber_14 {

	public static void main(String[] args) {
	
		int n=447;
		
		if (n%10 == 7 || n%7 == 0) 
		{
			System.out.println(n+" is a Buzz number.");
		} else 
		{
			System.out.println(n+" is not a Buzz number.");
		}

	}

}
