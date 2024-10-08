package Basic;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.print("Enter year : ");
		
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println("Leap year!");
				}else {
					System.out.println("Not a Leap year");
				}
			} else {
			System.out.println("Not a Leap year");
			}
		} else {
		System.out.println("Not a Leap year");
		}
	}

}
