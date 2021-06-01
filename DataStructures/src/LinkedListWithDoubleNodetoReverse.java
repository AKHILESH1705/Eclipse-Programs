import java.util.Scanner;
class DoubleLinked {
	Node<Integer> head;
	Node<Integer> tail;

DoubleLinked() {

	}
DoubleLinked(Node<Integer> head, Node<Integer> tail) {
		this.head = head;
		this.tail = tail;
	}
}

public class LinkedListWithDoubleNodetoReverse {
	
	public static DoubleLinked ReverseBetter(Node<Integer> head){
		DoubleLinked ans = new DoubleLinked();
		if(head == null || head.next == null) {
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		
		 DoubleLinked smallhead = ReverseBetter(head.next);
			 smallhead.tail.next = head;
			 head.next = null;
			 ans.head = smallhead.head;
			 ans.tail = head;
			 return ans;	
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
		DoubleLinked ans = ReverseBetter(head);
		PrintLinked(ans.head);

	}

}
