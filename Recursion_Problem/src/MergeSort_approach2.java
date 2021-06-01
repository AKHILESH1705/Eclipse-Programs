
public class MergeSort_approach2 {

	public static void merge(int ar[], int s, int e)  
	{  
	  int mid = (s+e)/2;
	  int i = s;
	  int j = mid+1;
	  int k = s;
	  int temp[] = new int[e+1];
	  while(i<=mid && j<=e) {
		  if(ar[i]<=ar[j]) {
			  temp[k++] = ar[i++];
		  }
		  else {
			  temp[k++] = ar[j++];
		  }
	  }
	  while(i<=mid) {
		  temp[k++] = ar[i++];
	  }
	  while(j<=e) {
		  temp[k++]=ar[j++];
	  }
    
	  for(int m = s;m<=e;m++) {
		  ar[m] = temp[m];
	  }
	
}  
	public static void MergeSort(int ar[],int si, int ei) {
		
		if(si<ei) {
		int mid  = (si+ei)/2;
		MergeSort(ar,si,mid);
		MergeSort(ar,mid+1,ei);
		merge(ar,si,ei);
		}
		
}
	public static void main(String args[]) {
		int arr[] = {5,3,2,4,45,65,23,34,1,23,45,6,4,32,2};
		
		MergeSort(arr,0,arr.length-1);
		
		for(int i = 0;i<arr.length;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}


