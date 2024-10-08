package CharacterPattern;

//A B C D 
//A B C 
//A B 
//A 
//A 
//A B 
//A B C 
//A B C D 

public class KShapeAlphabet {

	public static void main(String[] args) {
		
		int n=3, i, j, alphabet = 65;
		
		for(i=n; i>=0; i--) 
		{
			for(j=0; j<=i; j++) 
			{
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
		
		for(i=0; i<=n; i++) 
		{
			for(j=0; j<=i; j++) 
			{
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}

}
