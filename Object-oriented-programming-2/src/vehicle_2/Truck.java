package vehicle_2;

import Vehicle.vehicle;

public class Truck extends vehicle {
 int loaddingcapacity;
 public void print() {
	 System.out.println("truck color : "+get_color());
	 System.out.println("truck max speed: "+ get_maxSpeed());
	 System.out.println("truck : loading capacity : "+ loaddingcapacity);
	 
 }
}
