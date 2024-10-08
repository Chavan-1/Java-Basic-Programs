package NumberPattern;

public class Pattern5 {

//P5
//	 1 
//   1 2 1 
//   1 2 3 2 1 
//   1 2 3 4 3 2 1 
//   1 2 3 4 5 4 3 2 1 
	
	public static void main(String[] args) {


	 //two patterns combined P1 & P4
		
	   int n=5, i, j, k;
	   
	   for (i=1; i<=n; i++)
	   {
	       for (j=1; j<=i; j++) 
	       {
	           System.out.print(j+" ");
	       }
		   for (k=i-1; k>=1; k--) 
		   {
		       System.out.print(k+" ");
		   }
	       System.out.println();
	   } 

	}

}
