package NumberPattern;
/****
 *  5 4 3 2 *
 *  5 4 3 * 1
 *  5 4 * 2 1
 *  5 * 3 2 1
 *  * 4 3 2 1
 * ****/
public class Pattern24 {

	public static void main(String[] args) {
		int i, j, n=5;
		
		for(i=1; i<=n; i++) {
			for(j=n; j>=1; j--) {
				if(j != i)
					System.out.print(j+" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
