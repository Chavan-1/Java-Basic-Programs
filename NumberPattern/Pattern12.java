package NumberPattern;

//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1 

public class Pattern12 {

	public static void main(String[] args) {
		
		int n = 5, i, j;
		
		for(i=1; i<=n; i++) 
		{
			for(j=i; j>=1; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
