package NumberPattern;

//P3
//1 
//2 3 
//4 5 6 
//7 8 9 10 
//11 12 13 14 15 

public class Pattern3 {

	public static void main(String[] args) {

		int n=5, i , j, count=0;
		for(i=1; i<=n; i++)
		{
		    for (j=1; j<=i; j++)
		    {
		        count += 1;
		        System.out.print(count+" ");
		    } 
		    System.out.println();
		}

	}

}
