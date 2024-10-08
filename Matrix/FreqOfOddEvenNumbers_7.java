package Matrix;

public class FreqOfOddEvenNumbers_7 {

	public static void main(String[] args) {
		
		int a[][] = {{4,1,3},{3,5,7},{8,2,6}};
		int row=a.length;
		int col=a[0].length;
		int countEven = 0;
		int countOdd = 0;
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<col; j++) {
				
				if(a[i][j]%2 == 0)
					
					countEven++;
				else
					countOdd++;
			}
		}
		System.out.println("Frequency of odd numbers: "+countOdd);
		System.out.println("Frequency of even numbers: "+countEven);
	}

}
