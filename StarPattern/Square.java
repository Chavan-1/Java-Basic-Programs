package StarPattern;

public class Square {
	
	public static void main(String[] args) 
	{
		 // Outer loop for number of rows
		for (int i=0; i<5; i++)
		{
		     // Inner loop for number of stars in each row
		    for (int j=0; j<5; j++)
		    {
		        System.out.print(" * ");
	        }
	    // Move to the next line after printing stars in each row
		System.out.println();
	    }
    }
}
