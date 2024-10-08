package Basic;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		
		int rock = 0; 
		int paper = 1; 
		int scissor = 2; 
		int userChoice;    
		int computerChoice;   
		
		System.out.println("Make a Move! (0. Rock, 1. Paper, 2. Scissor?)");
		Scanner s = new Scanner(System.in);
		
		Random random = new Random();
		userChoice = s.nextInt();
		computerChoice = s.nextInt();
		
		if(userChoice == computerChoice) {
			//Tie
			System.out.println("It's a tie");
		}
		else if( (userChoice == rock && computerChoice == scissor) || (userChoice == scissor && computerChoice == paper) || (userChoice == paper && computerChoice == rock) ) {
			//User wins
			System.out.println("User won");
		}
		else {
			//computer win , user lost
			System.out.println("Computer won");
		}
		
	}
}
