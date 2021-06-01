import java.util.Scanner;
public class TermsOfAp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int n = 1,b=1,i=1;
		while(i<=num) {
			if(i%3!=0) {
				System.out.print(3*n+2+" ");
				n=n+2;
			}
			else {
				b+=2;
				System.out.print(3*b+5+" ");
				b=b+2;
			}
			
			i=i+1;
			
		}

	}

}

//5 11 14 17 23 26 29 35 38 41