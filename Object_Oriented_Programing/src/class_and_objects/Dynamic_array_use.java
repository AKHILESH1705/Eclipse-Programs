package class_and_objects;

public class Dynamic_array_use {
	
	public static void main(String args[]) {
		Dynamic_array_create d = new Dynamic_array_create();
		
		for(int i = 0 ;i<15;i++) {
			d.add(i+10);
		}
		System.out.println(d.size());
		//d.set(4,10);
		//System.out.println(d.get(3));
		//System.out.println(d.get(4));
		
		while(!d.isEmpty()) {
			System.out.println(d.removeLast());
			System.out.println("size = "+ d.size());
		}
	}

}
