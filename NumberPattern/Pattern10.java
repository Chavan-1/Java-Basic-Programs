package NumberPattern;

//1
//10
//101
//1010
//10101
//101010
//1010101
//10101010

public class Pattern10 {

	public static void main(String[] args) {
		
		int n = 8, i, j;
		
		for(i=1; i<=n; i++) 
		{
			for(j=1; j<=i; j++) 
			{
				//if even column print 0 else 1
				if(j%2 == 0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			System.out.println();
		}

	}

}
