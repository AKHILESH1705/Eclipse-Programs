import java.util.Scanner;

public class Pattern11{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=1;
		int a =0;
		while(i<=num) {
			int spaces = 1;
			while(spaces<=num-i) {
				System.out.print(" ");
				spaces +=1;
			}
			int j = 1;
			while(j<=i) {
				System.out.print(a+j);
				j +=1;
				
			}
			int b = a;
			j-=1;
			int dec = i-1;
			while(dec>=1) {
				System.out.print(j+b-1);
				dec-=1;
				b-=1;
			}
			
		
			System.out.println();
			i=i+1;
			a=a+1;
			
		}
		
		

	}

}
