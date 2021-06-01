
public class Quick_sort_prob {
	    
	    public static int partition(int input[], int si, int ei) {// 0, 6
			int pivotElement = input[si]; //5
			int smallNumberCount = 0;
			for (int i = si + 1; i <= ei; i++) {
				if (input[i] < pivotElement) {//2<5
					smallNumberCount++;//3
				}
			}
			int temp = input[si + smallNumberCount];//7
			input[si + smallNumberCount] = pivotElement;//5
			input[si] = temp;//7
			
			int i = si;//0
			int j = ei;//6
			while (i < j) {
				if (input[i] < pivotElement) {
					i++;
				}
				else if (input[j] >= pivotElement) {
					j--;
				}
				else {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
					i++;
					j--;
				}
			}
			return si + smallNumberCount;
		}
	    
	    public static void quickSort(int input[], int si, int ei) {//6
			if (si >= ei) {
				return;
			}
			int pivotIndex = partition(input, si, ei);//0, 6
			quickSort(input, si, pivotIndex - 1);
			quickSort(input, pivotIndex + 1, ei);
		}
		
		public static void Sort(int a[]) 
	    {
	        quickSort (a,0,a.length-1);
		}
	 public static void main(String args[]) {
		 int arr[] = {5,2,5,7,4,2,6};//7
		 Sort(arr); 
		 for(int i = 0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		 
	 }
		
	}

