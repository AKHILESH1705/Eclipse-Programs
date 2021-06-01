import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=0;	
		while(i<num) {
			int ch = 65+i;
			int j =0;
			while(j<=i) {
				System.out.print((char)ch);
				j+=1;
				ch = ch+1;
			}
		System.out.println();
		i=i+1;
		}
		
		

	}

}
