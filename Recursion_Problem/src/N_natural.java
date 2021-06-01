import java.util.Scanner;
public class N_natural {

	public static void Natural(int n) {
		if(n==1) {
			System.out.println(n +" ");
		}
		else {
			//System.out.println(n+" ");
			Natural(n-1);
			System.out.println(n+" ");
		}
	}
	
	public static void main(String argsp[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		Natural(n);
	}
}
