package CharacterPattern;

//A 
//A B 
//A B C 
//A B C D 
//A B C D E 
//A B C D E F 

public class RightTraingleAlphabatic {

	public static void main(String[] args) {
		
		int n=5, i, j, alphabet = 65;
		
		for(i=0; i<=n; i++) 
		{
			for(j=0; j<=i; j++) 
			{
				System.out.print((char)(alphabet+j) +" ");
			}
			System.out.println();
		}

	}

}
