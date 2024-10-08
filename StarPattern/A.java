package StarPattern;

public class A {

	public static void main(String[] args) {
	    int n=8, i, j, k;
		
		for (i=1; i<=n; i++) {
		    
		    for(j=n; j>=i; j--){
		        System.out.print(" ");
		    }
			for(k=1; k<(i*2); k++) {
				if(k>1 && k<(i*2)-1){
				    System.out.print(" ");
				} else{
				    System.out.print("*");
				}
			}
			System.out.println();
		}

		//Triangle border
//int n=9, i, j, k;
//	    
//	    for(i=1; i<=n; i++){
//	        
//	        for(j=i; j<n; j++){
//	            System.out.print(" ");
//	        }
//	        for(k=1; k<=(2*i-1); k++){
//	            if(k==1 || i==n || k==(i*2-1)){
//	                System.out.print("*");
//	            }else{
//	                System.out.print(" ");
//	            }
//	        }
//	        System.out.println();
//	    }
	}

}
