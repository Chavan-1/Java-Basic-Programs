package Number;

public class FindSmallestOfThreeNumber_30 {

	public static void main(String[] args) {
int a=1, b=12, c=10, smallest, temp;
		
		//using third variable 
		temp = (a<b)? a:b;
		smallest = c<temp? c:temp;
		System.out.println("The smallest number is : "+smallest);

		
		//logic in single statement
		int d = c < (a<b? a:b) ? c : ((a<b)? a:b);
		System.out.println("logic in single smallest : The smallest number is : "+smallest);
		
		
		//Using if-else..if
		if(a<=b && a<=c) {
			System.out.println(a+" is the smallest number");
		}else if(b<=a && b<=c) {
			System.out.println(b+" is the smallest number");
		}else
			System.out.println(c+" is the smallest number");
	
	
		//Using nested if
		if(a<=b) {
			if(a<=c)
				System.out.println(a+" is the smallest number");
			else 
				System.out.println(c+" is the smallest number");
		}else {
			if(b<=c)
				System.out.println(b+" is the smallest number");
			else
				System.out.println(c+" is the smallest number");
		}

	}

}
