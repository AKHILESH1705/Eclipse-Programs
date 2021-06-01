import java.util.Scanner;
public class check_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = str.charAt(0);
		
		if(ch == 'a' || ch =='b'|| ch == 'c' || ch =='e' || ch == 'f' || ch =='g'|| ch == 'h' || ch =='i'|| ch == 'j' ||
				ch =='k'|| ch == 'l' || ch =='m' || ch == 'n' || ch =='o' || ch == 'p' || ch =='q' || ch =='r' || ch =='s' || ch =='t' || ch =='u' || ch =='s' || ch =='t') {
			System.out.println("1");
		}
	}

}
