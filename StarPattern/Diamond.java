package StarPattern;

public class Diamond {

	public static void main(String[] args) {
		
		 int n=5;
		 // Outer loop for number of rows
		 
		for(int i=0; i<n; i++) {
			
			//print spaces
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			
			//print astricks
			for(int k=0; k<=i; k++) {
				System.out.print("* ");
			}
			
			//bring on next line, next row
			System.out.println();
		}
		
		for(int i=1; i<n; i++) {
			
			//print spaces
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			
			//print astricks
			for(int k=n-1; k>=i; k--) {
				System.out.print("* ");
			}
			
			//bring on next line, next row
			System.out.println();
		}
		
		//Diamond border
		
//		int n=5;
//		 
//		for(int i=1; i<=n; i++) {
//			
//			for(int j=n; j>i; j--) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			
//			for(int k=1; k<2*(i-1); k++) {
//				System.out.print(" ");
//			}
//			if(i==1){
//			   System.out.println(); 
//			} else{
//			    System.out.println("*");
//			}
//		}
//		
//		for(int i=n-1; i>=1; i--) {
//			
//			for(int j=n; j>i; j--) {
//				System.out.print(" ");
//			}
//			System.out.print("*");
//			
//			for(int k=1; k<2*(i-1); k++) {
//				System.out.print(" ");
//			}
//			if(i==1){
//			   System.out.println(); 
//			} else{
//			    System.out.println("*");
//			}
//		}
	    

	}

}
