import java.util.Scanner;

public class ReverselinkedListiterative {
	public static Node<Integer> Reverseitrativley(Node<Integer> head) {
         if(head==null || head.next==null) {
        	 return head;
         }
		Node<Integer> Next = null,prev = null,curr = head; // time complexity is O(N) optimized solution  with iteration
		while(curr!=null) {
			Next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = Next; 
		}
		head = prev;
		return head;
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
		head = Reverseitrativley(head);

		// System.out.println();
		// Reverse(head);
		PrintLinked(head);
	}
}
