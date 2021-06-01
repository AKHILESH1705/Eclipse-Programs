
//brute force approach

import java.util.Scanner;
public class TransitionPoint {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		int transition_index = -1;
		boolean b = false;
		for(int i=0;i<num;i++) {
			if(arr[i]!=0) {
				transition_index = i;
				b=true;
				break;
			}
		}
		if(arr[0]!=0) {
			transition_index = -1;
		}
		if(b)
		System.out.println(transition_index);
		else
			System.out.println(transition_index);
  }
}
