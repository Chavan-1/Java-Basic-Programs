package Array;

public class RotateArrayToRight_13 {

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,3,4,5};
		int n=1;
		
		System.out.println("Original Array");
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+ " ");
		
		for (int j=0; j<n; j++) {
			
			int k, last=arr[arr.length-1];
			
			for(k=arr.length-1; k>0; k--) {
				arr[k] = arr[k-1];
			}
			arr[0]=last;
		}
		
		System.out.println();
		System.out.println("Array after right rotation: ");
		for(int l=0; l<arr.length; l++)
			System.out.print(arr[l]+ " ");
	}

}
