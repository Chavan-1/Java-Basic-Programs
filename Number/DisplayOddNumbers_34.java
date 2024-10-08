package Number;

public class DisplayOddNumbers_34 {

	public static void main(String[] args) {
		
		int n=50, i;
		//Using for Loop
		System.out.print("List of odd numbers Using for Loop : ");
		for(i=1; i<=100; i++) {
			if(i%2 != 0)
				System.out.print(i+" ");
		}
		
		//Using nested-if Statement
		System.out.println();
		System.out.print("List of odd numbers Using nested-if : ");
		displayOddNumbers(1, 50);
		
		
		//Using while Loop
		int a = 50, j=1;
		System.out.println();
		System.out.print("List of odd numbers Using while Loop : ");
		while(j<=a) {
			System.out.print(j+" ");
			j=j+2;
		}
	}

	private static void displayOddNumbers(int num, int end) {
		if(num>end) 
			return;
			
		if(num%2 != 0) {
			System.out.print(num+" ");
			displayOddNumbers(num+2, end);  //calling the method and increments the number by 2 if the number is even  
		}else {
			displayOddNumbers(num+1, end);	//increments the number by 1 if the number is odd  
		}
	}
}


