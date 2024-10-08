package Number;

public class NthPrimeNumber_24 {

	public static void main(String[] args) {
		
		int n = 10, num=1, count = 0, i;
		
		while(count < n) {
			num ++;
			for(i=2; i<=num; i++) {
				if(num%i == 0)
					break;
			}
			if(i == num)
				count ++;	
		}
		System.out.println("The " +n +"th prime number is : " + num);
	}

}
