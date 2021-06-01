
public class Patter_using_recursion {

	public static void Pattter1(int n ,int i) {
		if(n==0) {
			return;
		}
		if(i<n) {
			System.out.print("* ");
			Pattter1(n,i+1);
		}
		else {
			System.out.println();
			Pattter1(n-1, 0);
		}
	}
	
	
	public static void main(String[]args) {
		Pattter1(5,0);
	}
	
	
}
