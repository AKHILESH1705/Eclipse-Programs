
public class Quick_sort_recursively {
	
	public static int Partition(int[] ar,int si,int ei) {
		
		int pivot = ar[si];
		int count = 0;
		for(int i = si+1;i<=ei;i++) {
			if(ar[i]<pivot) {
				count++;
			}
		}
		int temp = ar[si+count];
		ar[si+ count] = pivot;
		ar[si] = temp;
		
		int i = si;
		int j = ei;
		while(i<j) {
			if(ar[i]<pivot) {
				i++;
			}
			else if(ar[j]>=pivot) {
				j--;
			}
			else {
				int tmp = ar[i];
				ar[i] = ar[j];
				ar[j] = tmp;
				i++;
				j--;
			}
		}
		return si+count;
	}
	public static void Sort(int ar[],int si,int ei) {
		
	if(si>=ei) {
		return;
	}
	int pivot = Partition(ar,si,ei);
	
	Sort(ar,si,pivot-1);
	Sort(ar,pivot+1,ei);

		
	}
	    
	public static void quickSort(int ar[]) {
	
	int si = 0;
	int ei = ar.length-1;
	
	 Sort(ar,si,ei);

		
	}
	public static void main(String args[]) {
		int arr[] = {5,9,8,3,2,7,1};
		
		quickSort(arr);
		for(int i = 0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
