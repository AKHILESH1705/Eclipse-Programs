
public class ArrayIntersection {
	
	public static int BinarySearch(int arr[], int x) {
		int s = 0;
		int e = arr.length-1;
        
		while(s<=e) {
			int m = (s+e)/2;
			if(arr[m]>x) {
				e = m-1;			
			}
			else if(arr[m]<x) {
				s = m+1;
			}
			else
			{
			 return m;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
	int array[] = {1,2,3,4,5,6,7,8};
	int x = 9;
	int result = BinarySearch(array, x);
	System.out.println(result);
	}
}