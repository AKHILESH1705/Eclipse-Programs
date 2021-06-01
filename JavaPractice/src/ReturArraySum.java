import java.util.Scanner;
	
public class ReturArraySum {
	
	 public static int sumOfArray(int array[]) {
		 
		 int sum = 0;
		 for(int i=0;i<array.length;i++) {
			 sum = sum + array[i];
		 }
		 return sum;
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
		 System.out.println(sumOfArray(result));
		 n=n-1;
	 }
	
	 }

}
