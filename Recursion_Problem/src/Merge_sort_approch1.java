
public class Merge_sort_approch1 {
	
	public static void Merger(int a[],int b[],int ar[]) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<a.length && j<b.length) 
		{
			if(a[i]<=b[j]) {
				ar[k] = a[i];
				i++;
				k++;
			}
			else {
				ar[k] = b[j];
				j++;
				k++;
			}
		}
		
		if(i<a.length) {
			while(i<a.length) {
				ar[k] = a[i];
				i++;
				k++;
			}
		}
		if(j<b.length) {
			while(j<b.length) {
				ar[k] = b[j];
				j++;
				k++;
			}
		}
}
	
	public static void MergeSort(int ar[]) {
		if(ar.length<=1) {
			return;
		}
		int a[] = new int[ar.length/2];
		int b[] = new int[ar.length-a.length];
		
		for(int i = 0;i<ar.length/2;i++) {
			a[i] = ar[i];
		}
		for(int i = ar.length/2;i<ar.length;i++) {
			b[i-ar.length/2] = ar[i];
		}
		
		MergeSort(a);
		MergeSort(b);
		Merger(a,b,ar);
	}
	
	public static void main(String args[]) {
		int arr[] = {1,3,2,5,4,6,9,7,8,12,11,10};
		MergeSort(arr);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
