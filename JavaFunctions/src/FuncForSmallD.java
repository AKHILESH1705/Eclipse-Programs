import java.util.Scanner;

public class FuncForSmallD {
	
	public static int Small(int num) {
		int i = 1;
		for(int j = 0; j < i ; j++) 
		{
			int result = 0;
			int k = 1;
			while(num/k>0) 
			{
				int temp = (num/(k*10)*k+(num%k));
				k*=10;
				if(result>temp) 
				{
					result = temp;
				}
				else 
				{
					result = temp;	
				}
				
			
			}
			num = result;
		}
		return num;
		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = Small(num);
		System.out.println(result);
		
		
  }
}	
