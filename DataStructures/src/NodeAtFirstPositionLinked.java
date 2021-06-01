import java.util.Scanner;

public class NodeAtFirstPositionLinked {
	
	public static Node<Integer> InsertAtFirst(Node<Integer>head, int pos, int dt){
		if(pos==0) {
		Node<Integer> heads  = new Node<Integer>(dt);
		heads.next = head;
		return heads;
		}
		else {
			int count = 0 ;
			Node<Integer> node = new Node<Integer>(dt);
			Node<Integer> prev = head;
			while(count<pos-1 && prev!=null) {
				 prev= prev.next;
				 count++;
			}
			if(prev!=null) {
			node.next = prev.next;
			prev.next = node;
		    }
			return head;
		}
	}
	
	public static void PrintLinkedList(Node<Integer> head) {
		
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
	}
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data!=-1) {
			Node<Integer> currentNode = new Node<Integer>(data);  
			if(head==null) {
				head = currentNode;
				tail = currentNode;
			}
			else {
				tail.next = currentNode;
				tail = tail.next;
			}
			data = s.nextInt(); 
		}
		
		return head;
		
	}
	

	
	public static void main(String args[]) {
		
	  Node<Integer> head = takeInput();
	  Scanner s = new Scanner(System.in);
	  int pos = s.nextInt();
	  int ele = s.nextInt();
	  head = InsertAtFirst(head,pos,ele);
	  PrintLinkedList(head);
	  
		
	}
	
	
}
