package Basic;

import java.util.Scanner;

public class FindTypeOfWebsite {

	public static void main(String[] args) {
		
		System.out.print("Enter your website : ");
		
		Scanner s = new Scanner(System.in);

		String website = s.next();
		
		if(website.endsWith(".com")) {
			System.out.println("This is an commercial website");
		}else if(website.endsWith(".org")) {
			System.out.println("This is an organization website");
		}else if(website.endsWith(".in")) {
			System.out.println("This is an Indian website");
		}else {
			System.out.println("Enter valid website!");
		}

	}

}
