package Number;

public class ReverseNumber_1 {

	public static void main(String[] args) {
		
		int num = 1234, rev=0, rem;
		
		//1st approach
		for(; num!=0;num /= 10) {
			rem = num % 10;
			rev = (rev*10)+ rem;	
		}
		System.out.println("Using For Loop Reverse of a given number is : "+ rev);

		
		
		
		//2nd approach
		while (num != 0) { 
			rem = num % 10;            //reminder
			rev = (rev*10)+ rem; 		// quiotient
			num = num/10; 				
		}
		System.out.println("Using While Loop Reverse of a given number is : "+ rev);
	}

}
