package inheritance;

public class sphere extends shapes{
	public sphere(int r) {
	lsa = 4*3*r*r;	
	tsa = 4*3*r*r;
	volume = 4*3*r*r*r/3; 
	}
	public void print() {
		super.print();
	}

}
