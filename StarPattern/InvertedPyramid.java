package StarPattern;

public class InvertedPyramid {

	public static void main(String[] args) {
		
		int n = 6;
		 // Outer loop for number of rows
		for (int i=0; i<n; i++){
			
			//print spaces
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			//print asterisks
		     // Inner loop for number of stars in each row
		    for (int j=i; j<n; j++){
		    	
		        System.out.print("* ");
	        }
	    // Move to the next line after printing stars in each row
		System.out.println();
	    }

	}
}
