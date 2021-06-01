import java.util.Scanner;
public class FuncFibo {

	public static boolean checkMember(int num){
		int a = 1,b=1,c;
		boolean z = true;
		while(a<num) {
			c=a+b;
			a=b;
			b=c;
		}
		if(a==num) {
			z = true;
		}
		else {
			z = false;
		}
		return z;
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(FuncFibo.checkMember(num));
				

	}

}
