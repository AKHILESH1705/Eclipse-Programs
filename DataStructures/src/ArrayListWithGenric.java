import java.util.ArrayList;

public class ArrayListWithGenric {

	public static<E> ArrayList<E> printArray(E[] elements) {  
		
		ArrayList<E> result = new ArrayList<E>();
		result.add(elements[0]);
		for(int i = 1;i<elements.length;i++) {
			if(elements[i]!=elements[i-1]) {
				result.add(elements[i]);
			}
		}
		return result;  
    }  
    public static void main( String args[] ) {  
        Integer[] intArray = { 10, 20,20,30,30,40, 50 };  
     Character[] charArray = { 'J','J','A','A','V','V','A', 'T','P','P','O','I','N','T' };  
  
          System.out.println( "Printing Integer Array" );  
         ArrayList<Integer> result = printArray( intArray );   
        for(int i : result)
        	System.out.print(i +" ");
         
       System.out.println( "\n"+"Printing Character Array" ); 
       ArrayList<Character> results = printArray( charArray ); 
       for(int i : results)
       	System.out.print((char)i +" ");
    }   
}  
	
	