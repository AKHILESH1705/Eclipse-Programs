import java.util.Scanner;
public class practivrpattern1 {
	
	public static void main(String[]args) {
		Scanner s  = new Scanner(System.in);
		int num = s.nextInt();
	    int n1 = (2*num)/2;	
		int i =1;
		while(i<=n1) {
			int j =1,a=1;
			while(j<=num) {
				System.out.print(a);
				j=j+1;
				a=a+1;
			}
			num=num-1;
			i+=1;
			System.out.println();
					
		}
		int n2 = n1;
		i=1;
		while(n2>=1) {
			int a=1,j=1;
			while(j<=i) {
				System.out.print(a);
				a=a+1;
				j=j+1;
			}
			System.out.println();
			i=i+1;
			n2=n2-1;
			
		}
	}

}
