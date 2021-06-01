import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int digit,rev=0,temp = num;
		for(;num>0;num/=10) {
			digit = num%10;
			rev=rev*10+digit;
		}
		System.out.println(rev);
		
 /*      while(num > 0) {
		  digit = num%10;
			 rev = rev*10+digit;
			 num/=10;
		}
		
			System.out.println(rev);
		}

	

}
*/

	}
	}