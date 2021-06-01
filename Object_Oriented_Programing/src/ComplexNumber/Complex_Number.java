package ComplexNumber;

public class Complex_Number{
    private int real;
    private int imaginary;
 public Complex_Number(int real,int imaginary){
     this.real = real;
      this.imaginary = imaginary;
 }
	
 public void plus(Complex_Number c2) {
	this.real =  this.real+c2.real;
	this.imaginary = this.imaginary + c2.imaginary;
	
 }
  /*    
public void multiply(Complex_Number c2)
 {
   int firsts = this.real*c2.real;
   int outers = this.real*c2.imaginary;
   int inners = this.imaginary*c2.real;
   int lasts = (-1)*(this.imaginary*c2.imaginary);
   real=firsts+lasts;
   imaginary=outers+inners;
 }*/ //other way of doing this
 
 public void multiply(Complex_Number c2) {
	 int rel = this.real * c2.real - this.imaginary * c2.imaginary;
     int img = this.real * c2.imaginary + this.imaginary * c2.real;
     real = rel;
     imaginary = img;
 }

 public void print()
 {
     System.out.println(real +" + "+"i"+imaginary);
 }
}

