import java.util.Arrays;

public class Binary_search {

	public static int BinarySearch(int arr[],int si,int ei,int x) {
		if(si>ei) {
			return -1;
		}
		int mid = ((si+ei)/2);
		if(arr[mid] == x) {
			return mid;
		}
		else if(arr[mid]<x) {
			return BinarySearch(arr,mid+1,ei,x);
		}
		else {
			return  BinarySearch(arr,si,mid-1,x);
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {7,8,0,1,2,3,4,5,6,7,9};
		Arrays.sort(arr);
		System.out.println( BinarySearch(arr,0,arr.length-1,9));
	}
}
