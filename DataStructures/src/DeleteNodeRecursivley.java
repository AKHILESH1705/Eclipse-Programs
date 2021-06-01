import java.util.Scanner;

public class DeleteNodeRecursivley {

	public static Node<Integer> DeleteNode(Node<Integer> head, int pos) {

		if (head == null) {
			return head;
		}
		if (pos == 0) {
			return head.next;
		} else {
			head.next = DeleteNode(head.next, pos -1);
			return head;
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
		head = DeleteNode(head,2);

		// System.out.println();
		// Reverse(head);
		PrintLinked(head);

	}
}





































