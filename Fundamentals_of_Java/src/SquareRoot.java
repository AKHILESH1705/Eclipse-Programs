import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=0,j=0,k=1;
		while(k<=num) {
			if((i*j)<=num) {
				i=i+1;
				j=j+1;
			}
			else {
				j=j-1;
				break;
			}
			k=k+1;
			
		}
		System.out.println(j);

	}

}
