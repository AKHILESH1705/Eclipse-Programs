
public class Bubblesort {
	
	public static void PrintArray(int array[]) {
		int n = array.length;
		for(int i = 0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	
	public static void SelectionSort(int[] array){
		int i,j,temp;
		for(i = 0;i<array.length;i++) {
			for(j=0;j<array.length-1;j++) 
			{
				if(array[j]>array[j+1]) 
			   {
			    temp = array[j];
		     	array[j] = array[j+1];
			   array[j+1] = temp;
		       }

	       }
		}
	}		
	public static void main(String[] args) {
	int array[] = {1,3,4,2,0,5,7,5,6};
    SelectionSort(array);
    PrintArray(array);

	}

}
