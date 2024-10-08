package StarPattern;

public class DownwardTriangle {

	public static void main(String[] args) {
		
		int row=6, i, k;
		   
		   for (i=0; i<=row; i++){
		       
		       for(k=0; k<row-i; k++){
		           System.out.print("* ");
		       }
		       System.out.println();
		   }
		   
	}

}
