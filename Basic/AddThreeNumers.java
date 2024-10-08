package Basic;
import java.util.Scanner;
public class AddThreeNumers {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter numbers to be added : ");
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		int sum = num1+num2+num3;
		
		System.out.println("Sum to three numbers : "+sum);
	}

}
