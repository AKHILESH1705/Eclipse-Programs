package Vehicle;

public class bike_collection extends vehicle {
 
	boolean racing;
	String name;
	
	public void print() {
		super.print();
		System.out.println("Bike for Racing : "+ racing);
		System.out.println("Bike name : "+name);
	}

	
}
