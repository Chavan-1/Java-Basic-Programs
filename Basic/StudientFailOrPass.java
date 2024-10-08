package Basic;

import java.util.Scanner;

/**Write a program to find out whether a student is pass or fail; 
if it requires a total of 40% and at least 33% in each subject to pass. 
Assume 3 subjects and take marks as input from the user.
**/

public class StudientFailOrPass {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
       
		System.out.print("Enter the marks of English : ");
        byte english = s.nextByte();
        
        System.out.print("Enter the marks of Math : ");
        byte math = s.nextByte();
        
        System.out.print("Enter the marks of Science : ");
        byte science = s.nextByte();
        
        float avg = (english+math+science)/3.0f;
        System.out.println("Overall percentage : "+avg);
    
        
        if (avg >= 40 && english >= 33 && math >= 33 && science >= 33) {
        	
        	System.out.println("Congratulations, You have been promoted");
       } else {
    	   System.out.println("Sorry, You have not been promoted! Please try again.");
       }

	}

}
