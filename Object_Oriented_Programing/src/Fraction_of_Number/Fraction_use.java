package Fraction_of_Number;

public class Fraction_use {
	
	public static void main(String args[]) {
		Fraction f1 = new Fraction(20,30);
		f1.print();
		
		f1.set_numerator(12);
		int d = f1.get_denominator();
		System.out.println(d);
		f1.print();
		
		f1.set_numerator(10);
		f1.set_denominator(30);
		f1.print();
		
		Fraction f2 = new Fraction(4,6);
		f1.add(f2);
		f1.print();
		f2.print();
		Fraction f3 = new Fraction(3,4);
		f3.multiply(f2);
		f3.print();
		f2.print();
	    
		
		Fraction f4 = Fraction.add(f1,f2);
		f1.print();
		f2.print();
		f3.print();
		f4.print();
		
	}

}
