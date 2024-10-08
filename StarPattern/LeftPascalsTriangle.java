package StarPattern;

public class LeftPascalsTriangle {

	public static void main(String[] args) {
		
		   int n = 6, i, j, k;
		   
		   for (i=0; i<=n; i++){
		       
		       for(j=1; j<=n-i; j++){
		           System.out.print(" ");
		       }
		       
		       for(k=0; k<=i; k++){
		           System.out.print("*");
		       }
		       System.out.println();
		   }
		   
		   for (i=n; i>=1; i--){
		       
		       for(j=n; j>=i; j--){
		           System.out.print(" ");
		       }
		       for(k=1; k<=i; k++){
		           System.out.print("*");
		       }
		       System.out.println();
		   }

	}

}
