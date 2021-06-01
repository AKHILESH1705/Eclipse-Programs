
public class PrintLinkedListWithLength {
	public static void print(Node<Integer> head){
		 
	    Node<Integer> temp = head;
	    int count = 0;
	    while(temp != null)//&& temp.data!=-1  we can stop counting once we reach to null else we can also define our use case like once we reach -1
	    	{
	    	
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	        count++;
	    }
	    System.out.println();
	    System.out.println(count);
	
	}
	public static void main(String args[]){
		 
		 Node<Integer> node1 = new Node<Integer>(10);
		    Node<Integer> node2 = new Node<Integer>(20);
		    Node<Integer> node3 = new Node<Integer>(30);
		    Node<Integer> node4 = new Node<Integer>(40);
		    Node<Integer> node5 = new Node<Integer>(-1);
		    node1.next = node2;
		    node2.next = node3;
		    node3.next = node4;
		    node4.next = node5;
		    print(node1);

		}
}
