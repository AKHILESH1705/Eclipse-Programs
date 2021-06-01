import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=1;
		int a = num;

		while(i<=num) {
			int j=1;
			while(j<=num-i+1) {
				System.out.print("*");
				j=j+1;
				
			}
			System.out.println();
			i=i+1;
			 a-=1;
		}
		
		

	}

}
