package Test_constructor;

public class Polynomial {
 private int cofficient[];

 public Polynomial() {
	 cofficient = new int[100];
 }
 public void set_coff(int degree , int coffi) {

	 cofficient[degree] = coffi;
    }
	
 public void print() {
		for(int i = 0; i < cofficient.length; i++) {
			if(cofficient[i]!=0) {
				System.out.print(cofficient[i]+"x"+i+" ");
			}
		}
	}

 
 public Polynomial add(Polynomial second) {
	 for(int i = 0; i < this.cofficient.length; i++) {
		 for(int j = 0; j < second.cofficient.length; j++){
			 if( i == j && (this.cofficient[i]!= 0 || second.cofficient[i]!=0)) {
				 this.cofficient[i] = this.cofficient[i]+second.cofficient[j];
			 }
			  
		 }
	 }
	// System.out.println(this); this is just for passing an reference it has no impact 
	 return this; // it is mandatory to return something  but it should be a constructor type
 }
 
 public Polynomial substract(Polynomial second) {
	 for(int i = 0;i<this.cofficient.length;i++) {
		 for(int j = 0;j<second.cofficient.length;j++) {
			 if(i==j && (this.cofficient[i]!= 0 || second.cofficient[j]!= 0)) {
				 this.cofficient[i] = this.cofficient[i]-second.cofficient[j];
			 }
		 }
	 }
	 return this;
 }
 public Polynomial multiply(Polynomial p){
		Polynomial a =new Polynomial();

		for(int i=0;i<this.cofficient.length/2;i++){
			for(int j=0;j<p.cofficient.length/2;j++){

				a.cofficient[(i+j)]+=this.cofficient[i]*p.cofficient[j];

			}
			
		}
		return a;
	}
 
}
