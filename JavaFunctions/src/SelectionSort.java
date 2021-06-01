
public class SelectionSort {
	
	public static void Prinarray(int array[]) {
		int n = array.length;
		for(int i = 0;i<n;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	
	public static void SelectionSort(int[] array){
		int i,j,min,temp;
		for(i = 0;i<array.length-1;i++) {
			min = i;
			for(j = i+1;j<array.length;j++) {
				if(array[j]<array[min]) {
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}

	}
	public static void main(String[] args) {
	int array[] = {1,3,4,2,0,5,7,6};
    SelectionSort(array);
    Prinarray(array);

	}

}
