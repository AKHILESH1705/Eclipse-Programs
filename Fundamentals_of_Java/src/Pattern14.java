import java.util.Scanner;
public class Pattern14 {

    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i=1;
        while(i<=N) {
        	int sum=0;
        	int j=1;
        	while(j<=i) {
        		sum=sum+j;
        		System.out.print(j);
        		if(j<i) {
        			System.out.print("+");
        		}
        		j=j+1;
        	}
        	System.out.println("="+sum);
            i=i+1;
        }
        }
    }
