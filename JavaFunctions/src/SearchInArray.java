import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {

		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int arr[] = new int[num];
		for(int i = 0;i<num;i++) {
			arr[i] = s.nextInt();
		}
		int n = s.nextInt();
		/*for(int i = 0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}*/
		int result = 0;
		for(int i = 0;i<num;i++) {
			if(arr[i]==n) {
				result = i;
				break;
			}
			else {
				result = -1;
			}
		
		}
		System.out.println(result);

	}

}
