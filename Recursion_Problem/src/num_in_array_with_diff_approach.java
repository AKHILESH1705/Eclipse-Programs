import java.util.Scanner;

public class num_in_array_with_diff_approach {
	public static boolean checkNumber(int input[], int x) 
    {
		int  n = input.length;
        boolean res;
        if(n==0){
            return false;
        }
        if(n==1){
           if(input[0]==x)
           {
            return true;
           }
        }
           if(input[0]==x)
           {
            return true;
           }
        else{
            int arr[] = new int[n-1];
            for(int i = 1;i<n;i++)
            {
                arr[i-1] = input[i];
            }
            res = checkNumber(arr,x);
         
        }
        
        return res;
	}
	
	
	public static void main(String argsp[]) {
		Scanner s = new Scanner(System.in);
		int arr[] = {1,2,3,4};
			int n = s.nextInt();
		System.out.println(checkNumber(arr,n));
	}
}
