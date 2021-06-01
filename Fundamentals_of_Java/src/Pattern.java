import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 1,a=1;
        int max = 2*(num+1)-1;
        while(i<=max/2+1) {
        	int j =1;
        	while(j<=a) {
        		System.out.print("*");
        		j=j+1;	
        	}
        	System.out.println();
        	a=a+2;
        	i=i+1;
        }
        i=max/2;
        a=max-2;
        while(i>=0) {
        	int j =1;
        	while(j<=a) {
        		System.out.print("*");
        		j=j+1;
        	}
        	System.out.println();
        	i--;
        	a=a-2;
        }
        
    }
}