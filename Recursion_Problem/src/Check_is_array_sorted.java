
public class Check_is_array_sorted {
	
	
	public static boolean isSorted(int arr[]) {
		if(arr.length==1) {
			return true;
		}
		else if(arr[0] > arr[1]) {
			return false;
		}
			int ar[] = new int[arr.length-1];
			for(int i = 1;i<arr.length;i++) {
				ar[i-1] = arr[i];
			}
	      boolean b= isSorted(ar);
		return b;
	}
	
	public static void main(String args[]) {
		int arr[]  = {5,1,2,3,4,5};
		System.out.println(isSorted(arr));
 	}
	

}
