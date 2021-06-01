package Fraction_of_Number;

public class Fraction {
private int numerator;
private int denominator;

public Fraction(int numerator, int denominator) // constructor 
{ 
	this.numerator = numerator;
	if(denominator==0) {
		return;
	}
	this.denominator = denominator;
	simplify();
}

 public void set_numerator(int numerator) 
{
	this.numerator = numerator;
	simplify();			
 }
 public void set_denominator(int denominator)
 {
	if(denominator==0) {
		return;
	}
	this.denominator = denominator;
	simplify();	
 }
 public int get_numerator() 
 {
 	return numerator;
 }
 public int get_denominator() 
 {
 	return denominator;
 }

public void add(Fraction f2) {
	this.numerator = this.numerator*f2.denominator + this.denominator*f2.numerator;
	this.denominator = this.denominator * f2.denominator;
	simplify();
}
public static Fraction add(Fraction f1, Fraction f2){
	int newNum = f1.numerator*f2.denominator + f1.denominator*f2.numerator;
    int newDen = f1.denominator*f2.denominator;
    Fraction f = new Fraction(newNum, newDen);
	return f;
}

public void multiply(Fraction f2) {
	this.numerator = this.numerator*f2.numerator;
	this.denominator = this.denominator*f2.denominator;
	
	simplify();
}
public void simplify() {
	int small = Math.min(numerator, denominator);
	int gcd = 1;
	for(int i = 2;i<=small;i++) {
		if(numerator % i == 0 && denominator%i == 0) {
			gcd = i;
		}
	}
	numerator = numerator/gcd;
	denominator = denominator/gcd;
}

public void print() {
	if(denominator==1) {
		System.out.println(numerator);
	}
	else { 
		System.out.println(numerator+"/"+denominator);
	}
}

}
	
	
