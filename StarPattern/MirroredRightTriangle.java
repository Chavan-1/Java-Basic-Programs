package StarPattern;

public class MirroredRightTriangle {

	public static void main(String[] args) {
		
		int n = 7, i, j, k;
		
		for (i=0; i<=n; i++) {
			
			for (j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			for(k=0; k<=i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}
