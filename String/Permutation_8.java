package String;

/****************************************************************************************************************************************
 * Number of permutation = factorial of length of string
 * Heigth/depth of tree = length of string
 * 
 *           ABC             --Level1: Swap(A,A), Swap(A,B), Swap(A,C) 
 *        /   |   \
 *   ABC     BAC    CBA      --Level2: First character is fixed Swap(B,B), Swap(B,C) | Swap(A,A), Swap(A,C) | Swap(B,B), Swap(B,A)
 *   / \     / \    / \ 
 * ABC ACB BAC BCA CBA CAB   --Level3: First two character is fixed, only one left so cannot be swap
 *          
 * ****************************************************************************************************************************************/

public class Permutation_8 {

	//swapping the characters at position i with character at position j 
	public static String swapString(String str, int i, int j) {
		
		char[] strArray = str.toCharArray();
		char ch;
		
		ch = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = ch;
		
		return String.valueOf(strArray);
	}
	
	public static void generatePermutation(String str, int start, int end) {
		
		if(start == end-1) {
			System.out.println(str);
		}else {
			for(int i=start; i<end; i++) {
				
				//Swapping the string by fixing a character   
				str = swapString(str, start, i);
				
				//Recursively calling function generatePermutation() for rest of the characters
				generatePermutation(str, start+1, end);
				
				//Backtracking and swapping the characters again. 
				str = swapString(str, start, i);
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "ABC";
		int len = str.length();
		
		System.out.println("All the permutation of the string are: ");
		generatePermutation(str, 0, len);
	}

}
