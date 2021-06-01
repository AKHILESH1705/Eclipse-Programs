package arrays2d;

import java.util.Scanner;

public class ArrayRotate_90clockwise {

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
	public static void Printclockwise(int[][]arr) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			for(int j = n-1;j>=0;j--) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int arr[][] = takeInput();
		Printclockwise(arr);
		
}
}