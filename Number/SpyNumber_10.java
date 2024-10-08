package Number;
/***
 * a number whose sum and product of all digits are equal is called a spy number.
 * Example : n=1124
 * sum= 1+1+2+4 = 8
 * product = 1*1*2*4 = 8
 * **/
public class SpyNumber_10 {

	public static void main(String[] args) {
		
		int n = 1124; //132, 217, 1124
		int rem, sum=0, prod=1;
		
		while(n>0) {
			rem = n%10;
			sum = sum + rem;
			prod = prod * rem;
			n /= 10;
		}
		
		if (sum == prod)
			System.out.println("It is a Spy Number");
		else 
			System.out.println("It is not a Spy Number");
	}

}
