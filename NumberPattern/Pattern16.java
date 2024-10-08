package NumberPattern;

//1 2 3 4 5
//  2 3 4 5
//    3 4 5
//      4 5
//        5
//      4 5
//    3 4 5
//  2 3 4 5
//1 2 3 4 5

public class Pattern16 {

	public static void main(String[] args) {
		
		int n=5, i, j, k, count=0;
	    
		 for (i=1; i<=n; i++)
		 { 
		     
		     for(j=1; j<i; j++)
		     {
		         System.out.print(" ");
		     }
		    
		    for (k=i; k<=n; k++)
		    {
		        System.out.print(k);
		    } 
			System.out.println();
		 }

	    for (i=n-1; i>=1; i--)
	    { 
		     
		     for(j=1; j<i; j++)
		     {
		         System.out.print(" ");
		     }
		    
		    for (k=i; k<=n; k++)
		    {
		        System.out.print(k);
		    } 
			System.out.println();
		 }

	}

}
