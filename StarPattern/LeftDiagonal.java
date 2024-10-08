package StarPattern;

public class LeftDiagonal {

	public static void main(String[] args) {
		
		int n=8,i,j,k;
		
		for(i=1; i<=n; i++) {
			for(j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) {
				if(i>=2 && k>1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
