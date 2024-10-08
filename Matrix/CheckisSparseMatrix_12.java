package Matrix;
/**
 *  4 0 0     
 *  0 5 0 --> count of zero elements present in an array must be greater than size/2.
 *  0 0 6     
 *
 */
public class CheckisSparseMatrix_12 {

	public static void main(String[] args) {
		
		int a[][] = {{4,0,0},{0,5,0},{0,0,6}};
		int row=a.length, col=a[0].length, count = 0;
		
		int size = row*col;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(a[i][j] == 0) {
					count++;
				}
			}
		}
		if(count > size/2)
			System.out.println("Given matrix is a sparse matrix");    
        else    
            System.out.println("Given matrix is not a sparse matrix");
	}

}
