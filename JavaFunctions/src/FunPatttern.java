import java.util.Scanner;

public class FunPatttern {
	
	public static void Pattern1(int num) {
		int i =1;
		while(i<=num) {
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Pattern1(num);
	}
}
