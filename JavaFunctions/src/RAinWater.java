import java.util.Scanner;

public class RAinWater {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		for(int i = 0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
	System.out.println();
		int LM = Integer.MIN_VALUE;
		int RM = Integer.MIN_VALUE;
		int left_arr[] = new int[num];
		int right_arr[] = new int[num];
		
		for(int i = 0;i<num;i++) {
			if(LM<arr[i]) {
				LM = arr[i];
			}
			left_arr[i] = LM;
		}
		for(int i = num-1;i>=0;i--) {
			if(RM<arr[i]) {
				RM = arr[i];
			}
			right_arr[i] = RM;
		}
		/*for(int i = 0;i<num;i++) {
			System.out.print(left_arr[i]+" ");
		}
		System.out.println();
		for(int i = 0;i<num;i++) {
			System.out.print(right_arr[i]+" ");
		}*/
		
		int sum = 0,min=0;
		for(int i = 0;i<num;i++) {
			if(left_arr[i]>right_arr[i]) {
				 min = right_arr[i];
			}
			else
			{
				min = left_arr[i];
			}
			sum += min-arr[i];
		}
		System.out.println(sum);
		
}
}
