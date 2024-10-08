package Number;

/*********
 * A number is said to be a Keith number, if it is arranged with a special sequence of numbers 
 * which are initially created by its digits.
 * example : Input number is 19
 * Let’s check it by using the logic of Keith number −
 * By separating the digits of 19 we get our first sequence= 1, 9.
 * Now add all the digits= 1 + 9 = 10.
 * Now the new sequence is 1, 9, 10.
 * Now add the last two numbers = 9 + 10 = 19.
 * So the new sequence is 1, 9, 10, 19.
 * Here we can see the last number of the sequence is the same as our input number or the origin number.
 * Hence, 19 is a Keith number.
 * if 3digit no. then add last 3no.s to next next no.
 *
 * *********/

public class KeithNumber_8 {

	public static void main(String[] args) {
	
		int n=197; //152,14,19
		int temp=n;		
		String str = Integer.toString(n);
		int len = str.length();
		int store[] = new int[n];
		int i, sum=0;
		
		for(i=len-1; i>=0; i--)             // break n into single digits
		{
			store[i] = temp % 10;
			temp /= 10;
		}
		i=len;
		
		while(sum<n) {						//calculate the next numbers
			sum = 0;
			
			for(int j=1; j<=len; j++)
				sum = sum + store[i-j];
			
			store[i]=sum;						//store the calculated numbers into the array
			i++;
		}
		
		if(sum==n)
			System.out.println("It is a Keith number");
		else
			System.out.println("It is not a Keith number");
		
//		int n = 152, temp, rem, sum=0;
//		temp = n;
//		for (int i=0 ;temp > 0; i++) {
//			rem = temp%10;
//			sum = sum + rem;
//			temp /= 10;
//			
//			System.out.print(rem+", ");
//		}
//		System.out.print(sum);
		
		

	}

}
