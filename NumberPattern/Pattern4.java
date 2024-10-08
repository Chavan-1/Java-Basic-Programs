package NumberPattern;

//P4
//1 
//2 1 
//3 2 1 
//4 3 2 1 
//5 4 3 2 1

public class Pattern4 {

	public static void main(String[] args) {
		int n=5, i , j, k=1;
		
		for(i=1; i<=n; i++){
		    for (j=i; j>=1; j--){
		        System.out.print(j + " ");
		    } 
		    System.out.println();
		}

	}

}
