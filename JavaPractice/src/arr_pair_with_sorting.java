
import java.util.*;

public class arr_pair_with_sorting {
	
	public static int pairSum(int[] arr) 
	{
        Arrays.sort(arr);
        int num =6;
        int i = 0,j=arr.length-1;
        int count = 0; 
        while(i<=j){
            int res = arr[i] + arr[j];
            if(res == num ){
                count++;
                i++;
            }
            else if(res>num)
            {
               j--;  
            }
            else
            {
                i++;
            }
        }
        return count;
	}
	
	
public static void main(String args[]) {
	   
     int arr[] = {3,3,3,3,3};
     int res = pairSum(arr);
     System.out.println(res);
 }	
}
