import java.util.*;

public class Array_sort_using_function {
	
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n;i++) {
          arr[i] = s.nextInt();
		}
		
       Arrays.sort(arr);
		return arr; 
			
 }
	
    public static void intersection(int[] a, int[] b) {
        
    	int i = 0;
    	int j = 0;
    	while(i<a.length && j<b.length) 
    	{
          if(a[i]<b[j]) 
          {
        	i=i+1;
          }
          else if(b[j] < a[i]) {
        	  j=j+1;
        	  
          }
          else {
        	  System.out.print(a[i]+" ");
        	  i++;
        	  j++;
          }
    	
    	
    	}
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
   
 }
	
	
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
	    while(t > 0) {
            int[] arr1 = takeInput();
            int[] arr2 = takeInput();
            intersection(arr1, arr2);
            System.out.println();

            t -= 1;
        }	
	}
}
