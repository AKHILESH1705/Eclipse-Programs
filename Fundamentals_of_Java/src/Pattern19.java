import java.util.Scanner;
public class Pattern19{
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int n1 = 2*n;
        int i =1;
        while(i<=n1) {
        	int space =1;
        	while(space<i) {
        		System.out.print(" ");
        		space+=1;
        	}
        	int j =1 ;
        	while(j<=n) {
        		System.out.print("* ");
        		j=j+1;
        	}
        	n=n-1;
        	i=i+1;
        	System.out.println();
        }
    }
}
