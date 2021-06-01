import java.util.Scanner;

public class middleofLinkedList {
	
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
		head = MiddleOfLinkedList(head);
		System.out.println(head.data);
		//PrintLinked(head);
		
	}
}
