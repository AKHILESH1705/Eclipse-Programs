import java.util.Scanner;

public class ArrangeNumberInArray {
	public static void arrange(int[] arr, int n) {
    	//Your code goes here
        int a = 1;
        int n1,n2;
        
        if(n%2==0){
            n1 = n/2;
            for(int i=0;i<n1;i++){
            arr[i] = a;
            a=a+2;
            }
            int c = n;
            for(int k = n/2;k<n;k++ )
            {
                arr[k] = c;
                c= c-2;
            }

        }
        else{
            n2 = n/2+1;
            for(int i=0;i<n2;i++){
            arr[i] = a;
            a=a+2;
            }
            int b = n-1;
            for(int j = n/2+1;j<n;j++){
                arr[j] = b;
                b=b-2;
            }
        }  
        }
	public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 while(n>0) {
		 int x = s.nextInt();
		 int[] arr = new int[n];
		 arrange(arr, x);
		 n=n-1;
	 }

}
}