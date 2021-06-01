import java.util.*;
public class LinkedListUserInput {


	public static void PrintLinkedList(Node<Integer> head){
		
	    while(head != null ){
	    	
	        System.out.print(head.data +" ");
	        head = head.next;
	    }
	    System.out.println();
	}
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
	    while(data!=-1) {
	    	Node<Integer> currentNode = new Node<Integer>(data);
	    	//System.out.println(currentNode);
	    	if(head==null) {
	    		head = currentNode;
	    	}
	    	else 
	    	{
	    		Node<Integer> tail = head;
	    		
	    		while(tail.next!=null) {
	    			//System.out.println(tail);
	    			tail = tail.next;		
	    		}
	    		tail.next= currentNode; 
	    		
	    	}
	    	data = s.nextInt();	
	    }
		return head;
		
	}
  
public static void main(String args[]) {
	Node<Integer> head = takeInput();
	
	PrintLinkedList(head);
	}
	
}