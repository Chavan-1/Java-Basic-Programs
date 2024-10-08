package StarPattern;

public class InvertedTriangle {

	public static void main(String[] args) {
		
		 // Outer loop for number of rows
		for (int i=5; i>=0; i--)
		{
		     // Inner loop for number of stars in each row
		    for (int j=1; j<=i; j++)
		    {
		        System.out.print(" * ");
	        }
	    // Move to the next line after printing stars in each row
		System.out.println();
	    }

	}

}
