package Basic;

public class Palindrome {

	public static void main(String[] args) {
		
	   int num = 452;
	   int sum = 0, temp, rem;
	   
/**	   Palindrome of Number
 * 	   temp = num;  				// store the number to temp
	   while ( num > 0 || num != 0){
	       
	       rem = num % 10; 			// getting remainder
	       sum = (sum*10) + rem; 	// getting sum
	       num = num / 10; 			// getting quotiant
	   }
	   
	   if (temp == sum){			// check if temp and sum are equal
	       System.out.println(num+" is a Palindrome number ");    
        } else { 
            System.out.println(num+" is Not a Palindrome number");    
	   }
**/
	   //Palindrome of String
	   
	   String str = "MADAN", revStr = "";
	   
	   int strLen = str.length();
	   
	   for (int i = (strLen - 1); i >= 0; i--) {
		   revStr = revStr + str.charAt(i);
	   }
	   
	   if (str.toLowerCase().equals(revStr.toLowerCase())) {
		   System.out.println(str + " is a Palindrome string");
	   } else {
		   System.out.println(str + " is not a Palindrome string");
	   }
	}

}
