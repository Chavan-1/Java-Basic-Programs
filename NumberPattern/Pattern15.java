package NumberPattern;

//1 2 3 4 
//1 2 3 
//1 2 
//1 
//1 2 
//1 2 3 
//1 2 3 4 

public class Pattern15 {

	public static void main(String[] args) {
		
		int n = 4, i, j;
		
		for(i=n; i>=1; i--) 
		{
			for(j=1; j<=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(i=2; i<=n; i++) 
		{
			for(j=1; j<=i; j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
