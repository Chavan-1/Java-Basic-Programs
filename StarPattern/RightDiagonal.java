package StarPattern;

public class RightDiagonal {

	public static void main(String[] args) {
		
		int n = 8,i,j;
		
		for (i=1; i<=n; i++) {
			for(j=1; j<=i; j++) {
				if (i>=2 && j<=i-1) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}

			System.out.println();
		}
	}
}
