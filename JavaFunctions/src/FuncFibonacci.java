import java.util.Scanner;


public class FuncFibonacci {
	
	public static void Fibonacci(int num) {
		int a = 0,b=1,c;
		for(int i=1;i<=num;i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		Fibonacci(num);
	    
	
	}

}
