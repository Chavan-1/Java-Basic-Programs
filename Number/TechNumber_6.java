package Number;

public class TechNumber_6 {

	public static void main(String[] args) {
		
		int n = 2025, digit=0, res, sqOfSum=0, temp, firstHalf, secHalf;
		
		temp=n;
		//no. of digits
		while (temp > 0) 
		{	
			digit++;
			temp /= 10;
		}
		
		//check if no. of digits even
		if (digit%2 == 0) {
			temp = n;
			firstHalf = temp % (int) Math.pow(10,digit/2);
			secHalf = temp / (int) Math.pow(10,digit/2);
			
			sqOfSum = (int) Math.pow((firstHalf+secHalf), 2);
			
			if(n == sqOfSum) {
				System.out.println(n+" is a tech number");
			}else {
				System.out.println(n+" is not a tech number");
			}
		} else {
			System.out.println(n+" is not a tech number");
		}	
	}
}
