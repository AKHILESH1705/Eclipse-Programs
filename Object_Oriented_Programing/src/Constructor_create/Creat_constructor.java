package Constructor_create;

public class Creat_constructor {

	String name;
	int roll;
	
	public Creat_constructor(String s,int rn) {
		name = s;
		roll = rn;
	}
	public Creat_constructor(String s) {
		name = s;

	}
	public Creat_constructor(int rn) {
		roll = rn;

	}
	
	public void Set_value(int rn) {
		if(rn<=0) {
			return;
		}
		roll = rn;
	}
	public int get_roll() {
		return roll;
	}
	
	
	public void print() {
		System.out.println(name+" : "+ roll);
	}
}
