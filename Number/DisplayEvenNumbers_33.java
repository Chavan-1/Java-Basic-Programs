package Number;

public class DisplayEvenNumbers_33 {

	public static void main(String[] args) {
		
		int n=50, i;
		//Using for Loop
		System.out.print("List of even numbers Using for Loop : ");
		for(i=1; i<=100; i++) {
			if(i%2 == 0)
				System.out.print(i+" ");
		}
		
		//Using nested-if Statement
		System.out.println();
		System.out.print("List of even numbers Using nested-if : ");
		displayEvenNumbers(1, 50);
		
		
		//Using while Loop
		int a = 50, j=2;
		System.out.println();
		System.out.print("List of even numbers Using while Loop : ");
		while(j<=a) {
			System.out.print(j+" ");
			j=j+2;
		}
	}

	private static void displayEvenNumbers(int num, int end) {
		if(num>end) 
			return;
			
		if(num%2==0) {
			System.out.print(num+" ");
			displayEvenNumbers(num+2, end);  //calling the method and increments the number by 2 if the number is even  
		}else {
			displayEvenNumbers(num+1, end);	//increments the number by 1 if the number is odd  
		}
	}
	
	
}
