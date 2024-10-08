package String;
//Consider above example in which 'an' is the smallest word and 'extraordinary' is the largest word.
public class SmallestLargestWord_18 {

	public static void main(String[] args) {
		
		String str = "Hardships often prepare ordinary people for an extraordinary destiny";
		
		String words[] = new String[str.length()];
		
		String small="", large="", word="";
		int len = 0;
		
		//Add extra space after string to get the last word in the given string    
	      str = str + " "; 
	      
		for(int i=0; i<str.length(); i++) 
		{
			if(str.charAt(i) != ' ') {
				word += str.charAt(i);
			} else {
				words[len] = word;
				len++;
				word = "";
			}
		}
		
		small=large=words[0];
		
		for(int i=0; i<len; i++) {
			if(small.length() > words[i].length()) {
				small = words[i];
			}
			if(large.length() < words[i].length()) {
				large = words[i];
			}
		}
		
		System.out.println("Smallest word: " + small);    
	    System.out.println("Largest word: " + large); 

	}

}
