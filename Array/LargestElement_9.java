package Array;

public class LargestElement_9 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {25, 11, 7, 75, 56};
		int max=arr[0];

		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max)
				max = arr[i];
		}
		System.out.println(max+" is the Largest element in given array");
	}

}
