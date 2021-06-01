import java.util.Scanner;
public class Average_Program {
	

public static void main(String[] args) {
			// Write your code here
Scanner s = new Scanner(System.in);
    
    String str = s.next();
    char ch = str.charAt(0);
    int a,b,c;
    a = s.nextInt();
    b = s.nextInt();
    c = s.nextInt();
    int average = (a+b+c)/3;
    System.out.println(ch);
    System.out.println(average);
	}
			
}

