package Array;

public class ThirdLargestNumber_16 {

	public static void main(String[] args) {
		
//		int a[] = {44,66,99,77,33,22,55};
//		int temp=0, i, j;
//		
//		for(i=0; i<a.length; i++) {
//			for(j=i+1; j<a.length; j++) {
//				if(a[i]<a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//
//		System.out.println();
//		System.out.println("Third Largest: "+a[2]);
		
		
		int a[]={1,2,5,6,3,2};
		System.out.println("Third Largest: "+getThirdLargest(a));  
		
	}
	
	public static int getThirdLargest(int[] a) {
		
		int temp=0, i, j;
		
		for(i=0; i<a.length; i++) {
			for(j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length-3];
		
	}

}
