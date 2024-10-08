package NumberPattern;

//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 
//1 2 3 4 
//1 2 3 
//1 2 
//1

public class Pattern11 {

	public static void main(String[] args) {
		
		int n = 5, i, j;
		
		for(i=1; i<=n; i++) 
		{
			for(j=1; j<=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

		for(i=n-1; i>=1; i--) 
		{
			for(j=1; j<=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
