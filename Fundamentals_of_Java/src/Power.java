import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int pow = s.nextInt();
		int i =1,res=1;
		while(i<=pow) {
			res = res*num;
			
			i+=1;
		}
		
		System.out.println(res);
		

	}

}
