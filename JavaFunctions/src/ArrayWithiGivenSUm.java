/* this is non optimized solution because its time  complexity is O(N^2) */
import java.util.Scanner;

public class ArrayWithiGivenSUm {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		int n = s.nextInt();
		boolean b = false; 
		for(int i = 0;i<num;i++) {
			for(int j = i+1;j<num;j++) {
				if(arr[i]+arr[j]==n) {
					b = true;
					break;
				}
			}
		}
		if(b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

}
}
