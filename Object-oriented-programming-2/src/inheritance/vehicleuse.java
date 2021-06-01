package inheritance;

public class vehicleuse {

	public static void main(String args[]) {
		//vehicle v = new vehicle();
		//truck t = new truck();
		//car c = new car();
		vehicle v = new vehicle();
		v.print();
		car c = new car(10);
		c.print();
		
		
	}
}