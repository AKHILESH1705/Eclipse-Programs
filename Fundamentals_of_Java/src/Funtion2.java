import java.util.Scanner;
public class Funtion2 {
	
	public static void Fibonacci(int num) {
		 int a = 1,b=1,c;
		if(num==1) {
			 System.out.print(a+" ");
		 }
		 else {
		
			 for(int i =1;i<=num;i++) {
				 System.out.print(a+" ");
				 c=a+b;
				 a=b;
				 b=c;
				 
			 }
		 }
		
	}

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		Fibonacci(a);

	}

}
