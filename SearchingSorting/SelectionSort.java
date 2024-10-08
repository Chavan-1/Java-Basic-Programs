package SearchingSorting;
/************
 * The selection sort algorithm works in a very simple way. 
 * It maintains two subarray for the given array.
 * The subarray is already sorted. And the second subarray is unsorted.
 * With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.
 * ***************/
public class SelectionSort {
	
	public static void selectionSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {9,14,3,2,43,11,58,22}; 
		System.out.println("Before Selection Sort ");
		
		for(int i: arr) {
			System.out.print(i+" ");
		}

		System.out.println();
		selectionSort(arr);
		System.out.println("After Selection Sort ");
		for(int j: arr) {
			System.out.print(j+" ");
		}
	}

}
