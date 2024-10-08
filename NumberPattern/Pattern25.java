package NumberPattern;
/******
 *   * 0 0 0 * 0 0 0 *
 *   0 * 0 0 * 0 0 * 0
 *   0 0 * 0 * 0 * 0 0
 *   0 0 0 * * * 0 0 0
 * ******/
public class Pattern25 {

	public static void main(String[] args) {
		
		int n=4, i, j;
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				if(i==j)
					System.out.print("* ");
				else
					System.out.print("0 ");
			}
			j--;
			System.out.print("* ");
			
			while(j >= 1) {
				if(i==j)
					System.out.print("* ");
				else
					System.out.print("0 ");
				j--;
			}
			System.out.println();
		}
	}

}
