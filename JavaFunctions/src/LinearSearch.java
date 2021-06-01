import java.util.Scanner;
public class LinearSearch {
	// 1 
	// 7
	// 2 13 4 1 3 6 28
	// 3

		
			 public static int sumOfArray(int array[],int n) {
				 int index = 0;
				 for(int i=0;i<array.length;i++) {
					 if(array[i]==n) {
						 index = index + i; 
					 }
				 }
				 return index;
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
				 System.out.println(sumOfArray(result,x));
				 n=n-1;
			 }
			
			 }

		}




