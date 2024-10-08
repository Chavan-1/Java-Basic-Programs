package Basic;

import java.util.Scanner;

public class PercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the marks of English: ");
        int english = s.nextInt();
        
        System.out.print("Enter the marks of Math: ");
        int math = s.nextInt();
        
        System.out.print("Enter the marks of Science: ");
        int science = s.nextInt();
        
        System.out.print("Enter the marks of Chemistry: ");
        int chemistry = s.nextInt();
        
        System.out.print("Enter the marks of DSA: ");
        int DSA = s.nextInt();
        
        int obtained = english+math+science+chemistry+DSA;
        System.out.println("Total of 5 subject: "+obtained);
        
        int percentage = (obtained*100)/500;
        System.out.println("percentage: "+ percentage +"%");
	}

}
