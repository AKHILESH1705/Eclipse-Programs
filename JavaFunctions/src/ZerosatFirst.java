	import java.util.Scanner;

public class ZerosatFirst {
	

		public static void Printarray(int array[]) {
			int n = array.length;
			for(int i = 0;i<n;i++) {
			System.out.print(array[i]+" ");
			}
		}
			 public static void sumOfArray(int arr[]) {
				 int n = arr.length;
			     /*int temp[] = new int[n];
			     for(int i=0;i<n;i++) {
			    	 if(arr[i]==0) {
			    		 temp[i] = arr[i];
			    	 }
			     }*/
				 
				 
				 int count1=0,count2=0,count3=0;
				 for(int i = 0;i<n;i++) {
					 if(arr[i]==0) {
						 count1++;	 
					 }
					 else if(arr[i]==1) {
						 count2++;
					 }
					 else if(arr[i]==2){
						 count3++;
					 }
				 }
				 for(int i = 0;i<count1;i++) {
					 arr[i]=0;
				 }
				 for(int j= count1;j<=n-count2;j++) {
					 arr[j]=1;
				 }
				 for(int k=n-count2;k<n;k++) {
					 arr[k]=2;
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
				 Printarray(result);
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

