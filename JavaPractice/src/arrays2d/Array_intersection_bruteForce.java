package arrays2d;

public class Array_intersection_bruteForce {
	public static void main(String args[]) {
		int arr[] = {1,2,2,4,5,4,6,6,5,1,3,3};
		System.out.println(findUnique(arr));
	}
	public static int findUnique(int[] arr){
		
		for(int i = 0; i < arr.length; i++){
			int j; 
			for(j = 0; j < arr.length; j++) { 
				if(i != j) 
				{ 
					if(arr[i] == arr[j]) {
					break; 
					} 
				} 
			}
			if(j == arr.length) 
			{ 
				return arr[i]; 
			} 
		}
		return Integer.MAX_VALUE;
}
}