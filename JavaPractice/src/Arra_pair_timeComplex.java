import java.util.Arrays;
import java.io.*;
 
public class Arra_pair_timeComplex {
     
// Function to return the count of pairs
// from arr[] with the given sum
static int pairs_count(int arr[], int n, int sum)
{

    int ans = 0;
    Arrays.sort(arr);
 
    int i = 0, j = n - 1;
 
    while (i < j)
    {
        if (arr[i] + arr[j] < sum)
            i++;

        else if (arr[i] + arr[j] > sum)
            j--;

        else
        {
            int x = arr[i], xx = i;
            while ((i < j ) && (arr[i] == x))
                i++;
 
            int y = arr[j], yy = j;
            while ((j >= i )&& (arr[j] == y))
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
 
public static void main (String[] args)
{
    int arr[] = {3,3,3,3,3 };
    int n = arr.length;
    int sum = 6;
     
    System.out.println (pairs_count(arr, n, sum));
}
}