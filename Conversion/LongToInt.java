package Conversion;

public class LongToInt {

	public static void main(String[] args) {
		
		long l1 = 500;
		int i = (int) l1;
		System.out.println(i);

		Long l2 = new Long(10);
		int i1 = l2.intValue();
		System.out.println(i1);
	}

}
