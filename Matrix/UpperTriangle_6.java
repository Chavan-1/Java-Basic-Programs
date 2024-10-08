package Matrix;
/**
 *  1 2 3     1 2 3
 *  8 6 4 --> 0 6 4   --> i(row)>j(col), (2,1)(3,1)(3,2)
 *  4 5 6     0 0 6
 *
 */
public class UpperTriangle_6 {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{8,6,4},{4,5,6}};
		int row=a.length;
		int col=a[0].length;
		
		if(row != col) {
			System.out.println("Matrix should be a square matrix");
		} else {
			System.out.println("Display upper triangular matrix: ");
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(i>j)
						System.out.print("0 ");
					else
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}

	}

}
