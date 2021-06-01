import java.util.Scanner;
public class DecInc {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 int num = s.nextInt();
		 int prev = s.nextInt();
		 int i = 0,cur;
		 boolean isdec = true;
		 while(i<num-1) {
			 cur = s.nextInt(); //7 3 2 1 2 3 2 1
			 if(prev<cur) {
				 
			 }
			 else if(prev>cur && isdec==true) {
				 
			 }
			 else{
				 
				 isdec=false;
				 break;
			 }
			 prev = cur;
			 i=i+1;
		 }
		 if(isdec) {
			 System.out.println("true");
		 }
		 else {
			 System.out.println("false");
		 }
		 

	}

}
