package Basic;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		
		//Generating random numbers using random Method 
		System.out.println("Random Number using Random Method: " + Math.random());  

		//Generate random double value from 200 to 400  
		int min = 200;  
		int max = 400;    
		double a = Math.random()*(max-min+1)+min;   
		System.out.println("Random value of type double between "+min+" to "+max+ ": "+a);  
	
		//Generates random numbers using the Random class
		Random random = new Random();
		int x = random.nextInt(50);          // Generates random integers 0 to 49  
		int y = random.nextInt(1000);          // Generates random integers 0 to 999  
		System.out.println("Randomly Generated Integers Values of x : "+x+" & y "+y);  
 
		double d1 = random.nextDouble();          
		double d2 = random.nextDouble();          
		System.out.println("Randomly Generated double Values of d1 : "+d1+" & d2 "+d2);  
		
		float f1 = random.nextFloat();          
		float f2 = random.nextFloat();           
		System.out.println("Randomly Generated float Values of f1 : "+f1+" & f2 "+f2);  
 
		long l1 = random.nextLong();   
		long l2 = random.nextLong();   
		System.out.println("Randomly Generated Long Values of l1 : "+l1+" & l2 "+l2);  
		
		boolean b1 = random.nextBoolean();  
		boolean b2 = random.nextBoolean();  
		System.out.println("Randomly Generated Boolean Values of b1 : "+b1+" & b2 "+b2);  
	}

}
