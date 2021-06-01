package Constructor_create;

public class Use_constructor {

	public static void main(String args[]) {
		
		Creat_constructor s1 = new Creat_constructor("akhilesh");
		Creat_constructor s2 = new Creat_constructor(-123);	
		s1.Set_value(123);
		Creat_constructor s3 = new Creat_constructor("akhilesh",456);
		//s1.name = "aakash";
		//s1.roll = 123;
		s1.print();
		s2.print();
		s3.print();
	    //System.out.println(s1.name+" "+s1.roll);
		//System.out.println(s2.name+" "+s2.roll);
		//System.out.println(s3.name+" "+s3.roll);
		
		
	}
}
