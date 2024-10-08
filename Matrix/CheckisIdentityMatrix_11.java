package Matrix;
/**
 *  1 0 0     
 *  0 1 0 --> i==j must be 1 and i!=j must be 0 (must be sqaure matrix)
 *  0 0 1     
 *
 */
public class CheckisIdentityMatrix_11 {

	public static void main(String[] args) {

		int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
		int row=a.length, col=a[0].length;
		boolean flag = false;
		
		if(row != col) {
			System.out.println("Matrix should be square matrix");
		} 
		else {
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(i==j && a[i][j]==1) {
						flag = true;
						break;
					}
					if(i!=j && a[i][j]==0) {
						flag = true;
						break;
					}
				}
			}
			if(flag)    
                System.out.println("Given matrix is an identity matrix");    
            else    
                System.out.println("Given matrix is not an identity matrix"); 
		}
		
	}

}
