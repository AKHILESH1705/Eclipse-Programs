import java.util.Scanner;

public class FuncPrimeinRange {
	
	public static void Prime(int num) 
	{
		int i;
		for(i=1; i<=num;i++) 
		{
			int count = 0;
			for(int j=1;j<=i;j+=1)
			{
				if(i%j==0) 
				{
					count++;
				}
			
			}
			if(count==2) 
			{
				System.out.print(i+" ");
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
	    Prime(num);
	
	}

}
