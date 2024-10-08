package Number;
import java.util.Scanner;

public class ATM_11 {

	public static void main(String[] args) {
		
		int balance = 100000, withdraw, deposit;  
		
		while (true) {
			System.out.println("Automatic Teller Machine");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Choose the operation you want to perform : ");
			
			Scanner s = new Scanner(System.in);
			
			int choice = s.nextInt();
			
			switch(choice) {
				case 1: 
					System.out.println("Enter amount to withdraw ");
					withdraw = s.nextInt();
					if(balance>=withdraw) {
						balance = balance - withdraw;
						System.out.println("Please collect your money");
					} else {
						System.out.println("Insufficient Balance");
					}
					System.out.println("");
					break;
				case 2:
					System.out.println("Enter amount to be deposited ");
					deposit = s.nextInt();
					balance = balance + deposit;
					System.out.println("Your Money has been successfully deposited");
					System.out.println("");
					break;
				case 3: 
					System.out.println("Balance "+balance);
					System.out.println("");
					break;
				case 4:
					System.exit(0);
			}
		}
	}
}
