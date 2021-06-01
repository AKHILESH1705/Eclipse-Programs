import java.util.ArrayList;

public class RemoveDuplicatesArray {
	
	public static ArrayList<Integer> RemoveDuplicatesArrayFromArray(int ar[]){
		ArrayList<Integer> result = new ArrayList<>();
		result.add(ar[0]);
		for(int i = 1;i<ar.length;i++) {
			if(ar[i]!=ar[i-1]) {
				result.add(ar[i]);
			}
		}
		return result;
		
	}
	
	
	
	public static void main(String args[]) {
		int ar[] = {10,10,20,20,30,10};
		ArrayList<Integer> result = RemoveDuplicatesArrayFromArray(ar);
		for(int i: result) {
			System.out.print(i+" ");
		}
 	}
}
