import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1;
		int a =65;
		int c = a + num-1;
		while(i<=num) 
		{
		   
			int j =0;
			while(j<i) {
				System.out.print((char)(c+j));
				j=j+1;
				
			}
		System.out.println();
		i=i+1;
		c=c-1;
		
		}
		
		
			
	}	
	}		
			
