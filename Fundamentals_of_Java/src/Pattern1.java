import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=1;
		while(i<=num) {
			int j=1;
			while(j<=num) {
				System.out.print(num);
				j+=1;
				
			}
			System.out.print("\n");
			i+=1;
		}
		

	}

}
