package Number;

public class AlternatePrimeNumber_24 {

	static int checkPrime(int n) {
		
		int flag = 0;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) 
				flag = 1;
				break;		
		}
		if(flag == 0)
			return 1;
		else 
			return 0;	
	}
	
	static void printAlternatePrimeNumber(int n) {
		/* When the temp value is odd then we are
		 * not printing the prime number and when it is
		 * even then we are printing it, this way we are
		 * displaying alternate prime numbers
		 */
		int temp = 2;
		
		for(int num=2; num<=n-1; num++) {
			if(checkPrime(num) == 1) {
				if(temp%2==0) 
					System.out.println(num+ " ");
					temp++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int num=20;
		System.out.println("Alternate prime numbers up to "+num+" are : ");
		printAlternatePrimeNumber(num);
		
	}

}
