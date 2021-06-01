import java.util.*;
public class Triplet_sum_with_time {
	public static int tripletSum(int[] arr, int num) {
		int n = arr.length;
		int count  = 0 ;
		for(int i = 0;i<n;i++) {
			int pairsum = num - arr[i];
			int numpair = pairsum(arr,(i+1),(n-1),pairsum);
			count+= numpair;
		}
		return count;
	}
	public static int pairsum(int[] arr,int i, int j, int num) {     
		

    int ans = 0;
    while (i < j)
    {
        if (arr[i] + arr[j] < num)
            i++;
        else if (arr[i] + arr[j] > num)
            j--;
        else
        {
            int x = arr[i], xx = i;
            while ((i < j ) && (arr[i] == x))
                ans++;
            	i++;
 
            int y = arr[j], yy = j;
            while ((j >= i ) && (arr[j] == y))
                j--;
            if (x == y)
            {
                int temp = i - xx + yy - j - 1;
                ans += (temp * (temp + 1)) / 2;
            }
            else
                ans += (i - xx) * (yy - j);
        }
    }
    return ans;
 }
	public static void main(String args[])
	{
	int[] arr = new int[]{6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
	int sum = 5;
	int res = tripletSum(arr, sum);
	System.out.println(res);
	}
}

