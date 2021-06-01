/* this is optimized solution because its time  complexity is O(n) */


import java.util.Scanner;

public class PairSumInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		int n = s.nextInt();
		boolean b = false; 
		int i = 0;
		int j = num-1;
		while(i<j) {
		       if(arr[i] + arr[j] == n)
		         b = true;
		       if(arr[i] + arr[j] < n)
		         i = i+1;
		       else
		         j = j-1;
		    
		}
		
		if(b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

}
}

