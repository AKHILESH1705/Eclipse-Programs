import java.util.Scanner;

public class DistriBution {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		int m = s.nextInt();
		int n = arr.length;
		int temp[] = new int[n];
		for(int i = 0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;	
				}
			}
			temp[i] = arr[i];
		}
		for(int i = 0;i<n;i++) {
		   System.out.print(temp[i]+" ");
		}
		System.out.println();
		int ans = temp[m-1]-temp[0];
		int k = m,p=1; 
		System.out.println(ans);
		for(int i = k;i<n;i++) {
			int j = temp[i]-temp[p];
			p++;
			if(j<ans) {
				ans = j;
			}//90 70 20 80 50
		}
		System.out.println(ans);
}
}