package Basic;

import java.util.Scanner;

public class ConvertKmToMiles {

	public static void main(String[] args) {

		System.out.print("Km : ");
		Scanner s = new Scanner(System.in);
		
		float km = s.nextFloat();
		
		double miles = km/1.609344;
		System.out.print(km+" is "+miles+ " miles");
	

	}

}
