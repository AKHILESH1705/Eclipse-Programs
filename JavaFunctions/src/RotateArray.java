	import java.util.Scanner;

public class RotateArray {
	

		public static void Prinarray(int array[]) {
			int n = array.length;
			for(int i = 0;i<n;i++) {
				System.out.print(array[i]+" ");
			}
		}
			 public static void RotateArraybyK(int input[],int d) {
				 int inputLength = input.length;
			        for (int i = 0; i < d; i++){
			            int temp = input[0];
			            for(int j = 0; j < inputLength - 1; j++){
			                input[j] = input[j + 1];
			            }
			            input[inputLength - 1] = temp;
			        }			    }
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
	 

