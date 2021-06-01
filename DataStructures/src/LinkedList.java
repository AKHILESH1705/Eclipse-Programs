
public class LinkedList {
	
	public static Node<Integer> CreatList(){
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
        n1.next = n2;
       // System.out.println("n1 :" + n1 +" n1 data :"+ n1.data + " add of next node " + n1.next+" ");
        n2.next = n3;
        //System.out.println("n2 :" + n2 +" n2 data :"+ n2.data + " add of next node " + n2.next+" " );
        //System.out.println("n3 :" + n3 +" n3 data :"+ n3.data + " add of next node " + n3.next+" " );
   
        
		return n1;
	}
	
	public static void printlist(Node<Integer>head) {
		
		  Node<Integer> temp = head;

		    while(temp != null){
		        System.out.print(temp.data +" ");
		        temp = temp.next;
		    }
		    System.out.println();
//		System.out.println(head.data);
//		System.out.println(head.next.data);
//		System.out.println(head.next.next.data); this  is not the way to get the element but this is an idea like how we can actually print
	}

	public static void main(String args[]) {
		
		Node<Integer> head = CreatList();
		printlist(head);
		
//		Node<Integer> node1 = new Node<>(10);
//		System.out.println(node1.data);
//		System.out.println(node1.next);
//		Node<Integer> node2 = new Node<>(10);
//		node1.next = node2;
//		System.out.println(node2);
//		System.out.println(node1.next);	
	}
	
}
