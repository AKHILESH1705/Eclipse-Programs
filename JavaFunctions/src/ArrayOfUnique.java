import java.util.Scanner;


public class ArrayOfUnique {
		
			 public static int sumOfArray(int array[]) {
				 
				 int unique= 0 ;
				 for(int i=0;i<array.length;i++) {
					 if(unique!=array[i]) {
						 unique = array[i];
					 }
				 }
				 return unique;
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

/*  2
    5
    2 4 7 2 7
    9
    1 3 1 3 6 6 7 10 7*/

