package NumberPattern;

//P2
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5

public class Pattern2 {

	public static void main(String[] args) {
		
		int n=5, i , j;

	   for(i=1; i<=n; i++)
	   {
	       for (j=1; j<=i; j++)
	       {
	           System.out.print(j+" ");
	       } 
	       System.out.println();
	   }

	}

}
