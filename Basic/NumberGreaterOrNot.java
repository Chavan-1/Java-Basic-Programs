package Basic;

import java.util.Scanner;

public class NumberGreaterOrNot {

	public static void main(String[] args) {
		
		System.out.print("Enter number: ");
		Scanner s = new Scanner(System.in);
       
        int number = s.nextInt();
        
        Boolean num = 10 > number;
        System.out.print(num);

	}

}
