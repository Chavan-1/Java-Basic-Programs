package Matrix;

public class Product_8 {

	public static void main(String[] args) {
		
		int a[][] = {{1,3,2},{3,1,1},{1,2,2}};
		int b[][] = {{2,1,1},{1,0,1},{1,3,1}};
		
		int row1=a.length;		int row2=b.length;
		int col1=a[0].length;	int col2=a[0].length;
		
		if(col1 != row2) {
			System.out.println("Matrices cannot be multiplied");
		} else {
			int prod[][] = new int[row1][col2];
			
			for(int i=0; i<row1; i++) {
				for(int j=0; j<col2; j++) {
					for(int k=0; k<row2; k++) {
						prod[i][j] += a[i][k]*b[k][j];
					}
				}
			}
			System.out.println("Product of two matrices: ");
			
			for(int m=0; m<row1; m++) {
				for(int n=0; n<col2; n++) {
					System.out.print(prod[m][n]+" ");
				}
				System.out.println();
			}
		}
		
	}
}

