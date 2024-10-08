package String;
//possible subsets(parts) for a string will be n(n+1)/2. 
public class SubsetsOfString_6 {

	public static void main(String[] args) {
		
		String str = "FUN";
		int len = str.length();
		int temp=0;
		
		String[] strArray = new String[len*(len+1)/2];
		
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j=j+1) {
				strArray[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		System.out.println("All subsets for given string are: ");
		for(int k=0; k<strArray.length; k++)
			System.out.println(strArray[k]);

	}

}
