package Number;

/**************
 * Multiplying a number by two and three separately, the number obtained by writing the 
 * results obtained with the given number will be called a fascinating number. 
 * If the result obtained after concatenation contains all digits from 1 to 9, exactly once.
 * Let's take any number (n) say 327 and check whether the given number is fascinating or not. On multiplying the given number (n) by 2 and 3, we get:
	327×2=654
	327×3=981
	Now, concatenate the above results to the given number (n)
	"327"+"654"+ "981"= 327654981
 * ******************/
public class FascinatingNumber_7 {

	public static void main(String[] args) {
		
		int n=328, temp, digit=0;
		boolean flag = false;
		
		temp=n;
		while (temp > 0) {
			digit++;
			temp /= 10;
		}
		
		if ( digit == 3) {

			String m1 = Integer.toString(n*2);
			String m2 = Integer.toString(n*3);
			
			String concatNum = n+m1+m2;
			System.out.println(concatNum);
			flag=true;
			
			for(char c='1'; c<='9'; c++) 			// Loops from 1 to 9
			{ 								
				int count=0;               			//no. of times digit occurs
				
				for(int i=0; i<concatNum.length(); i++) 
				{
					char ch = concatNum.charAt(i);  //one char at a time check of concatNum
					
					if (ch == c) count++;			//if number occurs multiple time it will be added in count varibale
				}
				
				if(count>1 || count==0) {
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println("It is a Fascinating number");
			else
				System.out.println("It is not a Fascinating number");
		} else {
			System.out.println("It is not a Fascinating number");
		}
		
	}

}
