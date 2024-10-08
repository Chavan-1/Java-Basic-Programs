package String;

import java.util.Arrays;

/*
 * Two Strings are called the anagram if they contain the same characters. 
 * However, the order or sequence of the characters can be different.
 * */
public class IsAnagram_4 {

	public static void main(String[] args) {
		
		String str1 = "Brag";
		String str2 = "Grab";
		
		//Converting both the string to lower case.  
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		//Checking for the length of strings  
		if(str1.length() != str2.length()) {
			
			System.out.println("Both the strings are not Anagram");
		
		} else {
			//Converting both the arrays to character array  
			char[] str1Arr = str1.toCharArray();
			char[] str2Arr = str2.toCharArray();

			 //Sorting the arrays using in-built function sort () 
			Arrays.sort(str1Arr); 
			Arrays.sort(str2Arr);
			
			 //Comparing both the arrays using in-built function equals ()  
			if(Arrays.equals(str1Arr, str2Arr) == true)
				System.out.println("Both the strings are Anagram");
			else
				System.out.println("Both the strings are not Anagram");
		}
	}

}
