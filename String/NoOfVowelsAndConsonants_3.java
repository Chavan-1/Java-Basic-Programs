package String;

public class NoOfVowelsAndConsonants_3 {

	public static void main(String[] args) {
		String str = "This is a really simple sentence";
		int count=0;
		int vCount=0, cCount=0;
		str = str.toLowerCase();
		
		for(int i=0; i<str.length(); i++) {
			//Checks whether a character is a vowel    
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || 
			   str.charAt(i) == 'i' || str.charAt(i) == 'o' || 
			   str.charAt(i) == 'u') {
				vCount++;
			}
			//Checks whether a character is a consonant    
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
				cCount++;
			}
		}
		System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);   
	}

}
