package arrays2d;

import java.util.Scanner;

public class Array_anticlockwise {
	

	public static int[][] takeInput(){
	     
		Scanner s = new Scanner(System.in);
		 int n = s.nextInt();
		 int arr[][] = new int[n][n];
		 for(int i = 0;i<n;i++) {
			 for(int j = 0;j<n;j++) {
				 arr[i][j] = s.nextInt();
			 }
		 }
		return arr;
	}
	public static void PrintAnticlockwise(int[][]arr) {
		int n = arr.length;
		for(int i = n-1;i>=0;i--) {
			for(int j = 0;j<n;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = takeInput();
		PrintAnticlockwise(arr);
		
}

}
