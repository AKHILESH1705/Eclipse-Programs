package class_and_objects;

public class Student_creator { 
	public String Name;
	public int Contact;
	private int Roll;
	
	public void set_Roll(int rn) 
	{
		if(rn<=0) {
			return;
		}
		Roll = rn;
	}
	
	public int get_Roll() {
		return Roll;
	}
}
class Students_Education{
	int maths;
	int physics;
	int hindi;
	int english;
}
