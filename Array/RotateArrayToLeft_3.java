package Array;

public class RotateArrayToLeft_3 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		int n=1;
		
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");
		
		for(int j=0; j<n; j++) {  //Rotate the given array by n times toward left  
			
			int k, first=arr[0]; 		//first element stored in variable named first
			
			for(k=0; k<arr.length-1; k++) {
				arr[k] = arr[k+1];
			}
			arr[k]=first;
		}
		
		System.out.println();
		System.out.println("Array after left rotation: ");
		for(int l=0; l<arr.length; l++)
			System.out.print(arr[l]+ " ");
		
	}

}
