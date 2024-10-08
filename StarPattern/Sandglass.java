package StarPattern;

public class Sandglass {

	public static void main(String[] args) {
		
		int row = 6, i, j, k;
		   
		   for (i=0; i<row; i++){
				
				for (j=0; j<i; j++) {
					System.out.print(" ");
				}
			    for (j=i; j<row; j++){
			        System.out.print("* ");
		        }
			System.out.println();
		    }
		    
		   for(i=row-1; i>=0; i--) {
				
				for(j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(k=i; k<=row-1; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
	}

}
