package StarPattern;

public class RightTriangle {
	//Analyze the pattern to understand the relation between the row numbers and the number of stars in each row. 
	//In this example, the number of stars in each row equals the row number.
	public static void main(String[] args) 
		{
			 // Outer loop for number of rows
			for (int i=0; i<6; i++)
			{
			     // Inner loop for number of stars in each row
			    for (int j=0; j<=i; j++)
			    {
			        System.out.print("* ");
		        }
		    // Move to the next line after printing stars in each row
			System.out.println();
		    }
	    }
	
}
