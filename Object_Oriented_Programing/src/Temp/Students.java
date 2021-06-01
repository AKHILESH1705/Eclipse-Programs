package Temp;

public class Students {

	public static void main(String args[]) {
		Student_use2 s1 = new Student_use2();
		Student_use2 s2 = new Student_use2();
		System.out.println(s1.Name);
		System.out.println(s1);
		s1.set_Roll(12345);
		
		s1.Name = "akhilesh";
		System.out.println(s1.Name + " " + s1.get_Roll());
		
	}
}
