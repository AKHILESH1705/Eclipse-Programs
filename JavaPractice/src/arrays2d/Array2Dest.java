package arrays2d;

import java.util.Scanner;

public class Array2Dest {
	public static void main(String[] args) {
		int arr_2d[][] = new int[2][3];
 	Scanner s = new Scanner(System.in);
	for(int i = 0;i<2;i++) {
		for(int j = 0;j<3;j++) {
			
			System.out.print(arr_2d[i][j]+" ");
			}
		System.out.println();
		}
	
	System.out.println(arr_2d);
	System.out.println(arr_2d.length);//length of row
	for(int i = 0;i<2;i++) {
		System.out.println(arr_2d[i].length);//length of column
	}
	
	int arr[][] = new int[4][];
	System.out.println(arr[2].length);

}
}