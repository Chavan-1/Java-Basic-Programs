package Number;

/*********
 * Duck number is another special positive non-zero number that contains zero in it. 
 * The digit zero should not be presented at the starting of the number. 
 * Zero can be present at any of the positions except the beginning of the number.
 * **********/

public class DuckNumber_15 {

	public static boolean isDuckNumber(String num) {
		
		// If the number starts with '0', it's not a Duck Number
		if (num.charAt(0) == '0') {
			return false;
		}
		
		// Traverse through the number to check if it contains a zero
		// If no zero is found in the number, it's not a Duck Number
		for(int i=1; i<num.length(); i++) {
			if(num.charAt(i) == '0') {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String num = "0123"; //3210, 0123, 805
		
		if (isDuckNumber(num))
			System.out.println(num+" is a Duck Number");
		else 
            System.out.println(num + " is not a Duck Number.");
		
	}

}
