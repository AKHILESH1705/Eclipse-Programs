import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=1;
		while(i<=num) {
			int spaces = 1;
			while(spaces<=num-i) {
				System.out.print(" ");
				spaces +=1;
			}
			int star = 1;
			while(star<=i) {
				System.out.print(star);
				star +=1;
			}
			
			System.out.println();
			i=i+1;
		}
		
		

	}

}
