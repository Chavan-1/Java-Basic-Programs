package Number;
/***
 * A number N will be a xylem number if the sum of its extreme (first and last) digits is equal to 
 * the sum of mean (all digits except first and last) digits.
 * If the sum of extreme digits is not equal to the sum of mean digits, 
 * the number is called phloem number.
 * ****/
public class XylemAndPhloemNumber_23 {

	public static void main(String[] args) {
		
		int num = 34326; //1235, 825122
		int extreme_sum=0, mean_sum = 0;
		int temp = num;
		
		while(temp != 0) 
		{
			if(temp==num || temp<10) 
				extreme_sum += temp%10;  //lastdigit
			else
				mean_sum += temp%10;    //mean digits 
				temp /= 10;	
		}
		System.out.println("Sum of extreme digits "+extreme_sum);
		System.out.println("Sum of mean digits "+mean_sum);
		
		if(extreme_sum == mean_sum)
			System.out.println(num + " is a xylem number.");  
		else  
			System.out.println(num + " is a phloem number."); 
	}

}
