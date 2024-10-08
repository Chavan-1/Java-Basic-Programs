package String;

public class DuplicateCharacters_15 {

	public static void main(String[] args) {
		
		String str = "Great responsibility";
		
		//Converts given string into character array 
		char[] strArray = str.toCharArray();
		int count, i, j;
		
		for(i=0; i<strArray.length; i++) {
			count = 1;
			for(j=i+1; j<strArray.length; j++) {
				if(strArray[i] == strArray[j] && strArray[i] != ' ') {
					count++;
					 //Set string[j] to 0 to avoid printing visited character    
					strArray[j] = 0;
				}
			}
			
			//A character is considered as duplicate if count is greater than 1  
			if(count>1 && strArray[i] != 0) {
				System.out.println(strArray[i]);
			}
		}

	}

}
