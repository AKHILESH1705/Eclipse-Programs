import java.util.Scanner;
public class PracticePattern2 {

	public static void main(String[]args) {
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
        while(i<=n) {
        	int  j = 1;
        	while(j<=n-i) {
        		System.out.print(" ");
                j++;        	
        	}
        	int a =1;
        	int k=1;
        	while(k<=i) {
        		System.out.print(a+" ");
        		a= a*(i-k)/(k);
        		k+=1;
        	}
        	System.out.println();
        	i=i+1;
        	
        	
        }
	}
}
