package Basic;

import java.util.Scanner;

public class Greetings {
	public static void main(String[] args) {

		
		System.out.print("Enter your name :");
		Scanner s = new Scanner(System.in);
		
		String name = s.next();
		
		System.out.println("Hello "+name+ ", have a good day!");
	}
}
