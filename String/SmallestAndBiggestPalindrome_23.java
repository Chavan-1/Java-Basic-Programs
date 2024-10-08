package String;
//wow represent the smallest palindrome and kayak represent the biggest palindrome. 
public class SmallestAndBiggestPalindrome_23 {

	
	public static boolean checkPalin(String str) {
		int n = str.length();
		str = str.toLowerCase();
		
		for(int i=0; i<n; i++, n--) {
			if(str.charAt(i) != str.charAt(n-1)) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void lengthOfPalin(int temp, String words[]) {
		
		String BigPalin="", smallPalin="";
		
		int count=0;

		for(int i=0; i<temp; i++) {
			
			if(checkPalin(words[i])) {
				count++;
				
				// Initialize smallest and longest when first palindromic word is found
				if(count == 1) 
					smallPalin = BigPalin = words[i];
	
				// Compare smallest and longest with each palindromic words 
				else {
					
					if(smallPalin.length() > words[i].length())
						smallPalin = words[i];
					
					if(BigPalin.length() < words[i].length())
						BigPalin = words[i];
				}
			}
		}
		
		if(count == 0)
			System.out.println("No palindrome found");  
        else
            System.out.println("Smallest palindrome: "+ smallPalin); 
            System.out.println("Biggest palindrome: "+ BigPalin); 
	}
	
	public static void main(String[] args) {

		String str = "Wow you own kayak";
		String word="";
		String words[] = new String[str.length()];
		int temp=0;
		
		str += " ";
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				word += str.charAt(i);
			}else {
				words[temp] = word;
				temp++;
				word = "";
			}
		}
		System.out.println("Inputted String : " + str); 
		lengthOfPalin(temp, words);
	}

}
