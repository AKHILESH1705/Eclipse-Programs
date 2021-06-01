import java.util.Scanner;
public class Number_in_array {

	public static boolean checkNumber(int input[], int x) {
	    int len = input.length;
	    boolean b;
	    if(len == 0)
	    {
	        return false;
	    }
	    else if(input[0] == x)
	    {
	        return true;
	    }
	    else
	    {   
	    	int arr[] = new int[len-1];
	    	for(int i = 1;i<len;i++) {
	    		arr[i-1] = input[i];
	    	}
	        b = checkNumber(arr, x);
	    }   
	    return b;
	}	
		public static void main(String argsp[]) {
			Scanner s = new Scanner(System.in);
			int arr[] = {1,2,3,4};
 			int n = s.nextInt();
			System.out.println(checkNumber(arr,n));
		}
}


