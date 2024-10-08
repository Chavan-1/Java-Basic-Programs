package Number;

/***
 * When sum of digits=no. of digit then it is Autobiographical Number
 * count the frequency of digits 
 * length and sum of digits should not be greater than 10.
 * ***/
public class AutobiographicalNumber_12 {

	public static void main(String[] args) {
		
		int n = 21200; //2120001
		
		n=Math.abs(n); 				// absoulte  value of n
		int temp=n;
		String str = String.valueOf(n);
		
		int digitArray[] = new int[str.length()];
		
		for(int i=digitArray.length-1; i>=0; i--) {
			digitArray[i] = temp % 10;
			temp /= 10;
		}
		
		boolean flag = true;
		for(int i=0; i<digitArray.length; i++) {
			int count = 0;
			for(int j=0; j<digitArray.length; j++) {
				if(i == digitArray[j]) count++;
			}
			if(count != digitArray[i]) flag = false; break;
		}
		
		if(flag)
			System.out.println(n+ " is an autobiographical number.");
		else
			System.out.println(n + " is not an autobiographical number.");
	}

}
