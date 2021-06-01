package class_and_objects;

public class Polynomial {
	private int coefficient[];
	public Polynomial() {
		coefficient = new int[10];
	}
	public void setCoefficient(int degree, int coeff){
		if(degree > coefficient.length-1) 
		{ 
			int temp[] = coefficient; coefficient = new int[degree+1];  
			for(int i = 0; i < temp.length; i++) {
				coefficient[i] = temp[i]; 
				} 
			}
		coefficient[degree] = coeff; 
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print()
	{
        for(int i = 0 ;i<coefficient.length;i++)
        {
		 if(coefficient[i]!=0)
		 {
			System.out.print(coefficient[i]+"x"+i+" ");
		 }
        }
		
	}
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        
     for(int i=0;i<this.coefficient.length;i++){
			for(int j=0;j<p.coefficient.length;j++){
				if(i==j && (this.coefficient[i]!=0 || p.coefficient[j]!=0)){
					this.coefficient[i]+=p.coefficient[j];
				}
			}
		}
   return this;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	
	public Polynomial subtract(Polynomial p){
        for(int i=0;i<this.coefficient.length;i++){
			for(int j=0;j<p.coefficient.length;j++){
				if(i==j && (this.coefficient[i]!=0 || p.coefficient[j]!=0)){
					this.coefficient[i]-=p.coefficient[j];
				}
			}
		}
return this;
			
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	
	public Polynomial multiply(Polynomial p){
		Polynomial a =new Polynomial();

		for(int i=0;i<this.coefficient.length/2;i++){
			for(int j=0;j<p.coefficient.length/2;j++){

				a.coefficient[(i+j)]+=this.coefficient[i]*p.coefficient[j];

			}
			
		}
		return a;
	}


}
