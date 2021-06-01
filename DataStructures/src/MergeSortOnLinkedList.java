import java.util.Scanner;

public class MergeSortOnLinkedList {
	
public static Node<Integer> MergetwoLinked(Node<Integer> head1, Node<Integer> head2){
		
		Node<Integer> newhead = null, tail = null;
		Node<Integer>	t1 = head1,t2 = head2;
		if(t1.data<=t2.data) {
			newhead = t1;
			tail = t1;
			t1  = t1.next;	
		}
		else {
			newhead = t2;
			tail = t2;
			t2 = t2.next;
		}
		while(t1!=null && t2!=null) {
			if(t1.data<=t2.data) {
				tail.next = t1;
				t1 = t1.next;
				tail = tail.next;
			}
			else {
				tail.next = t2;
				tail = tail.next;
				t2 = t2.next;
			}
		}
		if(t1!=null) {
				tail.next = t1;
			}
		else {
			tail.next = t2;
		}
		
		return newhead;
	}


public static Node<Integer> MiddleOfLinkedList( Node<Integer> head){
	if(head==null || head.next == null) {
		return head;
	}
	Node<Integer> fast = head;
	Node<Integer> slow = head;
	while(fast.next!=null && fast.next.next!=null) {
		fast = fast.next.next;
		slow = slow.next;
		
	}
	return slow;
}

public static Node<Integer> Mergesort(Node<Integer> head){
	
	if(head == null || head.next== null) {
		return head;
	}
	Node<Integer> mid = MiddleOfLinkedList(head);
	Node<Integer> nextOfmid = mid.next;
	mid.next = null;
	Node<Integer> head1 = Mergesort(head);
	Node<Integer> head2 = Mergesort(nextOfmid);
	Node<Integer> newhead = MergetwoLinked(head1,head2);
	return newhead;

}
	public static void PrintLinked(Node<Integer> head) {
		while(head!=null)
		{
			System.out.print(head.data+ " ");
			head = head.next;
		}
		
	}
	
	public static Node<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null,tail = null;
		while(data!=-1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head==null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = tail.next; // tail = currentNode
			}
			data = s.nextInt();
			}
		return head;
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
		head = Mergesort(head);
	    PrintLinked(head);
		
	}
}
