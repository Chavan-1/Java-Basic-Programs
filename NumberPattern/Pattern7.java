package NumberPattern;

//1 2 3 
//6 5 4 
//7 8 9 
//12 11 10 
//13 14 15
// Even numbers are reversed and odd's are in sequence.

public class Pattern7 {

	public static void main(String[] args) {
		
		int n = 5, i, j, temp, count=0; 
	    
	    for (i=1; i<=n; i++)
	    {
	    	// condition to find odd numbers
	        if(i%2 != 0)
	        {
	        	//Prints Odd numbers, 3 is no. of columns
	            for (j=1; j<=3; j++)
	            {
	                count += 1;
	                System.out.print(count+" ");
	            }
	        } else {
	        	
	        	//Prints Even numbers in reverse order
	        	// temp stores the last even no. of row and put it first in row
	            temp = count+1;
	            for (j=count+3; j>=temp; j--)
	            {
	                count += 1;
	                System.out.print(j+" ");
	            }
	        }
	    System.out.println();
	    } 

	}

}
