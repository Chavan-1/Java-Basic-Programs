package String;

public class ReverseWordByWor_24 {
	
	public static String reverseString(String str) {
		
		//checks the string if empty 
		if(str.isEmpty())
			return str;
	
		//recursively call
		return reverseString(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		
		String str = "I am going to market.";
		String reversed = reverseString(str);  
		System.out.println("The reversed string is: " + reversed);  
	}

}
