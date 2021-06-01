import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 1,i=1,b = 1,c,last;
        while(i<=n) {
        	//System.out.print(a+" \n");
        	c=a+b;
        	a=b;
        	b=c;
            i=i+1;
        }
        last = b-a;
        System.out.println(last);
        

       
   }
}
