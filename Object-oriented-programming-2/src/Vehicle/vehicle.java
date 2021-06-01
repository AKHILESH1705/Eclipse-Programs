package Vehicle;

import Genrics.PrintInterface;

public class vehicle implements PrintInterface {
	 String color;
    private int maxSpeed;
    
    public vehicle(int max ) {
    	maxSpeed = max;
    	System.out.println("vehicle constructor");
    	
    }  
    public vehicle() {
    	System.out.println("vehicle constructor");
    	
    }
    public void print() {
    	System.out.println("Vehicle color : "+ color);
    	System.out.println("Vehicle Speed : "+ maxSpeed);
    }
    public void set_maxspeed(int speed,String color) {
    	maxSpeed = speed;
    	this.color = color; 
    }
    public int get_maxSpeed() {
    	return maxSpeed;
    }
    public String get_color() {
    	return color;
    }

}
