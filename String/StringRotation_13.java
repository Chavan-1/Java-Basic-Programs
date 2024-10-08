package String;
/******************
 * String 1: abcde  String 2: deabc  
 * String 1 + String 1: abcdeabcde  
 * If string 2 is present in concatenated string then, string 2 is rotation of string 1. 
 * String 2 deabc is found on the index 3 in concatenated string. So, deabc is rotation of abcde.
 * *********************/
public class StringRotation_13 {

	public static void main(String[] args) {
		
		String str1 = "abcde";
		String str2 = "deabc";
		
		if(str1.length() != str2.length()) 
		{
			System.out.println("Second string is not a rotation of first string");
		} else {
			
			 //Concatenate str1 with str1 and store it in str1   
			str1 = str1.concat(str1);
			
			 //Check whether str2 is present in str1 
			if(str1.indexOf(str2) != -1)
				 System.out.println("Second string is a rotation of first string");    
            else    
                System.out.println("Second string is not a rotation of first string"); 
		}
	}

}
