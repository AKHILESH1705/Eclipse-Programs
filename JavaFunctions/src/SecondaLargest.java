import java.util.Scanner;

public class SecondaLargest {
	

		public static int secondLargestElement(int[] arr) {
				
			int large = 0, secondL = 0;
			for(int i = 0 ;i<arr.length;i++) {
				if(large<arr[i]) {
					secondL = large;
					large = arr[i];
				}
                else if(arr[i]<large && arr[i] > secondL ){
                    secondL = arr[i];
                }
                else{
                    secondL = -2147483648;
                }
			}
             if(arr.length==0){
                 return -2147483648; 
             }
             else
             {
			 return secondL;
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
			 
			 public static void main(String args[]) {//8 9 9 1 7 5 5 10 1 0 7 
				 Scanner s = new Scanner(System.in);
				 int n = s.nextInt();
				 while(n>0) {
				 int result[] = TakeInput();
				 int res = secondLargestElement(result);
				 System.out.println(res);
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

