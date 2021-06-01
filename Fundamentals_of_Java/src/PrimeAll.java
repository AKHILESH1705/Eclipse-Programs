import java.util.Scanner;
public class PrimeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       int num =s.nextInt();
       int i=1;
       while(i<=num) {
    	   int j = 1,count=0;
    	   while(j<=num) {
    		   if(i%j==0) {
    			   count+=1;
    		   }
    		   j=j+1;
    	   }
    	   if(count==2) {
    		   System.out.println(i);
    	   }
    	   i=i+1;
       }
	}

}
