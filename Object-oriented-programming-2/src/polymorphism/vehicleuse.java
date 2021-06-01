package polymorphism;

public class vehicleuse {

	public static void main(String args[]) {
		
		Object O = new vehicle();//object class is super class of ever java class
		vehicle v = new vehicle();
		v.getClass();
		
//		vehicle v = new car(10);
//		System.out.println(v);
//		//v.print();
//		v.MaxSpeed = 400;
//		v.vehicle_type = "sedan";
//		//v.print();
//		truck v1 = new truck();
//        v1.truck_company = "TATA";
//        v = new truck(); // cast to class polymophism.car can not be possible
//        car c = (car)v;
//        System.out.println(c);
//        c.numGear=8;
//        c.print();
	}
}