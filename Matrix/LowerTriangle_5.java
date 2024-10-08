package Matrix;

/**
 *  1 2 3     1 0 0
 *  8 6 4 --> 8 6 0   --> j(col)>i(row), (1,2)(1,3)(2,3)
 *  4 5 6     4 5 6
 *
 */
public class LowerTriangle_5 {

	public static void main(String[] args) {
		
		
		int a[][] = {{1,2,3},{8,6,4},{4,5,6}};
		int row=a.length;
		int col=a[0].length;
		
		if(row != col) {
			
			System.out.println("Matrix should be a square matrix");	
		}else {
			
			System.out.println("Display lower triangular matrix: ");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(j>i)
						System.out.print("0 ");
					else
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
