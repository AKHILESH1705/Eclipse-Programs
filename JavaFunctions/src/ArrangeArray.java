

import java.util.Scanner;

public class ArrangeArray {
	
	
	public static int[] takeInput () {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		
		return arr;
	}
	
    public static void arrange(int[] arr, int n) {
    	n = arr.length;
    	int a = 1;
		for (int i = 0; i <= (n - 1)/2; i++) {
			
			int b = a + i;
			System.out.print(b + " ");
			a = a + 1;
		}


	if (n % 2 == 0) {
		int j = n;
		while (j > 1) {
			System.out.print(j + " ");
			j = j - 2;
		}
	}
	else {
		int j = n - 1;
		while (j > 1) {
			System.out.print(j + " ");
			j = j - 2;
		}
	}
}   	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
		int[] arr = takeInput();
		int n = arr.length;

		arrange(arr, n);
		
		t = t - 1;
		}
	}
}