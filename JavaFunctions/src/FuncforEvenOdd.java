import java.util.Scanner;
public class FuncforEvenOdd {

	public static int EvenOdd(int num) {
		
		if(num%2==0) {
			return 0;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int result = EvenOdd(num);
		if(result==0) {
			System.out.println("even number");
		}
		else {
		System.out.println("odd number");
			}
		}
}
