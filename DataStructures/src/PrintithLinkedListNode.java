import java.util.Scanner;

public class PrintithLinkedListNode {
	public static void print(Node<Integer> head){
		 
	    Node<Integer> temp = head;

	    while(temp != null && temp.data!=-1){
	    	
	        System.out.print(temp.data +" ");
	        temp = temp.next;
	    }
	    System.out.println();
	    
	    Scanner s = new Scanner(System.in);
	    int i = s.nextInt();
	    // here we have pass to GetNth function Head value and index value to get what data is present at this index
	    System.out.println(GetNth(head,i));
	    
	}
		public static int GetNth(Node<Integer>head,int index)
	    {
	        Node<Integer> current = head;
	        int count = 0; 
	        while (current != null)
	        {
	            if (count == index)
	                return current.data;
	            count++;
	            current = current.next;
	        }
	        //assert (false);
	        return 0;
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
