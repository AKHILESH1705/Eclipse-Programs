package Vehicle;

public class car_collection extends vehicle {
	int numberGear;
    boolean automatic;
	String name;
	//String color = "red"; when we have same name and when we call a function on derived class this will find whatever we have search for in derived class after then i will find in base class.
	 car_collection(int numberGear) {
		super(100);
		this.numberGear = numberGear;
		System.out.println("car constructor");
	}
		

   
	/*
	 * public void print() { //System.out.println("car color : "+ color);
	 * //System.err.println("car max speed : "+ get_maxSpeed());
	 * 
	 * super.print(); System.out.println("car Gear : "+ numberGear);
	 * System.out.println("car automatic : "+ automatic);
	 * System.out.println("car name : "+ name); }
	 */
}