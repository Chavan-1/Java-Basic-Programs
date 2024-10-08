package CharacterPattern;

//     A 
//    A B 
//   A B C 
//  A B C D 
// A B C D E 
//A B C D E F 

public class TriangleCharacter {

	public static void main(String[] args) {
		
		int n=5, i, j, k, alphabet = 65;
		
		for(i=0; i<=n; i++) 
		{
			for(j=n; j>i; j--) 
			{
				System.out.print(" ");
			}
			for(k=0; k<=i; k++) 
			{
				System.out.print((char)(alphabet+k) +" ");
			}
			System.out.println();
		}
	}

}
