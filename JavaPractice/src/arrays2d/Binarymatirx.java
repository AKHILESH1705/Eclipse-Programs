package arrays2d;

import java.util.Scanner;

public class Binarymatirx {
	
	public static void main(String args[]) {
		Scanner s  = new Scanner(System.in);
		
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		
		int row_ar[] = new int[row];
		int col_ar[] = new int[col];
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length;j++) {
				arr[i][j] = s.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length;j++) {
				if(arr[i][j] == 1) {
					row_ar[i] = 1;
					col_ar[j] = 1; 
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j<arr[0].length;j++) {
				if(row_ar[i]==1 || col_ar[j]==1) {
					arr[i][j]=1;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0; j<arr[0].length;j++) {
				 System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
