package NumberPattern;
/*******
 * 
 *  1     1
 *   2   2
 *    3 3
 *     4
 *    3  3
 *   2    2
 *  1      1
 * ***/
public class Pattern27 {

	public static void main(String[] args) {
		
		int n= 8, i, j;
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n/2; j++) {
				if(i==j)
					System.out.print(j+" ");
				else if(i>n/2 && j == n-i)
					System.out.print(j+" ");
				else
					System.out.print(" ");
			}
			j=j-2;

			while(j>0) {
				if(i==j)
					System.out.print(j+" ");
				else if(i>n/2 && j == n-i)
					System.out.print(j+" ");
				else
					System.out.print(" ");
				j--;
			}
			System.out.println("");
		}

	}

}
