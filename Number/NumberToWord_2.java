package Number;

public class NumberToWord_2 {

	/*
	 * Define a array of string of 1 & 2digit numbers
	 * Define string hundread&thousand
	 * Get the last and previous digits of number
	 * Print the digits as a word from array. 
	 * */
	
	public static void main(String[] args) {
		
		int num = 7240;
		
		if (num<1 || num>9999) {
			System.out.println("Invalid");
		} else {
			
			// for 2digits
			int a = num%10; //last digit
			int b = num/10; 
			int c = b%10;   //privous to last digit
			
			// for 3digits
			int g = num/100; // first of 3digit number
			int d = g%10;	
			
			// for 4digit
			int e = num/1000; //last of 4digit
			
			String sD[] = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Elevan", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String dD[] = {"", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty"};
			String h = "Hundread";
			String th = "Thousand";
			
			if(num<20)
				System.out.println(sD[num]);  			// 1 to 19
														
			else if (num>=20 && num<=100)              // 20 to 100
				
				System.out.println(dD[c]+" "+sD[a]);
			
			else if (num>=100 && num<999) 
				
				System.out.println(sD[d]+" "+ h +" "+dD[c]+" "+sD[a]);
			else
				System.out.println(sD[e]+" "+th+" "+sD[d]+" "+h+" "+dD[c]+" "+sD[a]);
		}
	}

}
