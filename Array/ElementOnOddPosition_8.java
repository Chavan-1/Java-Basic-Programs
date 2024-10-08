package Array;

public class ElementOnOddPosition_8 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println("Original array:");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();

		System.out.println("Elements of given array present on odd position:");
		for(int j=0; j<arr.length; j=j+2) { 			
			System.out.print(arr[j]+" ");
		}

	}

}
