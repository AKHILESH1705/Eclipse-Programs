import java.util.Scanner;

public class EvenafterOddLinked {

	public static Node<Integer> EvenOddLinked(Node<Integer>head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> oddhead = null, oddtail = null; 
		Node<Integer> evenhead = null, eventail = null;
	  	while(head!=null) {   
		   if(head.data%2!=0) {
			   if(oddhead==null) {
				oddhead = head;
				oddtail = head;
			   }
			   else {
				   oddtail.next = head;
				   oddtail = oddtail.next;
			   }
		   }
	  	   else {
	  		   if(evenhead==null) {
	  			 evenhead = head;
	             eventail = head; 
	  		   }
	  		   else {
	  			   eventail.next = head;
	  			 eventail = eventail.next;
	  		   }
	  		   
	  	   }
		   head = head.next;
	  	}
	  	if(oddhead==null) {
	  		return evenhead;
	  	}
	  	else if(evenhead==null) {
	  		return oddhead;
	  	}
	  	else {
	  	oddtail.next=null;
	  	eventail.next = null;
	  	oddtail.next = evenhead;
	  	}
		return oddhead;
	}
	  	
	  	
	public static void PrintLinked(Node<Integer> head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}

	}

	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = tail.next; // tail = currentNode
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void main(String args[]) {
		Node<Integer> head = takeInput();
		head = EvenOddLinked(head);
		PrintLinked(head);

	}

}
