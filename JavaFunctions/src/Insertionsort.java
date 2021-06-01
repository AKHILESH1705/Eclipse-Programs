
public class Insertionsort {
	public static void PrintArray(int arr[]) {
		int n = arr.length;
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public static void InsertionSort(int[] arr){
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
	       }
			arr[j+1] = key;
		}
	}		
	public static void main(String[] args) {
	int array[] = {1,3,4,2,0,5,7,5,6};
    InsertionSort(array);
    PrintArray(array);
}
	
}