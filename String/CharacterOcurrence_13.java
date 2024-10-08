package String;
/*******
 * In below string  
 * character 'a' is occurred only once in the string. So, it is minimum occurring character
 * Character 'e' has occurred maximum number of times in the entire string i.e. 6 times. Hence, it is the maximum occurring character 
 * *******/
public class CharacterOcurrence_13 {

	public static void main(String[] args) {
		
		String str = "Grass is greener on the other side";
		str = str.toLowerCase();
		char[] strArray = str.toCharArray();
		int[] freq = new int[str.length()];
		
		char minChar=str.charAt(0), maxChar=str.charAt(0);
		int i,j,min,max;
		
		//Count each word in given string and store in array freq    
		for(i=0; i<strArray.length; i++) {
			freq[i] = 1;
			for(j=i+1; j<strArray.length; j++) {
				if(strArray[i]==strArray[j] && strArray[i]!=' ' && strArray[i]!='0') {
					freq[i]++;
					
					//Set string[j] to 0 to avoid printing visited character    
					strArray[i] = '0';
				}
			}	
		}
		
		max=min=freq[0];
		
		for(i=0; i<freq.length; i++) {
			
			//If min is greater than frequency of a character     
	          //then, store frequency in min and corresponding character in minChar
			if(min>freq[i] && freq[i]!='0') {
				min = freq[i];
				minChar = strArray[i];
			}
			
			//If max is less than frequency of a character     
	          //then, store frequency in max and corresponding character in maxChar  
			if(max<freq[i]) {
				max = freq[i];
				maxChar = strArray[i];
			}
		}
		System.out.println("Minimum occurring character: " + minChar);    
	    System.out.println("Maximum occurring character: " + maxChar);
	}

}
