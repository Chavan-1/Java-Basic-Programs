package Array;

public class ElementsOnEvenPosition_7 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Original array:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();

		System.out.println("Elements of given array present on even position:");
		for(int j=1; j<arr.length; j=j+2) { 			//Here, j will start from 1 as first even positioned element is present at position 1.  
			System.out.print(arr[j]+" ");
		}
	}

}
