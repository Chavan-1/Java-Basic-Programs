package NumberPattern;

//123456
//234561
//345612
//456123
//561234
//612345

public class Pattern20 {

	public static void main(String[] args) {
		
		int n=6, i , j, k;
		
		for(i=1; i<=n; i++) 
		{
			for(j=i; j<=n; j++) 
			{
				System.out.print(j);
			}
			for(k=1; k<=i-1; k++) 
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
