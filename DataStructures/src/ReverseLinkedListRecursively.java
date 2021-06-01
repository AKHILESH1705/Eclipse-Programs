import java.util.Scanner;

public class ReverseLinkedListRecursively {
	
	public static Node<Integer> ReverseRecursive(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		} 
	    else {
	    	Node<Integer>newnode = ReverseRecursive(head.next);
	    	 head.next.next = head;
	         head.next = null;
	         return newnode;
		  
		}
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
		Scanner s = new Scanner(System.in);
		Node<Integer> head = takeInput();
		head = ReverseRecursive(head);

		// System.out.println();
		// Reverse(head);
		PrintLinked(head);
	}
}
