import java.util.Scanner;

public class FuncRevers {
	public static int Reverse(int num){
        int  rev = 0,digit;
		while(num>0) {
			digit = num%10;
			rev = rev*10+digit;
			num=num/10;
			
		}
		return rev;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int res = Reverse(num);
		System.out.println(res);
	    
	
	}
}
