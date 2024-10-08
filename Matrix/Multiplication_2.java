package Matrix;
/*****
 * 
 * 1 1 1     1 1 1    1*1+1*2+1*3  1*1+1*2+1*3  1*1+1*2+1*3    6 6 6
 * 2 2 2  X  2 2 2  = 2*1+2*2+2*3  2*1+2*2+2*3  2*1+2*2+2*3  = 12 12 12
 * 3 3 3     3 3 3    3*1+3*2+3*3  3*1+3*2+3*3  3*1+3*2+3*3    18 18 18
 * 
 * ******/
public class Multiplication_2 {

	public static void main(String[] args) {
		
		int a[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int b[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int c[][] = new int[3][3];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j] = 0;
				for(int k=0; k<3; k++) {
					c[i][j] += a[i][k]*b[k][j];
				}
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
