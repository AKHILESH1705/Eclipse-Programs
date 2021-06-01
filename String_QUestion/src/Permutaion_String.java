import java.util.Scanner;

public class Permutaion_String {

	
	
	
	
 public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
	 
	 int str1_len = str1.length();
	 int str2_len = str2.length();
	 int arr[] = new int[256];
 	 if(str1_len == str2_len) {
		 for(int i = 0; i< str1_len;i++) {
			 arr[(int)str1.charAt(i)] += 1;
		 }
		 for(int i = 0; i< str1_len;i++) {
			 arr[(int)str2.charAt(i)] -= 1;
		 }
		 for(int i = 0; i<arr.length-1;i++) {
			 if(arr[i]!=0) {
				 return false;
			 }
		 }
 	 }
 	 else {
 		 return false;
 	 }
	 return true;
	}

	public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	
	String str1 = s.nextLine();
	String str2 = s.nextLine();
	System.out.println(isPermutation(str1,str2));
 }
}