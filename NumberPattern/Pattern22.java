package NumberPattern;

//    1
//   212
//  32123
// 4321234
//  32123
//   212
//    1

public class Pattern22 {

	public static void main(String[] args) {
		
		int n=4, i , j, k, l;
		
		for (i=1; i<=n; i++) 
		{
			for(j=1; j<=n-i; j++) 
			{
				System.out.print(" ");
			}
			for(k=i; k>=1; k--) 
			{
				System.out.print(k);
			}
			for(l=2; l<=i; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}

		for (i=3; i>=1; i--) 
		{
			for(j=1; j<=n-i; j++) 
			{
				System.out.print(" ");
			}
			for(k=i; k>=1; k--) 
			{
				System.out.print(k);
			}
			for(l=2; l<=i; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
