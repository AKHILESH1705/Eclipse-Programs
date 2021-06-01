package polymorphism;

public class vehicle {

	String vehicle_type;
	int MaxSpeed;
	public vehicle() {
		System.out.println("vehicle constructor");
	}
	public void print () {
		System.out.println("vehicle ka print function");
		System.out.println("vehicle type : "+vehicle_type);
		System.out.println("vehicle maxspeed : "+MaxSpeed);
	    
	}

}
