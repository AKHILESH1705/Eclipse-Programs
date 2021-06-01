package Genrics;

public class FetchBasicDetails{

	public static void main(String args[]) {
	BasicOperation<Integer,Integer> f1 = new BasicOperation<>(10,20);
	
     f1.setFirst(11);
     System.out.println(f1.getFirst());
     BasicOperation<Double,Integer> f2 = new BasicOperation<>(15.0,20);
     f2.setSecond(25);
     System.out.println(f2.getSecond());
     BasicOperation<String,String> f3 = new BasicOperation<>("a","k");
     f3.setFirst("Akhilesh");
     f3.setSecond("kushwah");
     System.out.println(f3.getFirst() + " " + f3.getSecond());
     BasicOperation<Character,String> f4 = new BasicOperation<>('a',"k");
     f4.setSecond("kushwah jii");
     System.out.println(f4.getFirst() + " " + f4.getSecond());

     
  }
}