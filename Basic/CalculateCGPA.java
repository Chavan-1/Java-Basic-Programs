package Basic;

import java.util.Scanner;

public class CalculateCGPA {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter marks of OS : ");
		float os = s.nextInt();
		
		System.out.print("Enter marks of DBMS : ");
		float dbms = s.nextInt();
		
		System.out.print("Enter marks of JAVA : ");
		float java = s.nextInt();
		
		float cgpa = (os+dbms+java)/30;
		
		System.out.println("CGPA : "+ cgpa);

	}

}
