
public class Check_array_sorted_bettersolution {
	public static boolean isSorted(int arr[],int si) {
		if(si == arr.length-1) {
			return true;			
		}
		if(arr[si] > arr[si+1]) {
			return false;
		}
		boolean b =  isSorted(arr,si+1);
		return b;
	}
	public static void main(String args[]) {
		int arr[]  = {1,2,3,4,7,5};
		System.out.println(isSorted(arr,0));
 	}
}
