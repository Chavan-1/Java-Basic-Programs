package NumberPattern;

//j

//5 
//5 4 
//5 4 3 
//5 4 3 2 
//5 4 3 2 1 

//i

//5 
//4 4 
//3 3 3 
//2 2 2 2 
//1 1 1 1 1 

public class Pattern9 {

	public static void main(String[] args) {
		
		int n = 5, i, j;
		
		for(i=n; i>=1; i--) 
		{
			for(j=n; j>=i; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
