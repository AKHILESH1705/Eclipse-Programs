package polymorphism;

public class car extends vehicle {
	
	String car_name;
	int numGear;
	
	public car(int numGear) {
		this.numGear = numGear;
	}
	public void print () {
		System.out.println("car ka print function");
		System.out.println("car name : " + "bugati");
		System.out.println("car numGear :"+numGear);
		super.print();
	}

}
