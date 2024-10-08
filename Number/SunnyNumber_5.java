package Number;

/********
 * A number is called a sunny number if the number next to the given number 
 * is a perfect square. In other words, a number N will be a sunny number if N+1 is a perfect square.
 * Example : N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.
 * *********/

public class SunnyNumber_5 {

	public static void main(String[] args) {
		
		int	n = 24;
		double m = n+1;  //variable which store next value of input number
		double sq = Math.sqrt(m);
		
		//check whether the square root is a integer value or not if yes return true otherwise false
		if(sq-Math.floor(sq) == 0) {
			System.out.println(n + " is a Sunny number");
		} else {
			System.out.println(n + " is not a Sunny number");
		}
	}
}
