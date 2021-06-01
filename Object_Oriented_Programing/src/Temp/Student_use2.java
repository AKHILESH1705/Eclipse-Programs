package Temp;
  
public class Student_use2 
{
   public String Name;
   public int Contact;
   private int Roll;

 public void set_Roll(int Roll){
	if(Roll<=0) 
	{
		return;
	}
	System.out.println(this);
	this.Roll = Roll;
}

 public int get_Roll() 
  { 
	return Roll;
  }

}
