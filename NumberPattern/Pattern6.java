package NumberPattern;

//5 4 3 2 1 
//5 4 3 2 
//5 4 3 
//5 4 
//5 

public class Pattern6 {

	public static void main(String[] args) {
		
		int n=5, i, j;
		
		for(i=1; i<=n; i++) 
		{
			for(j=n; j>=i; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
