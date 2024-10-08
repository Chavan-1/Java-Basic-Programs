package Number;

/******
 * A number is called an automorphic number if and only if the square of the given number ends with the same number itself. 
 * For example, 25, 76 are automorphic numbers because their square is 625 and 5776, 
 * respectively and the last two digits of the square represent the number itself. 
 * Some other automorphic numbers are 5, 6, 36, 890625, etc.
 * ******/

public class AutomorphicNumber_3 {

	public static void main(String[] args) 
	{
	    
	    int num = 5, sq = num*num;
	    if(isAutomorphic(num) == 1)
	        System.out.println("Num = "+num+", square = "+sq+", It is automorphic number");
		else
		    System.out.println("Num = "+num+", square = "+sq+", It is not a automorphic number");
	}	
	
	
	static int isAutomorphic(int num)
	{
	    int sq = num * num;
	    while (num != 0)
	    {
	        //means not automorphic number
		    if(num%10 != sq%10){
		        return 0;
		    }
		    //reduce down numbers
		        num /= 10;
		        sq /= 10;
	    }
	    //if reaches here means automorphic number
	    return 1;
	}
	

}
