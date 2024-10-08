package Number;

public class FindLargestOfThreeNumber_29 {

	public static void main(String[] args) {
		
		int a=1, b=12, c=10, largest, temp;
		
		//using third variable 
		temp = (a>b)? a:b;
		largest = c>temp? c:temp;
		System.out.println("The largest number is : "+largest);

		
		//logic in single statement
		int d = c > (a>b? a:b) ? c : ((a>b)? a:b);
		System.out.println("logic in single statement : The largest number is : "+largest);
		
		
		//Using if-else..if
		if(a>=b && a>=c) {
			System.out.println(a+" is the largest number");
		}else if(b>=a && b>=c) {
			System.out.println(b+" is the largest number");
		}else
			System.out.println(c+" is the largest number");
	
	
		//Using nested if
		if(a>=b) {
			if(a>=c)
				System.out.println(a+" is the largest number");
			else 
				System.out.println(c+" is the largest number");
		}else {
			if(b>=c)
				System.out.println(b+" is the largest number");
			else
				System.out.println(c+" is the largest number");
		}
	}

}
