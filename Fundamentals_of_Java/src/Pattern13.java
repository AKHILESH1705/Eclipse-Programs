import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=1;
		while(i<=num) {
			int space = i-1;
			while(space>=1) {
				System.out.print(" ");
				space-=1;
			}
			int j  = 1;
			while(j<=num) {
				System.out.print("*");
				j=j+1;
			}
			System.out.println();
			i=i+1;
			
		}
	}
}	