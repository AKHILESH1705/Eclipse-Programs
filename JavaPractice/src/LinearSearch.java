import java.util.Scanner;
public class LinearSearch {

	
	 public static int LinearSearchinArray(int ar[],int x) {
		 
		 for(int i=0;i<ar.length;i++) {
			if(ar[i]==x) {
				return i;
			}
		 }
		 return -1;
	}
	 public static int[] TakeInput() {
		 Scanner s =  new Scanner(System.in);
		 int size = s.nextInt();
		 int arr[] = new int[size];
		 for(int i=0;i<size;++i) {
			 arr[i] = s.nextInt();
		 }
		 return arr;
	 }
	 
	 public static void main(String args[]) {
		 Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 while(n>0) {
		 int result[] = TakeInput();
		 int x = s.nextInt();
		 System.out.println(LinearSearchinArray(result,x));
		 n=n-1;
	 }
	
	 }

}
