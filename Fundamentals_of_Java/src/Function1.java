import java.util.*;
 
public class Function1{
 
	public static int GetnCr(int num) {
		int fact = 1;
		if(num==0) {
			return num;
		}
		else {
		for(int i = 1;i<=num;i++) {
			fact = fact*i;
		}
		}
		return fact;
	}
	
	
public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int num = s .nextInt();
	int result = GetnCr(num);
	System.out.println(result);
	
}
}
