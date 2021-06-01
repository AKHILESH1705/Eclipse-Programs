import java.util.Scanner;
public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s .nextInt();
		int i = 0,rem,sum=0,pv=1;
		while(num>0) {
			rem = num%10;
			sum=sum+rem*pv;
			num=num/10;
			i=i+1;
			pv*=2;
		}
		System.out.println(sum);

	}

}
