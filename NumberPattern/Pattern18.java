package NumberPattern;

//10101
//01010
//10101
//01010
//10101

public class Pattern18 {

	public static void main(String[] args) {
		
		int n = 5, i, j, num;
		
		for(i=1; i<=n; i++) 
		{
			if(i%2 == 0) 
			{
				num=0;
				for(j=1; j<=n; j++) 
				{
					System.out.print(num);
					num = (num == 0)? 1 : 0;
				}
			}else {
				num=1;
				for(j=1; j<=n; j++) 
				{
					System.out.print(num);
					num = (num == 0)? 1 : 0;
				}
			}
			System.out.println();
		}
		
	}

}
