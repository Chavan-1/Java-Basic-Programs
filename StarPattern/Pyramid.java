package StarPattern;

public class Pyramid {

	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i=0; i<row; i++) {
			
			for(int j=row; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
