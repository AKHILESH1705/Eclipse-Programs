import java.util.Scanner;

public class TransitionPointWithBinarySearch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		
		int S = 0;
		int E = num-1,ans = -1;
		boolean b = false;
		while(S<=E) {
			int mid =(S+E)/2;
			if(arr[mid]==0) 
			{
				S=mid+1;
			}
			else if(arr[mid]==1)
			{
				if((mid == 0 || (mid > 0 && arr[mid - 1] == 0)))
				{
					ans = mid;
					b = true;
					break;
				}
				else {
					E=mid-1;
				}
			}
			
		}
		if(b) {
			System.out.println(ans);
		}
		else {
			System.out.println(ans);
		}
}
}
