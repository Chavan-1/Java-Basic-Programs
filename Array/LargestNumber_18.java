package Array;

public class LargestNumber_18 {
	
	public static int getLargest(int[] a) {
		int temp=0,i,j;
		for(i=0; i<a.length; i++) {
			for(j=i+1; j<a.length; j++) {
				if(a[i]>a[j]){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length-1];
	}
	
	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getLargest(a));  
		System.out.println("Second Largest: "+getLargest(b));  

	}

}
