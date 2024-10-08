package Basic;

/*
 * 153: 13 + 53 + 33 = 1 + 125+ 27 = 153
 * 125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)
 * */

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 125, sum = 0, digits = 0, last = 0, temp;
		//int num = 153;
		temp = num;
		while (temp > 0) {
			temp = temp/10;
			digits++;
		}
		
		temp = num;
		while(temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp/10;
		}
		
		if ( num == sum ) {
			System.out.println(sum+" is a Armstrong number");
		} else {
			System.out.println(sum+" is not a Armstrong number");
		}

	}

}
