import java.util.Scanner;
public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char arr[] = {'c','o','d','i','n','g'};
        //String str1 = "abcdz";
       // String str2 = "abcda";
        //str1+=str2;
        
        String str1="abc";
        String str2=new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1.substring(2));
        System.out.println(str1);
        System.out.println(str2+str1);
        System.out.println(str1+str2);
        System.out.println(str1.contains("ing"));
        System.out.println(str1.compareTo(str2));
	}

}
