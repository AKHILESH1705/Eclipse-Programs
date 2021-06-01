import java.util.Scanner;
//  2 5 8 12 -1
// 3 6 9 -1
// 12 9 8 6 5 3 2 
public class MergertwoSortedListInreverse { 
	
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
	public static Node<Integer> MergetwoLinked(Node<Integer> head1, Node<Integer> head2) {
		if (head1 == null && head2 != null) {
			return head2;
		} else if (head1 != null && head2 == null) {
			return head1;
		} else if (head1 == null && head2 == null) {
			return null;
		}
		Node<Integer> newhead = null, tail = null;
		Node<Integer> t1 = head1, t2 = head2;
		if (t1.data <= t2.data) {
			newhead = t1;
			tail = t1;
			t1 = t1.next;
		} else {
			newhead = t2;
			tail = t2;
			t2 = t2.next;
		}
		while (t1 != null && t2 != null) {
			if (t1.data <= t2.data) {
				tail.next = t1;
				t1 = t1.next;
				tail = tail.next;
			} else {
				tail.next = t2;
				t2 = t2.next;
				tail = tail.next;
			}
		}
		if (t1 != null) {
			tail.next = t1;
		} else {
			tail.next = t2;
		}

		return ReverseRecursive(newhead);
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
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		Node<Integer> head = MergetwoLinked(head1, head2);
		PrintLinked(head);

	}
}
