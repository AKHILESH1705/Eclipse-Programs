package arrays2d;
import java.util.*;

public class Array2DInput_Col_wise {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println("enter number of rows --"); 
	int rows = s.nextInt();
	System.out.println("enter number of columns --"); 
	int cols = s.nextInt();
	
	int arr_2d[][] = new int[rows][cols];
	
	for(int i = 0;i<rows;i++) {
		for(int j = 0;j<cols;j++) {
			System.out.println("enter number of col " + i + " row" + j);
			arr_2d[j][i] = s.nextInt();		
			}
	}
	
	for(int i = 0;i<rows;i++) {
		for(int j = 0;j<cols;j++) {
			
			System.out.print(arr_2d[i][j]+" ");
			}
		System.out.println();
		}
	
}
}