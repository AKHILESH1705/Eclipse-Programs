
public class UniqueArray {

	public static int UniqueElement(int arr[]) {
		int res = arr[0];
        for (int i = 1; i < arr.length; i++)
            res = res ^ arr[i];
     
        return res;
	 	
}
	
	public static void main(String[]args) {
		int arr[] = {2,3,1,6,3,6,2};
		int result = UniqueElement(arr);
		System.out.println(result);
	}
}
