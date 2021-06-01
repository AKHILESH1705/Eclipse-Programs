import java.util.*;
public class ArrayCountInversion {
    public static void main(String[]args) {
    	Scanner s = new Scanner(System.in);
    	
    	long num = s.nextInt();
    	long arr[] = new long[(int) num];
    	for(int i = 0;i<num;i++) {
    		arr[i] = s.nextInt();
    	}
    	System.out.println(getInversions(arr));
    	
    }
    public static long getInversions(long[] arr) {
        int n = arr.length;
        long totalInversions = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    totalInversions += 1;
                }

            }
        }

        return totalInversions;
    }
}
