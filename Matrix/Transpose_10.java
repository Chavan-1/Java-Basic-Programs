package Matrix;
/**
 *  1 2 3     1 4 7
 *  4 5 6 --> 2 5 8   --> a[row][col] = t[col][row]
 *  7 8 9     3 6 9
 *
 */
public class Transpose_10 {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row=a.length, col=a[0].length;

		int t[][] = new int[col][row];
		
		//Calculates transpose of given matrix    
		for(int i=0; i<col; i++) {
			for(int j=0; j<row; j++) {
				t[i][j] = a[j][i];			//Converts the row of original matrix into column of transposed matrix    
			}
		}
		
		System.out.println("Transpose of given matrix");
		for(int m=0; m<col; m++) {
			for(int n=0; n<row; n++) {
				System.out.print(t[m][n]+" ");
			}
			System.out.println();
		}
	}

}
