import java.util.Scanner;
public class PairArray {

	public static void Prinarray(int array[]) {
		int n = array.length;
		for(int i = 0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
		 public static void sumOfArray(int array[]) {
			 for(int i = 0;i<array.length-1;i+=1) {
				 for(int j = i+1;j<array.length;j++) 
				 {
					 if(array[i]<array[j]) 
					 {
					  int temp = array[i];
					  array[i] = array[j];
					  array[j] = temp;
				    }
				 }
			 }
		
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
			 sumOfArray(result);
			 Prinarray(result);
			 n=n-1;
		 }
		
		 }

	}

/*
 * time complexity reduce with this code O(n) ;
 *         int k = 0;
         for(int i = 0;i<array.length;i+=1) {
					 if(array[i]!=0) 
					 {
					  int temp = array[k];
					  array[k] = array[i];
					  array[i] = temp;
                      k++;   
				    }
				 }
 * */

