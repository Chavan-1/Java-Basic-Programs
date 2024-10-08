package String;

public class FrequencyCharacter_17 {

	public static void main(String[] args) {
		
		String str = "picture perfect";
		
		int[] freq = new int[str.length()];
		char[] strArray = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			freq[i] = 1;
			for(int j=i+1; j<str.length(); j++) {
				if(strArray[i]==strArray[j]) {
					freq[i]++;
					strArray[j] = '0';
				}
			}
		}
		System.out.println("Characters and their corresponding frequencies"); 
		
		for(int i=0; i<freq.length; i++) {
			if(strArray[i] != ' ' && strArray[i] != '0') 
				System.out.println(strArray[i]+"-"+freq[i]);
		}
	}

}
