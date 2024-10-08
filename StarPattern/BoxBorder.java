package StarPattern;

public class BoxBorder {

	public static void main(String[] args) {
		
		int n=4, i, j, k;
		
		for (i=1; i<=n; i++) {
		    
		    for(j=1; j<=n; j++){
		        
		        if(i>=2 && j>=2 && i<=3 && j<=3){
				    System.out.print(" ");
				} else{
				    System.out.print("*");
				}
		    }
			System.out.println();
		}

	}

}
