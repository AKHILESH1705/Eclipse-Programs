import java.util.Scanner;

public class SimplePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=0;
		
		while(i<num) {
			int a =1+i;
			int j=0;
			
			while(j<=i) {
				System.out.print(a);
				j+=1;
				a=a+1;
				
			}
			System.out.println();
			i+=1;
		}
		

	}

}
