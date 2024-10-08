package Number;

public class SqrtOfNumber_26 {

	public static double sqrtOfNo(int num) {
		double sqrtroot = num/2, temp;
		do {
			temp=sqrtroot;
			sqrtroot = (temp+(num/temp))/2;
		} 
		while((temp-sqrtroot) != 0);
		
		return sqrtroot;
		
	}
	public static void main(String[] args) {
		
		int n = 25; //144, 49
		
		System.out.println("The square root of "+n+" is : "+sqrtOfNo(n));

	}

}
