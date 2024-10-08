package NumberPattern;

//111111
//111122
//111333
//114444
//155555
//666666

public class Pattern19 {

	public static void main(String[] args) {
		
		int n = 6, i, j, k;
		
		for(i=1; i<=n; i++) 
		{
			for(j=n-1; j>=i; j--) 
			{
				System.out.print(1);
			}
			for(k=1; k<=i; k++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
