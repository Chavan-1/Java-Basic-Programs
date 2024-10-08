package SearchingSorting;
/*****
 * Binary Search is an efficient algorithm used to find the position of a target value within a sorted array. 
 * It works by repeatedly dividing the search interval in half. 
 * If the target value is less than the middle element, 
 * the search continues in the lower half, otherwise in the upper half. 
 * Example:
 * Suppose we are searching for the number 7 in the sorted array:
 * [1,3,5,7,9,11,13]
 * Step 1: low = 0, high = 6.
 * mid = (0 + 6) // 2 = 3.
 * arr[3] = 7 (found the target).
 * ********/
public class BinarySearch {
	
	public static int binarySearch(int[] arr, int key, int first, int last) {
		
		if(last > first) {
			int mid = first + (last-first)/2;
			
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid] > key) {
				//search in left subarray 
				return binarySearch(arr, key, first, mid-1);
			}else {
				
				//search in right subarray  
				return binarySearch(arr, key, first, mid+1);
			}
		}
		return -1;	
	}
	
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};  
        int key = 30; 
        int last = arr.length-1;
        int result = binarySearch(arr, key, 0, last);
        
        if(result == -1)
        	System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  

	}

}
