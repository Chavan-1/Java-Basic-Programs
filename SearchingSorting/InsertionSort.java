package SearchingSorting;
/**************
 *
 * *************/
public class InsertionSort {

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		
		for(int i=1; i<n; i++) {
			
			int key=arr[i];
			int j = i-1;
			
			// Compare key with each element on the left of it until an element smaller than
		    // it is found.
		    // For descending order, change key<array[j] to key>array[j] 
			while(j>=0 && (arr[j] > key)) {
				arr[j+1] = arr[j];
				j--;
			}
			 // Place key at after the element just smaller than it.
			arr[j+1] = key;
		}
		
	}
	
	
	public static void main(String[] args) {
		int[] arr= {9,14,3,2,43,11,58,22};    
		
		System.out.println("Before Insertion Sort");  
		for(int i: arr) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		System.out.println("After Insertion Sort");  
		insertionSort(arr);
		for(int j: arr) {
			System.out.print(j+" ");
		}
	}

}
