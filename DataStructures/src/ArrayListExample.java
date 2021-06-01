import java.util.ArrayList;
public class ArrayListExample {
	
	public static<v> void printArray(ArrayList<v> arr) {
//	for(int i = 0;i<arr.size();i++) {
//			System.out.print(arr.get(i)+" ");
//		}
//		System.out.println();
//	
		for(v i: arr) { // for each loop work with values not with index 
			System.out.print(i+" ");
		}
	}

	public static void main(String args[]) {
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		Integer i = 10;
		arr.remove(i); // we can not put value directly to the remove function we have to initialize value what ever we want to remove 

	//	arr.add(10,100); at this point program will generate an Error why because that time size of array is 2 only  default capacity is 10

		System.out.println(arr.size());
		System.out.println(arr.get(1));
		printArray(arr);
		ArrayList<String> ar = new ArrayList<>();
		ar.add("akhi");
		ar.add("akhil");
		ar.add("akhilesh");
		ar.add("akhilesh ji");
		ar.add("akhil kushwah");
		printArray(ar);
 	}
}
