import java.util.*;

public class SuccessorProblem{
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
	    int num =  s.nextInt();
	    int count = 0;
	    int temp = num;
	    while(num>0) {
	    	count++;
	    	num/=10;
	    }
	    System.out.println(count);
	    int k = count-1;
	    int arr[] = new int[count];
 		while(temp>0) {
			int rem = temp%10;
			arr[k] = rem;
			temp/=10;
			k--;
		}
 		//System.out.println(k);
 		/*for(int i = 0;i<arr.length;i++)
 		{
 			System.out.print(arr[i]+" ");
 		}
	    */
	    int ans = -1;
	    for(int i= count-1;i>0;i--) {
	    	if(arr[i]>arr[i-1]) {
	    		ans = i;
	    		break;
	    	}
	    }
	    if(ans==-1) {
	    	for(int i=count-1;i>=0;i--) {
	    		System.out.print(arr[i]);
	    	}
	    }
	    else
	    {
	    	int index = ans;
	    	int val = arr[index-1];
	    	int m = Integer.MAX_VALUE;
	    	for(int i = ans;i<count;i++) {
	    		if(val<arr[i] && m>arr[i]) {
	    			m = arr[i];
	    			index = i;
	    		}	
	    	}
	    	int tmp = arr[ans-1];
	    	arr[ans-1] = arr[index];
	    	arr[index]  = tmp;
	    	for (int i = ans; i < arr.length; i++)   
	    	{  
	    	 for (int j = i + 1; j < arr.length; j++) {  
	    	   if (arr[i] > arr[j]){  
	    	    int tp = arr[i];  
	    	    arr[i] = arr[j];  
	    	    arr[j] = tp;  
	    	    }  
	    	 }
	    	}
	    	for(int i = 0;i<count;i++) {
	    		System.out.print(arr[i]);
	    	}
	    	
	    }
	    
	}
}