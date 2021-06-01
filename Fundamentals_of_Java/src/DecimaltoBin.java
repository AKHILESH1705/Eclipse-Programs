import java.util.Scanner;
public class DecimaltoBin {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long num = s.nextLong();
		long rem,sum=0,pv=1;
		while(num>0) {
			rem = num%2;
			sum = sum + rem*pv;
			num = num/2;
			pv*=10;
			
		}
		System.out.println(sum);
    }
}