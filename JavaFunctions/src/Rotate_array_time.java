import java.util.*;

public class Rotate_array_time {
	public static void Prinarray(int array[]) {
		int n = array.length;
		for(int i = 0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
		 public static void RotateArraybyK(int arr[],int d) {
			 int n = arr.length;
			 int k = 0;
			  Collections.reverse(Arrays.asList(arr));
			 for(int i = n-d-1;i>=0;i--) {
				 if(k<i) {
					 int temp = arr[i];
					 arr[i] = arr[k];
					 arr[k] = temp;
				 }
				 k++;
			 }
		      
			 
		 }
	 private static void reverse(int[] arr) {
			// TODO Auto-generated method stub
			
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
		 int d = s.nextInt();
		 RotateArraybyK(result,d);
		 Prinarray(result);
		 n=n-1;
	 }

}
}