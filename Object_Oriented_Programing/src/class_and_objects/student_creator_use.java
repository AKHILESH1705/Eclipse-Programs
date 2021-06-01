package class_and_objects;

public class student_creator_use {

	public static void main(String args[]) {
	Student_creator s1 = new Student_creator();
	Student_creator s2 = new Student_creator();
	
	s1.Name = "akhilesh";
	
	s1.set_Roll(-12354);
	System.out.println(s1.Name);
	System.err.println(s1.get_Roll());
	
}
}