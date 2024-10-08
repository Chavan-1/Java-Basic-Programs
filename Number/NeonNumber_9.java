package Number;
/**********
 * A positive integer whose sum of digits of its square is 
 * equal to the number itself is called a neon number.
 * Example:
 * 9 = 9*9 = 81 = 8+1 = 9
 * **********/
public class NeonNumber_9 {

	public static void main(String[] args) {
		
		int n=9; //15,45, 9
		int rem, sum=0;
		int sq= n*n;
		
		while (sq > 0) {
			rem = sq % 10;
			sum = sum + rem;
			sq /= 10;
		}

		if (n == sum)
			System.out.println("It is a Neon Number");
		else 
			System.out.println("It is not a Neon Number");
	}

}
