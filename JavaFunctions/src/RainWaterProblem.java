/* input 3 0 0  2 4
 * output 7
 * 
 * input 30 90 20 70 50
 * output 50
 * 
 */


import java.util.Scanner;

public class RainWaterProblem {

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
		int max = Integer.MIN_VALUE;
		int max_index = 0; 
		for(int i = 0;i<num;i++) {
			if(arr[i]>max) {
				max = arr[i];
				
			}
			max_index = i;
		}
		System.out.println(max);
	System.out.println(max_index);	
		
        int sum = 0,peak = arr[0];
        for(int i = 1;i<=max_index;i++) {
        	if(peak>arr[i] && peak!=max) {
        		sum += peak-arr[i];
        	}
        	if(peak<arr[i]) {
        		peak = arr[i];
        	}
        }
        System.out.println(sum);
        //System.out.println(peak);

	}

}
