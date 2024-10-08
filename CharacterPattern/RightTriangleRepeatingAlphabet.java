package CharacterPattern;

//A 
//B B 
//C C C 
//D D D D 
//E E E E E 
//F F F F F F

public class RightTriangleRepeatingAlphabet {

	public static void main(String[] args) {
		
		int n=5, i, j, alphabet = 65;
		
		for(i=0; i<=n; i++) 
		{
			for(j=0; j<=i; j++) 
			{
				System.out.print((char)(alphabet+i) +" ");
			}
			System.out.println();
		}


	}

}
