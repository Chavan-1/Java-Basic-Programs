package Conversion;

public class StringToInt {

	public static void main(String[] args) {
		
		String str = "200";
		//Approach1
		int i = Integer.parseInt(str);
		
		System.out.println(str+100);
		System.out.println(i+100);
		
		
		//Aproach2
		int j = Integer.valueOf(str);
		
		System.out.println(j);

	}

}
