// optimized solution of power calculation O(log2 b)
public class power_calculate {

 public static int Powerrecursive(int a, int b) {
	 if(b <= 1){
		 return a;
	 }
	 int temp = Powerrecursive(a,b/2);
	 if(b % 2 == 0) {
		 return temp*temp;
	 }
	 else {
		 return a*temp*temp;
	 }
 }
	
 public static void main(String args[]) {
	 System.out.println(Powerrecursive(5,3));
 }
	
}
