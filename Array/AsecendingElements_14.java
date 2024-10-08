package Array;

public class AsecendingElements_14{

	public static void main(String[] args) {

		int[] arr = new int[] {5, 2, 8, 7, 1};
		int temp=0;
		
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");

		
		System.out.println();
		System.out.println("Array after sorting in ascending order :");
		
		for(int j=0; j<arr.length; j++) {
			for(int k=j+1; k<arr.length; k++) {
				if(arr[j]>arr[k]) {
					temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}
			}
		}
		

		System.out.println();
		System.out.println("Elements of array sorted in ascending order");
		for(int l=0; l<arr.length; l++)
			System.out.print(arr[l]+ " ");
	}

}
