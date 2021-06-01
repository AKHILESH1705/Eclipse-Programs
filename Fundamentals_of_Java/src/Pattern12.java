import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i = 1;
		int n1 =  (num+1)/2;
		while (i <= n1) {
			int space = 1;
			while (space <= n1-i) {
				System.out.print(" ");
				space += 1;
			}
			int n = 1;
			while (n <= i) {
				System.out.print("*");
				n = n + 1;
			}
			int dec = i - 1;
			while (dec >= 1) {
				System.out.print("*");
				dec = dec - 1;
			}
			System.out.println();
			i = i + 1;
		}
		i = num/2;
		while (i >= 0) {
			int space = 1;
			while (space <= (num-i)/2) {
				System.out.print(" ");
				space = space + 1;
			}
			int n = 1;
			while (n <= i * 2 - 1) {
				System.out.print("*");
				n = n + 1;
			}
			System.out.println();
			i = i - 1;
		}
	}

}
