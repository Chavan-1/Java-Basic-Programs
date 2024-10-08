package Matrix;

public class EqualMatrix_4 {

	public static void main(String[] args) {

		int a[][] = {{1,2,3}, {8,4,6}, {4,5,7}};
		int b[][] = {{1,2,3}, {8,4,6}, {4,5,7}};
		
		int r1, r2, c1, c2;
		boolean flag = true;
		
		r1 = a.length;      r2 = b.length;
		c1 = a[0].length;   c2 = b[0].length;
		
		if(r1 != r2 || c1 != c2) {
			
			System.out.println("Matrices are not equal");
			
		} else {
			
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					if(a[i][j] != b[i][j])
						flag = false;
						break;
				}
			}
		}
		
		if(flag)    
            System.out.println("Matrices are equal");    
        else    
            System.out.println("Matrices are not equal");  

	}

}
