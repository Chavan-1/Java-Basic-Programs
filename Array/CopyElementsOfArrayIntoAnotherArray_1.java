package Array;

public class CopyElementsOfArrayIntoAnotherArray_1 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {2, 4, 5, 1, 0};
		int[] arr2 = new int[arr1.length];
		
		//Copying all elements of one array into another    
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Elements of arr1");

		//Displaying elements of array arr1 
		for(int j=0; j<arr1.length; j++) {
			System.out.print(arr1[j]+ " ");
		}
		
		System.out.println();
		System.out.println("Elements of arr2");
		
		//Displaying elements of array arr1 
		for(int k=0; k<arr2.length; k++) {
			System.out.print(arr2[k]+ " ");
		}
	}

}
