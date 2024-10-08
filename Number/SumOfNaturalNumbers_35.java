package Number;
/**
 * The natural numbers are the numbers that include all the positive integers from 1 to infinity. 
 * For example, 1, 2, 3, 4, 5, ......, n. When we add these numbers together, 
 * we get the sum of natural numbers.
 * using the mathematical formula:
 * Sum of n natural numbers=n*(n+1)/2
 * */
public class SumOfNaturalNumbers_35 {

	public static void main(String[] args) {
		int i, num=10, sum=0;
		
		//using for loop
		for(i=1; i<=num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of Natural Numbers using for loop is = " + sum);

		
		//using while loop
		while(i<=num) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of Natural Numbers using while loop is = " + sum);
		
		//using formula
		int res = num*(num+1)/2;
		System.out.println("Sum of Natural Numbers using formula is = " + res);
	}

}
