package NumberPattern;

//1 
//2 6 				6-2=4
//3 7 10 			10-7=3
//4 8 11 13 		13-11=2
//5 9 12 14 15		15-14=1

// Difference betwn columns is 4, 3, 2, 1
// So if we subtract i by j we will get 4,3,2,1



public class Pattern8 {

	public static void main(String[] args) {
		
		int n=5, i, j, num;
	    
		 for (i=1; i<=n; i++){ 
		    
			// num store value of i i.e row
			num = i;
		    
		    for (j=1; j<=i; j++)
		    {
		        System.out.print(num+" ");
		        // add i with no. of rows and sub by column
		        num = num + n - j;
		    } 
			System.out.println();
		 }

	}

}
