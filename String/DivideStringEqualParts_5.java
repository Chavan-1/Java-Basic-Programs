package String;
//N equal parts of string
public class DivideStringEqualParts_5 {

	public static void main(String[] args) {
		
		String str = "aaaabbbbcccc";
		int len=str.length();
		int n=3;
		int chars = len/n, temp=0;
		
		String[] strArray = new String [n]; //String array
		
		if(len % n != 0) {
			System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");
		}
		else {
			
			for(int i=0; i<len; i=i+chars) {
				
				strArray[temp] = str.substring(i, i+chars);  //Dividing string in n equal part using substring() 
				temp++;
			}
			System.out.println(n + " equal parts of given string are ");  
			
			for(int j=0; j<strArray.length; j++) {
				System.out.println(strArray[j]);
			}
		}
		
	}

}
