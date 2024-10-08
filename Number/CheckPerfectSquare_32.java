package Number;
/**
 * Using sqrt() method
 * Using User-Defined Logic
 * ***/
public class CheckPerfectSquare_32 {
	
// without using sqrt() pre defined method
//	public static int findSquareRoot(int n) {
//		int sqrtroot=n/2, temp;
//		
//		do {
//			temp = sqrtroot;
//			sqrtroot = (temp + (n/temp))/2;
//		}
//		while((temp-sqrtroot) != 0);
//		
//		return sqrtroot;
//	}
	
	
	static boolean findSquare(double n) {
		double sqrt = Math.sqrt(n);
		
		return ((sqrt - Math.floor(sqrt)) == 0);	
	}
	
	
	static boolean findSquareUserDefined(double num) {
		
		for(int i=1; i*i<=num; i++) {
			if((num%i==0) && (num/i==i))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		double n=50;
		
		//System.out.println(findSquareRoot(n));
		
		
		if(findSquare(n))
			System.out.println("Yes, the given number is perfect square.");   
		else  
			System.out.println("No, the given number is not perfect square.");  

		
		
		if(findSquareUserDefined(n))
			System.out.println("Yes, the given number is perfect square.");   
		else  
			System.out.println("No, the given number is not perfect square.");  

		
	}

}
