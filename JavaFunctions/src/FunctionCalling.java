import java.util.Scanner;

public class FunctionCalling {
	
	public static void a(char a) {
	   int c=a;
	   System.out.println("inside simple a "+c);
		
	}
	public static void a(int a,int b) {
		   int c = a+b;
		   System.out.println("inside sum "+c);
			
		}
	public static void a(double n) {
		   ++n;
		   System.out.println("inside double a "+n);
			
		}
	public static int a(int n) {
		   ++n;
		   System.out.println("inside a");
			return n;
		}
	public static void main(String[] args) {
		int res = a(10);
		System.out.println(res);
		a(10.5);
		a('a');
		a(10,20);
	
	}

}
