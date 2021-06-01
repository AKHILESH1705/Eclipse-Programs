import java.util.*;
public class arrayTest {

	
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		int n =  s.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[n];
		for(int i = 0;i<n;i++) 
		{
			a[i] = s.nextInt();	
		}
		for(int i = 0;i<n;i++) 
		{
			b[i] = s.nextInt();	
		}
		int count = 0;
		for(int i=0;i<n;i++){
            if(a[i]==b[i]){
                continue;
            }
         for(int j=i+1;j<n;j++){
             if(a[j]==b[i]){
                 count++;
                 int temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
                    break;
             }
         }
		}
		System.out.println(count);
 }

}
