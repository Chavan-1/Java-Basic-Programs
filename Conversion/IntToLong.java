package Conversion;

public class IntToLong {

	public static void main(String[] args) {
		
		int i=200;
		long l=i;
		System.out.println(l);
		
		//Approach1
		Long l1 = new Long(i);
		System.out.println(l1);
		
		//Approach2
		Long l2 = Long.valueOf(i);
		System.out.println(l2);
	}

}
